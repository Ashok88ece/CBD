@DataDriven
Feature: Orange HRM Login Page
Scenario: Orange HRM Login Scenario
 Given User login to HRM
 When User enter login credentials
 |Admin | admin123|
 And Clicked Login Button
 Then Landing page is HOME