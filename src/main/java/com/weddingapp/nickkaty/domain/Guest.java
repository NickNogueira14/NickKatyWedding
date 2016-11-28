package com.weddingapp.nickkaty.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Entity that references the Kind Guest in Datastore
 * 
 * @since 18 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Entity
public class Guest {

    @Id
    private Long guestKey;

    @Index
    private String guestName;
    private String guestEmail;
    private String guestTelephone;
    private Integer quantityAddGuests;
    private String guestNotes;

    /**
     * @return the guestKey
     */
    public Long getGuestKey() {
        return guestKey;
    }

    /**
     * @param guestKey
     *            the guestKey to set
     */
    public void setGuestKey(Long guestKey) {
        this.guestKey = guestKey;
    }

    /**
     * @return the guestName
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * @param guestName
     *            the guestName to set
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    /**
     * @return the guestEmail
     */
    public String getGuestEmail() {
        return guestEmail;
    }

    /**
     * @param guestEmail
     *            the guestEmail to set
     */
    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    /**
     * @return the guestTelephone
     */
    public String getGuestTelephone() {
        return guestTelephone;
    }

    /**
     * @param guestTelephone
     *            the guestTelephone to set
     */
    public void setGuestTelephone(String guestTelephone) {
        this.guestTelephone = guestTelephone;
    }

    /**
     * @return the quantityAddGuests
     */
    public Integer getQuantityAddGuests() {
        return quantityAddGuests;
    }

    /**
     * @param quantityAddGuests
     *            the quantityAddGuests to set
     */
    public void setQuantityAddGuests(Integer quantityAddGuests) {
        this.quantityAddGuests = quantityAddGuests;
    }

    /**
     * @return the guestNotes
     */
    public String getGuestNotes() {
        return guestNotes;
    }

    /**
     * @param guestNotes
     *            the guestNotes to set
     */
    public void setGuestNotes(String guestNotes) {
        this.guestNotes = guestNotes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Guest [guestKey=" + guestKey + ", guestName=" + guestName + ", guestEmail=" + guestEmail
                + ", guestTelephone=" + guestTelephone + ", quantityAddGuests=" + quantityAddGuests + ", guestNotes="
                + guestNotes + "]";
    }

}
