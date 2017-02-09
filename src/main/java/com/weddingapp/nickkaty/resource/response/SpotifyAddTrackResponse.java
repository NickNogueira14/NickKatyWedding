/**
 * 
 */
package com.weddingapp.nickkaty.resource.response;

import java.io.Serializable;

/**
 * 
 * 
 * @since 30 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class SpotifyAddTrackResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String snapshot_id;

	/**
	 * @return the snapshot_id
	 */
	public String getSnapshot_id() {
		return snapshot_id;
	}

	/**
	 * @param snapshot_id the snapshot_id to set
	 */
	public void setSnapshot_id(String snapshot_id) {
		this.snapshot_id = snapshot_id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpotifyAddTrackResponse [snapshot_id=" + snapshot_id + "]";
	}
	

}
