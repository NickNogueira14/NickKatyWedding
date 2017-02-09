/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;

/**
 * 
 * 
 * @since 30 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyTrackLinkResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private SpotifyExternalUrlResponse external_urls;
	private String href;
	private String id;
	private String type;
	private String uri;

	/**
	 * @return the external_urls
	 */
	public SpotifyExternalUrlResponse getExternal_urls() {
		return external_urls;
	}

	/**
	 * @param external_urls
	 *            the external_urls to set
	 */
	public void setExternal_urls(SpotifyExternalUrlResponse external_urls) {
		this.external_urls = external_urls;
	}

	/**
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * @param href
	 *            the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyTrackLinkResponse [external_urls=" + external_urls + ", href=" + href + ", id=" + id + ", type="
				+ type + ", uri=" + uri + "]";
	}

}
