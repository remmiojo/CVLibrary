Feature: Cv Library - Job search functionality

  @RunallTest
  Scenario Outline:Job search functionality scenario  - With More search option
    Given I am on the CV library home
    When I search for a job with the following "<keyword>", "<location>" , "<distance>" , "<minSalary>", "<maxSalary>", "<salaryType>"  and "<jobType>"
    Then page containing "<keyword>" jobs in "<location>" is displayed

    Examples:
      | keyword     | location | distance       | minSalary | maxSalary | salaryType | jobType   |
      | sales       | London   | up to 10 miles | 30000     | 50000     | Per annum  | Permanent |