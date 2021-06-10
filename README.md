# Project---OpenCart-Login page automation

The assignment given was to automate the URL = "https://www.opencart.com/index.php?route=account/login".

Here I had used Eclipse IDE for Java, TestNG, Maven and Listeners. Starting from the scratch first I created the Maven Project. After that getting all the jars from the maven repositery was easy. Then using the page object model I created the page objects for the Login page and the user page (page after successful login). After that the testcase was built for validating the login page. Here I also implemented the Excel sheet integration for getting the login info. so the test can run for as many times as we provide the username and password in the sheet. For validation the correct login user I used TestNG assertions and listeners.

I was not able to automate the Registration Page as it had the Visual CAPTCHA.
