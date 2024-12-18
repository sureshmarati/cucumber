Feature: orange hrm login should be susseefull with the given credentials
Scenario: orange hrm login

Given Chrome browser should be open
And User is on Search page
When  User enters credentials 
And User clicks on login button
Then User is taken to home page

