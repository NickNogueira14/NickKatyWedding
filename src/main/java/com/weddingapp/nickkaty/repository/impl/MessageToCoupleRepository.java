/**
 * 
 */
package com.weddingapp.nickkaty.repository.impl;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.MessageToCouple;
import com.weddingapp.nickkaty.repository.IMessageToCoupleRepository;

/**
 * Repository Implementation to access the {@link MessageToCouple} information
 * 
 * @since 24 de nov de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public class MessageToCoupleRepository implements IMessageToCoupleRepository {

	/**
	 * Method to persist a new {@link MessageToCouple} into Datastore
	 * 
	 * @param msg
	 * @return Key of the object persisted
	 */
	@Override
	public Key<MessageToCouple> save(MessageToCouple msg) {
		return ofy().save().entity(msg).now();
	}

	/**
	 * Method to delete a specific {@link MessageToCouple} from Datastore
	 * 
	 * @param msg
	 */
	@Override
	public void delete(MessageToCouple msg) {
		ofy().delete().entity(msg).now();
	}

	/**
	 * Method to get a specific {@link MessageToCouple} from Datastore by its ID
	 * 
	 * @param id
	 * @return {@link MessageToCouple}
	 */
	@Override
	public MessageToCouple findById(Long id) {
		return ofy().load().type(MessageToCouple.class).id(id).now();
	}

	/**
	 * Method to get a list of {@link MessageToCouple} from Datastore by the Author's name 
	 * 
	 * @param author
	 * @return List of Messages
	 */
	@Override
	public List<MessageToCouple> findByAuthor(String author) {
		return ofy().load().type(MessageToCouple.class).filter("msgAuthor", author).list();
	}

	/**
	 * Method to get all {@link MessageToCouple} from Datastore
	 * 
	 * @return
	 */
	@Override
	public List<MessageToCouple> findAll() {
		return ofy().load().type(MessageToCouple.class).list();
	}

}
