Feature: login action
Scenario Outline: Successful login valid credential
Given user will open the creditional
When user click on login
And user enters "<username>" and "<pasword>"
Then message displyaed login successfully

Examples:
|username           |password|
|aravind.guggilla57@gmail.com|aravind|
|aravindkumarguggilla@gmail.com|Aravind@123|