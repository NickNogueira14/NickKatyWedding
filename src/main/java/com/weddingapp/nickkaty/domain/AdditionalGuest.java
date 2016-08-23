package com.weddingapp.nickkaty.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 *
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:viniceranogueira@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Entity
public class AdditionalGuest {

    @Id
    private Long addGuestKey;

    @Index
    private String addGuestName;
    private Integer addGuestAge;

    @Index
    private Guest mainGuest;

    /**
     * @return the addGuestKey
     */
    public Long getAddGuestKey() {
        return addGuestKey;
    }

    /**
     * @param addGuestKey
     *            the addGuestKey to set
     */
    public void setAddGuestKey(Long addGuestKey) {
        this.addGuestKey = addGuestKey;
    }

    /**
     * @return the addGuestName
     */
    public String getAddGuestName() {
        return addGuestName;
    }

    /**
     * @param addGuestName
     *            the addGuestName to set
     */
    public void setAddGuestName(String addGuestName) {
        this.addGuestName = addGuestName;
    }

    /**
     * @return the addGuestAge
     */
    public Integer getAddGuestAge() {
        return addGuestAge;
    }

    /**
     * @param addGuestAge
     *            the addGuestAge to set
     */
    public void setAddGuestAge(Integer addGuestAge) {
        this.addGuestAge = addGuestAge;
    }

    /**
     * @return the mainGuest
     */
    public Guest getMainGuest() {
        return mainGuest;
    }

    /**
     * @param mainGuest
     *            the mainGuest to set
     */
    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AdditionalGuest [addGuestKey=" + addGuestKey + ", addGuestName=" + addGuestName + ", addGuestAge="
                + addGuestAge + ", mainGuest=" + mainGuest + "]";
    }

}
