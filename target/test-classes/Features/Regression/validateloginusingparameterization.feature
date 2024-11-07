Feature: To Validate Login Functionality

Scenario Outline:To Validate Login Using different combination of Crediantials

Given user starts "chrome" browser
And user launch app url using "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks on login button using xpath "//input[@name='login']"
Then user verifies the title to be '<expected title>'

Examples:
| username | password | expected title |
| rajuchotu | 417C5A | Adactin.com - Search Hotel |
| rajucsed | 417C5A | Adactin.com - Hotel Reservation System |
| rajuchotu | 4adwsf | Adactin.com - Hotel Reservation System |
| defdf | sfrdg | Adactin.com - Hotel Reservation System |