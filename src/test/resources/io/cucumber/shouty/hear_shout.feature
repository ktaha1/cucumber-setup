Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 15 metres from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is out of range
    Given Lucy is located 10 metres from Sean
    When Sean shouts "Come and get a taste!"
    Then Lucy hears Sean's message