package com.weddingapp.nickkaty.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.weddingapp.nickkaty.domain.AdditionalGuest;
import com.weddingapp.nickkaty.domain.Guest;

/**
 * Repository Interface to access the {@link AdditionalGuest} information
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:viniceranogueira@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public interface IAdditionalGuestRepository {

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
