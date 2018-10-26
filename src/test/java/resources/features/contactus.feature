Feature: submit data to webdriver university.com

Scenario: submit valid data
Given I acces webdriveruniversity contact us form
When I enter a valid firstname
And I enter a valed lastname
| Beuker | Korswagen |
And I enter a valid email adress
And I enter comments
| comment1 | comment 2|
When I click on the sumbit button
Then the information should succesfully been submitted via the contact us form