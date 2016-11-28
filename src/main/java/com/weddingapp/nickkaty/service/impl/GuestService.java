package com.weddingapp.nickkaty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.repository.IGuestRepository;
import com.weddingapp.nickkaty.service.IGuestService;

/**
 * Service Implementation to call the {@link Guest} Repository Method.
 * 
 * @since 22 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public class GuestService implements IGuestService {

    @Autowired
    private IGuestRepository guestRepository;

    /**
     * Method to persist a {@link Guest} in to Datastore
     * 
     * @param guest
     * @return
     */
    @Override
    public Key<Guest> save(Guest guest) {
        return guestRepository.save(guest);
    }

    /**
     * Method to remove a {@link Guest} from Datastore
     * 
     * @param guest
     */
    @Override
    public void delete(Guest guest) {
        guestRepository.delete(guest);

    }

    /**
     * Method to get a {@link Guest} from the Datastore through its Key
     * 
     * @param id
     * @return
     */
    @Override
    public Guest findById(Long id) {
        return guestRepository.findById(id);
    }

    /**
     * Method to get a {@link Guest} from the Datastore through its Name
     * 
     * @param name
     * @return
     */
    @Override
    public Guest findByName(String name) {
        return guestRepository.findByName(name);
    }

    /**
     * Method to get a {@link Guest} from the Datastore through its E-Mail
     * 
     * @param email
     * @return
     */
    @Override
    public Guest findByEmail(String email) {
        return guestRepository.findByEmail(email);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.weddingapp.nickkaty.service.IGuestService#findAll()
     */
    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

}
