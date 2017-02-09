/**
 * 
 */
package com.weddingapp.nickkaty.resource;

import java.io.Serializable;

/**
 * 
 * 
 * @since 27 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyArtistResource implements Serializable {

	private static final long serialVersionUID = 1L;

	private String artistId;
	private String artistExternalUrl;
	private String artistApiUrl;
	private String artistSpotifyUri;
	private String artistName;
	private String imgSrc;
	private Integer imgWidth;
	private Integer imgHeight;

	/**
	 * @return the artistId
	 */
	public String getArtistId() {
		return artistId;
	}

	/**
	 * @param artistId
	 *            the artistId to set
	 */
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	/**
	 * @return the artistExternalUrl
	 */
	public String getArtistExternalUrl() {
		return artistExternalUrl;
	}

	/**
	 * @param artistExternalUrl
	 *            the artistExternalUrl to set
	 */
	public void setArtistExternalUrl(String artistExternalUrl) {
		this.artistExternalUrl = artistExternalUrl;
	}

	/**
	 * @return the artistApiUrl
	 */
	public String getArtistApiUrl() {
		return artistApiUrl;
	}

	/**
	 * @param artistApiUrl
	 *            the artistApiUrl to set
	 */
	public void setArtistApiUrl(String artistApiUrl) {
		this.artistApiUrl = artistApiUrl;
	}

	/**
	 * @return the artistSpotifyUri
	 */
	public String getArtistSpotifyUri() {
		return artistSpotifyUri;
	}

	/**
	 * @param artistSpotifyUri
	 *            the artistSpotifyUri to set
	 */
	public void setArtistSpotifyUri(String artistSpotifyUri) {
		this.artistSpotifyUri = artistSpotifyUri;
	}

	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName
	 *            the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/**
	 * @return the imgSrc
	 */
	public String getImgSrc() {
		return imgSrc;
	}

	/**
	 * @param imgSrc
	 *            the imgSrc to set
	 */
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	/**
	 * @return the imgWidth
	 */
	public Integer getImgWidth() {
		return imgWidth;
	}

	/**
	 * @param imgWidth
	 *            the imgWidth to set
	 */
	public void setImgWidth(Integer imgWidth) {
		this.imgWidth = imgWidth;
	}

	/**
	 * @return the imgHeight
	 */
	public Integer getImgHeight() {
		return imgHeight;
	}

	/**
	 * @param imgHeight
	 *            the imgHeight to set
	 */
	public void setImgHeight(Integer imgHeight) {
		this.imgHeight = imgHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyArtistResource [artistId=" + artistId + ", artistExternalUrl=" + artistExternalUrl
				+ ", artistApiUrl=" + artistApiUrl + ", artistSpotifyUri=" + artistSpotifyUri + ", artistName="
				+ artistName + ", imgSrc=" + imgSrc + ", imgWidth=" + imgWidth + ", imgHeight=" + imgHeight + "]";
	}

}
