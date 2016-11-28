package com.weddingapp.nickkaty.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.Guest;

/**
 * Repository Interface to access the {@link Guest} information
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public interface IGuestRepository {

    /**
     * Method to persist a {@link Guest} in to Datastore
     * 
     * @param guest
     * @return
     */
    Key<Guest> save(final Guest guest);

    /**
     * Method to remove a {@link Guest} from Datastore
     * 
     * @param guest
     */
    void delete(final Guest guest);

    /**
     * Method to get a {@link Guest} from the Datastore through its Key
     * 
     * @param id
     * @return
     */
    Guest findById(final Long id);

    /**
     * Method to get a {@link Guest} from the Datastore through its Name
     * 
     * @param name
     * @return
     */
    Guest findByName(final String name);

    /**
     * Method to get a {@link Guest} from the Datastore through its E-Mail
     * 
     * @param email
     * @return
     */
    Guest findByEmail(final String email);

    List<Guest> findAll();

}
