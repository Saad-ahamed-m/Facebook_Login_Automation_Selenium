@LoginFeature @Sanity
  Feature: LoginFeature

    Background:
      Go to Facebook Login page
      Given I am on facebook login page

    @Test1
    Scenario Outline: Verify login fails with incorrect credentials
      When I enter username as <username>
      And I enter password as <password>
      Then Login should fail
      And This is a test
      Examples:
        | username | password |
        | "sfdnfjdnfj@gmail.com"   | "fjdfjdf" |
