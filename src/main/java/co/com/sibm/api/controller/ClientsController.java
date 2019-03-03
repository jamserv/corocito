package co.com.sibm.api.controller;

import co.com.sibm.api.model.Client;
import co.com.sibm.api.repository.ClientsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    ClientsDAO repository;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    Iterable<Client> getAllUsers() {
        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.POST)
    Client add(@RequestBody Client model) {
        return repository.save(model);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.DELETE)
    void delete(@RequestParam("id") Integer id) {
        repository.deleteById(id);
    }
}
