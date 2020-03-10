Feature: login into application

Scenario Outline: Positive Test Validate Login

Given intialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on login link in home page to secure sign in page
When User enter <username> and <password> and login
Then Verify user is successfully logged in
And Close the Browser
Examples:
|username           |password   |
|shraddhajn8@gmail.com | Ronak12# |
|test122@g@gmail.com  |shraddha12 | 
