/**
 * 
 */
package com.weddingapp.nickkaty.service;

import org.springframework.stereotype.Service;

import com.weddingapp.nickkaty.resource.response.SpotifyOAuthTokenResource;

/**
 * 
 * 
 * @since 27 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public interface ISpotifyService {
	
	SpotifyOAuthTokenResource getSpotifyClientCredentials();
	
	String addTrackToPlaylist(final String tokenId, final String tokenType, final String trackUri);

}
