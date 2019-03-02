package co.com.sibm.api.controller;

import co.com.sibm.api.model.Group;
import co.com.sibm.api.repository.GroupsDAO;
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
@RequestMapping("/groups")
public class UserController {

    @Autowired
    GroupsDAO repository;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    Iterable<Group> getAllUsers() {
        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.POST)
    Group add(@RequestBody Group model) {
        return repository.save(model);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.DELETE)
    void delete(@RequestParam("id") Long id) {
        repository.deleteById(id);
    }

}
