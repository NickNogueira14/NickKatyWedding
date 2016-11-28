package com.weddingapp.nickkaty.repository.impl;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.repository.IGuestRepository;

/**
 * Repository implementation to access the {@link Guest} information
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public class GuestRepository implements IGuestRepository {

    /**
     * Method to persist a {@link Guest} in to Datastore
     * 
     * @param guest
     * @return
     * @return
     */
    @Override
    public Key<Guest> save(Guest guest) {
        return ofy().save().entity(guest).now();
    }

    /**
     * Method to remove a {@link Guest} from Datastore
     * 
     * @param guest
     */
    @Override
    public void delete(Guest guest) {
        ofy().delete().entity(guest).now();
    }

    /**
     * Method to get a {@link Guest} from the Datastore through its Key
     * 
     * @param id
     * @return
     */
    @Override
    public Guest findById(Long id) {
        return ofy().load().type(Guest.class).id(id).now();
    }

    /**
     * Method to get a {@link Guest} from the Datastore through its Name
     * 
     * @param name
     * @return
     */
    @Override
    public Guest findByName(String name) {
        return ofy().load().type(Guest.class).filter("guestName", name).first().now();
    }

    /**
     * Method to get a {@link Guest} from the Datastore through its E-Mail
     * 
     * @param email
     * @return
     */
    @Override
    public Guest findByEmail(String email) {
        return ofy().load().type(Guest.class).filter("guestEmail", email).first().now();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.weddingapp.nickkaty.repository.IGuestRepository#findAll()
     */
    @Override
    public List<Guest> findAll() {
        return ofy().load().type(Guest.class).list();
    }

}
