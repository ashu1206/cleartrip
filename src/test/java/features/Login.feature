Feature: Cleartrip Login Page


@login1
Scenario Outline: Login Page
Given user is launching the browser go to "<url>"
When clicks on Your trip option
Then clicks on Sigin option
And enter the "<username>" and "<password>"
Then click on sign in button
Then verify that user is able to successfuly logged in
#Then close the browser

Examples: 
|url                       |username                 |password|
|https://www.cleartrip.com/|mukeshmaurya365@gmail.com|Geetangali365#|



