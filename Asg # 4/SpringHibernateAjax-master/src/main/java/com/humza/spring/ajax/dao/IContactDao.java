
package com.humza.spring.ajax.dao;

import com.humza.spring.ajax.entity.Contact;
import java.io.Serializable;
import java.util.List;

public interface IContactDao<T extends Serializable> {
    
    void save(Contact contact);
    
    List<Contact> findAll();
    
    Contact findByName(String firstName, String lastName);
    
    List<Contact> findByFirstName(String firstName);

    Contact getContactById(int id);

    void deleteEntity(int id);
}
