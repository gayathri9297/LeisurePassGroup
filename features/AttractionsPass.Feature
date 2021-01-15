Feature: Purchase tourist attraction pass from Go Boston Application.



  Scenario: Verify user is able to choose valid pass
    Given I navigate to URL "https://gocity.com/boston/en-us"
    Then  I should be navigated to Home page
    When  I click on All Inclusive link from nav bar
    And   I click on Attractions link from All Inclusive nav bar options
    Then  I should be navigated to attractions page
    When  I click on package new England Aquarium Whale watch
    Then  I should be navigated to corresponding attraction page
    When  I click on Buy a Pass button
    Then  I should be navigated to attraction comparison page
    When  I click on Buy now button for Explorer pass
    Then  I should be navigated to Pricing page
    When  I click on select button for  2choice pass
    Then  I should see Additional information about 2choice pass
    When  I click on Checkout Button
    Then  I should be navigated to Review Page
    When  I select date of Explorer pass activation
    And   I click on Continue Payment Button
    Then  I should be navigated to Payment Page