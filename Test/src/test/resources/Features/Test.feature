Feature: Test for Myntra Functionality

  Scenario: user go to myntra
    Given user should be on Myntra page
    When user click on woman tag
    And user click on tops tag
    And user click on tops tag
    And user sort by popularity
    And user select discount
    And user select Brand
    And user select price range
    And user click on tops
    And user Add the cart
    And user Go to bag
    And user view the cart
    Then user verifies the Product in wishlist
   
