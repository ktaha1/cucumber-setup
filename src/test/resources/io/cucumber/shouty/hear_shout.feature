Feature: Hear shout

  Shouty allows users to "hear" other users "shout" as long as they are close enough to each other.

  To do:
    - Only shout to people within a certain distance

  Rule: Shouts can be heard by other users within a range
  Scenario: Listener is within range
    Given Lucy is located 15 metres from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within of range
    Given Lucy is located 1 metre from Sean
    When Sean shouts "Come and get a taste!"
    Then Lucy hears Sean's message

  Rule: Shouts can be heard by other users

  Rule: Shouts cannot be heard by other users out of range