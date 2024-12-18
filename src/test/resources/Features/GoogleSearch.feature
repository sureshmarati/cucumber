Feature: feature to test google search functionality

  Scenario: validate google search is working
    Given User opens the Chrome browser
    And User is on google search page
    When user enters data in serach
    And user clicks on enter
    Then Search results displayed
