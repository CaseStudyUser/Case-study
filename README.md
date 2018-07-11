# Case-study

## Selenium Web driver Tests Explanation:
Used TestNG framework to run the tests and used Page object Model to create the tests in java.<br/>
To execute the tests, we can run the testng.xml file which is in project directory and the xml file will be triggered for all tests in chrome, Firefox and edge browsers.<br/>
Check the below files for all tests.<br/>
Login test cases:<br/>
https://github.com/CaseStudyUser/Case-study/blob/master/SeleniumCaseStudy/src/main/java/com/selenium/tests/LoginTest.java <br/>
Xpath test cases:<br/>
https://github.com/CaseStudyUser/Case-study/blob/master/SeleniumCaseStudy/src/main/java/com/selenium/tests/XpathTests.java <br/>
full path test cases:<br/>
https://github.com/CaseStudyUser/Case-study/blob/master/SeleniumCaseStudy/src/main/java/com/selenium/tests/AbsoluteXpathTests.java <br/>
Check font, size and alignment test cases: <br/>
https://github.com/CaseStudyUser/Case-study/blob/master/SeleniumCaseStudy/src/main/java/com/selenium/tests/CheckCSSTest.java <br/>

## JMeter Tests Explanation: 
Used ApacheJMeter version 3.0 to prerare the test suites and used JMterPlugins.jar file to perform a Stress,Endurance and Spike testing.<br/>
Jar file is available at https://github.com/CaseStudyUser/Case-study/blob/master/JMeterTests/JMeterPlugins.jar  <br/>
Please check the below file, to check the load test plan and visulization graphs for all tests. <br/>
https://github.com/CaseStudyUser/Case-study/blob/master/JMeterTests/LoadTestPlan.pdf <br/>
Check the below explanation for all Jmeter test suites.<br/>
UserIdExtractor.jmx <br/> 
This suite has two requests by extracting userId from from first request and used that in the API path of the second request.

All_Titles_Extractor.jmx <br/>
In this added test case to get all titles from the response of the API and displayed all titles in beanshell sampler.

LoadTestForGET_withoutTimers.jmx <br/>
Added GET request to the test suite and given estimated maximum amount of load to run the test suite in 15 minutes.

LoadTestForGET_withTimers.jmx <br/>
Added GET request to the test suite and used constant throughput timer to generate the constant load for the duration of 15 minutes.

LoadTestForPOST_withoutTimers.jmx <br/>
Added POST request to the test suite and given estimated maximum amount of load to run the test suite in 15 minutes.

LoadTestForPOST_withTimers.jmx <br/>
Added POST request to the test suite and used constant throughput timer to generate the constant load for the duration of 15 minutes.

SpikeTesting.jmx <br/>
Added both GET and POST requests in the test suite and used ULtimate thread group to simulate the users.

StressTesting.jmx <br/>
Added both GET and POST requests in the test suite and used Stepping thread group to simulate the users.

EnduranceTesting.jmx <br/>
Added both GET and POST requests in the test suite and used Ultimate thread group to simulate the users.
