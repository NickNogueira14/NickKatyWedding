/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotifyOAuthTokenResource implements Serializable {

	private static final long serialVersionUID = 1L;

	private String access_token;
	private String token_type;
	private String scope;
	private Integer expires_in;

	/**
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * @param access_token
	 *            the access_token to set
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/**
	 * @return the token_type
	 */
	public String getToken_type() {
		return token_type;
	}

	/**
	 * @param token_type
	 *            the token_type to set
	 */
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope
	 *            the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * @return the expires_in
	 */
	public Integer getExpires_in() {
		return expires_in;
	}

	/**
	 * @param expires_in
	 *            the expires_in to set
	 */
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyOAuthTokenResource [access_token=" + access_token + ", token_type=" + token_type + ", scope="
				+ scope + ", expires_in=" + expires_in + "]";
	}

}
