Feature: Add customer

  Background: Below are the common steps for each scenario
    Given user opens the browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And user click on login button
    Then user can view dashboard "Dashboard / nopCommerce administration"
    When user clicks on the customer menu
    And clicks on the customer tab

  Scenario: Successfully add a customer in the webpage
    And clicks on the add new button
    Then user can view add new customer page "Add a new customer / nopCommerce administration"
    When user enters the all data
    And clicks on the save button
    Then the user view the confirmation message "The new customer has been added successfully."
    And close the browser
