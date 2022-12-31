Feature:  Salesforce login
@smoke
Scenario Outline:  Salesforce Home page login

Given Intialize the Webdriver
When user navigates to  "https://login.salesforce.com/?locale=in"
And enter <username> and <password> and click on login button
Then user should be able to login successfully

 Examples:
 
 |uesrname|password|
 |test12|secure123|
 |tset321|secure654|
 
 