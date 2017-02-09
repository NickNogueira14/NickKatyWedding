/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;

/**
 * 
 * 
 * @since 25 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyExternalUrlResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String spotify;

	/**
	 * @return the spotify
	 */
	public String getSpotify() {
		return spotify;
	}

	/**
	 * @param spotify the spotify to set
	 */
	public void setSpotify(String spotify) {
		this.spotify = spotify;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyExternalUrl [spotify=" + spotify + "]";
	}
	
}
