package com.weddingapp.nickkaty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weddingapp.nickkaty.domain.AdditionalGuest;
import com.weddingapp.nickkaty.domain.Guest;

/**
 * Service Interface to call the {@link AdditionalGuest} Repository Method.
 * 
 * @since 22 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public interface IAdditionalGuestService {

    /**
     * Method to persist a {@link AdditionalGuest} in to Datastore
     * 
     * @param addGuest
     */
    void save(final AdditionalGuest addGuest);

    /**
     * Method to remove a {@link AdditionalGuest} from Datastore
     * 
     * @param addGuest
     */
    void delete(final AdditionalGuest addGuest);

    /**
     * Method to get a {@link AdditionalGuest} from the Datastore through its
     * Name
     * 
     * @param name
     * @return
     */
    AdditionalGuest findByName(final String name);

    /**
     * Method to get a List of {@link AdditionalGuest} from the Datastore
     * through the {@link Guest}
     * 
     * @param guest
     * @return
     */
    List<AdditionalGuest> findByMainGuest(final Guest guest);

}
