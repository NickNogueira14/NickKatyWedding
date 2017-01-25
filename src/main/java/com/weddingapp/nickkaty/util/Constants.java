/**
 * 
 */
package com.weddingapp.nickkaty.util;

import javax.xml.bind.DatatypeConverter;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public final class Constants {
	
	public static final String SPOTIFY_CLIENT_ID = "6b77a78573a94a068f260729bbe67330";
	public static final String SPOTIFY_CLIENT_SECRET = "2122ac41378f4cb6bc6bba92860cee2f";
	public static final String SPOTIFY_API_AUTH__URI = "https://accounts.spotify.com/api/token";
	public static final String SPOTIFY_HEADER_AUTH_KEY = "Authorization";
	public static final String SPOTIFY_HEADER_AUTH_VALUE = "Basic " + new String(DatatypeConverter.parseBase64Binary(SPOTIFY_CLIENT_ID + ":" + SPOTIFY_CLIENT_SECRET));
	public static final String SPOTIFY_PAYLOAD_GRANT_AUTH_KEY = "grant_type";
	public static final String SPOTIFY_PAYLOAD_GRANT_AUTH_VALUE = "client_credentials";
	public static final String SPOTIFY_PAYLOAD_SCOPE_AUTH_KEY = "scope";
	public static final String SPOTIFY_PAYLOAD_SCOPE_AUTH_VALUE = "playlist-modify-public playlist-modify-private";

}
