package com.weddingapp.nickkaty.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.MessageToCouple;

/**
 * Repository Interface to access the {@link MessageToCouple} information
 * 
 * @since 24 de nov de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public interface IMessageToCoupleRepository {

	/**
	 * Method to persist a new {@link MessageToCouple} into Datastore
	 * 
	 * @param msg
	 * @return Key of the object persisted
	 */
	Key<MessageToCouple> save(final MessageToCouple msg);
	
	/**
	 * Method to delete a specific {@link MessageToCouple} from Datastore
	 * 
	 * @param msg
	 */
	void delete(MessageToCouple msg);
	
	/**
	 * Method to get a specific {@link MessageToCouple} from Datastore by its ID
	 * 
	 * @param id
	 * @return {@link MessageToCouple}
	 */
	MessageToCouple findById(final Long id);
	
	/**
	 * Method to get a list of {@link MessageToCouple} from Datastore by the Author's name 
	 * 
	 * @param author
	 * @return List of Messages
	 */
	List<MessageToCouple> findByAuthor(final String author);
	
	/**
	 * Method to get all {@link MessageToCouple} from Datastore
	 * 
	 * @return
	 */
	List<MessageToCouple> findAll();
}
