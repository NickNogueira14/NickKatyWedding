package com.weddingapp.nickkaty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.service.IGuestService;

/**
 *
 * 
 * @since 22 de ago de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Controller
@RequestMapping(value = "/confirmation")
public class ConfirmationController {

    @Autowired
    private IGuestService guestService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Guest addGuestConfirmation(@RequestBody Guest guest) {

        if (guestService.save(guest) != null) {
            return guestService.findByName(guest.getGuestName());
        } else {
            return new Guest();
        }

    }

    @ResponseBody
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Guest> findAll() {

        return guestService.findAll();
    }

}
