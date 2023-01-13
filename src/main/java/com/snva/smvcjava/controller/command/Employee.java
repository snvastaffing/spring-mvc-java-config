package com.snva.smvcjava.controller.command;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {


    @NotEmpty
    @Size(min = 1 , message = "This field is required, please enter a valid name !")
    private String firstName;
    @NotEmpty
    @Pattern(regexp = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@edu*(\\.[a-zA-Z]{1,6}))?$" , message = "Only the college students with a valid edu can signup")
    private String email;
    @NotEmpty
    @Size(min = 1 , message = "This field is required, please enter a valid name !")
    private  String lastName;
    @NotNull()
    @Size(min = 1 , message = "This field is required, please enter a valid name !")
    private String contactNumber;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
