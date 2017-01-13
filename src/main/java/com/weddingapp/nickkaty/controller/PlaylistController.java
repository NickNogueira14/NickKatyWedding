/**
 * 
 */
package com.weddingapp.nickkaty.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.weddingapp.nickkaty.resource.SpotifyOAuthTokenResource;
import com.weddingapp.nickkaty.util.Constants;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Controller
@RequestMapping(value = "/playlist")
public class PlaylistController {
	
	@ResponseBody
	@RequestMapping(value = "/addTrackIntoPlaylist", method = RequestMethod.GET)
	public SpotifyOAuthTokenResource getAlbumTracks() {
		
		RestTemplate authTemplate = new RestTemplate();
		String uri = Constants.SPOTIFY_API_AUTH__URI;
		
		MultiValueMap<String, String> payload = new LinkedMultiValueMap<String, String>();
		payload.add(Constants.SPOTIFY_PAYLOAD_GRANT_AUTH_KEY, Constants.SPOTIFY_PAYLOAD_GRANT_AUTH_VALUE);
		payload.add(Constants.SPOTIFY_PAYLOAD_SCOPE_AUTH_KEY, Constants.SPOTIFY_PAYLOAD_SCOPE_AUTH_VALUE);
		
		ResponseEntity<SpotifyOAuthTokenResource> response = authTemplate.postForEntity(uri, payload, SpotifyOAuthTokenResource.class);
		System.out.println(response.getBody());
		
		return response.getBody();
	}

}
