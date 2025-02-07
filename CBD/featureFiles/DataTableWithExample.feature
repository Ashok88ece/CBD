Feature:  Ashok Orange HRM Login 
Scenario Outline:: Ashok HRM Login Scenario
 Given Ashok login to HRM
 When Ashok Enter "<UserName>" and password "<Password>"
 And Ashok Clicked Login Button
 Examples:
 |UserName | Password|
 |Admin | admin123|

 