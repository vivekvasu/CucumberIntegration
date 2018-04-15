Feature: Invalid Login Functionality Feature

Background: Opened the url in chrome browser

Given Open the url in chrome browser


@positiveScenario
Scenario: Verify Valid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

@Negative
Scenario: Verify Invalid Login
Given User is in homepage
Then  Enter username and password
When  Clicks on the submit button
Then  login should be successful

