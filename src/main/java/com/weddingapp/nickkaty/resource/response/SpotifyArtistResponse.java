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
public class SpotifyArtistResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private SpotifyExternalUrlResponse external_urls;
	private SpotifyFollowersResponse followers;
	private List<String> genres;
	private String href;
	private String id;
	private List<SpotifyImageResponse> images;
	private String name;
	private Integer popularity;
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
	 * @return the followers
	 */
	public SpotifyFollowersResponse getFollowers() {
		return followers;
	}

	/**
	 * @param followers
	 *            the followers to set
	 */
	public void setFollowers(SpotifyFollowersResponse followers) {
		this.followers = followers;
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
		return "SpotifyArtistResponse [external_urls=" + external_urls + ", followers=" + followers + ", genres="
				+ genres + ", href=" + href + ", id=" + id + ", images=" + images + ", name=" + name + ", popularity="
				+ popularity + ", type=" + type + ", uri=" + uri + "]";
	}

}
