package br.com.finance.finance.controller;

import br.com.finance.finance.model.CreditCard;
import br.com.finance.finance.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

    @Autowired
    private CreditCardService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditCard findById(@PathVariable(value = "id") String id)
        throws Exception{

        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CreditCard> findAll(){
        return service.findAll();
    }

}
