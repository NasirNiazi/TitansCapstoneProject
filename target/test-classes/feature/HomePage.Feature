Feature: Home Page

Scenario: User verify currency values change
Given User is on Retail websiteWhen User click on Currency 
And User Chose Euro from dropdown 
Then currency value should change to EuroScenario: User empty Shopping cart message displays
Given User is on Retail websiteWhen User click on shopping cart
Then “Your shopping cart is empty!” message should display