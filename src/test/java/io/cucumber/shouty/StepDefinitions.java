package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.shouty.model.Person;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private final Person sean;
    private final Person lucy;

    public StepDefinitions() {
        this.sean = new Person();
        this.lucy = new Person();
    }

    @Given ("Lucy is located {int} metres from Sean")
    public void lucy_is_located_metres_from_sean(Integer distance) {
        lucy.moveTo(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        lucy.hear(sean.getMessageShouted());
        Assertions.assertEquals(sean.getMessageShouted(), lucy.getMessagesHeard());
    }
}
