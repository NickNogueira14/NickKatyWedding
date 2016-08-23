package com.weddingapp.nickkaty.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.service.IGuestService;

/**
 *
 * 
 * @since 22 de ago de 2016
 * @author <a href="mailto:viniceranogueira@gmail.com">Vinicius Nogueira</a>
 * 
 */
@RestController
@RequestMapping(value = "/confirmation")
public class ConfirmationController {

    @Autowired
    private IGuestService guestService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String addGuestConfirmation(@RequestBody Guest guest, HttpServletRequest request,
            HttpServletResponse response) {

        if (guestService.save(guest) != null) {
            return "OK";
        } else {
            return "FAIL";
        }

    }

}
