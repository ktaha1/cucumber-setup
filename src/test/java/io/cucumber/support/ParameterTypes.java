package io.cucumber.support;

import io.cucumber.java.ParameterType;
import io.cucumber.shouty.model.Person;

public class ParameterTypes {

    @ParameterType("Lucy|Sean")
    public Person person(String name){
        return new Person(name);
    }
}
