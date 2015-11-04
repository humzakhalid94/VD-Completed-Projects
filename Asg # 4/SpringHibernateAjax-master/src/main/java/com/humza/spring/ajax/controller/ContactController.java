
package com.humza.spring.ajax.controller;

import com.humza.spring.ajax.dao.IContactDao;
import com.humza.spring.ajax.dto.ContactDto;
import com.humza.spring.ajax.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("spring-ajax/contact")
public class ContactController {
    
    @Autowired
    private IContactDao dao;
    
    @RequestMapping("/home")
    public ModelAndView home(ModelMap model) {
        model.put("contacts", dao.findAll());
        return new ModelAndView("contact", model);
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Contact saveContact(Contact contact) {
        dao.save(contact);

        return contact;
    }
    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public Contact update(@PathVariable("id")int id,@RequestBody ContactDto contact){
        Contact stu=dao.getContactById(id);
        stu.setFirstName(contact.getFirstName());
        stu.setLastName(contact.getLastName());
        stu.setAge(contact.getAge());
        dao.save(stu);
        return stu;
    }

    @RequestMapping(value = "/remove/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id")int id){
        //dao.show(id);
        try {
            dao.deleteEntity(id);

        }
        catch (Exception e){
            e.getMessage();
        }

    }


    /*@RequestMapping(value = "/save", method = RequestMethod.POST)
    public @ResponseBody
    ContactDto saveContact(@RequestBody ContactDto contactDto) {
        dao.save(new Contact());

        return contactDto;
    }*/
    
    @RequestMapping(value = "/getJSON/{firstName}/{lastName}", method = RequestMethod.GET)
    @ResponseBody
    public Contact findByName(@PathVariable("firstName") String first, @PathVariable("lastName") String last) {
        Contact contact = dao.findByName(first, last);
        return contact;
    }
    
    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public ModelAndView load() {
        return new ModelAndView("/table");
    }
    
    @RequestMapping(value = "/load/{firstName}", method = RequestMethod.GET)
    public ModelAndView loadByName(@PathVariable("firstName") String firstName, ModelMap model) {
        model.put("contacts", dao.findByFirstName(firstName));
        return new ModelAndView("/search", model);
    }
}
