/**
 * 
 */
package com.weddingapp.nickkaty.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.weddingapp.nickkaty.resource.response.SpotifyAddTrackResponse;
import com.weddingapp.nickkaty.resource.response.SpotifyOAuthTokenResource;
import com.weddingapp.nickkaty.service.ISpotifyService;
import com.weddingapp.nickkaty.util.Constants;

/**
 * 
 * 
 * @since 27 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public class SpotifyService implements ISpotifyService {

	@Override
	public SpotifyOAuthTokenResource getSpotifyClientCredentials() {

		MultiValueMap<String, String> header = new LinkedMultiValueMap<String, String>();
		header.add(Constants.SPOTIFY_HEADER_AUTH_KEY, Constants.SPOTIFY_HEADER_AUTH_VALUE);
		header.add(Constants.SPOTIFY_HEADER_CONTENT_KEY, Constants.SPOTIFY_HEADER_CONTENT_VALUE);
		
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

		String uri = Constants.SPOTIFY_API_AUTH__URI;
		
		MultiValueMap<String, String> payload = new LinkedMultiValueMap<String, String>();
		payload.add(Constants.SPOTIFY_PAYLOAD_GRANT_AUTH_KEY, Constants.SPOTIFY_PAYLOAD_GRANT_AUTH_VALUE);
//		payload.add(Constants.SPOTIFY_PAYLOAD_SCOPE_AUTH_KEY, Constants.SPOTIFY_PAYLOAD_SCOPE_AUTH_VALUE);
		payload.add(Constants.SPOTIFY_PAYLOAD_REFRESH_KEY, Constants.SPOTIFY_PAYLOAD_REFRESH_VALUE);
		
		HttpEntity<?> req = new HttpEntity<Object>(payload, header);
		
		ResponseEntity<SpotifyOAuthTokenResource> response = template.exchange(uri, HttpMethod.POST, req, SpotifyOAuthTokenResource.class);
		
		return response.getBody();
	}

	@Override
	public String addTrackToPlaylist(String tokenId, String tokenType, String trackUri) {

		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		String uri = "https://api.spotify.com/v1/users/" 
					+ Constants.SPOTIFY_USER_ID + "/playlists/" 
					+ Constants.SPOTIFY_PLAYLIST_ID + "/tracks?uris="
					+ trackUri;
		
		MultiValueMap<String, String> header = new LinkedMultiValueMap<String, String>();
		header.add(Constants.SPOTIFY_HEADER_AUTH_KEY, tokenType + " " + tokenId);
		header.add(Constants.SPOTIFY_HEADER_CONTENT_KEY, Constants.SPOTIFY_HEADER_CONTENT_VALUE);
		
		HttpEntity<?> req = new HttpEntity<Object>(header);
		
		ResponseEntity<SpotifyAddTrackResponse> resp = template.exchange(uri, HttpMethod.POST,req, SpotifyAddTrackResponse.class);
		
		if(HttpStatus.CREATED.equals(resp.getStatusCode())) {
			return trackUri;
		} else if(HttpStatus.FORBIDDEN.equals(resp.getStatusCode())){
			return "Forbidden";
		} else if(HttpStatus.NOT_FOUND.equals(resp.getStatusCode())){
			return "Not Found Testando";
		} else if(HttpStatus.OK.equals(resp.getBody())) {
			return resp.getHeaders().toString();
		} else if(HttpStatus.INTERNAL_SERVER_ERROR.equals(resp.getBody())) {
			return resp.getHeaders().toString();
		}
		
		return null;
	}

}
