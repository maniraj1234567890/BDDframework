Feature: To Validate Login Functionality

@mani

Scenario: To Validate Login Using Valid Crediantials

Given user starts "chrome" browser
And user launch app url using "https://adactinhotelapp.com/"
When user enters text "rajuchotu" in textbox using xpath "//input[@name='username']"
And user enters text "417C5A" in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be "Adactin.com - Search Hotel"