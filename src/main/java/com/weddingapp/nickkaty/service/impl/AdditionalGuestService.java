package com.weddingapp.nickkaty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingapp.nickkaty.domain.AdditionalGuest;
import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.repository.IAdditionalGuestRepository;
import com.weddingapp.nickkaty.service.IAdditionalGuestService;

/**
 *
 * 
 * @since 22 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Service
public class AdditionalGuestService implements IAdditionalGuestService {

    @Autowired
    private IAdditionalGuestRepository additionalGuestRepository;

    /**
     * Method to persist a {@link AdditionalGuest} in to Datastore
     * 
     * @param addGuest
     */
    @Override
    public void save(AdditionalGuest addGuest) {
        additionalGuestRepository.save(addGuest);
    }

    /**
     * Method to remove a {@link AdditionalGuest} from Datastore
     * 
     * @param addGuest
     */
    @Override
    public void delete(AdditionalGuest addGuest) {
        additionalGuestRepository.delete(addGuest);
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
        return additionalGuestRepository.findByName(name);
    }

    /**
     * Method to get a List of {@link AdditionalGuest} from the Datastore
     * through the {@link Guest}
     * 
     * @param guest
     * @return
     */
    @Override
    public List<AdditionalGuest> findByMainGuest(Long mainGuestId) {
        return additionalGuestRepository.findByMainGuest(mainGuestId);
    }

}
