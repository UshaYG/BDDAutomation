Feature: User will come on application and perform activities

Scenario Outline: Registered user comes to application, login and logout
Given User is on login page
When user enters "<uname>" username  
And user enters "<pwd>" password
And user clicks on signin button
Then user should be logged in
Then User clicks on logout button
And User should be logged out
Examples:
|uname  |pwd |
|test   |test|

    
