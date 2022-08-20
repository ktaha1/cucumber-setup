package io.cucumber.shouty.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private List<String> messageShouted;
    private List<String> messagesHeard;
    private int distance;
    private final int range=20;

    private String name;
    public void moveTo(Integer distance) {
        this.distance=distance;

    }

    public Person(String name){
        this.name = name;
    }

    public void shout(String message) {
        if (this.messageShouted==null) this.messageShouted = new ArrayList<>();
        this.messageShouted.add(message);
    }


    public void hear(List<String> messageShouted) {
        if (distance<=range){
            if (this.messagesHeard==null) this.messagesHeard = new ArrayList<>();
            this.messagesHeard.addAll(messageShouted);
        }
    }
}
