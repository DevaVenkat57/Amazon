Feature: Verifying the Facebook Signup Page

  Scenario Outline: Verifying facebook Signup details with valid credentials
    Given User is on the facebook page
    When User Should click the create new Acct button
    And User Should Sign up using "<firstname>" ,"<lastname>" , "<phno>"

    Examples: 
      | firstname | lastname | phno       |
      | hello     | world    | 9878878987 |
