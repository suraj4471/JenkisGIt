Feature: Home page functionality
@sanity
Scenario: Validate title
Given user at the landing page
Then page title should contains "Online Shopping site in "

@functional
Scenario: verify cart icon
Given user at the landing page
Then Cart icon  should get dispalay

@regression
Scenario: CheckOut the deals section
Given user at the landing page
When user should be click on Outdoor and sportsToy

@smoke
Scenario: login to app
Given user at the landing page
When user click on sign in button
And user enters username "9890582053"
And user enters password "Suraj@123"


 