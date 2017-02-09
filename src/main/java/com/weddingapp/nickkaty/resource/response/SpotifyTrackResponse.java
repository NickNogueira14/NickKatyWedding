/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * 
 * @since 25 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotifyTrackResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private SpotifyAlbumResponse album;
	private List<SpotifyArtistResponse> artists;
	private List<String> available_markets;
	private Integer disc_number;
	private Integer duration_ms;
	private Boolean explicit;
	private SpotifyExternalIdResponse external_ids;
	private SpotifyExternalUrlResponse external_urls;
	private String href;
	private String id;
	private Boolean is_playable;
	private SpotifyTrackLinkResponse linked_from;
	private String name;
	private Integer popularity;
	private String preview_url;
	private Integer track_number;
	private String type;
	private String uri;

	/**
	 * @return the album
	 */
	public SpotifyAlbumResponse getAlbum() {
		return album;
	}

	/**
	 * @param album
	 *            the album to set
	 */
	public void setAlbum(SpotifyAlbumResponse album) {
		this.album = album;
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
	 * @return the disc_number
	 */
	public Integer getDisc_number() {
		return disc_number;
	}

	/**
	 * @param disc_number
	 *            the disc_number to set
	 */
	public void setDisc_number(Integer disc_number) {
		this.disc_number = disc_number;
	}

	/**
	 * @return the duration_ms
	 */
	public Integer getDuration_ms() {
		return duration_ms;
	}

	/**
	 * @param duration_ms
	 *            the duration_ms to set
	 */
	public void setDuration_ms(Integer duration_ms) {
		this.duration_ms = duration_ms;
	}

	/**
	 * @return the explicit
	 */
	public Boolean getExplicit() {
		return explicit;
	}

	/**
	 * @param explicit
	 *            the explicit to set
	 */
	public void setExplicit(Boolean explicit) {
		this.explicit = explicit;
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
	 * @return the is_playable
	 */
	public Boolean getIs_playable() {
		return is_playable;
	}

	/**
	 * @param is_playable
	 *            the is_playable to set
	 */
	public void setIs_playable(Boolean is_playable) {
		this.is_playable = is_playable;
	}

	/**
	 * @return the linked_from
	 */
	public SpotifyTrackLinkResponse getLinked_from() {
		return linked_from;
	}

	/**
	 * @param linked_from
	 *            the linked_from to set
	 */
	public void setLinked_from(SpotifyTrackLinkResponse linked_from) {
		this.linked_from = linked_from;
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
	 * @return the preview_url
	 */
	public String getPreview_url() {
		return preview_url;
	}

	/**
	 * @param preview_url
	 *            the preview_url to set
	 */
	public void setPreview_url(String preview_url) {
		this.preview_url = preview_url;
	}

	/**
	 * @return the track_number
	 */
	public Integer getTrack_number() {
		return track_number;
	}

	/**
	 * @param track_number
	 *            the track_number to set
	 */
	public void setTrack_number(Integer track_number) {
		this.track_number = track_number;
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
		return "SpotifyTrackResponse [album=" + album + ", artists=" + artists + ", available_markets="
				+ available_markets + ", disc_number=" + disc_number + ", duration_ms=" + duration_ms + ", explicit="
				+ explicit + ", external_ids=" + external_ids + ", external_urls=" + external_urls + ", href=" + href
				+ ", id=" + id + ", is_playable=" + is_playable + ", linked_from=" + linked_from + ", name=" + name
				+ ", popularity=" + popularity + ", preview_url=" + preview_url + ", track_number=" + track_number
				+ ", type=" + type + ", uri=" + uri + "]";
	}

}
