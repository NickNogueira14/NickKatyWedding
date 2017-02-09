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
 * @param <obj>
 * 
 */
public class SpotifyPagingResponse<obj> implements Serializable {

	private static final long serialVersionUID = 1L;

	private String href;
	private List<SpotifyTrackResponse> items;
	private Integer limit;
	private String next;
	private Integer offset;
	private String previous;
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
	 * @return the items
	 */
	public List<SpotifyTrackResponse> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<SpotifyTrackResponse> items) {
		this.items = items;
	}

	/**
	 * @return the limit
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * @param limit
	 *            the limit to set
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * @return the next
	 */
	public String getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(String next) {
		this.next = next;
	}

	/**
	 * @return the offset
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	/**
	 * @return the previous
	 */
	public String getPrevious() {
		return previous;
	}

	/**
	 * @param previous
	 *            the previous to set
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
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
		return "SpotifyResponseObject [href=" + href + ", items=" + items + ", limit=" + limit + ", next=" + next
				+ ", offset=" + offset + ", previous=" + previous + ", total=" + total + "]";
	}

}
