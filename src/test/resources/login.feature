Feature: Validating login function of facebook Application

  Scenario: Login with incorrect username and incorrect password
    Given User is on Facebook Page
    When user enter username and password
    And user should click login button
    Then user need to verify home page is oprated or not
