/**
 * 
 */
package com.weddingapp.nickkaty.resource;

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
public class PlaylistResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String trackId;
	private String trackExternalUrl;
	private String trackApiUrl;
	private String trackSpotifyUri;
	private String trackName;
	private String imgSrc = "../images/icons/track.png";
	private Integer imgWidth;
	private Integer imgHeight;

	/**
	 * @return the trackId
	 */
	public String getTrackId() {
		return trackId;
	}

	/**
	 * @param trackId
	 *            the trackId to set
	 */
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	/**
	 * @return the trackExternalUrl
	 */
	public String getTrackExternalUrl() {
		return trackExternalUrl;
	}

	/**
	 * @param trackExternalUrl
	 *            the trackExternalUrl to set
	 */
	public void setTrackExternalUrl(String trackExternalUrl) {
		this.trackExternalUrl = trackExternalUrl;
	}

	/**
	 * @return the trackApiUrl
	 */
	public String getTrackApiUrl() {
		return trackApiUrl;
	}

	/**
	 * @param trackApiUrl
	 *            the trackApiUrl to set
	 */
	public void setTrackApiUrl(String trackApiUrl) {
		this.trackApiUrl = trackApiUrl;
	}

	/**
	 * @return the trackSpotifyUri
	 */
	public String getTrackSpotifyUri() {
		return trackSpotifyUri;
	}

	/**
	 * @param trackSpotifyUri
	 *            the trackSpotifyUri to set
	 */
	public void setTrackSpotifyUri(String trackSpotifyUri) {
		this.trackSpotifyUri = trackSpotifyUri;
	}

	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}

	/**
	 * @param trackName
	 *            the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
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
		return "PlaylistResource [trackId=" + trackId + ", trackExternalUrl=" + trackExternalUrl + ", trackApiUrl="
				+ trackApiUrl + ", trackSpotifyUri=" + trackSpotifyUri + ", trackName=" + trackName + ", imgSrc="
				+ imgSrc + ", imgWidth=" + imgWidth + ", imgHeight=" + imgHeight + "]";
	}

}
