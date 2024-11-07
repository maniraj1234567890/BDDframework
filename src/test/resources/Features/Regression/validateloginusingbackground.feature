Feature: To Validate Login Functionality

Background: To Start the Browser and launch the application
Given user starts "chrome" browser
And user launch app url using "https://adactinhotelapp.com/"

Scenario: To Validate Login Using Valid Crediantials

When user enters text "rajuchotu" in textbox using xpath "//input[@name='username']"
And user enters text "417C5A" in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be "Adactin.com - Search Hotel"

Scenario: To Validate Login Using Invalid Crediantials

When user enters text "xcdvfdv" in textbox using xpath "//input[@name='username']"
And user enters text "xzcdvdf" in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be "Adactin.com - Hotel Reservation System"

Scenario: To Validate Login Using Valid and Invalid Crediantials

When user enters text "rajuchotu" in textbox using xpath "//input[@name='username']"
And user enters text "xzcdvdf" in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be "Adactin.com - Hotel Reservation System"

Scenario: To Validate Login Using Invalid and Valid Crediantials

When user enters text "dsfdfs" in textbox using xpath "//input[@name='username']"
And user enters text "417C5A" in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be "Adactin.com - Hotel Reservation System"
