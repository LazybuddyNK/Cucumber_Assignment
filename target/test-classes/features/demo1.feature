Feature: Customer Orders Report
  Admin want to use this template for Customer Orders Report

  Background: Signin with admin account
    Given User is on the application

  @order
  Scenario Outline: Filter out search results in Customer Orders Report
    Given fills up the "<username>" and "<password>"
    And clicks on Login button
    Given Admin moves to the Customer Orders Report page
    Then Admin fills the required fields "<Date_Start>", "<date_end>", "<Customer>"
    And clicks on Filter button
    Then Expected Customer results should be displayed

    Examples: 
      | username | password  | Date_Start | date_end   | Customer |
      | admin    | Admin@123 | 2022-01-08 | 2022-03-08 | Krishna Mohan  |
