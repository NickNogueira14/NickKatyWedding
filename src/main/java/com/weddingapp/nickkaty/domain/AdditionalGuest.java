package com.weddingapp.nickkaty.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Entity that references the Kind AdditionalGuest in Datastore
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Entity
public class AdditionalGuest {

	@Id
	private Long addGuestKey;

	@Index
	private String addGuestName;
	private Integer addGuestAge;
	
	@Index
	private Long mainGuestId;

	/**
	 * @return the addGuestKey
	 */
	public Long getAddGuestKey() {
		return addGuestKey;
	}

	/**
	 * @param addGuestKey
	 *            the addGuestKey to set
	 */
	public void setAddGuestKey(Long addGuestKey) {
		this.addGuestKey = addGuestKey;
	}

	/**
	 * @return the addGuestName
	 */
	public String getAddGuestName() {
		return addGuestName;
	}

	/**
	 * @param addGuestName
	 *            the addGuestName to set
	 */
	public void setAddGuestName(String addGuestName) {
		this.addGuestName = addGuestName;
	}

	/**
	 * @return the addGuestAge
	 */
	public Integer getAddGuestAge() {
		return addGuestAge;
	}

	/**
	 * @param addGuestAge
	 *            the addGuestAge to set
	 */
	public void setAddGuestAge(Integer addGuestAge) {
		this.addGuestAge = addGuestAge;
	}

	/**
	 * @return the mainGuestId
	 */
	public Long getMainGuestId() {
		return mainGuestId;
	}

	/**
	 * @param mainGuestId the mainGuestId to set
	 */
	public void setMainGuestId(Long mainGuestId) {
		this.mainGuestId = mainGuestId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AdditionalGuest [addGuestKey=" + addGuestKey + ", addGuestName=" + addGuestName + ", addGuestAge="
				+ addGuestAge + ", mainGuestId=" + mainGuestId + "]";
	}

}
