@UI
Feature: This feature will verify Car Tax Check and get vehicle information

  Background: User navigate to url
    Given person navigate to "https://cartaxcheck.co.uk/"


  Scenario Outline: User type the car registration number and click free car check button.
    When user enter car registration number "<reg>"
    And  click Free Car check button to get Vehicle details
    Then user should be on Vehicle Identity page and get text

    Examples:
      | reg     |
      |SG18HTN  |
#      |DN09HRM   |
#      |BW57BOF   |
#      |KT17DLX   |

