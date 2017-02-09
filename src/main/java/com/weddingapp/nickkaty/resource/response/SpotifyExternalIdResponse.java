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
public class SpotifyExternalIdResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String isrc;
	private String ean;
	private String upc;

	/**
	 * @return the isrc
	 */
	public String getIsrc() {
		return isrc;
	}

	/**
	 * @param isrc
	 *            the isrc to set
	 */
	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	/**
	 * @return the ean
	 */
	public String getEan() {
		return ean;
	}

	/**
	 * @param ean
	 *            the ean to set
	 */
	public void setEan(String ean) {
		this.ean = ean;
	}

	/**
	 * @return the upc
	 */
	public String getUpc() {
		return upc;
	}

	/**
	 * @param upc
	 *            the upc to set
	 */
	public void setUpc(String upc) {
		this.upc = upc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyExternalIdResponse [isrc=" + isrc + ", ean=" + ean + ", upc=" + upc + "]";
	}

}
