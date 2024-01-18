Feature: Test Guru 99 application

  Scenario Outline: Validate contact information page functionality
    Given User is on contact information page
    When User enter "<FirstName>", "<LastName>","<Phone>","<Email>"

    Examples: 
      | FirstName | LastName | Phone      | Email              |
      | Harshada  | Barawkar | 1234567675 | harshada@gmail.com |

  Scenario: Validate User Information Functionality
    When user enter valid Username, Password, ConfirmPassword
      | Username  | Password     | ConfirmPassword |
      | Pratiksha | pratiksha123 | pratiksha123    |
