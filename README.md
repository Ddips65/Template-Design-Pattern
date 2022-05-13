# E-MailGeneration Application System

# Program Details

A company has different types of customers, like Business, Returning, Frequent, New and VIP.
The management of the company needs to send customer specific emails to their customers. They
would need to have an application that generates emails from a base template for different types of
customers.

    Refactoring 1: I implemented assignment-3 with template method. My intention behind the to
    implement template method for assignment-3 is,each organization has a differents types of the 
    customers.When Company sends the email to the customers for their news, upcoming events or any
    business realted information they don't use same kind of the email template or email body
    for each customers.So Instead of the factory method according to my observation template method
    is best suitable for assignment-3 with following skeltond and defining respected steps depends
    on respected customer.
    Sub class override the typeofEmailTemplate method based on the respected customer types.
    
    Refactoring 2: CustomerInfo.java file. Refactoring line number 15 to line number 25 commented part 
    remove and move class attributes and methods likely customer name,subject,email body to the inside
    the Email Center class.
    
    Refactoring 3: Email Center.java file. Refactoring and remvoe method public String toString
    (String customerType) CustomerInfo ct1 = generateEmail(customerType) is able to identify which 
    type of the customer is.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




