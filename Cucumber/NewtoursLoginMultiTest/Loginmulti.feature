#creating feature to test with multiple test data
# In this test scenario, we using www.newtours.demoaut.com web app.
# we are testing login functionality with multiple test scenarios.
# Cucomber farme work will not support either excel or db (taking data from excel or db)
Feature: Newtous Application login functionality testing with multi test data
Scenario Outline: Validating login functionality with multi test data
Given Open firefox browser and navidate to application
When user enters valid "<userName>" and "<password>" and then click on signin button
Then user successflly logon to newtours application and close the browser

|userName     |password    |
|tutorial     |tutorial    |
|ram          |ram         |
|mercury      |mercury     |
|hello        |hello       |
