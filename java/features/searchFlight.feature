Feature: To book a flight ticket on Cleartrip Website


@Flight_Search
Scenario Outline: To fill the details of Home Page
Given user is launching the browser go to "<url>"
When clicks on Your trip option
Then clicks on Sigin option
And enter the "<username>" and "<password>"
Then click on sign in button
Then verify that user is able to successfuly logged in
Then Fills the From which is boarding placeFrom
And Fills the To which is deboarding placeTo
Then Selects the date of departure "<year>" and "<month>" and "<date>"
And Fills the number of Adults and Children and Infants
Then Clicks on Search Flights
Then verify that user is on flight booking page with selected search 


Examples:

|year| month     |date|url                       |username                 |password      |
|2021|  January  | 26 |https://www.cleartrip.com/|mukeshmaurya365@gmail.com|Geetangali365#|


@Flightbooking
Scenario Outline: Flight Booking
Given user is launching the browser go to "<url>"
When clicks on Your trip option
Then clicks on Sigin option
And enter the "<username>" and "<password>"
Then click on sign in button
Then verify that user is able to successfuly logged in
Then Fills the From which is boarding placeFrom
And Fills the To which is deboarding placeTo
Then Selects the date of departure "<year>" and "<month>" and "<date>"
And Fills the number of Adults and Children and Infants
Then Clicks on Search Flights
Then verify that user is on flight booking page with selected search 
Then get the flight list with price
And Booking the desired flight 


Examples:

|year| month     |date|url                       |username                 |password      |
|2021|  January  | 26 |https://www.cleartrip.com/|mukeshmaurya365@gmail.com|Geetangali365#|



@Itinerary
Scenario Outline: Itinerary
Given user is launching the browser go to "<url>"
When clicks on Your trip option
Then clicks on Sigin option
And enter the "<username>" and "<password>"
Then click on sign in button
Then verify that user is able to successfuly logged in
Then Fills the From which is boarding placeFrom
And Fills the To which is deboarding placeTo
Then Selects the date of departure "<year>" and "<month>" and "<date>"
And Fills the number of Adults and Children and Infants
Then Clicks on Search Flights
Then verify that user is on flight booking page with selected search 
Then get the flight list with price
And Booking the desired flight 
Then verify the Itinerary page
Then click on continue booking


Examples:

|year| month     |date|url                       |username                 |password      |
|2021|  January  | 26 |https://www.cleartrip.com/|mukeshmaurya365@gmail.com|Geetangali365#|

@Traveller
Scenario Outline: Filling the names of the travellers
#Given user is launching the browser go to "<url>"
When clicks on Your trip option
Then clicks on Sigin option
And enter the "<username>" and "<password>"
Then click on sign in button
Then verify that user is able to successfuly logged in
Then Fills the From which is boarding placeFrom
And Fills the To which is deboarding placeTo
Then Selects the date of departure "<year>" and "<month>" and "<date>"
And Fills the number of Adults and Children and Infants
Then Clicks on Search Flights
Then verify that user is on flight booking page with selected search 
Then get the flight list with price
And Booking the desired flight 
Then verify the Itinerary page
Then click on continue booking
And fill the adult salutation and first name and last name
Then fill the child salutation and first name and last name and date of birth
Then fill the infant salutation and first name and last name and date of birth
Then click on continue

Examples:

|year| month     |date|url                       |username                 |password      |
|2021|  January  | 26 |https://www.cleartrip.com/|mukeshmaurya365@gmail.com|Geetangali365#|