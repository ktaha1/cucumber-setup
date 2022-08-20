package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.shouty.model.Person;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class StepDefinitions {
    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given ("Lucy is located {int} metres from Sean")
    public void lucy_is_located_metres_from_sean(Integer distance) {
        System.out.println("Distance : "+distance);
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        Assertions.assertEquals(Arrays.asList(messageFromSean), lucy.getMessagesHeard());
    }
}
