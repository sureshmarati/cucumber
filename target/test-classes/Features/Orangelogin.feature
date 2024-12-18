Feature: orange hrm login
Scenario Outline: orange hrm login Successfull with valid credentialss

Given chrome browser is open
And User is now on driver page
When User enters <username>and <password>
And User clicks on login button
Then User is taken  to home page



Examples:
|username|password|
|Admin   |admin123|