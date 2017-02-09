/**
 * 
 */
package com.weddingapp.nickkaty.resource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.weddingapp.nickkaty.resource.response.SpotifyArtistResponse;
import com.weddingapp.nickkaty.resource.response.SpotifyImageResponse;
import com.weddingapp.nickkaty.resource.response.SpotifyTrackResponse;
import com.weddingapp.nickkaty.util.Constants;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotifyTrackResource implements Serializable {

	private static final long serialVersionUID = 1L;

	private String albumName;
	private String artistName;
	private Integer imgHeight;
	private String imgSrc;
	private Integer imgWidth;
	private String trackApiUrl;
	private String trackExternalUrl;
	private String trackId;
	private String trackName;
	private String trackSpotifyUri;

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
		return "SpotifyTrackObject [trackId=" + trackId + ", trackExternalUrl=" + trackExternalUrl + ", trackApiUrl="
				+ trackApiUrl + ", trackSpotifyUri=" + trackSpotifyUri + ", trackName=" + trackName + ", artistName="
				+ artistName + ", albumName=" + albumName + ", imgSrc=" + imgSrc + ", imgWidth=" + imgWidth
				+ ", imgHeight=" + imgHeight + "]";
	}
	
	public static SpotifyTrackResource fromResponse(SpotifyTrackResponse resp, SpotifyAlbumResource album) {
		
		SpotifyTrackResource obj = new SpotifyTrackResource();
		obj.setTrackId(resp.getId() != null ? resp.getId() : null);
		obj.setTrackExternalUrl(resp.getExternal_urls().getSpotify() != null ? resp.getExternal_urls().getSpotify() : null);
		obj.setTrackSpotifyUri(resp.getHref() != null ? resp.getHref() : null);
		obj.setTrackApiUrl(resp.getUri() != null ? resp.getUri() : null);
		obj.setTrackName(resp.getName() != null ? resp.getName() : resp.getName());
		
		if(resp.getArtists() != null && !resp.getArtists().isEmpty()) {
			StringBuffer buf = new StringBuffer();
			for(SpotifyArtistResponse artist : resp.getArtists()) {
				if(resp.getArtists().indexOf(artist) == (resp.getArtists().size() - 1)) {
					buf.append(artist.getName());
				} else {
					buf.append(artist.getName());
					buf.append(" / ");
				}
			}
			
			obj.setArtistName(buf.toString());
		}
		
		if(null != album) {
			obj.setAlbumName(album.getAlbumName() != null ? album.getAlbumName() : null);
			obj.setImgSrc(album.getImgSrc() != null ? album.getImgSrc() : Constants.SPOTIFY_DEFAULT_TRACK_IMG);
			obj.setImgWidth(album.getImgWidth() != null ? album.getImgWidth() : Integer.valueOf(0));
			obj.setImgHeight(album.getImgHeight() != null ? album.getImgHeight() : Integer.valueOf(0));
		} else {
			obj.setAlbumName(resp.getAlbum().getName() != null ? resp.getAlbum().getName() : null);
			if(resp.getAlbum().getImages() != null && !resp.getAlbum().getImages().isEmpty()) {
				for(SpotifyImageResponse img : resp.getAlbum().getImages()){
					obj.setImgSrc(img.getUrl() != null ? img.getUrl() : Constants.SPOTIFY_DEFAULT_TRACK_IMG);
					obj.setImgWidth(img.getWidth() != null ? img.getWidth() : Integer.valueOf(0));
					obj.setImgHeight(img.getHeight() != null ? img.getHeight() : Integer.valueOf(0));
				}
			}
		}
		
		
		return obj;
	}
	
	public static List<SpotifyTrackResource> fromResponse(List<SpotifyTrackResponse> respList, SpotifyAlbumResource album) {
		
		List<SpotifyTrackResource> objList = new ArrayList<>();
		for(SpotifyTrackResponse resp : respList) {
			objList.add(fromResponse(resp, album));
		}
		
		return objList;
	}
}
