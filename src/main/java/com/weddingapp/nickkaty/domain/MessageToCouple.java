package com.weddingapp.nickkaty.domain;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Entity that references the Kind MessageToCouple in Datastore
 * 
 * @since 24 de nov de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Entity
public class MessageToCouple {

	@Id
	private Long messageKey;
	private String messageContent;
	@Index
	private String messageAuthor;
	private Date messageCreate;

	/**
	 * @return the messageKey
	 */
	public Long getMessageKey() {
		return messageKey;
	}

	/**
	 * @param messageKey
	 *            the messageKey to set
	 */
	public void setMessageKey(Long messageKey) {
		this.messageKey = messageKey;
	}

	/**
	 * @return the messageContent
	 */
	public String getMessageContent() {
		return messageContent;
	}

	/**
	 * @param messageContent
	 *            the messageContent to set
	 */
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	/**
	 * @return the messageAuthor
	 */
	public String getMessageAuthor() {
		return messageAuthor;
	}

	/**
	 * @param messageAuthor
	 *            the messageAuthor to set
	 */
	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}

	/**
	 * @return the messageCreate
	 */
	public Date getMessageCreate() {
		return messageCreate;
	}

	/**
	 * @param messageCreate
	 *            the messageCreate to set
	 */
	public void setMessageCreate(Date messageCreate) {
		this.messageCreate = messageCreate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MessageToCouple [messageKey=" + messageKey + ", messageContent=" + messageContent + ", messageAuthor="
				+ messageAuthor + ", messageCreate=" + messageCreate + "]";
	}
}
