Feature: To validate different Login Scenario

  @smoke
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


    @smoke
  Scenario: To validate login feature when correct email and correct password is entered using regular Expression
    Given Open the browser
    Given Enter the url
    And Click on My Account icon
    When Click on login Link
    And Enter correct email as "ben.fletcher@janbask.com"
    And Enter correct password as "test@1234"
    When Click on Login button
    Then Validate Login Status
    And Close the browser

      @regression
  Scenario: To validate login feature when correct email and correct password is entered using Data Table
    Given Open the browser
    Given Enter the url
    And Click on My Account icon
    When Click on login Link
    And Enter correct credentials
      | forest.grump@janbask.com | test@1234 | 29 | London |
    When Click on Login button
    Then Validate Login Status
    And Close the browser

        @sanity
  Scenario Outline: To validate login feature when correct email and correct password is entered using parameterization
    Given Open the browser
    Given Enter the url
    And Click on My Account icon
    When Click on login Link
    And Enter correct "<email>" and correct "<password>"
    When Click on Login button
    Then Validate Login Status
    And Close the browser
    Examples:
      | email                    | password  |
      | jason.roger@janbask.com  | test@1234 |
      | ben.fletcher@janbask.com | test@1234 |
      | forest.grump@janbask.com | test@1234 |
