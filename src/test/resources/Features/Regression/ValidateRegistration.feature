Feature: To Valdate Registartion functionality

@reg0198

Scenario: To Validate Registartion functionality using valid crediantials

Given user starts "chrome" browser
And user launch app url using "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
And user verifies the title to be "Adactin.com - New User Registration"
And user enters text "maniraj" in textbox using xpath "//input[@name='username']"
And user enters text "xscsc" in textbox using xpath "//input[@name='password']"
And user enters text "zcdvffg" in textbox using xpath "//input[@name='re_password']"
And user enters text "cdvgfds" in textbox using xpath "//input[@name='full_name']"
And user enters text "manirajbasa@afs" in textbox using xpath "//input[@name='email_add']"
And user enters text "india" in textbox using xpath "//input[@name='captcha']"