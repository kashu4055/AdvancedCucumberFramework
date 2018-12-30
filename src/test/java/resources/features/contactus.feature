Feature: submit data to webdriver university.com

Scenario: submit valid data
Given I access webdriveruniversity contact us form  
When I enter a valid firstname
And I enter a valid last name  
| Beuker | Korswagen |
And i enter a valid email address
And i enter comments
| comment1 | comment 2|
When i click on the submit button
Then the information should successfully be submitted via the contact us form