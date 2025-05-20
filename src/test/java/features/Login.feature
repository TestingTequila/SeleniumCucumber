Feature: To validate different Login Scenario

  Scenario: To validate login feature when correct email and correct password is entered
    Given Open the browser
    Given Enter the url
    And Click on My Account icon
    When Click on login Link
    And Enter correct email
    And Enter correct password
    When Click on Login button
    Then Validate Login Status
    And Close the browser
