Feature: Flipkart Shopping

Scenario: Buy iPhone

Given User launches Flipkart
When User closes login popup
And User searches for "iPhone 17"
And User selects first product
And User switches to product window
And User adds product to cart
And User clicks Place Order
Then Checkout page should be displayed
