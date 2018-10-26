Feature: select special offer

Scenario Outline: validate promo code
Given user navigates to "<url>"
When user clicks on "<button>"
Then user should be presented with promo alert


Examples:
|url																| button					|
|http://www.webdriveruniversity.com/Page-Object-Model/products.html |#container-special-offers	|