@SimpleLogin 
Feature: Valid Login
@Positive
Scenario: Positive Login Scenario
Given User is on Login page
When the user enter the valid Username and Password
And clicks on the login button
Then  then user should be navigated to Home page


@Negative
Scenario: Invalid Login Negative Scenario
Given User is on Login page
When the user enter the invalid Username and invalid Password
And clicks on the login button
Then  then user should be navigated to Home page