/**
 * 
 */
package com.weddingapp.nickkaty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.MessageToCouple;
import com.weddingapp.nickkaty.repository.IMessageToCoupleRepository;
import com.weddingapp.nickkaty.service.IMessageToCoupleService;

/**
 * Service Implementation to call the {@link MessageToCouple} Repository Method.
 * 
 * @since 24 de nov de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public class MessageToCoupleService implements IMessageToCoupleService {
	
	@Autowired
	private IMessageToCoupleRepository repository;

	/**
	 * Method to persist a new {@link MessageToCouple} into Datastore
	 * 
	 * @param msg
	 * @return Key of the object persisted
	 */
	@Override
	public Key<MessageToCouple> save(MessageToCouple msg) {
		return repository.save(msg);
	}

	/**
	 * Method to delete a specific {@link MessageToCouple} from Datastore
	 * 
	 * @param msg
	 */
	@Override
	public void delete(MessageToCouple msg) {
		repository.delete(msg);
	}

	/**
	 * Method to get a specific {@link MessageToCouple} from Datastore by its ID
	 * 
	 * @param id
	 * @return {@link MessageToCouple}
	 */
	@Override
	public MessageToCouple findById(Long id) {
		return repository.findById(id);
	}

	/**
	 * Method to get a list of {@link MessageToCouple} from Datastore by the Author's name 
	 * 
	 * @param author
	 * @return List of Messages
	 */
	@Override
	public List<MessageToCouple> findByAuthor(String author) {
		return repository.findByAuthor(author);
	}

	/**
	 * Method to get all {@link MessageToCouple} from Datastore
	 * 
	 * @return
	 */
	@Override
	public List<MessageToCouple> findAll() {
		return repository.findAll();
	}

}
