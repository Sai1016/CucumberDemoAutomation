Feature: to check Register Page in automation testing website
  Scenario Outline: automate Register Page
    Given chrome browser is open
    When  user opens url "https://demo.automationtesting.in/Register.html"  webpage
    And user enters FullName as "<FirstName>" and "<LastName>"
    And user enters "<address>"
    And user enter "Email>"
    And user enters "<phone>"
    And user clicks on "<Gender>"
    When user clicks on Cricket as hobbies;
    And user clicks on Language
   When user clicks on Skills
    When user clicks on Country
    When user selects on "date of birth"
    When clicks on "<Password>"
    When user clicks on "<ConfirmPwd>"
    Then user clicks on Submit button
    And close browser
    Examples:


    |FirstNAme| LastName | address | Email | phone | Gender | Password | ConfirmPwd |
    |Tome|     Tom       |11,EE,SS |ss@c.com|1111111111|Male|SSS123  |SSS123        |
    |ssss| yyyy          |22,22,33 |ee@abc.com|222222222|Female|eee344|eee344       |
