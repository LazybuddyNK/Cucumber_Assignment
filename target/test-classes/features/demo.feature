Feature: Affiliate
  Admin want to use this template for Affiliates.

  Background: Signin with admin account
    Given User is on the application

  @smoke
  Scenario Outline: Filter out search results
    Given fills up the "<username>" and "<password>"
    And clicks on Login button
    Given Admin moves to the affiliates page
    Then fills the required fields "<affiliate_name>", "<date>"
    And clicks on Filter button
    Then Expected results should be displayed

    Examples: 
      | username | password  | affiliate_name | date       |
      | admin    | Admin@123 | abx            | 2022-03-08 |

  @regression
  Scenario Outline: Add Affiliates
    Given admin fills up the "<username>" and "<pass>"
    And admin clicks on Login button
    Given moves to the affiliates page
    Then Admin moves to Add Affiliates page
    And Enters all the required fields "<firstname>", "<lastname>", "<telephone>", "<password>", "<confirm>", "<address1>", "<city>"
    And select country and Region
    Then Move to Payment Details
    And Enter "<Cheque_Payee_Name>"
    Then Click on save button
    Then the above entered information should be added check by email

    Examples: 
      | username | pass      | firstname | lastname | telephone | password | confirm | address1 | city   | Cheque_Payee_Name |
      | admin    | Admin@123 | abc       | xyz      |    543452 | qwert    | qwert   | adsshg   | wetgsd | mnop              |

 
