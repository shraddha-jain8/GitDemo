Feature: Application login

Scenario: Home Page Default
Given User is on Netbanking landing page
When User login into Application with Username and Password
Then Home Page is populated
And Cards are displayed
