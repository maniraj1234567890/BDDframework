Feature: To Valdate Registartion functionality

@reg0179

Scenario: To Validate Registartion functionality using valid crediantials

Given user starts "chrome" browser
And user launch app url using "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
And user verifies the title to be "Adactin.com - New User Registration"
When user enters details in registration form
|maniraj|@manu2211|@manu2211|manirajbasa|manirajbasa456@gmail.com|india|