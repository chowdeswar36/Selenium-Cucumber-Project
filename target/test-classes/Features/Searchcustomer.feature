Feature: Search customer

  Background: Below are the common steps for each scenario
    Given user opens the browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And user click on login button
    Then user can view dashboard "Dashboard / nopCommerce administration"
    When user clicks on the customer menu
    And clicks on the customer tab

  Scenario: Successfully search a customer by email id
    Then user can view the customer page "Customers / nopCommerce administration"
    When user enters a mail
    And clicks on the search button
    Then user can see the customer email details in table
    And close the browser

  Scenario: Successfully search a customer by Firstname and lastname
    Then user can view the customer page "Customers / nopCommerce administration"
    When user enters a firstname as "Victoria" and lastname as "Terces"
    And clicks on the search button
    Then user can see the customer name details in table
    And close the browser
