Feature: Login functionality

  Scenario Outline: Login test with different username and password combinations
    Given Navigate to website
    When Enter username "<username>" and password "<password>" and click login button
    Then Login should be "<status>"

    Examples:
      | username | password | status     |
      | Leyla  | leyla   | successful |
      | Team2    | Team2    | unsuccessful |



