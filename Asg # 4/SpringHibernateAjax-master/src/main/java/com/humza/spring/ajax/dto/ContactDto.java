package com.humza.spring.ajax.dto;

/**
 * Created by humza on 11/3/2015.
 */
public class ContactDto {
    public String firstName;
    public String lastName;
    public Integer age;

    public ContactDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
