Feature: Add contact

  Scenario: Add contact
    Given we are inside the app
    Given click to add contact button
    Given add to contact name
    Given add to contact phone
    Given select option celular
    Given add to contact email
    Given select option work
    When click to save
    Then the saved contact is displayed
