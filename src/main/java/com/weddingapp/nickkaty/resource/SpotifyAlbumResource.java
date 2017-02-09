/**
 * 
 */
package com.weddingapp.nickkaty.resource;

import java.io.Serializable;

/**
 * 
 * 
 * @since 25 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyAlbumResource implements Serializable {

	private static final long serialVersionUID = 1L;

	private String albumId;
	private String albumExternalUrl;
	private String albumApiUrl;
	private String albumSpotifyUri;
	private String albumName;
	private String imgSrc = "../images/icons/album.png";
	private Integer imgWidth = 0;
	private Integer imgHeight = 0;

	/**
	 * @return the albumId
	 */
	public String getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId
	 *            the albumId to set
	 */
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	/**
	 * @return the albumExternalUrl
	 */
	public String getAlbumExternalUrl() {
		return albumExternalUrl;
	}

	/**
	 * @param albumExternalUrl
	 *            the albumExternalUrl to set
	 */
	public void setAlbumExternalUrl(String albumExternalUrl) {
		this.albumExternalUrl = albumExternalUrl;
	}

	/**
	 * @return the albumApiUrl
	 */
	public String getAlbumApiUrl() {
		return albumApiUrl;
	}

	/**
	 * @param albumApiUrl
	 *            the albumApiUrl to set
	 */
	public void setAlbumApiUrl(String albumApiUrl) {
		this.albumApiUrl = albumApiUrl;
	}

	/**
	 * @return the albumSpotifyUri
	 */
	public String getAlbumSpotifyUri() {
		return albumSpotifyUri;
	}

	/**
	 * @param albumSpotifyUri
	 *            the albumSpotifyUri to set
	 */
	public void setAlbumSpotifyUri(String albumSpotifyUri) {
		this.albumSpotifyUri = albumSpotifyUri;
	}

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName
	 *            the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
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
		return "SpotifyAlbumObject [albumId=" + albumId + ", albumExternalUrl=" + albumExternalUrl + ", albumApiUrl="
				+ albumApiUrl + ", albumSpotifyUri=" + albumSpotifyUri + ", albumName=" + albumName + ", imgSrc="
				+ imgSrc + ", imgWidth=" + imgWidth + ", imgHeight=" + imgHeight + "]";
	}

}
