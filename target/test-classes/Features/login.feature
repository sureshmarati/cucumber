Feature: 80089 login
@80089_Tc001
Scenario: Check login is successful with the given credentials

Given user is on login panel
When user enters username and password
And clicks on next button
And clicks on login button
Then user is navigated to home page


