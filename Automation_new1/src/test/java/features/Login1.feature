Feature: Application login

Scenario: Home Page Default
Given User is on Netbanking landing page
When User login into Application with Username "abc" and Password "123"
Then Home Page is populated
And Cards are displayed "true"

Scenario: Home Page Default
Given User is on Netbanking landing page
When User login into Application with Username "def" and Password "456"
Then Home Page is populated
And Cards are displayed "false"

And Shraddha is cute
