
Feature: Test login hrm functionality
Scenario Outline: Verify login is successfull with provided credentials

Given open the firefoxdriver
And verify the user is on search page
When User enters the username and password
And  user clicks on login button
Then User navigate to home page
And  User clicks on PIM
And User clicks on Addemployee
Then User enters Addemployee tab
When  User enters firstname <firstname> and lastname <lastname> and EmployeeID <EmployeeID>
And  User clicks on save button


Examples:

|firstname|lastname|Employeeid|

|Suresh   |Marati  |12345      |

