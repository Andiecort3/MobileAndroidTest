Feature: Invisible Contacts

  Scenario: Invisible Contacts
    Given we are inside the app
    When click to invisible contacts option
    Then contacts are not seen