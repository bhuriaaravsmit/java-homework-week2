Gmail Login Functionality

As a user i want to login gmail successfully.


Background:User is on gmail login page
Given	user open chrome browser and enter url https://www.gmail.co.uk
When 	user click on gmail
Then 	User is navigate to login page successfully


Scenario: user should login with Valid Credentials.

When	User enter user name "xyz@gmail.com" into username field
And 	User enter Password "Abcd1234" into password field
And 	User click on submit button.
Then 	User is logged in suceesfully


Scenario: user should login with Valid Credentials

When	User enter user name "xyz@gmail.com" into username field
And 	User enter Password "Abcd1234" into password field
And 	User Enter on submit button.
Then 	User is logged in suceesfully



Scenario: User should not login with Invalid username and Valid password

When 	User enter valid user name "xy@gmail.com" into username field
And		User enter invalid Password "Abc1234" into password field
And		user click on submit buton
Then 	User is not logged in suceesfully

Scenario: User should not login with Valid username and Invalid password

When 	User enter Valid user name "xyz@gmail.com" into username field
And		User enter Invalid Password "Abc123" into password field
And		user click on submit buton
Then 	User is not logged in suceesfully

Scenario: User should not login with Invalid Credentials

When 	User enter Invalid user name "abc123@gmail.com" into username field
And		User enter Invalid Password "abc123" into password field
And		user click on submit buton
Then 	User is not logged in suceesfully
And 	Error message should be displayed


Scenario: User should not login with blank Credentials

When 	User enter Blank user name " " into username field
And		User enter Blank Password " " into password field
And		user click on submit buton
Then 	User is not logged in suceesfully
And 	Error message should be displayed

