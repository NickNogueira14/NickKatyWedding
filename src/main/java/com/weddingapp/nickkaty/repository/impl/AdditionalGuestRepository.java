package com.weddingapp.nickkaty.repository.impl;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.weddingapp.nickkaty.domain.AdditionalGuest;
import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.repository.IAdditionalGuestRepository;

/**
 *
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Repository
public class AdditionalGuestRepository implements IAdditionalGuestRepository {

    /**
     * Method to persist a {@link AdditionalGuest} in to Datastore
     * 
     * @param addGuest
     */
    @Override
    public void save(AdditionalGuest addGuest) {
        ofy().save().entity(addGuest).now();
    }

    /**
     * Method to remove a {@link AdditionalGuest} from Datastore
     * 
     * @param addGuest
     */
    @Override
    public void delete(AdditionalGuest addGuest) {
        ofy().delete().entity(addGuest).now();

    }

    /**
     * Method to get a {@link AdditionalGuest} from the Datastore through its
     * Name
     * 
     * @param name
     * @return
     */
    @Override
    public AdditionalGuest findByName(String name) {
        return ofy().load().type(AdditionalGuest.class).filter("addGuestName", name).first().now();
    }

    /**
     * Method to get a List of {@link AdditionalGuest} from the Datastore
     * through the {@link Guest}
     * 
     * @param guest
     * @return
     */
    @Override
    public List<AdditionalGuest> findByMainGuest(Long maindGuestId) {
        return ofy().load().type(AdditionalGuest.class).filter("mainGuestId", maindGuestId).list();
    }

}
