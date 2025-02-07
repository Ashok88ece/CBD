@OpenGoogle
Feature: This is to test IPIGS search 
Scenario: Google search scenario
 Given User is enetering IPIGS.in
 When User is typing the search term "IPIGS"
 And enter the return key
 Then the user should see the search results