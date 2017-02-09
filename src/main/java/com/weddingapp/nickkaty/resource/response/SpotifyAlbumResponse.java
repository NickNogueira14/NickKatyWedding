/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 
 * @since 25 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyAlbumResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String album_type;
	private List<SpotifyArtistResponse> artists;
	private List<String> available_markets;
	private List<SpotifyCopyrightResponse> copyrights;
	private SpotifyExternalIdResponse external_ids;
	private SpotifyExternalUrlResponse external_urls;
	private List<String> genres;
	private String href;
	private String id;
	private List<SpotifyImageResponse> images;
	private String label;
	private String name;
	private Integer popularity;
	private String release_date;
	private String release_date_precision;
	private SpotifyTrackResponse tracks;
	private String type;
	private String uri;

	/**
	 * @return the album_type
	 */
	public String getAlbum_type() {
		return album_type;
	}

	/**
	 * @param album_type
	 *            the album_type to set
	 */
	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	/**
	 * @return the artists
	 */
	public List<SpotifyArtistResponse> getArtists() {
		return artists;
	}

	/**
	 * @param artists
	 *            the artists to set
	 */
	public void setArtists(List<SpotifyArtistResponse> artists) {
		this.artists = artists;
	}

	/**
	 * @return the available_markets
	 */
	public List<String> getAvailable_markets() {
		return available_markets;
	}

	/**
	 * @param available_markets
	 *            the available_markets to set
	 */
	public void setAvailable_markets(List<String> available_markets) {
		this.available_markets = available_markets;
	}

	/**
	 * @return the copyrights
	 */
	public List<SpotifyCopyrightResponse> getCopyrights() {
		return copyrights;
	}

	/**
	 * @param copyrights
	 *            the copyrights to set
	 */
	public void setCopyrights(List<SpotifyCopyrightResponse> copyrights) {
		this.copyrights = copyrights;
	}

	/**
	 * @return the external_ids
	 */
	public SpotifyExternalIdResponse getExternal_ids() {
		return external_ids;
	}

	/**
	 * @param external_ids
	 *            the external_ids to set
	 */
	public void setExternal_ids(SpotifyExternalIdResponse external_ids) {
		this.external_ids = external_ids;
	}

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
	 * @return the genres
	 */
	public List<String> getGenres() {
		return genres;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
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
	 * @return the images
	 */
	public List<SpotifyImageResponse> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<SpotifyImageResponse> images) {
		this.images = images;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the popularity
	 */
	public Integer getPopularity() {
		return popularity;
	}

	/**
	 * @param popularity
	 *            the popularity to set
	 */
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	/**
	 * @return the release_date
	 */
	public String getRelease_date() {
		return release_date;
	}

	/**
	 * @param release_date
	 *            the release_date to set
	 */
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	/**
	 * @return the release_date_precision
	 */
	public String getRelease_date_precision() {
		return release_date_precision;
	}

	/**
	 * @param release_date_precision
	 *            the release_date_precision to set
	 */
	public void setRelease_date_precision(String release_date_precision) {
		this.release_date_precision = release_date_precision;
	}

	/**
	 * @return the tracks
	 */
	public SpotifyTrackResponse getTracks() {
		return tracks;
	}

	/**
	 * @param tracks
	 *            the tracks to set
	 */
	public void setTracks(SpotifyTrackResponse tracks) {
		this.tracks = tracks;
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
		return "SpotifyAlbumResponse [album_type=" + album_type + ", artists=" + artists + ", available_markets="
				+ available_markets + ", copyrights=" + copyrights + ", external_ids=" + external_ids
				+ ", external_urls=" + external_urls + ", genres=" + genres + ", href=" + href + ", id=" + id
				+ ", images=" + images + ", label=" + label + ", name=" + name + ", popularity=" + popularity
				+ ", release_date=" + release_date + ", release_date_precision=" + release_date_precision + ", tracks="
				+ tracks + ", type=" + type + ", uri=" + uri + "]";
	}

}
