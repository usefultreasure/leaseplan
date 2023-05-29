Feature: Search for the product

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product} for getting the products.
### Available products: "orange", "apple", "pasta", "cola"
### Prepare Positive and negative scenarios


  Scenario:
    When he calls endpoint "/apple"
    Then he sees the results displayed for "Apple"

  Scenario:
    When he calls endpoint "/orange"
    Then he sees the results displayed for "Mango"

  Scenario:
    When he calls endpoint "/car"
    Then he does not see the results