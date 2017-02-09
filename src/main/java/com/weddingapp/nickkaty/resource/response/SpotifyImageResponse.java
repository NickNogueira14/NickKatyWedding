/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;

/**
 * 
 * 
 * @since 27 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyImageResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String url;
	private Integer width;
	private Integer height;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyImageResponse [url=" + url + ", width=" + width + ", height=" + height + "]";
	}

}
