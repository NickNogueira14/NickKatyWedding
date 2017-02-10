/**
 * 
 */
package com.weddingapp.nickkaty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;

import com.weddingapp.nickkaty.resource.SpotifyAlbumResource;
import com.weddingapp.nickkaty.resource.SpotifyTrackResource;
import com.weddingapp.nickkaty.resource.response.SpotifyOAuthTokenResource;
import com.weddingapp.nickkaty.resource.response.SpotifyPagingResponse;
import com.weddingapp.nickkaty.service.ISpotifyService;
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
	
	@Autowired
	private ISpotifyService spotify;
	
	public String token = "BQDYJs-lRwZRNBQEdLNI3ynS3KnpH-frfFUt84k-Y7E2rvG2ZkfFX_ojDgKvPF1J96P1-zQ1dbGyXic0U7k1j_BwqwlHWIFyvj8bJfxHH33ubOlBv40hYA8DymC-1sA4MW-WszwUu2D8rayHJ0KBvzsPPGRanCG8WoYsg532T8lGShxrZLHXw6a86s8iwyihhDjZ6Sn6i83S_CviN4_f_iyZUnlvmAgh2QMVHph0duIEs5Y-5dq_y4kB";
	public String refresh = "AQBNeezPCvhfsbALA2PUUIE3nIGUxAYY7mBgZBV5MuS5RuD6AbkowJTOf5GIhVJBysRXOwiBX2WDidLX0i6N2LoBQUldZ70mDzs1UalPvKLXDEiok5d6POLq_lzN9HxB8jI";
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/getAuthorization", method = RequestMethod.GET, produces = "text/plain")
	public String getAuthorization() {
		
		RestTemplate authTemplate = new RestTemplate();
		String uri = "https://accounts.spotify.com/authorize?client_id=6b77a78573a94a068f260729bbe67330"
				+ "&response_type=code&redirect_uri=https:%3A%2F%2localhost:8080%2Fplaylist%2FgetSpotifyToken"
				+ "&scope=playlist-modify-public%20playlist-modify-private";
		
		String res = authTemplate.getForObject(uri, String.class);
		
		return res;
	}
	
	@ResponseBody	
	@RequestMapping(value = "/addTrackIntoPlaylist/{spotifyUri}", method = RequestMethod.GET, produces = "text/plain")
	public String addTrackIntoPlaylist(@PathVariable String spotifyUri) {
		
		SpotifyOAuthTokenResource oAuthToken = spotify.getSpotifyClientCredentials();
		
		String resp = spotify.addTrackToPlaylist(oAuthToken.getAccess_token(), oAuthToken.getToken_type(), spotifyUri);
		
		return spotifyUri;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getSpotifyToken/{code}/{state}", method = RequestMethod.GET, produces = "text/plain")
	public String getSpotifyToken(
			@RequestParam(value = "code", required = false) String code,
			@RequestParam(value = "state", required = false) String state) {
		
		return code;
		
//		SpotifyOAuthTokenResource oAuthToken = spotify.getSpotifyClientCredentials();
//		
//		return oAuthToken;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getTracksFromAlbum", method = RequestMethod.GET)
	public List<SpotifyTrackResource> getTracksFromAlbum() {
		
		SpotifyAlbumResource album = new SpotifyAlbumResource();
		
		RestTemplate template = new RestTemplate();
		String uri = "https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks";
		
		ResponseEntity<SpotifyPagingResponse> resp = template.getForEntity(uri, SpotifyPagingResponse.class);
		
		List<SpotifyTrackResource> resultList = SpotifyTrackResource.fromResponse(resp.getBody().getItems(), album);
		
		return resultList;
	}

}
