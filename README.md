# Java based REST API automation framework

## Setting up the application under test

The AUT is [Restful-booker](https://restful-booker.herokuapp.com). The test suite in the framework would functionalities mentioned in the [API docs](https://restful-booker.herokuapp.com/apidoc/index.html). 
To avoid output that is unreliable, host the website locally, you can do so by following the instructions in the [README](https://github.com/mwinteringham/restful-booker/blob/main/README.md).

Here's a high-level overview of how the framework would look like:

1. Test Case Management: This component handles the organization and execution of test cases. It includes features like test case creation, grouping, prioritization, and reporting.
2. Configuration Management: It deals with the management of environment-specific configurations, such as API endpoints, authentication credentials, timeouts, and logging levels. It allows for easy configuration switching between different test environments (e.g., development, staging, production).
3. Test Data Management: This module focuses on managing the data required for API testing. It may include techniques for generating or retrieving test data, parameterizing requests, and handling test data dependencies.
4. HTTP Client: A robust HTTP client library, such as Apache HttpClient or OkHttp, is utilized to send HTTP requests to the API endpoints. I would be using RestAssured which is a popular Java-based library that simplifies the testing and validation of RESTful APIs.
5. Request and Response Validation: This component encompasses mechanisms to validate the request and response data against expected criteria. We would be using TestNG assertions for the framework.
6. Test Reporting: The framework incorporates reporting capabilities to provide detailed information about test execution results. It may generate reports in various formats like HTML, XML, or JSON, and can include details such as test case status, execution time, and error messages.
7. Logging and Debugging: Logging mechanisms are employed to capture relevant information during test execution, aiding in debugging and troubleshooting. Logging frameworks like Log4j or SLF4J can be used to record logs with different log levels.
8. Utility Functions: This component consists of utility functions or helper classes that provide reusable code snippets for common operations, such as data manipulation, date-time formatting, error handling, and file management.
9. Test Execution: The framework incorporates a test execution component responsible for orchestrating the overall test execution flow. It handles the setup and teardown activities, test case sequencing, and test result aggregation.
10. Integration with Build Tools: The framework can be integrated with popular build tools like Apache Maven or Gradle for dependency management, build automation, and continuous integration (CI) pipelines.
