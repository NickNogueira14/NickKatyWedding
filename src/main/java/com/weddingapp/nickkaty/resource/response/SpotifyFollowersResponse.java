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
public class SpotifyFollowersResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String href;
	private Integer total;

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
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyFollowersResponse [href=" + href + ", total=" + total + "]";
	}

}
