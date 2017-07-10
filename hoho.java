D1	
Carefully read the question and answer accordingly.
What does XSL stands for?


Selected Option:


Extensible Style Sheet Language

Correct Answer:


Extensible Style Sheet Language 

2	
Carefully read the question and answer accordingly.
Select the right coding best practices followed while using java Collections.
1.Use for loop instead of iterator
2.Use Collections with generic with same type of data.
3.Copy collections into other collections by calling addAll() methods instead using iterator  
to copy each collection element.


Selected Option:


2&3

Correct Answer:


2&3 

3	
Carefully read the question and answer accordingly.
The method Class.forName() is a part of JDBC API. State True or False.


Selected Option:


TRUE

Correct Answer:


FALSE 

4	 
Carefully read the question and answer accordingly.
What is the outputof below code:
package p1;
class Parent {
 public static void doWork() {
 System.out.println("Parent");
 }
}
class Child extends Parent {
 public static void doWork() {
 System.out.println("Child");
 }
}
class Test {
 public static void main(String[] args) {
 Child.doWork();
 }
} 


Selected Option:


Child Parent

Correct Answer:


Child 

5	
Carefully read the question and answer accordingly.
You are developing a web application using Servlets. You have to use filters so that the web container intercepts the 
incoming requests before it is forwarded to the servlet. Which of the following method is called for every request
 intercepted by the filter? 


Selected Option:


doFilter

Correct Answer:


doFilter 

6	
Carefully read the question and answer accordingly.
Which of the following correctly defines use of DTD in XML development?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

7	
Carefully read the question and answer accordingly.
Examine the code snippet
declare 
TYPE ABC is VARRAY(10) of NUMBER;
v2 ABC:=ABC(10,8,9,6,5,4,3,32);
begin
Dbms_output.put_line(v2(1));
end;
what will be the output of the above code ?


Selected Option:


Compiles and prints 8

Correct Answer:


Compiles and prints 10 

8	
Carefully read the question and answer accordingly.
Which tool verifies for best practice adherence? 
1.PMD
2.Check Style
3.CPD
4.ANT


Selected Option:


1&2&3

Correct Answer:


1&2&3 

9	
Carefully read the question and answer accordingly.
Identify the circumstance under which you will create an Index?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

10	
Carefully read the question and answer accordingly.
Which one is required as a sub-element of listener tag  in Deployment Descriptor?


Selected Option:


<listener-class>

Correct Answer:


<listener-class> 

11	
Carefully read the question and answer accordingly.
The proposed web application need to access two databases, for performing the business operations. Which of the API in J2EE package will support to achieve this functionality?


Selected Option:


JNDI

Correct Answer:


JTA 

12	
Carefully read the question and answer accordingly.
Manoj has created the Hello servlet that displays Welcome in the browser window. The code of the servlet is:
package myworld;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class hello extends HttpServlet 
{
   protected void doGet(HttpServletRequest request HttpServletResponse response) throws ServletException IOException   
   {
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>My Servlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h>WELCOME</h>");
      out.println("</body>");
      out.println("</html>");
      out.close();
   }
}
Which of the following code snippets correctly defines the deployment descriptor for the preceding servlet? 


Selected Option:


<servlet> <servlet-name>hello</servlet-name> <servlet-class>myworld.hello</servlet-class> </servlet> <servlet-mapping> <servlet-name>hello</servlet-name> <url-pattern>/hello</url-pattern> </servlet-mapping>

Correct Answer:


<servlet> <servlet-name>hello</servlet-name> <servlet-class>myworld.hello</servlet-class> </servlet> <servlet-mapping> <servlet-name>hello</servlet-name> <url-pattern>/hello</url-pattern> </servlet-mapping> 

13	
Carefully read the question and answer accordingly.
Which of the following keywords ensures that a method cannot be overridden? 


Selected Option:


final

Correct Answer:


final 

14	
Carefully read the question and answer accordingly.
What is the return type of getAttribute() method of HttpServletRequest ?


Selected Option:


Object

Correct Answer:


Object 

15	
Carefully read the question and answer accordingly.
During translation the scriptlet code is copied inside:


Selected Option:


The service method of generated servlet

Correct Answer:


The service method of generated servlet 

16	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

17	
Carefully read the question and answer accordingly.
A scriptlet contains Java code that is executed every time a JSP is invoked.State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

18	
Carefully read the question and answer accordingly.
The parameters for procedures can be specified using ?


Selected Option:


an explicit data type
Using the %ROWTYPE definition
Using the %TYPE definition

Correct Answer:


an explicit data type 
Using the %TYPE definition 
Using the %ROWTYPE definition 

19	
Carefully read the question and answer accordingly.
Which of the following exception is not mandatory to be handled in code?


Selected Option:


IOException

Correct Answer:


NullPointerException 

20	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
String class do not provides a method which is used to compare two strings lexicographically.


Selected Option:


FALSE

Correct Answer:


FALSE 

21	
Carefully read the question and answer accordingly.
Predict the output of below code:
package p1;
class MyThread extends Thread {
 public void run(int a) {
  System.out.println("Important job running in MyThread");
 }
 public void run(String s) {
  System.out.println("String in run");
 }
}
class Test {
 public static void main(String[] args) {
  MyThread t1=new MyThread();
  t1.start();
 }
}


Selected Option:


Compile Error

Correct Answer:


No Output 

22	
Carefully read the question and answer accordingly.
Consider you are creating a JSP page. You want to use the classes of java.util package. Which statement will you use to import the java.util package? 


Selected Option:


<%@ page import="java.util.*" %>

Correct Answer:


<%@ page import="java.util.*" %> 

23	
Carefully read the question and answer accordingly.
We have customer table with the following values
ID     NAME     AGE  ADDRESS  SALARY
1      Ramesh   26       Delhi         25000
2      Khilan      22       Chennai    30000
What will be the code to execute all the 3 records from the customer and to print the name and address in a single line. For example : Ramesh Delhi


Selected Option:

DECLARE c_id customers.id%type; c_name customers.name%type;
 c_addr customers.address%type; BEGIN CURSOR c_customers is 
SELECT id, name, address FROM customers; OPEN c_customers;
 LOOP FETCH c_customers into
 c_id, c_name, c_addr; dbms_output.put_line(c_id || ' ' || c_name || ' ' || c_addr); 
EXIT WHEN c_customers%notfound; END LOOP; CLOSE c_customers; END; /

Correct Answer:

DECLARE c_id customers.id%type; c_name customers.name%type; c_addr customers.address%type; CURSOR c_customers is SELECT id, name, address FROM customers; BEGIN OPEN c_customers; LOOP FETCH c_customers into c_id, c_name, c_addr; dbms_output.put_line(c_id || ' ' || c_name || ' ' || c_addr); EXIT WHEN c_customers%notfound; END LOOP; CLOSE c_customers; END; / 

24	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Operators 
{
 public static void main(String[]args)
 {
  int i=12;
  int j=13;
  int k=++i-j--;
  System.out.println(i);
  System.out.println(j);
  System.out.println(k);
 }
}


Selected Option:


13,12,0

Correct Answer:


13,12,0 

25	
Carefully read the question and answer accordingly.
What is the collection exception raised for the below code?
DECLARE
   TYPE NumList IS TABLE OF NUMBER;
   nums NumList;
BEGIN
nums(1) := 1;
END;  


Selected Option:


SUBSCRIPT_BEYOND_COUNT

Correct Answer:


COLLECTION_IS_NULL 

26	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

27	
Carefully read the question and answer accordingly.
Which object provides you with methods to access data from the table?


Selected Option:


ResultSet

Correct Answer:


ResultSet 

28	
Carefully read the question and answer accordingly.
In Thread implementation methods like wait(), notify(), notifyAll() should be used in synchronized context . 
State true or false


Selected Option:


TRUE

Correct Answer:


TRUE 

29	
Carefully read the question and answer accordingly.
Which of the following variable represents the uncaught throwable object that resulted from a call to the error page in JSP? 


Selected Option:


Exception

Correct Answer:


Exception 

30	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

31	
Carefully read the question and answer accordingly.
Which of the following method is used to initialize the instance variable of a class.


Selected Option:


Constructor

Correct Answer:


Constructor 

32	
Carefully read the question and answer accordingly.
Automatic page Refresh can be done by using refresh Meta Tag.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

33	
Carefully read the question and answer accordingly.
What is the use of attributes in HTML tags?


Selected Option:


Provides additional behaviour to the tag

Correct Answer:


Provides additional behaviour to the tag 

34	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

35	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:

<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:

<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" 
type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice>
</xs:complexType> 

36	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

37	
Carefully read the question and answer accordingly.
What will be the output of the below query?
select to_CHAR(sysdate+(10/1400),'HH:MI:SS') from  dual;


Selected Option:


adds 10 minutes to the current Timestamp

Correct Answer:


adds 10 minutes to the current Timestamp 

38	
Carefully read the question and answer accordingly.
When a JSP is executed, out of the following, what is most likely 
to be sent to the client? 


Selected Option:


The compiled Servlet file

Correct Answer:


HTML 

39	
Carefully read the question and answer accordingly.
You are developing a trigger which should ensure that no negative value is
 inserted in employee table’s Age column .  you have created a trigger as follows 
create or replace trigger  AgeVerify 
before insert
on employee for each row
when(new.EmpAge < 0)
begin
RAISE_APPLICATION_ERROR(-20000, 'no negative age allowed'); 
end;
/
Identify error if any in the above trigger and give the solution. 


Selected Option:


No problem in the trigger. It gives the desired result

Correct Answer:


No problem in the trigger. It gives the desired result 

40	
Carefully read the question and answer accordingly.
Lisa is a systems programmer at ABC Consultants. 
She has written an application to accept student marks in the variable marks.
 If the student has scored marks greater than 60. She needs 
to forward the control of the program to another file called as
 "Ex.jsp" else the control should be forwarded to a file called as "Av.jsp".
Which of the following code snippets should she use
 for checking this condition and forward control? 


Selected Option:


<% if(Integer.parseInt(request.getParameter("marks"))>=60) { %> <jsp:forward page="Ex.jsp" /> <% } else { %> <jsp:forward page="Av.jsp" /> <% } %>

Correct Answer:


<% if(Integer.parseInt(request.getParameter("marks"))>=60) { %> <jsp:forward page="Ex.jsp" /> <% } else { %> <jsp:forward page="Av.jsp" /> <% } %> 

41	
Carefully read the question and answer accordingly.
Which of the following statements are true?
1.A PL/SQL block has three parts, declarative part, 
an executable part and an exception handling part. 
2.Declarative and Executable block are Mandatory
3. A PL/SQL Block can be anonymous or named
4. Identifiers in PL/SQL can contain max 35 character
5. Blocks of PL/SQL statements are translated by the PL/SQL 
engine that can reside either in the client or at the server side. 


Selected Option:


1&3&4

Correct Answer:


1&3&5 

42	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

43	
Carefully read the question and answer accordingly.
Which two statements are true regarding the USING clause in table joins?
1. It can be used to join a maximum of three tables.
2. It can be used to restrict the number of columns used in a NATURAL join.
3. It can be used to access data from tables through equijoins as well as nonequijoins.
4. It can be used to join tables that have columns with the same name and compatible data types.


Selected Option:


3&4

Correct Answer:


2&4 

44	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: When tags are implemented with tag
 handlers written in Java, each tag in the library must be declared in 
the TLD with a tag element.
Statement B: The tag element contains the tag name, 
the class of its tag handler, information on the tag's attributes, and information on the variables created by the tag.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is false.

Correct Answer:


Statement A is true and statement B is true. 

45	
Carefully read the question and answer accordingly.
Which of the following parameter in Query Flashback 
clearly defines the maximum time period that the database can be flashbacked?


Selected Option:


DBA_UNDO_EXTENTS

Correct Answer:


UNDO_RETENTION 

46	 
Carefully read the question and answer accordingly.
Is "Array" a subclass of "Collection" ? 


Selected Option:


FALSE

Correct Answer:


FALSE 

47	
Carefully read the question and answer accordingly.
Consider the development scenario where you have created
 Employee class with implementation code and as per the
 project requirement you have to ensure that developer in
 team reusing code written in Employee class only using 
inheritance by extending the employee class but not by 
creating the instance of Employee object directly. 
Please suggest the solution to implement given requirement?


Selected Option:


Mark Employee class with abstract keyword

Correct Answer:


Mark Employee class with abstract keyword 

48	
Carefully read the question and answer accordingly.
Expression Language treats null values as “zero” 
In arithmetic operations.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

49	
Carefully read the question and answer accordingly.
What are the Tools & plug-ins commonly used  in testing java application code? 
1.ANT
2.JUnit
3.JavaScript
4.EMMA


Selected Option:


2&4

Correct Answer:


2&4 

50	
Carefully read the question and answer accordingly.
Please select the correct statement  with respect to
 including JavaScript in HTML pages.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

51	
Carefully read the question and answer accordingly.
Data can be passed to the function ____


Selected Option:


Both by value & reference

Correct Answer:


by value 

52	
Carefully read the question and answer accordingly.
Which of the following is the deployment descriptor file of 
a web application? Assuming that the name of the Web application is BankApp.


Selected Option:


web.xml

Correct Answer:


web.xml 

53	
Carefully read the question and answer accordingly.
Which parser is a W3C standard?


Selected Option:


DOM

Correct Answer:


DOM 

54	Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which 
method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

55	 
Carefully read the question and answer accordingly.
A developer designs a web application that must support multiple user interfaces such as 
1. XML based web services for Business to Business clients
2. HTML for web based clients
3. WML for wireless clients
Which design pattern provides the solution for this requirement. 


Selected Option:


Model - View - Controller

Correct Answer:


Model - View - Controller 

56	
Carefully read the question and answer accordingly.
Which of following are standard JSTL?
1.http://java.sun.com/jstl/xml/fmt
2.http://java.sun.com/jstl/core/fmt
3.http://java.sun.com/jstl/xml
4.http://java.sun.com/jstl/sql
5.http://java.sun.com/jstl/core


Selected Option:


3&4&5

Correct Answer:


3&4&5 

57	
Carefully read the question and answer accordingly.
What is the output of this program?
1.    import java.io.*;
2.    class files {
3.        public static void main(String args[]) {
4.            File obj = new File("/java/system");
5.            System.out.print(obj.getName());
6.        }
7.    }


Selected Option:


compilation error

Correct Answer:


system 

58	
Carefully read the question and answer accordingly.
Consider the following code:
1   public class FinallyCatch { 
2      public static void main(String args[]) {  
3         try {
4            throw new java.io.IOException();
5         }
6      }
7   }
Which of the following is true regarding the above code?


Selected Option:


Shows unhandled exception type IOException at line number 4

Correct Answer:


Demands a finally block at line number 5 

59	
Carefully read the question and answer accordingly.
Which of the following are true statements?


Selected Option:


The ListIterator interface provides forward and backward iteration capabilities.
The Iterator interface declares only three methods: hasNext, next and remove.
The ListIterator interface provides the ability to determine its position in the List.

Correct Answer:


The Iterator interface declares only three methods: hasNext, next and remove. 
The ListIterator interface provides the ability to determine its position in the List. 
The ListIterator interface provides forward and backward iteration capabilities. 

60	
Carefully read the question and answer accordingly.
Given that URL-rewriting must be used for session management, identify the query string attribute used when URL-rewriting. 


Selected Option:


jsessionid

Correct Answer:


jsessionid 

1	
Carefully read the question and answer accordingly.
Variables in Java Script should be declared with data types.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

2	
Carefully read the question and answer accordingly.
Which of the following are true about protected access specifier?


Selected Option:


All members of abstract class are by default protected

Correct Answer:


If one class is having protected method then the method is available for subclass which is present in another package 

3	
Carefully read the question and answer accordingly.
Which of the following is the correct syntax for left outer join ? 
1.select Stud_Name , clg_Name
from student s left outer join college c
on s.clg_code = c.clg_code
2.select Stud_name , clg_Name
from studentDemo s ,collegeDemo c
where s.clg_code = c.clg_code(+)
3.select Stud_name , clg_Name
from studentDemo s ,collegeDemo c
where s.clg_code(+) = c.clg_code
4.select Stud_Name , clg_Name
from student s outer join left  college c
on s.clg_code = c.clg_code
5.select Stud_Name , clg_Name
from student s left outer join college c
where s.clg_code = c.clg_code 


Selected Option:


1&5

Correct Answer:


1&2 

4	 
Carefully read the question and answer accordingly.
What is the outputof below code:
package p1;
class Parent {
 public static void doWork() {
 System.out.println("Parent");
 }
}
class Child extends Parent {
 public static void doWork() {
 System.out.println("Child");
 }
}
class Test {
 public static void main(String[] args) {
 Child.doWork();
 }
} 


Selected Option:


Parent Child

Correct Answer:


Child 

5	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: GenericServlet is an abstract class
Statement B: GenericServlet internally implements Servlet interface
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is false.

Correct Answer:


Statement A is true and statement B is true. 

6	
Carefully read the question and answer accordingly.
Translation and Compilation of JSP happens during:


Selected Option:


Deployment

Correct Answer:


Deployment 

7	
Carefully read the question and answer accordingly.
What are the uses of XML parsers?
1.Parsing XML files and retrieving data from XML elements
2.Creating XML files programmatically
3.Used to direct conversion using an XSLT processor


Selected Option:


2&3

Correct Answer:


1&2 

8	
Carefully read the question and answer accordingly.
Which one is required as a sub-element of listener tag  in Deployment Descriptor?


Selected Option:


<listener-class>

Correct Answer:


<listener-class> 

9	
Carefully read the question and answer accordingly.
For the given Employee class
package com.cts;
public class Employee{
  private String strEmpID=""; 
  public String getEmpId()  { 
      return this.strEmpID; 
  } 
  public void setEmpId(String strEmpID){ 
 this.strEmpID=strEmpID; 
 } 
} 
We have the JSP file
<jsp:useBean id="employee" class="com.cts.Employee" scope="request">   
   <property name="person" property="empId" value="<%= request.getParameter("empId")%>" />   
</jsp:useBean>   
<html>   
<body>   
Employee Id: 
</body></html>
Identify the JSP tag from the given options to print the employee id.


Selected Option:


<jsp:getProperty name="employee" property="employee.empId"/>

Correct Answer:


<Jsp:getProperty name="employee" property="empId"/> 

10	
Carefully read the question and answer accordingly.
Consider the following code snippet:
   String thought = "Green";
   StringBuffer bufferedThought = new StringBuffer(thought);
   String secondThought = bufferedThought.toString();  
   System.out.println(thought == secondThought);
Which of the following option gives the output of the above code snippet?


Selected Option:


FALSE

Correct Answer:


FALSE 

11	
Carefully read the question and answer accordingly.
In JavaScript, for reading the contents inside the first paragraph tag which statement is used?


Selected Option:


document.getElementsByTagName("p")[0].innerText;

Correct Answer:


document.getElementsByTagName("p")[0].innerText; 

12	
Carefully read the question and answer accordingly.
TreeSet uses which two interfaces to sort the data 


Selected Option:


SortTable
Serializable
SortedSet

Correct Answer:


SortedSet 
Comparable 

13	
Carefully read the question and answer accordingly.
Scripting can be blocked in a jsp by:


Selected Option:


Declaring <scripting-invalid> tag at the top of JSP page

Correct Answer:


Putting <scripting-invalid> element in web.xml 

14	
Carefully read the question and answer accordingly.
Consider you are trying to persist or store object of Customer class using ObjectOutputStream class in java. When you are trying to persist customer object data java code is throwing runtime exception without persisting object information.  Please suggest what is the key important factor you have consider in code in order to persist customer object data.


Selected Option:


Check whether you have implemented Customer class with Serializable interface

Correct Answer:


Check whether you have implemented Customer class with Serializable interface 

15	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

16	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class While {
static int i;
public static void main(String[]args){
System.out.println(i);
while(i<=5){
i++;
}
System.out.println(i);
}
}


Selected Option:


0,6

Correct Answer:


0,6 

17	
Carefully read the question and answer accordingly.
Which of the following variable represents the uncaught throwable object that resulted from a call to the error page in JSP? 


Selected Option:


Exception

Correct Answer:


Exception 

18	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

19	
Carefully read the question and answer accordingly.
In conditional control statements, if the condition yields NULL, its associated sequence of statements is not executed


Selected Option:


TRUE

Correct Answer:


TRUE 

20	
Carefully read the question and answer accordingly.
A Web application developed for an institution requires insertion of a header file comprising the logo and institution name. Identify the correct JSP tag from the options given below to add the logo and institution name to all the pages of the Web application. 


Selected Option:


<%@ include file="Header.html" %>

Correct Answer:


<%@ include file="Header.html" %> 

21	
Carefully read the question and answer accordingly.
What does DTD stands for?


Selected Option:


Document Type Definition

Correct Answer:


Document Type Definition 

22	
Carefully read the question and answer accordingly.
A Java Server Page (JSP) cannot be deployed in web server


Selected Option:


FALSE

Correct Answer:


FALSE 

23	
Carefully read the question and answer accordingly.
A filter configuration object used by a servlet container to pass information to a filter during initialization.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

24	
Carefully read the question and answer accordingly.
Does the below code compares 2 collections?
DECLARE
   TYPE Clientele IS TABLE OF VARCHAR2(64);
   group1 Clientele := Clientele('Customer 1', 'Customer 2'); 
   group2 Clientele := Clientele('Customer 1', 'Customer 3'); 
BEGIN
   IF group1 = group2 THEN
      ...
   END IF;
END;


Selected Option:


FALSE

Correct Answer:


FALSE 

25	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
If any class has at least one abstract method you must declare it as abstract class


Selected Option:


TRUE

Correct Answer:


TRUE 

26	
Carefully read the question and answer accordingly.
What are the two common exceptions in JAXP?
1.ParserConfigurationException
2.FactoryConfigurationException
3.FactoryConfigurationError


Selected Option:


1&3

Correct Answer:


1&3 

27	
Carefully read the question and answer accordingly.
Within try block if System.exit(0) is called then also finally block is going to be executed.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

28	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

29	
Carefully read the question and answer accordingly.
Servlet A receives a request that it forwards to servlet B within another web application in the same web container. Servlet A needs to share data with servlet B and that data must not be visible to other servlets in A's web application. In which object can the data that A shares with B be stored?


Selected Option:


ServletContext

Correct Answer:


HttpServletRequest 

30	
Carefully read the question and answer accordingly.
Consider the following code snippet:
ServletContext sc = this.getServletContext();
RequestDispatcher dis = sc.getRequestDispatcher("/menu.jsp");
if (dis != null){
dis.include(request, response);
}
PrintWriter out = response.getWriter();
out.print("Output after menu.jsp");
Which one of the following will be the correct outcome when the above lines are executed?


Selected Option:


Compilation error

Correct Answer:


Compilation and output of the contents of menu.jsp followed by "Output after menu.jsp" 

31	
Carefully read the question and answer accordingly.
The user SCOTT who is the owner of ORDERS and SUPPLIERS tables issues the following GRANT command:
GRANT ALL
ON orders, Suppliers TO PUBLIC;
What correction needs to be done to the above statement?


Selected Option:


WITH GRANT OPTION should be added to the statement.

Correct Answer:


Separate GRANT statements are required for ORDERS and SUPPLIERS tables. 

32	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Variabledec {
public static void main(String[]args){
boolean x = true;
int a;
if(x) a = x ? 2: 1;
else a = x ? 3: 4;
System.out.println(a);
}
}


Selected Option:


2

Correct Answer:


2 

33	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

34	 
Carefully read the question and answer accordingly.
The below html meta tag will reload page automatically every 60 ______ .
<meta http-equiv="refresh" content="60">


Selected Option:


seconds

Correct Answer:


seconds 

35	
Carefully read the question and answer accordingly.
Consider you are creating a cursor,Choose the correct sequence of steps to work with cursors?


Selected Option:


Declare , Open , Fetch , Close

Correct Answer:


Declare , Open , Fetch , Close 

36	
Carefully read the question and answer accordingly.
Examine the code snippet 
declare
TYPE CITY is TABLE of varchar2(20) index by PLS_INTEGER;
v1 CITY;
begin
v1(1):='Bangalore';
v1(6):='Mumbai';
v1(2):='Delhi';
dbms_output.put_line(v1.count());
dbms_output.put_line(v1(2));
dbms_output.put_line(v1.next(6));
end;
what will be the output of the above code?


Selected Option:


Compiles , executes prints 3 Delhi

Correct Answer:


Compiles , executes prints 3 Delhi 

37	
Carefully read the question and answer accordingly.
HTML is used to perform the programming logic.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

38	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

39	
Carefully read the question and answer accordingly.
Try can be followed with either catch or finally.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

40	
Carefully read the question and answer accordingly.
Ronald has observed that his Web application has some HTML tags or features that all the Web browsers do not support. If the client's browser does not support the application may or may not run or may generate undesired output in the Web browser of the client. Therefore Ronald wants to identify the type of browser and other specific information about the client that sends the request to the Web application before invoking the servlet. Which of the following options will help Ronald provide this functionality? 


Selected Option:


By programming filters

Correct Answer:


By programming filters 

41	
Carefully read the question and answer accordingly.
Which of the following interface represents the Servlet Config for the current Servlet? 


Selected Option:


javax.servlet.ServletConfig

Correct Answer:


javax.servlet.ServletConfig 

42	
Carefully read the question and answer accordingly.
A procedure containing a single OUT parameter would be better rewritten as a function returning the value.


Selected Option:


TRUE

Correct Answer:


TRUE 

43	
Carefully read the question and answer accordingly.
what is the way to iterate over the elements of a Map


Selected Option:


foreach
list Iterator
Iterator

Correct Answer:


foreach 
Iterator 

44	
Carefully read the question and answer accordingly.
Select the advantages of  using coding conventions in java application development.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

45	
Carefully read the question and answer accordingly.
Which of the following is true with respect to code given below?
import java.sql.*;
public class OracleDemo
{
 public static void main(String [] args) throws SQLException,ClassNotFoundException
 {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@PC188681:1521:training","scott","tiger");
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("SELECT * FROM Person");
  while(rs.next())
  {
   System.out.println(rs.getString("column1"));
  }
 }
}


Selected Option:


Class.forName must be mentioned after Connection statement

Correct Answer:


The code will display all values in column named column1 

46	
Carefully read the question and answer accordingly.
If the application is associated with JDK, it will lead to lighter memory footprint compared associating the application to JRE


Selected Option:


FALSE

Correct Answer:


FALSE 

47	
Carefully read the question and answer accordingly.
The method Class.forName() is a part of JDBC API. State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

48	 
Carefully read the question and answer accordingly.
Which design pattern used in creating connections using Java Database Connectivity (JDBC) API 


Selected Option:


Abstract Factory

Correct Answer:


Factory Pattern 

49	
Carefully read the question and answer accordingly.
What will be the output of the below query?
SELECT * FROM suppliers
WHERE supplier_name LIKE '!%' escape '!';


Selected Option:


All supplier record whose name starts with ! will be displayed

Correct Answer:


All supplier record whose name starts with % will be displayed 

50	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
Threads are small process which run in shared memory space within a process.


Selected Option:


TRUE

Correct Answer:


TRUE 

51	
Carefully read the question and answer accordingly.
Which of the following SQL statements will calculate and return the absolute value of -80?


Selected Option:


SELECT ABS("-80") Absolute FROM DUAL

Correct Answer:


SELECT ABS(-80) "Absolute" FROM DUAL 

52	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: A tag library descriptors an XML document that contains information about a library as a whole and about each tag contained in the library. 
Statement B: TLDs are used by a Web container to validate the tags used by JSP page development tools.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

53	
Carefully read the question and answer accordingly.
State TRUE or FALSE.
getParent() gives the parent directory of the file and isFile() Tests whether the file denoted by the given abstract pathname is a normal file.


Selected Option:


TRUE

Correct Answer:


TRUE 

54	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

55	
Carefully read the question and answer accordingly.
Consider you are developing an application where you have to store and retrieve data in character format in file.
 Which API you will use to store and retrieve the data in character format?


Selected Option:


Collection APIs

Correct Answer:


Reader and Writer Stream APIs 

56	
Carefully read the question and answer accordingly.
What is the output of the current code segment ?
 <c:forTokens items=“a,b,c,d,e” delims=“,” begin=“0” end=“4” step=“2” var=“alphabet”>
 <c:out value=“${alphabet}”/>
 </c:forTokens>


Selected Option:


b,d

Correct Answer:


a,c,e 

57	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

58	
Carefully read the question and answer accordingly.
Consider the code segment given below:
  List list = new ArrayList();
     list.add(“1”);
 list.add(“2”);
 list.add(“3”);
 list.add(“4”);
 request.setAttribute(“list”, list);
 String[]  names = {“a”, “b”, “c”, “d”, “e”};
What will ${names[list[0] + 1]} display?


Selected Option:


c

Correct Answer:


c 

59	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

60	
Carefully read the question and answer accordingly.
What are the types of refactoring?
1.Physical Structure
2.Logical Structure
3.Method Level
4.Class Level Structure


Selected Option:


1&4

Correct Answer:


1&4 

1	 
Carefully read the question and answer accordingly.
A developer designs a web application that must support multiple user interfaces such as 
1. XML based web services for Business to Business clients
2. HTML for web based clients
3. WML for wireless clients
Which design pattern provides the solution for this requirement. 


Selected Option:


Model - View - Controller

Correct Answer:


Model - View - Controller 

2	
Carefully read the question and answer accordingly.
What will be the output of the below query?
select to_CHAR(sysdate+(10/1400),'HH:MI:SS') from  dual;


Selected Option:


adds 10 minutes to the current Timestamp

Correct Answer:


adds 10 minutes to the current Timestamp 

3	
Carefully read the question and answer accordingly.
which are the Basic features of implementations of interfaces in Collections Framework  in java?


Selected Option:


All implementations support having null elements.
All implementations are serializable and cloneable

Correct Answer:


All implementations are unsynchronized 
All implementations support having null elements. 
All implementations are serializable and cloneable 

4	
Carefully read the question and answer accordingly.
what is the way to iterate over the elements of a Map


Selected Option:


Iterator
foreach

Correct Answer:


foreach 
Iterator 

5	
Carefully read the question and answer accordingly.
What is the syntax of Function?
CREATE [OR REPLACE] FUNCTION function_name [parameters] 
IS
Declaration_section 
RETURN return_datatype; 
BEGIN
Execution_section 
Return return_variable;  
EXCEPTION  
exception section  
Return return_variable; 
 END; 


Selected Option:


FALSE

Correct Answer:


FALSE 

6	
Carefully read the question and answer accordingly.
Which of these interface is not a member of java.io package?


Selected Option:


FileFilter

Correct Answer:


ObjectFilter 

7	
Carefully read the question and answer accordingly.
When Oracle starts an instance, it reads the server parameter file called _______________.


Selected Option:


SPFILE

Correct Answer:


SPFILE 

8	
Carefully read the question and answer accordingly.
What will be the output of the following code snippet?
<% page language="java"%>
<html>
<head></head>
<body>
<%java.util.Date now=new java.util.Date(); %>
<H1><%= now.getHours() %>:<%=now.getMinutes()%>:<%=now.getSeconds()%></H1>
</body>
</html> 


Selected Option:


It will display the current time as hh:mm:ss.

Correct Answer:


It will display the current time as hh:mm:ss. 

9	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

10	
Carefully read the question and answer accordingly.
How can you force garbage collection of an object?
1.Garbage collection cannot be forced
2.Call System.gc(). 
3.Call Runtime.gc().
4. Set all references to the object to new values(null, for example).


Selected Option:


Option 1

Correct Answer:


Option 1 

11	
Carefully read the question and answer accordingly.
Identify the correct syntax to create a sequence which generates values as 2,4,6,8,10?


Selected Option:


Create sequence MySeq Start with 2 Increment by 2

Correct Answer:


Create sequence MySeq Start with 2 Increment by 2 

12	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: Modules of Java code run in a server application is called Applet
Statement B: Modules of Java code run at client side is called Servlet
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is false.

Correct Answer:


Statement A is false and statement B is false. 

13	
Carefully read the question and answer accordingly.
What will be the output of following code?
public class Exception1{
public static void main(String args[]) { 
 int i=1, j=1;
try {
i++; 
 j--;
if(i/j > 1)
 i++;
} catch(ArithmeticException e) {
System.out.println(0);
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println(1);
} catch(Exception e) {
  System.out.println(2);
}
 finally {
System.out.println(3);
}
System.out.println(4);
}
}
1.0
2.1
3.3
4.4.


Selected Option:


1&3&4

Correct Answer:


1&3&4 

14	
Carefully read the question and answer accordingly.
Choose a valid package name in Java?
1.com.sun.eng
2.123pack
3.pack123
4.outerpack_innerpack


Selected Option:


1&3&4

Correct Answer:


1&3&4 

15	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

16	
Carefully read the question and answer accordingly.
Which anonymous block to select first 3 highest paid salary and to insert into a temp table without any duplicate entry.
TABLE DATA : TBL_EMPLOYEES
EmployeeID   Salary      DepartmentID
258963             3000                  20
257896             6000                  30
457892             3000                  40
564232             3000                  40
254589             8000                  50
784555             5000                  20


Selected Option:


DECLARE CURSOR c1 is SELECT employeeid, firstname||','||lastname "Name" , salary FROM tbl_employees ORDER BY salary DESC; v_employeeid NUMBER; v_name VARCHAR2(30); v_salary NUMBER; BEGIN OPEN c1; FOR i IN 1..3 LOOP FETCH c1 INTO v_employeeid, v_name, v_salary; INSERT INTO temp VALUES (v_employeeid, v_name, v_salary); EXIT WHEN c1%NOTFOUND; COMMIT; END LOOP; CLOSE c1; END;

Correct Answer:


DECLARE CURSOR c1 is SELECT employeeid, firstname||','||lastname "Name" , salary FROM tbl_employees ORDER BY salary DESC; v_employeeid NUMBER; v_name VARCHAR2(30); v_salary NUMBER; BEGIN OPEN c1; FOR i IN 1..3 LOOP FETCH c1 INTO v_employeeid, v_name, v_salary; INSERT INTO temp VALUES (v_employeeid, v_name, v_salary); EXIT WHEN c1%NOTFOUND; COMMIT; END LOOP; CLOSE c1; END; 

17	
Carefully read the question and answer accordingly.
Which object provides you with methods to access data from the table?


Selected Option:


ResultSet

Correct Answer:


ResultSet 

18	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

19	
Carefully read the question and answer accordingly.
What happens when the following code is compiled and run. Select the one correct  
answer.
     for(int i = 1; i < 3; i++)
        for(int j = 3; j >= 1; j--)
            assert i!=j : i;


Selected Option:


The program generates a compilation error.

Correct Answer:


The number 1 gets printed with AssertionError 

20	
Carefully read the question and answer accordingly.
Which of the following keywords ensures that a method cannot be overridden? 


Selected Option:


final

Correct Answer:


final 

21	
Carefully read the question and answer accordingly.
In conditional control statements, if the condition yields NULL, its associated sequence of statements is not executed


Selected Option:


TRUE

Correct Answer:


TRUE 

22	
Carefully read the question and answer accordingly.
Which method of jsp is equivalent to service method of servlet? 


Selected Option:


_jspService()

Correct Answer:


_jspService() 

23	
Carefully read the question and answer accordingly.
What is the sequence of output of the following code?
DECLARE
           TYPE list_of_names_t IS TABLE OF emp.ename%TYPE
              INDEX BY BINARY_INTEGER;
           family_mem   list_of_names_t;
           l_row BINARY_INTEGER;
        BEGIN
           family_mem (100) := 'Veena';
           family_mem (-15) := 'Sheela';
           family_mem (-30) := 'Syed';
           family_mem (88) := 'Raji';
          l_row := family_mem.FIRST;
          WHILE (l_row IS NOT NULL)
          LOOP
             DBMS_OUTPUT.put_line ( family_mem(l_row));
             l_row := family_mem.NEXT (l_row);
          END LOOP;
      END;


Selected Option:


Sheela, Syed, Veena, Raji

Correct Answer:


Syed, Sheela,Raji, Veena 

24	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

25	
Carefully read the question and answer accordingly.
Which of the following codes will allow the user to load the servlet using form. The form should first display submit button and when the user clicks on submit button it should load the servlet called myservlet?


Selected Option:


<HTML> <BODY> <FORM ACTION=http://localhost:8080/servlet/myservlet METHOD=GET> <INPUT TYPE=SUBMIT VALUE=SUBMIT> </FORM> </BODY> </HTML>

Correct Answer:


<HTML> <BODY> <FORM ACTION=http://localhost:8080/servlet/myservlet METHOD=GET> <INPUT TYPE=SUBMIT VALUE=SUBMIT> </FORM> </BODY> </HTML> 

26	
Carefully read the question and answer accordingly.
In JSP request implicit object is of which type?


Selected Option:


HttpServletRequest

Correct Answer:


HttpServletRequest 

27	
Carefully read the question and answer accordingly.
Any text that should not be parsed by the xml parser needs to declare as:
I: PCDATA
II: CDATA


Selected Option:


II

Correct Answer:


II 

28	
Carefully read the question and answer accordingly.
Consider the code segment given below:
  List list = new ArrayList();
     list.add(“1”);
 list.add(“2”);
 list.add(“3”);
 list.add(“4”);
 request.setAttribute(“list”, list);
 String[]  names = {“a”, “b”, “c”, “d”, “e”};
What will ${names[list[0] + 1]} display?


Selected Option:


c

Correct Answer:


c 

29	
Carefully read the question and answer accordingly.
If you want to know when a request attribute has been removed,added or replaced, then which listener is the appropriate one?


Selected Option:


HttpRequestListener

Correct Answer:


ServletRequestAttributeListener 

30	
Carefully read the question and answer accordingly.
Which of the following attributes of page directive are invalid?


Selected Option:


isScriptingEnabled

Correct Answer:


isScriptingEnabled 

31	
Carefully read the question and answer accordingly.
How can an existing session in servlet can be destroyed ? 
1.programmatically using session.invalidate()
2.by calling session.service() method
3.by closing the browser
4.when the server itself is shut down


Selected Option:


1&4

Correct Answer:


1&4 

32	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: A tag library descriptors an XML document that contains information about a library as a whole and about each tag contained in the library. 
Statement B: TLDs are used by a Web container to validate the tags used by JSP page development tools.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

33	
Carefully read the question and answer accordingly.
What are the uses of XML parsers?
1.Parsing XML files and retrieving data from XML elements
2.Creating XML files programmatically
3.Used to direct conversion using an XSLT processor


Selected Option:


1&2

Correct Answer:


1&2 

34	
Carefully read the question and answer accordingly.
What is the use of attributes in HTML tags?


Selected Option:


Provides additional behaviour to the tag

Correct Answer:


Provides additional behaviour to the tag 

35	
Carefully read the question and answer accordingly.
Select the best definition for Why Collection needed in Oracle?  


Selected Option:


Every time a software application connect up with a database, there is a performance value to be paid. Not only that, programs that continually switch off between code and SQL can become quite complex.

Correct Answer:


Every time a software application connect up with a database, there is a performance value to be paid. Not only that, programs that continually switch off between code and SQL can become quite complex. 

36	
Carefully read the question and answer accordingly.
Variables in Java Script should be declared with data types.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

37	
Carefully read the question and answer accordingly.
Which of the Following Statements are true?
Statement A : Join permanently joins two tables having 1 or more common attributes 
Statement B: Inner Joins are also called as EQUI Joins


Selected Option:


Both statements A and B are true.

Correct Answer:


Statement A is false and B is true. 

38	
Carefully read the question and answer accordingly.
Select the right coding best practices followed while using java Collections.
1.Use for loop instead of iterator
2.Use Collections with generic with same type of data.
3.Copy collections into other collections by calling addAll() methods instead using iterator  to copy each collection element.


Selected Option:


2&3

Correct Answer:


2&3 

39	
Carefully read the question and answer accordingly.
Consider the following code snippet:
<jsp:forward page="relativeURLspec"/>
Which of the following statements is true about the execution status of the page where this statement has been written? 


Selected Option:


The execution of the current page is terminated.

Correct Answer:


The execution of the current page is terminated. 

40	
Carefully read the question and answer accordingly.
Which is the super class for Exception and Error?


Selected Option:


Throwable

Correct Answer:


Throwable 

41	
Carefully read the question and answer accordingly.
Using prefix c to represent the JSTL library, which of the following produces the same result as <%= var %>?


Selected Option:


<c:out value=${var}>

Correct Answer:


<c:out value=${var}> 

42	
Carefully read the question and answer accordingly.
Which of the following is not an attribute of meta tag?


Selected Option:


value

Correct Answer:


value 

43	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

44	
Carefully read the question and answer accordingly.
If display method in super class has a protected specifier then what should be the specifier for the overriding display method in sub class?


Selected Option:


protected or public

Correct Answer:


protected or public 

45	
Carefully read the question and answer accordingly.
Consider the following deployment descriptor(web.xml)file:
<session-config>
<session-timeout>
30
</session-timeout>
</session-config>
Then, in the Servlet program code setMaxInactiveInterval(600)(seconds) for the session object is invoked. After how long would session expire? Select one answer from the following.


Selected Option:


30 minutes

Correct Answer:


10 minutes 

46	
Carefully read the question and answer accordingly.
Which of the following listed option gives the valid type of object to store a date and time combination using JDBC API?


Selected Option:


java.util.Date

Correct Answer:


java.sql.Timestamp 

47	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

48	
Carefully read the question and answer accordingly.
Which of these is not valid method in Thread class


Selected Option:


void start()

Correct Answer:


boolean getPriority() 

49	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

50	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class CompareStrings{
public static void main(String[]args){
if("  string  ".trim()=="string")
System.out.println("both strings are equal");
else
System.out.println("both strings are  not equal");
}
}


Selected Option:


both strings are not equal

Correct Answer:


both strings are not equal 

51	
Carefully read the question and answer accordingly.
Given a Filter class definition with this method:
21. public void doFilter(ServletRequest request,
22. ServletResponse response,
23. FilterChain chain)
24. throws ServletException, IOException {
25. // insert code here
26. }
Which code line should you insert at line 25 to properly invoke the next filter in the chain, or the target servlet if
there are no more filters?


Selected Option:


chain.doFilter(request, response);

Correct Answer:


chain.doFilter(request, response); 

52	
Carefully read the question and answer accordingly.
Select the key advantages of using Store procedures in database management system.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

53	
Carefully read the question and answer accordingly.
Which statement  creates DocumentBuilderFactory instance?


Selected Option:


DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();

Correct Answer:


DocumentBuilderFactory f=DocumentBuilderFactory.newInstance(); 

54	
Carefully read the question and answer accordingly.
What is the use of ServletConfig interface?


Selected Option:


A servlet configuration object used by a servlet container to pass information to a servlet during initialization

Correct Answer:


A servlet configuration object used by a servlet container to pass information to a servlet during initialization 

55	
Carefully read the question and answer accordingly.
Which of these is executed first before execution of any other thing takes place in a program?


Selected Option:


main method

Correct Answer:


static block code 

56	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

57	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

58	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

59	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The below code will compile &   provide desired output:
package p1;
class Parent {
 private int doWork(){
  System.out.println("Do Work - Parent");
  return 0;
 }
}
class Child extends Parent {
 public void doWork(){
  System.out.println("Do Work - Child");
 }
}
class Test{
 public static void main(String[] args) {
  new Child().doWork();
 }
}


Selected Option:


TRUE

Correct Answer:


TRUE 

60	
Carefully read the question and answer accordingly.
Consider you are developing an ATM application for ABC Bank using java application. Several account holders of ABC Bank have opted for add-on cards. There is a chance that two users may access the same account at same time and do transaction simultaneously knowingly or unknowingly from different ATM machine from same or different bank branches. As developer you have to ensure that when one user login to account until he finishes his transaction account should be locked to other users who are trying access the same account. How do you implement given requirement programmatically using java?


Selected Option:


Using Thread Synchronization

Correct Answer:


Using Thread Synchronization 

1	
Carefully read the question and answer accordingly.
What is the value of variable "I" after execution of following code?
public class Evaluate 
{
 public static void main(String[]args)
 {
  int i=10;
  if(((i++)>12)&&(++i<15))
   System.out.println(i);
  else
   System.out.println(i);
 }
}


Selected Option:


11

Correct Answer:


11 

2	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending data securely on submitting the form? 
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

3	
Carefully read the question and answer accordingly.
which of these are the subclass of Exception class


Selected Option:


Throwable
IOException

Correct Answer:


IOException 
RunTimeException 
FileNotFindException 

4	
Carefully read the question and answer accordingly.
When a database is created the users SYS and SYSTEM are created automatically and granted the DBA role. State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

5	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

6	
Carefully read the question and answer accordingly.
If you want to know when a request attribute has been removed,added or replaced, then which listener is the appropriate one?


Selected Option:


ServletRequestAttributeListener

Correct Answer:


ServletRequestAttributeListener 

7	
Carefully read the question and answer accordingly.
Consider you are creating a JSP page. You want to use the classes of java.util package. Which statement will you use to import the java.util package? 


Selected Option:


<%@ page import="java.util.*" %>

Correct Answer:


<%@ page import="java.util.*" %> 

8	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

9	
Carefully read the question and answer accordingly.
Which of the following statement is true regarding try-catch-finally?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

10	
Carefully read the question and answer accordingly.
If display method in super class has a protected specifier then what should be the specifier for the overriding display method in sub class?


Selected Option:


protected or default

Correct Answer:


protected or public 

11	
Carefully read the question and answer accordingly.
Which of the following correctly defines use of DTD in XML development?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

12	
Carefully read the question and answer accordingly.
Variables in Java Script should be declared with data types.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

13	
Carefully read the question and answer accordingly.
Which of the following variable represents the uncaught throwable object that resulted from a call to the error page in JSP? 


Selected Option:


Exception

Correct Answer:


Exception 

14	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class VariableDec 
{
 public static void main(String[]args)
 {
  int x = 1;
  if(x>0 )
   x = 3;
  switch(x) 
  {
   case 1: System.out.println(1);
   case 0: System.out.println(0);
   case 2: System.out.println(2);
   break;
   case 3: System.out.println(3);
   default: System.out.println(4);
   break;
  }
 }
}


Selected Option:


3 4

Correct Answer:


3 4 

15	
Carefully read the question and answer accordingly.
Which JSTL code snippet can be used to perform URL rewriting?


Selected Option:


<a href='<c:url value="cognizant.jsp"/>'/>

Correct Answer:


<a href='<c:url value="cognizant.jsp"/>'/> 

16	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class CompareStrings{
public static void main(String[]args){
String a=new String("string");
String s=new String("string");
if(a==s)
System.out.println("both strings are equal");
else
System.out.println("both strings are  not equal");
}
}


Selected Option:


both strings are not equal

Correct Answer:


both strings are not equal 

17	
Carefully read the question and answer accordingly.
Statement A:Listener process scans for connection requests to an Oracle Instance
Statement B:Listener process links up a dispatcher process to user process.
which of the following is true?


Selected Option:


Statement A is true and Statement B is false

Correct Answer:


Both Statements A and B are true 

18	
Carefully read the question and answer accordingly.
When comparable interface is used which method should be overridden?


Selected Option:


compareTo

Correct Answer:


compareTo 

19	
Carefully read the question and answer accordingly.
Which collection class allows you to associate its elements with key values


Selected Option:


java.utill.Map
java.util.HashMap
java.util.Dictionary

Correct Answer:


java.util.Dictionary 
java.util.HashMap 

20	
Carefully read the question and answer accordingly.
What are the two common exceptions in JAXP?
1.ParserConfigurationException
2.FactoryConfigurationException
3.FactoryConfigurationError


Selected Option:


1&3

Correct Answer:


1&3 

21	 
Carefully read the question and answer accordingly.
In the below code, if we declare List interface instead of ArrayList, it would be easier to change any List implementation to store customer details in future. By defining ArrayList here the programmer tightly couples the ArrayList in his application. 
class CustomerList {
 ArrayList customerList;
 public CustomerList(ArrayList list){
 customerList=list;
 }
} 


Selected Option:


TRUE

Correct Answer:


TRUE 

22	
Carefully read the question and answer accordingly.
Which of the following correctly fits for the definition 'holding instances of other objects'?


Selected Option:


Generic

Correct Answer:


Aggregation 

23	
Carefully read the question and answer accordingly.
In which case should you use a FULL OUTER JOIN? 


Selected Option:


You want all matched and unmatched data from only one table.

Correct Answer:


You want all unmatched data from both tables. 

24	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

25	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: A tag library descriptors an XML document that contains information about a library as a whole and about each tag contained in the library. 
Statement B: TLDs are used by a Web container to validate the tags used by JSP page development tools.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

26	
Carefully read the question and answer accordingly.
InputStream is the class used for stream of characters.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

27	
Carefully read the question and answer accordingly.
Which of the following is applicable to Servlet Containers?


Selected Option:


These are responsible for managing the lifecycle of servlets, mapping a URL (Universal Resource Locator) to a particular servlet, and ensuring that the URL requester has got the correct access rights

Correct Answer:


All of the listed options 

28	
Carefully read the question and answer accordingly.
Examine the description of the employees table: 
EMP_ID NUMBER (4) NOT NULL 
LAST_NAME VARCHAR2 (30) NOT NULL 
FIRST_NAME VARCHAR2 (30) 
DEPT_ID NUMBER (2) 
JOB_CAT VARCHAR (30) 
SALARY NUMBER (8, 2) 
Which of the following SQL statements shows the department ID, minimum salary, and maximum salary paid in that department, only if the minimum salary is less than 2000 and maximum salary is more than 5000?


Selected Option:


SELECT dept_id, MIN (salary), MAX (salary) FROM employees GROUP BY dept_id HAVING MIN(salary) < 2000 AND MAX (salary) > 5000

Correct Answer:


SELECT dept_id, MIN (salary), MAX (salary) FROM employees GROUP BY dept_id HAVING MIN(salary) < 2000 AND MAX (salary) > 5000 

29	
Carefully read the question and answer accordingly.
Which of the following tag disables scriplets?


Selected Option:


<is-scripting-invalid>

Correct Answer:


<scripting-invalid> 

30	
Carefully read the question and answer accordingly.
Comparisons involving nulls always yield NULL


Selected Option:


TRUE

Correct Answer:


TRUE 

31	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

32	
 Carefully read the question and answer accordingly.
What will be the output of the query?
Select trim(0 from '00003443500') from dual?
 


Selected Option:


34435

Correct Answer:


34435 

33	
Carefully read the question and answer accordingly.
Given a Filter class definition with this method:
21. public void doFilter(ServletRequest request,
22. ServletResponse response,
23. FilterChain chain)
24. throws ServletException, IOException {
25. // insert code here
26. }
Which code line should you insert at line 25 to properly invoke the next filter in the chain, or the target servlet if
there are no more filters?


Selected Option:


chain.doFilter(request, response);

Correct Answer:


chain.doFilter(request, response); 

34	
Carefully read the question and answer accordingly.
HTTP is stateful protocol which maintains clients state automatically. State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

35	
Carefully read the question and answer accordingly.
In JavaScript, for reading the contents inside the first paragraph tag which statement is used?


Selected Option:


document.getElementsByTagName("p")[0].innerText;

Correct Answer:


document.getElementsByTagName("p")[0].innerText; 

36	
Carefully read the question and answer accordingly.
Which of the following is build tool?


Selected Option:


ANT

Correct Answer:


ANT 

37	
Carefully read the question and answer accordingly.
 public class Threads 
{
 public static void main (String[] args) 
 {
  new Threads().go();
 }
 public void go()
 {
  Runnable r = new Runnable()
   {
   public void run() 
   {
   System.out.print("Run");
    }
  };
  
  Thread t = new Thread(r);
   t.start();
   t.start();
  }
}
What will be the result?


Selected Option:


Compilation fails.

Correct Answer:


An exception is thrown at runtime. 

38	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

39	
Carefully read the question and answer accordingly.
Which of the trigger is used to log all errors and also to do some special processing when the log error is 1017?


Selected Option:


CREATE TRIGGER log_errors AFTER SERVERERROR ON DATABASE BEGIN IF (IS_SERVERERROR (1017)) THEN <special processing of logon error> ELSE <log error number> END IF; END;

Correct Answer:


CREATE TRIGGER log_errors AFTER SERVERERROR ON DATABASE BEGIN IF (IS_SERVERERROR (1017)) THEN <special processing of logon error> ELSE <log error number> END IF; END; 

40	
Carefully read the question and answer accordingly.
Which of the following tag is used to specify the initialization parameters in the web.xml file? 


Selected Option:


<init-param>

Correct Answer:


<init-param> 

41	
Carefully read the question and answer accordingly.
Lisa is a systems programmer at ABC Consultants. She has written an application to accept student marks in the variable marks. If the student has scored marks greater than 60. She needs to forward the control of the program to another file called as "Ex.jsp" else the control should be forwarded to a file called as "Av.jsp".
Which of the following code snippets should she use for checking this condition and forward control? 


Selected Option:


<% if(Integer.parseInt(request.getParameter("marks"))>=60) { %> <jsp:forward page="Ex.jsp" /> <% } else { %> <jsp:forward page="Av.jsp" /> <% } %>

Correct Answer:


<% if(Integer.parseInt(request.getParameter("marks"))>=60) { %> <jsp:forward page="Ex.jsp" /> <% } else { %> <jsp:forward page="Av.jsp" /> <% } %> 

42	
Carefully read the question and answer accordingly.
You being a software developer needs to develop a web application for your organization. You decided to use servlets to create the web application. While you are creating the servlet you feel the need to write the code for the initialization of the servlet. This is needed to initialize the servlet with the required data after the servlet instance has been created. How will you perform this task? 


Selected Option:


By overriding the init method in the servlet class.

Correct Answer:


By overriding the init method in the servlet class. 

43	
Carefully read the question and answer accordingly.
What are the uses of XML parsers?
1.Parsing XML files and retrieving data from XML elements
2.Creating XML files programmatically
3.Used to direct conversion using an XSLT processor


Selected Option:


1&2

Correct Answer:


1&2 

44	
Carefully read the question and answer accordingly.
What are the types of refactoring?
1.Physical Structure
2.Logical Structure
3.Method Level
4.Class Level Structure


Selected Option:


1&4

Correct Answer:


1&4 

45	
Carefully read the question and answer accordingly.
A PL/SQL function can return more than one value from a function using PL/SQL record or PL/SQL table


Selected Option:


FALSE

Correct Answer:


TRUE 

46	
Carefully read the question and answer accordingly.
How to convert the following code using the cursor FOR LOOP?
 DECLARE
 CURSOR occupancy_cur IS
 SELECT pet_id, room_number
 FROM occupancy WHERE occupied_dt = SYSDATE;
 occupancy_rec occupancy_cur%ROWTYPE;
 BEGIN
 OPEN occupancy_cur;
 LOOP
 FETCH occupancy_cur INTO occupancy_rec;
 EXIT WHEN occupancy_cur%NOTFOUND;
 update_bill (occupancy_rec.pet_id,   occupancy_rec.room_number);
 END LOOP;
 CLOSE occupancy_cur;
 END;


Selected Option:


DECLARE CURSOR occupancy_cur IS SELECT pet_id, room_number FROM occupancy WHERE occupied_dt = SYSDATE; BEGIN FOR occupancy_rec IN occupancy_cur LOOP update_bill (occupancy_rec.pet_id, occupancy_rec.room_number); END LOOP; CLOSE occupancy_cur; END;

Correct Answer:


DECLARE CURSOR occupancy_cur IS SELECT pet_id, room_number FROM occupancy WHERE occupied_dt = SYSDATE; BEGIN FOR occupancy_rec IN occupancy_cur LOOP update_bill (occupancy_rec.pet_id, occupancy_rec.room_number); END LOOP; END; 

47	
Carefully read the question and answer accordingly.
Consider the following servlet code segment:
 Map map = new HashMap();
 map.put(“a”, “1”);
 map.put(“b”, “2”);
 map.put(“c”, “3”);
 map.put(“d”, “4”);
 request.setAttribute(“map”, map);
 String[] names = {“a”, “b”, “c”, “d”};
 request.setAttribute(“names” , names);
 What does ${map[names[0]]} return?


Selected Option:


1

Correct Answer:


1 

48	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

49	
Carefully read the question and answer accordingly.
Scripting can be blocked in a jsp by:


Selected Option:


Putting <scripting-invalid> element in web.xml

Correct Answer:


Putting <scripting-invalid> element in web.xml 

50	
Carefully read the question and answer accordingly.
If we want to apply a style for a text or a part of a text which tag will be used?
I: SPAN
II: DIV


Selected Option:


I

Correct Answer:


I 

51	
Carefully read the question and answer accordingly.
Consider you are trying to persist or store object of Customer class using ObjectOutputStream class in java. When you are trying to persist customer object data java code is throwing runtime exception without persisting object information.  Please suggest what is the key important factor you have consider in code in order to persist customer object data.


Selected Option:


Check whether you have implemented Customer class with Serializable interface

Correct Answer:


Check whether you have implemented Customer class with Serializable interface 

52	
Carefully read the question and answer accordingly.
What is the use of attributes in HTML tags?


Selected Option:


Provides additional behaviour to the tag

Correct Answer:


Provides additional behaviour to the tag 

53	
Carefully read the question and answer accordingly.
The method Class.forName() is a part of JDBC API. State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

54	
Carefully read the question and answer accordingly.
jspInit() method can be overridden by the author. Say True or False


Selected Option:


TRUE

Correct Answer:


TRUE 

55	
 Carefully read the question and answer accordingly.
Examine the code snippet
declare 
TYPE XYZ is VARRAY(10) of NUMBER;
v2 XYZ; --line 1
x Number:=0;
Begin
v2:=XYZ(1,2,3,4,5,6,7); --line 2
v2.delete(1); --line 3
 while x < v2.last –line 4 
loop
x:=x+1;
dbms_output.put_line(x);
end loop;
end;
/
What will be the output of the above code ?
 


Selected Option:


Compilation fails due to error on line 1

Correct Answer:


Compilation fails due to error on line 4 

56	
Carefully read the question and answer accordingly.
Consider you are developing java application in a team consists of 20 developers and you have been asked to develop class by Name ProgrammerAnalyst and to ensure that other developers in team use ProgrammerAnalyst class only by creating object and team member should not be given provision to inherit and modify any functionality written in ProgrammerAnalyst class using inheritance. How do you achieve this requirement in development scenario?


Selected Option:


Declare the ProgrammerAnalyst class has final

Correct Answer:


Declare the ProgrammerAnalyst class has final 

57	
Carefully read the question and answer accordingly.
Consider the following code for an HTML form.
<form action=”/servlet/Login”>
<input type=”text” name=”username” value=”enter username”/>
<input type=”submit”  name=”sbbutton” value=”signin!..”/>
</form>
Which of the following happens upon pressing the submit button in the above form?
1.A request is sent with the HTTP method GET.
2.A request is sent with the HTTP method POST.
3.The parameter username is the only parameter passed to the web server in the request.
4.The parameters username and sbbutton are passed to the web server in the request URL.


Selected Option:


1&4

Correct Answer:


1&4 

58	
Carefully read the question and answer accordingly.
Which of the following is not an attribute of meta tag?


Selected Option:


value

Correct Answer:


value 

59	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The below code will compile &   provide desired output:
package p1;
interface Bounceable {
 void bounce();
 void setBounceFactor(int bf);
 private class BusinessLogic
 {
  int var1;
  float var2;
  double result(int var1,float var2){
   return var1*var2;
  }
 }
}
class Test {
 public static void main(String[] args) {
  System.out.println(new Bounceable.BusinessLogic().result(12,12345.22F));
 }
}


Selected Option:


TRUE

Correct Answer:


FALSE 

60	
Carefully read the question and answer accordingly.
Which statements about JDBC are true? 
1.JDBC has 5 types of Drivers
2.JDBC stands for Java DataBase Connectivity
3.JDBC is an API to access relational databases, spreadsheets and flat files
4.JDBC is an API to bridge the object-relational mismatch between OO programs and relational databases


Selected Option:


2&4

Correct Answer:


2&3 


1	
Carefully read the question and answer accordingly.
What language is used to write servlets and JSP?


Selected Option:


Servlets are written in the Java language

Correct Answer:


Servlets are written in the Java language 

2	
Carefully read the question and answer accordingly.
What is the use of attributes in HTML tags?


Selected Option:


Provides additional behaviour to the tag

Correct Answer:


Provides additional behaviour to the tag 

3	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

4	
Carefully read the question and answer accordingly.
Which parser is a W3C standard?


Selected Option:


DOM

Correct Answer:


DOM 

5	
Carefully read the question and answer accordingly.
What will be the output of the below query?
SELECT * FROM suppliers
WHERE supplier_name LIKE '!%' escape '!';


Selected Option:


All supplier record will be displayed

Correct Answer:


All supplier record whose name starts with % will be displayed 

6	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

7	
Carefully read the question and answer accordingly.
You have a map named “carMap” with a key named “Ford”. Select  correct EL syntaxes to print the value of this key.
1.${carMap.Ford}
2.${carMap.[Ford]}
3.${carMap[“Ford”]}
4.${carMap[Ford]}


Selected Option:


1&3

Correct Answer:


1&3 

8	
Carefully read the question and answer accordingly.
Given a Filter class definition with this method:
21. public void doFilter(ServletRequest request,
22. ServletResponse response,
23. FilterChain chain)
24. throws ServletException, IOException {
25. // insert code here
26. }
Which code line should you insert at line 25 to properly invoke the next filter in the chain, or the target servlet if
there are no more filters?


Selected Option:


chain.doFilter(request, response);

Correct Answer:


chain.doFilter(request, response); 

9	
Carefully read the question and answer accordingly.
Which of the Following Statements are true?
Statement A : Join permanently joins two tables having 1 or more common attributes 
Statement B: Inner Joins are also called as EQUI Joins


Selected Option:


Statement A is false and B is true.

Correct Answer:


Statement A is false and B is true. 

10	
Carefully read the question and answer accordingly.
Which of the following Listener can get context init parameter and run some code before rest of the application can service a client?


Selected Option:


HttpSessionListener

Correct Answer:


ServletContextListener 

11	
Carefully read the question and answer accordingly.
In JavaScript, for reading the contents inside the first paragraph tag which statement is used?


Selected Option:


document.getElementsByTagName("p")[0].innerText;

Correct Answer:


document.getElementsByTagName("p")[0].innerText; 

12	 
Carefully read the question and answer accordingly.
What will be the output for following code?
class Super
{
 int num=20;
 public void display()
 {
 System.out.println("super class method");
 }
}
public class ThisUse extends Super
{
 int num;
 public ThisUse(int num)
 {
 this.num=num;
 }
 public void display()
 {
 System.out.println("display method");
 }
 public void Show()
 {
 this.display();
 display();
 System.out.println(this.num);
 System.out.println(num);
 }
 public static void main(String[]args)
 {
 ThisUse o=new ThisUse(10);
 o.Show();
 }
} 


Selected Option:


display method display method 10 10

Correct Answer:


display method 
display method 
10 
10 

13	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

14	
Carefully read the question and answer accordingly.
Which of the below is invalid state of thread?


Selected Option:


Blocked

Correct Answer:


Stop 

15	
Carefully read the question and answer accordingly.
What is the syntax of Function?
CREATE [OR REPLACE] FUNCTION function_name [parameters] 
IS
Declaration_section 
RETURN return_datatype; 
BEGIN
Execution_section 
Return return_variable;  
EXCEPTION  
exception section  
Return return_variable; 
 END; 


Selected Option:


TRUE

Correct Answer:


FALSE 

16	
Carefully read the question and answer accordingly.
Select the best definition for Why Collection needed in Oracle?  


Selected Option:


Every time a software application connect up with a database, there is a performance value to be paid. Not only that, programs that continually switch off between code and SQL can become quite complex.

Correct Answer:


Every time a software application connect up with a database, there is a performance value to be paid. Not only that, programs that continually switch off between code and SQL can become quite complex. 

17	
Carefully read the question and answer accordingly.
What are the Tools & plug-ins commonly used  in testing java application code? 
1.ANT
2.JUnit
3.JavaScript
4.EMMA


Selected Option:


2&4

Correct Answer:


2&4 

18	
Carefully read the question and answer accordingly.
Which of the following is a marker interface used for object serialization?


Selected Option:


Serializable

Correct Answer:


Serializable 

19	
Carefully read the question and answer accordingly.
What will be the output of the following code snippet?
<% page language="java"%>
<html>
<head></head>
<body>
<%java.util.Date now=new java.util.Date(); %>
<H1><%= now.getHours() %>:<%=now.getMinutes()%>:<%=now.getSeconds()%></H1>
</body>
</html> 


Selected Option:


It will display the current time as hh:mm:ss.

Correct Answer:


It will display the current time as hh:mm:ss. 

20	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

21	
Carefully read the question and answer accordingly.
Please select the correct statement  with respect to including JavaScript in HTML pages.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

22	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

23	 
Carefully read the question and answer accordingly.
Which are the pattern types are used for building loosely coupled systems 


Selected Option:


Creational pattern
Behavioral Pattern
Structural Pattern

Correct Answer:


Structural Pattern 
Behavioral Pattern 

24	
Carefully read the question and answer accordingly.
Which type of Statement can execute parameterized queries?


Selected Option:


All kinds of Statements (i.e. which implement a sub interface of Statement)

Correct Answer:


PreparedStatement 

25	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

26	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class While {
public static void main(String[]args){
 int a='A';
int i=a+32;
while(a<='Z'){
a++;
}
System.out.println(i);
System.out.println(a);
}
}


Selected Option:


97,91

Correct Answer:


97,91 

27	
Carefully read the question and answer accordingly.
Select correct naming convention used during class declaration. 
1.Class name should be nouns
2.Should be simple & descriptive
3.Class name starts with lower case.
4.Class name can be java valid keyword.


Selected Option:


1&2

Correct Answer:


1&2 

28	
Carefully read the question and answer accordingly.
Consider you are creating a JSP page. You want to use the classes of java.util package. Which statement will you use to import the java.util package? 


Selected Option:


<%@ page import="java.util.*" %>

Correct Answer:


<%@ page import="java.util.*" %> 

29	
Carefully read the question and answer accordingly.
How do we compare records?
(old_company_rec, new_company_rec are 2 records with name , incorp_date, address1 as fields)


Selected Option:


IF old_company_rec.name = new_company_rec.name AND old_company_rec.incorp_date = new_company_rec.incorp_date AND old_company_rec.address1 = new_company_rec.address1 AND THEN ... the two records are identical ... END IF;

Correct Answer:


IF old_company_rec.name = new_company_rec.name AND old_company_rec.incorp_date = new_company_rec.incorp_date AND old_company_rec.address1 = new_company_rec.address1 AND THEN ... the two records are identical ... END IF; 

30	
Carefully read the question and answer accordingly.
what is the way to iterate over the elements of a Map


Selected Option:


foreach
Iterator

Correct Answer:


foreach 
Iterator 

31	
Carefully read the question and answer accordingly.
executeUpdate() & execute() are valid methods that can be used for executing DDL statements. State  True or False


Selected Option:


FALSE

Correct Answer:


TRUE 

32	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending data securely on submitting the form? 
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

33	
Carefully read the question and answer accordingly.
Using prefix c to represent the JSTL library, which of the following produces the same result as <%= var %>?


Selected Option:


<c:out value=${var}>

Correct Answer:


<c:out value=${var}> 

34	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

35	
Carefully read the question and answer accordingly.
Servlet A receives a request that it forwards to servlet B within another web application in the same web container. Servlet A needs to share data with servlet B and that data must not be visible to other servlets in A's web application. In which object can the data that A shares with B be stored?


Selected Option:


ServletContext

Correct Answer:


HttpServletRequest 

36	
Carefully read the question and answer accordingly.
What will be the output for following code
public class
MethodOverloading {
int m=10,n;
public void div(int a) throws Exception{
n=m/a;
System.out.println(n);
}
public void div(int a,int b) {
n=a/b;
}
public static void main(String[]args) throws Exception{
MethodOverloading o=new MethodOverloading();
o.div(0);
o.div(10,2);
}
}
 


Selected Option:


It will give ArithmeticException

Correct Answer:


It will give ArithmeticException 

37	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: A tag library descriptors an XML document that contains information about a library as a whole and about each tag contained in the library. 
Statement B: TLDs are used by a Web container to validate the tags used by JSP page development tools.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

38	
Carefully read the question and answer accordingly.
Any text that should not be parsed by the xml parser needs to declare as:
I: PCDATA
II: CDATA


Selected Option:


I

Correct Answer:


II 

39	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

40	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
StringBuilder is not thread-safe unlike StringBuffer


Selected Option:


FALSE

Correct Answer:


TRUE 

41	
Carefully read the question and answer accordingly.
Manoj has created the Hello servlet that displays Welcome in the browser window. The code of the servlet is:
package myworld;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class hello extends HttpServlet 
{
   protected void doGet(HttpServletRequest request HttpServletResponse response) throws ServletException IOException   
   {
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>My Servlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h>WELCOME</h>");
      out.println("</body>");
      out.println("</html>");
      out.close();
   }
}
Which of the following code snippets correctly defines the deployment descriptor for the preceding servlet? 


Selected Option:


<servlet> <servlet-name>hello</servlet-name> <servlet-class>myworld.hello</servlet-class> </servlet> <servlet-mapping> <servlet-name>hello</servlet-name> <url-pattern>/hello</url-pattern> </servlet-mapping>

Correct Answer:


<servlet> <servlet-name>hello</servlet-name> <servlet-class>myworld.hello</servlet-class> </servlet> <servlet-mapping> <servlet-name>hello</servlet-name> <url-pattern>/hello</url-pattern> </servlet-mapping> 

42	
 Carefully read the question and answer accordingly.
Which of the following methods can not be over-ridden ? 


Selected Option:


_jspService()

Correct Answer:


_jspService() 

43	
Carefully read the question and answer accordingly.
What is an EXIT - WHEN statement?


Selected Option:


The EXIT-WHEN statement replaces a simple IF statement.
When the EXIT statement is encountered, the condition in the WHEN clause is evaluated. If the condition is true, the loop completes and control passes to the next statement after the loop

Correct Answer:


When the EXIT statement is encountered, the condition in the WHEN clause is evaluated. If the condition is true, the loop completes and control passes to the next statement after the loop 
The EXIT-WHEN statement replaces a simple IF statement. 

44	
Carefully read the question and answer accordingly.
Consider the following servlet code segment:
 HttpSession session = request.getSession(true);
 session.setAttribute(“name”, “Cognizant”);
 session.invalidate(0);
 if (session.isNew())
 {  System.out.println(session.getAttribute(“name”);
 } else {  System.out.println(session.isNew());
 }
 What is the output of the above code segment ?


Selected Option:


Throws exception

Correct Answer:


Throws exception 

45	
Carefully read the question and answer accordingly.
Consider you are developing an application where you have to store and retrieve data in character format in file. Which API you will use to store and retrieve the data in character format?


Selected Option:


None of the listed options

Correct Answer:


Reader and Writer Stream APIs 

46	
Carefully read the question and answer accordingly.
Which procedure raises an exception 'NO DATA FOUND' when the student searches for the course which is not available else to display
a message that the course is available.


Selected Option:


CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like 'p_course%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major;

Correct Answer:


CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like p_course||'%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major; 

47	
Carefully read the question and answer accordingly.
Your web application views all have the same header which includes <title> tag in the <head> element of the rendered HTML. You have decided to remove the redundant HTML code from your JSPs and put into a single JSP called /WEB-INF/jsp/header.jsp. However, the title of each page is unique, so you have decided to use variable called pageTitle to parameterize this in the header JSP like this:
<title> ${param.pageTitle}</title>
Which JSP code snippet you use in your main view JSPs to insert the header and pass the pageTitle variable?


Selected Option:


<jsp:include page='WEB-INF/jsp/header.jsp'> <jsp:param name='pageTitle' value='Welcome Page'/> </jsp:include>

Correct Answer:


<jsp:include page='WEB-INF/jsp/header.jsp'> <jsp:param name='pageTitle' value='Welcome Page'/> </jsp:include> 

48	
Carefully read the question and answer accordingly.
There exists a procedure called add_dept with two parameters. The procedure is called as shown below 
     EXECUTE add_dept ('ADVERTISING', loc => 1200)
What type of parameter-passing is this ?


Selected Option:


positional

Correct Answer:


combined(positional and named) 

49	
Carefully read the question and answer accordingly.
Is this true or false. Map interface is derived from the Collection interface. 


Selected Option:


TRUE

Correct Answer:


FALSE 

50	
Carefully read the question and answer accordingly.
For every HTTP request, static contents will be served by a web server, whereas if dynamic content is requested, web server forwards the request to application server.


Selected Option:


TRUE

Correct Answer:


TRUE 

51	
Carefully read the question and answer accordingly.
Which method binds an object to a given attribute name in this ServletContext interface?


Selected Option:


void setAttribute(String name, Object object)

Correct Answer:


void setAttribute(String name, Object object) 

52	
Carefully read the question and answer accordingly.
Consider the following code:
1   public class FinallyCatch { 
2      public static void main(String args[]) {  
3         try {
4            throw new java.io.IOException();
5         }
6      }
7   }
Which of the following is true regarding the above code?


Selected Option:


Shows unhandled exception type IOException at line number 4

Correct Answer:


Demands a finally block at line number 5 

53	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Exception1{
public static void main(String args[]) { 
 int i=1, j=1;
try {
i++; 
 j--;
if(i/j > 1)
 i++;
} catch(Exception e) {
  System.out.println(2);
} catch(ArithmeticException e) {
System.out.println(0);
}
 finally {
System.out.println(3);
}
}
}


Selected Option:


compilation error

Correct Answer:


compilation error 

54	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

55	
Carefully read the question and answer accordingly.
Choose the correct option.
Statement I: When an abstract class is sub classed, the subclass should provide the implementation for all the abstract methods in its parent class.
Statement II: If the subclass does not implement the abstract method in its parent class, then the subclass must also be declared abstract.


Selected Option:


Statement I & II are TRUE

Correct Answer:


Statement I & II are TRUE 

56	
Carefully read the question and answer accordingly.
The user SCOTT who is the owner of ORDERS and SUPPLIERS tables issues the following GRANT command:
GRANT ALL
ON orders, Suppliers TO PUBLIC;
What correction needs to be done to the above statement?


Selected Option:


WITH GRANT OPTION should be added to the statement.

Correct Answer:


Separate GRANT statements are required for ORDERS and SUPPLIERS tables. 

57	
Carefully read the question and answer accordingly.
Which language is used for formatting XML documents?


Selected Option:


XSLT

Correct Answer:


XSL-FO 

58	
Carefully read the question and answer accordingly.
Which of the following is not an attribute of meta tag?


Selected Option:


value

Correct Answer:


value 

59	
Carefully read the question and answer accordingly.
Consider you are trying to persist or store object of Customer class using ObjectOutputStream class in java. When you are trying to persist customer object data java code is throwing runtime exception without persisting object information.  Please suggest what is the key important factor you have consider in code in order to persist customer object data.


Selected Option:


Check whether you have implemented Customer class with Serializable interface

Correct Answer:


Check whether you have implemented Customer class with Serializable interface 

60	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Variabledec {
public static void main(String[]args){
boolean x = true;
int a;
if(x) a = x ? 2: 1;
else a = x ? 3: 4;
System.out.println(a);
}
}


Selected Option:


2

Correct Answer:


2 


1	
Carefully read the question and answer accordingly.
What will be the output of the below query?
select instr('My SQL World','a') from dual;


Selected Option:


Prints 0

Correct Answer:


Prints 0 

2	
Carefully read the question and answer accordingly.
A container does not initialize the servlets as soon as it starts up, it initializes a servlet when it receives a request for that servlet first time. This is called lazy loading.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

3	
Carefully read the question and answer accordingly.
Try can be followed with either catch or finally.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

4	
Carefully read the question and answer accordingly.
Consider the following code for an HTML form.
<form action=”/servlet/Login”>
<input type=”text” name=”username” value=”enter username”/>
<input type=”submit”  name=”sbbutton” value=”signin!..”/>
</form>
Which of the following happens upon pressing the submit button in the above form?
1.A request is sent with the HTTP method GET.
2.A request is sent with the HTTP method POST.
3.The parameter username is the only parameter passed to the web server in the request.
4.The parameters username and sbbutton are passed to the web server in the request URL.


Selected Option:


1&4

Correct Answer:


1&4 

5	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

6	
Carefully read the question and answer accordingly.
A scriptlet contains Java code that is executed every time a JSP is invoked.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

7	
Carefully read the question and answer accordingly.
BufferedWriter constructor CAN ACCEPT Filewriter Object as a parameter.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

8	
Carefully read the question and answer accordingly.
Consider the usage of JSTL forEach tag  in the following code snippet: 
<font color='green'>
 <ul>
  <c:foreach flag=errmsg  items="${errorMsgs}">
  <li>$errmsg</li>
  </c:forEach>
 </ul>
</font>
The code snippet contains some errors.  Predict the correct code. 


Selected Option:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>${errmsg}</li> </c:forEach> </ul> </font>

Correct Answer:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>${errmsg}</li> </c:forEach> </ul> </font> 

9	
Carefully read the question and answer accordingly.
If display method in super class has a protected specifier then what should be the specifier for the overriding display method in sub class?


Selected Option:


protected or public

Correct Answer:


protected or public 

10	
Carefully read the question and answer accordingly.
Consider you are creating a JSP page. You want to use the classes of java.util package. Which statement will you use to import the java.util package? 


Selected Option:


<%@ page import="java.util.*" %>

Correct Answer:


<%@ page import="java.util.*" %> 

11	
Carefully read the question and answer accordingly.
What will be the output for following code
public class
MethodOverloading {
int m=10,n;
public void div(int a) throws Exception{
n=m/a;
System.out.println(n);
}
public void div(int a,int b) {
n=a/b;
}
public static void main(String[]args) throws Exception{
MethodOverloading o=new MethodOverloading();
o.div(0);
o.div(10,2);
}
}
 


Selected Option:


It will give ArithmeticException

Correct Answer:


It will give ArithmeticException 

12	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

13	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: GenericServlet is an abstract class
Statement B: GenericServlet internally implements Servlet interface
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

14	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

15	
Carefully read the question and answer accordingly.
Which of the following Listener is used to track number of active sessions or users?


Selected Option:


HttpSessionListener

Correct Answer:


HttpSessionListener 

16	
Carefully read the question and answer accordingly.
Which parser is a W3C standard?


Selected Option:


DOM

Correct Answer:


DOM 

17	
Carefully read the question and answer accordingly.
At Point X in below code, which code is necessary to make the code compile?
public class Test 
{ 
    class TestException extends Exception {} 
    public void runTest() throws TestException {} 
    public void test() /* Point X */ 
    { 
       runTest(); 
    } 
}


Selected Option:


throws Exception

Correct Answer:


throws Exception 

18	
Carefully read the question and answer accordingly.
TagSupport and BodyTagSupport classes are present in which package?


Selected Option:


javax.servlet.jsp.tagext

Correct Answer:


javax.servlet.jsp.tagext 

19	
 Carefully read the question and answer accordingly.
Examine the code snippet
declare 
TYPE XYZ is VARRAY(10) of NUMBER;
v2 XYZ; --line 1
x Number:=0;
Begin
v2:=XYZ(1,2,3,4,5,6,7); --line 2
v2.delete(1); --line 3
 while x < v2.last –line 4 
loop
x:=x+1;
dbms_output.put_line(x);
end loop;
end;
/
What will be the output of the above code ?
 


Selected Option:


Compilation fails due to error on line 3

Correct Answer:


Compilation fails due to error on line 4 

20	
Carefully read the question and answer accordingly.
The container supplies a ServletConfig reference to the jspInit() method. Say true or false


Selected Option:


TRUE

Correct Answer:


TRUE 

21	
Carefully read the question and answer accordingly.
Which of the following statement is TRUE
(i) Strong REF CURSOR types are less error prone
(ii) Weak REF CURSOR types are not flexible


Selected Option:


(i) & (ii)

Correct Answer:


(i) 

22	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The below code will compile &   provide desired output:
package p1;
abstract class LivingThings{
 public abstract void resperate();
 interface Living
 {
  public abstract void walk();
 }
}
class Human implements LivingThings.Living{
 @Override
 public void walk() {
  System.out.println("Human Can Walk");
 }
}
class Test {
 public static void main(String[] args) {
  new Human().walk();
 }
}


Selected Option:


TRUE

Correct Answer:


TRUE 

23	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

24	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class WrapperClass1 {
public static void main(String[]args){
Integer i=new Integer(10);
Integer j=new Integer(10);
System.out.println(i==j);
}
}


Selected Option:


False

Correct Answer:


False 

25	
Carefully read the question and answer accordingly.
jspInit() method can be overridden by the author. Say True or False


Selected Option:


TRUE

Correct Answer:


TRUE 

26	
Carefully read the question and answer accordingly.
Which of the following is an empty tag in HTML?


Selected Option:


<br>

Correct Answer:


<br> 

27	
Carefully read the question and answer accordingly.
Select correct naming convention used during class declaration. 
1.Class name should be nouns
2.Should be simple & descriptive
3.Class name starts with lower case.
4.Class name can be java valid keyword.


Selected Option:


1&2

Correct Answer:


1&2 

28	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

29	
Carefully read the question and answer accordingly.
Consider you are trying to persist or store object of Customer class using ObjectOutputStream class in java. When you are trying to persist customer object data java code is throwing runtime exception without persisting object information.  Please suggest what is the key important factor you have consider in code in order to persist customer object data.


Selected Option:


Check whether you have implemented Customer class with Serializable interface

Correct Answer:


Check whether you have implemented Customer class with Serializable interface 

30	
Carefully read the question and answer accordingly.
Choose the correct option.
Statement I: StringBuffer is efficient than “+” concatenation
Statement II: Using API’s in StringBuffer the content and length of String can be changed which intern creates new object.


Selected Option:


Statement I & II are TRUE

Correct Answer:


Statement I is TRUE & II is FALSE 

31	 
Carefully read the question and answer accordingly.
Observe the below code snippet.
public interface iPersistence{
 public Object save(Object o);
 public Object findBy(Object key);
}
public class PersistenceImp implements iPersistence{
 public Object save(Object o){
 ....
 }
 public Object findBy(Object key){
 ....
 }
}
As per the requirement, the iPersistence interface might be added with few more methods in future. This leads to the change of code in PersistenceImp class as well to provide implementation for new abstract methods introduced. Which pattern should be used in this scenario so that any change in the interface will not result in a change in PersistenceImp class. 


Selected Option:


Proxy Pattern

Correct Answer:


Bridge pattern 

32	
Carefully read the question and answer accordingly.
Which of these is executed first before execution of any other thing takes place in a program?


Selected Option:


static block code

Correct Answer:


static block code 

33	
Carefully read the question and answer accordingly.
Java provides ____ ways to create Threads.


Selected Option:


Two

Correct Answer:


Two 

34	
Carefully read the question and answer accordingly.
Which two statements are true regarding the USING clause in table joins?
1. It can be used to join a maximum of three tables.
2. It can be used to restrict the number of columns used in a NATURAL join.
3. It can be used to access data from tables through equijoins as well as nonequijoins.
4. It can be used to join tables that have columns with the same name and compatible data types.


Selected Option:


2&4

Correct Answer:


2&4 

35	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

36	
Carefully read the question and answer accordingly.
Which of the following are used for executing client side script?
1.JavaScript
2.JSP
3.Servlets
4.VBScript


Selected Option:


1&4

Correct Answer:


1&4 

37	
Carefully read the question and answer accordingly.
Evaluate the following SQL statements that are issued in the given order:
CREATE TABLE emp
(emp_no NUMBER(2) CONSTRAINT emp_emp_no_pk PRIMARY KEY,
enameVARCHAR2(15),
salary NUMBER(8,2),
mgr_no NUMBER(2) CONSTRAINT emp_mgr_fk REFERENCES emp);
ALTER TABLE emp
DISABLE CONSTRAINT emp_emp_no_pk CASCADE;
ALTER TABLE emp
ENABLE CONSTRAINT emp_emp_no_pk;
What would be the status of the foreign key EMP_MGR_FK?


Selected Option:


It would remain disabled and has to be enabled manually using the ALTER TABLE command.

Correct Answer:


It would remain disabled and has to be enabled manually using the ALTER TABLE command. 

38	
Carefully read the question and answer accordingly.
Which trigger is used to display the salary change information whenever a DELETE , INSERT or UPDATE statement affects the tbl_employees table(Salary Column)- The trigger should be FOR EACH ROW trigger.
SAMPLE OUTPUT : Fahan,Karn: Old salary = 3500, New salary = 4500, Difference: 1000


Selected Option:


CREATE OR REPLACE TRIGGER salary_changes BEFORE DELETE OR INSERT OR UPDATE ON TBL_EMPLOYEES FOR EACH ROW DECLARE sal_diff NUMBER; BEGIN sal_diff := :NEW.salary - :OLD.salary; DBMS_OUTPUT.PUT(:OLD.firstname||','||:OLD.lastname|| ': '); DBMS_OUTPUT.PUT('Old salary = ' || :OLD.salary || ', '); DBMS_OUTPUT.PUT('New salary = ' || :NEW.salary || ', '); DBMS_OUTPUT.PUT_LINE('Difference: ' || sal_diff); END;

Correct Answer:


CREATE OR REPLACE TRIGGER salary_changes BEFORE DELETE OR INSERT OR UPDATE ON TBL_EMPLOYEES FOR EACH ROW DECLARE sal_diff NUMBER; BEGIN sal_diff := :NEW.salary - :OLD.salary; DBMS_OUTPUT.PUT(:OLD.firstname||','||:OLD.lastname|| ': '); DBMS_OUTPUT.PUT('Old salary = ' || :OLD.salary || ', '); DBMS_OUTPUT.PUT('New salary = ' || :NEW.salary || ', '); DBMS_OUTPUT.PUT_LINE('Difference: ' || sal_diff); END; 

39	
Carefully read the question and answer accordingly.
What is the syntax of PRAGMA EXCEPTION_INIT?


Selected Option:


DECLARE exception_name EXCEPTION PRAGMA EXCEPTION_INIT (exception_name , err_code); Begin Execution section Exception WHEN exception_name THEN Handle the exception END;

Correct Answer:


DECLARE exception_name EXCEPTION PRAGMA EXCEPTION_INIT (exception_name , err_code); Begin Execution section Exception WHEN exception_name THEN Handle the exception END; 

40	
Carefully read the question and answer accordingly.
Which type of Statement can execute parameterized queries?


Selected Option:


PreparedStatement

Correct Answer:


PreparedStatement 

41	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

42	
Carefully read the question and answer accordingly.
what are the data dictionary views?


Selected Option:


USER_SOURCES
USER_OBJECTS
ALL_SOURCE

Correct Answer:


ALL_SOURCE 
USER_SOURCE 
USER_OBJECTS 

43	
Carefully read the question and answer accordingly.
What does DTD stands for?


Selected Option:


Document Type Definition

Correct Answer:


Document Type Definition 

44	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

45	
Carefully read the question and answer accordingly.
Which tag is used to include multiple HTML pages in single page?


Selected Option:


frameset

Correct Answer:


frameset 

46	
Carefully read the question and answer accordingly.
Which of the following variable represents the uncaught throwable object that resulted from a call to the error page in JSP? 


Selected Option:


Exception

Correct Answer:


Exception 

47	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

48	
Carefully read the question and answer accordingly.
_____________ Operator is used to create an object.


Selected Option:


new

Correct Answer:


new 

49	
Carefully read the question and answer accordingly.
What is the use of ServletConfig interface?


Selected Option:


A servlet configuration object used by a servlet container to pass information to a servlet during initialization

Correct Answer:


A servlet configuration object used by a servlet container to pass information to a servlet during initialization 

50	
Carefully read the question and answer accordingly.
Which statement  creates  DocumentBuilder instance?


Selected Option:


None of the listed options

Correct Answer:


DocumentBuilder b=factory.new DocumentBuilder(); 

51	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

52	
Carefully read the question and answer accordingly.
You are developing a web application using Servlets. You have to use filters so that the web container intercepts the incoming requests before it is forwarded to the servlet. Which of the following method is called for every request intercepted by the filter? 


Selected Option:


doFilter

Correct Answer:


doFilter 

53	
Carefully read the question and answer accordingly.
Which type of driver converts JDBC calls into the network protocol used by the database management system directly?


Selected Option:


Type 3 driver

Correct Answer:


Type 4 driver 

54	
Carefully read the question and answer accordingly.
Which procedure raises an exception 'NO DATA FOUND' when the student searches for the course which is not available else to display
a message that the course is available.


Selected Option:


CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like p_course||'%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major;

Correct Answer:


CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like p_course||'%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major; 

55	
Carefully read the question and answer accordingly.
Expression Language treats null values as “zero” In arithmetic operations.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

56	 
Carefully read the question and answer accordingly.
The below html meta tag will reload page automatically every 60 ______ .
<meta http-equiv="refresh" content="60">


Selected Option:


seconds

Correct Answer:


seconds 

57	
Carefully read the question and answer accordingly.
Which of the following is / are true about web applications?


Selected Option:


To access the application, the device like mobile phones, tablets, computers need to open the port for connectivity to web server
Web applications allows the users to invoke from any device like mobile phones, tablets that has browsers
web application provides cross platform compatibility

Correct Answer:


web application provides cross platform compatibility 
Little or no diskspace is required on the client 
Web applications allows the users to invoke from any device like mobile phones, tablets that has browsers 

58	
Carefully read the question and answer accordingly.
Smith is developing an application using Java Server Pages. The name of the component that he has 
created is "Emp". he has included the following statement in her application:
<jsp:setProperty name="Emp" property=* />
What would be the result of the above code?


Selected Option:


It will iterate over the current ServletRequest parameters setting each matched property to the value of the matching parameter

Correct Answer:


It will iterate over the current ServletRequest parameters setting each matched property to the value of the matching parameter 

59	
Carefully read the question and answer accordingly.
The ArrayList<String> is immutable.


Selected Option:


FALSE

Correct Answer:


FALSE 

60	
Carefully read the question and answer accordingly.
When comparable interface is used which method should be overridden?


Selected Option:


compareTo

Correct Answer:


compareTo 

1	
Carefully read the question and answer accordingly.
Consider the following deployment descriptor(web.xml)file:
<session-config>
<session-timeout>
30
</session-timeout>
</session-config>
Then, in the Servlet program code setMaxInactiveInterval(600)(seconds) for the session object is invoked. After how long would session expire? Select one answer from the following.


Selected Option:


10 minutes

Correct Answer:


10 minutes 

2	
Carefully read the question and answer accordingly.
When a JSP is executed, out of the following, what is most likely to be sent to the client? 


Selected Option:


The compiled Servlet file

Correct Answer:


HTML 

3	
Carefully read the question and answer accordingly.
Select correct options with respect to Expression Language (EL) used in JSP
1.The purpose of EL is to make a JSP script free
2.EL is a simple and powerful replacement of Standard Actions
3.EL is enabled in a JSP by default
4.EL stands for Extended Language


Selected Option:


1&2&3

Correct Answer:


1&2&3 

4	
Carefully read the question and answer accordingly.
Which of the following listed option gives the valid type of object to store a date and time combination using JDBC API?


Selected Option:


java.util.Date

Correct Answer:


java.sql.Timestamp 

5	
Carefully read the question and answer accordingly.
Which of the following is not the Java keyword?


Selected Option:


throwed

Correct Answer:


throwed 

6	
Carefully read the question and answer accordingly.
Which of the following tag is used to specify the initialization parameters in the web.xml file? 


Selected Option:


<init-param>

Correct Answer:


<init-param> 

7	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
If any method overrides one of it’s super class methods, we can invoke the overridden method through the this keyword.


Selected Option:


FALSE

Correct Answer:


FALSE 

8	
Carefully read the question and answer accordingly.
Which tag creates containers to other HTML tags/elements?
I: DIV
II: SPAN


Selected Option:


I

Correct Answer:


I 

9	
Carefully read the question and answer accordingly.
what is the result when we attempt to change the value of an IN parameter ?


Selected Option:


no error

Correct Answer:


compile-time error 

10	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

11	 
Carefully read the question and answer accordingly.
Which of the following provides an efficient means of storing key/value pairs in sorted order, and allows rapid retrieval?


Selected Option:


TreeMap

Correct Answer:


TreeMap 

12	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

13	
Carefully read the question and answer accordingly.
What does DTD stands for?


Selected Option:


Document Type Definition

Correct Answer:


Document Type Definition 

14	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

15	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

16	
Carefully read the question and answer accordingly.
State TRUE or FALSE.
line 1: public class Test {
line 2:  public static void main(String[] args) {
line 3: Queue queue = new LinkedList();
line 4:   queue.add("Hello");
line 5:   queue.add("World");
line 6:   List list = new ArrayList(queue);
line 7: System.out.println(list); }
line 8: }
Above code will give run time error at line number 3.
 


Selected Option:


FALSE

Correct Answer:


FALSE 

17	
Carefully read the question and answer accordingly.
Given a servlet that stores an Account bean in the session scope with the following code snippet:
public void doPost(HttpServletRequest req, HttpServletResponse resp) {
     HttpSession session = req.getSession();
     com.cts.Account acc= new com.cts.Account();
     emp.setAccountNumber(req.getParameter(“acc_num”));
     session.setAttribute(“account”, acc);
     RequestDispatcher page = req.getRequestDispatcher(“index.jsp”);
     page.forward(req, resp);
}
Which of these complete JSPs will print the account number?


Selected Option:


<jsp:useBean id="account" type="com.cts.Account” scope="session"/> <jsp:getProperty name="account" property="accountNumber" />

Correct Answer:


<jsp:useBean id="account" type="com.cts.Account” scope="session"/> <jsp:getProperty name="account" property="accountNumber" /> 

18	
Carefully read the question and answer accordingly.
Which is used to transform XML document?


Selected Option:


XSLT

Correct Answer:


XSLT 

19	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

20	
Carefully read the question and answer accordingly.
XYZ Company database tables are accessed by several users but few users want to do positional row updates or deletes operation on databases tables based on business requirement. What will the right solution you will implement in such scenario?


Selected Option:


Use Cursors

Correct Answer:


Use Cursors 

21	
Carefully read the question and answer accordingly.
What exception is raised when the user enters the ID as -6 in the below code?
DECLARE
   c_id customers.id%type := &cc_id;
   c_name  customers.name%type;
   c_addr customers.address%type;
   -- user defined exception
   ex_invalid_id  EXCEPTION;
BEGIN
   IF c_id <= 0 THEN
      RAISE ex_invalid_id;
   ELSE
      SELECT  name, address INTO  c_name, c_addr
      FROM customers
      WHERE id = c_id;
   END IF;
EXCEPTION
   WHEN ex_invalid_id THEN
      dbms_output.put_line('ID must be greater than zero!');
   WHEN no_data_found THEN
      dbms_output.put_line('No such customer!');
 END; /


Selected Option:


ex_invalid_id exception will be raised

Correct Answer:


ex_invalid_id exception will be raised 

22	
Carefully read the question and answer accordingly.
Comparisons involving nulls always yield NULL


Selected Option:


TRUE

Correct Answer:


TRUE 

23	
Carefully read the question and answer accordingly.
If your JDBC Connection is in auto-commit mode, which it is by default, then every SQL statement is committed to the database upon its completion.  State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

24	
Carefully read the question and answer accordingly.
Which of the following is / are true about the layered architecture style?


Selected Option:


Layered architecture separates the functionalities to individual layers, thereby improving maintainability & reusability
Layered architecture can be used to increase or decrease the level of abstraction between layers
Testing the communication across multiple layers is complex

Correct Answer:


Layered architecture separates the functionalities to individual layers, thereby improving maintainability & reusability 
Layered architecture can be used to increase or decrease the level of abstraction between layers 

25	
Carefully read the question and answer accordingly.
public class TestDemo implements Runnable
 {
 public void run() 
 {
   System.out.print("Runner");
 }
 public static void main(String[] args) 
 {
   Thread t = new Thread(new TestDemo());
   t.run();
   t.run();
   t.start();
 }
}
What will be the result?


Selected Option:


The code executes and prints "RunnerRunnerRunner".

Correct Answer:


The code executes and prints "RunnerRunnerRunner". 

26	
Carefully read the question and answer accordingly.
Which of the following attributes of page directive are invalid?


Selected Option:


isScriptingEnabled

Correct Answer:


isScriptingEnabled 

27	
Carefully read the question and answer accordingly.
Which of the following is a marker interface used for object serialization?


Selected Option:


Serializable

Correct Answer:


Serializable 

28	
Carefully read the question and answer accordingly.
A container does not initialize the servlets as soon as it starts up, it initializes a servlet when it receives a request for that servlet first time. This is called lazy loading.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

29	
Carefully read the question and answer accordingly.
You are developing a web application using Servlets. You have to use filters so that the web container intercepts the incoming requests before it is forwarded to the servlet. Which of the following method is called for every request intercepted by the filter? 


Selected Option:


doFilter

Correct Answer:


doFilter 

30	
Carefully read the question and answer accordingly.
What will be the output of following code?
public class Exception1{
public static void main(String args[]) { 
 int i=1, j=1;
try {
i++; 
 j--;
if(i/j > 1)
 i++;
} catch(ArithmeticException e) {
System.out.println(0);
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println(1);
} catch(Exception e) {
  System.out.println(2);
}
 finally {
System.out.println(3);
}
System.out.println(4);
}
}
1.0
2.1
3.3
4.4.


Selected Option:


1&3&4

Correct Answer:


1&3&4 

31	
Carefully read the question and answer accordingly.
Choose a valid package name in Java?
1.com.sun.eng
2.123pack
3.pack123
4.outerpack_innerpack


Selected Option:


1&3&4

Correct Answer:


1&3&4 

32	
Carefully read the question and answer accordingly.
Interfaces are mainly used to expose behavior or functionality not the implementation code. 
State true or false 


Selected Option:


FALSE

Correct Answer:


TRUE 

33	
Carefully read the question and answer accordingly.
In which case should you use a FULL OUTER JOIN? 


Selected Option:


You want all unmatched data from both tables.

Correct Answer:


You want all unmatched data from both tables. 

34	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The below code will compile &   provide desired output:
package p1;
interface A {
 public abstract void methodOne();
}
interface B extends A {
 public abstract void methodTwo();
}
class C implements B{
 @Override
 public void methodTwo() {
  System.out.println("Method Two Body");
 }
}
class Test {
 public static void main(String[] args) {
  new C().methodTwo();
 }
}


Selected Option:


FALSE

Correct Answer:


FALSE 

35	
Carefully read the question and answer accordingly.
LinkedList represents a collection that does not allow duplicate elements.


Selected Option:


FALSE

Correct Answer:


FALSE 

36	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

37	
Carefully read the question and answer accordingly.
What will be the output of the below query?
select instr('My SQL World','a') from dual;


Selected Option:


Prints 0

Correct Answer:


Prints 0 

38	
Carefully read the question and answer accordingly.
Select the right coding best practices followed while using java Collections.
1.Use for loop instead of iterator
2.Use Collections with generic with same type of data.
3.Copy collections into other collections by calling addAll() methods instead using iterator  to copy each collection element.


Selected Option:


2&3

Correct Answer:


2&3 

39	
Carefully read the question and answer accordingly.
JSP syntax errors are caught during which lifecycle event of JSP?


Selected Option:


Compilation

Correct Answer:


Translation 

40	
Carefully read the question and answer accordingly.
You are developing dynamic web application using JSP. Which attribute of page directive specifies the list of classes imported in the JSP file? 


Selected Option:


import

Correct Answer:


import 

41	
Carefully read the question and answer accordingly.
Consider the usage of JSTL forEach tag  in the following code snippet: 
<font color='green'>
 <ul>
  <c:foreach flag=errmsg  items="${errorMsgs}">
  <li>$errmsg</li>
  </c:forEach>
 </ul>
</font>
The code snippet contains some errors.  Predict the correct code. 


Selected Option:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>$errmsg</li> </c:forEach> </ul> </font>

Correct Answer:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>${errmsg}</li> </c:forEach> </ul> </font> 

42	
Carefully read the question and answer accordingly.
Evaluate the following SQL statements that are issued in the given order:
CREATE TABLE emp
(emp_no NUMBER(2) CONSTRAINT emp_emp_no_pk PRIMARY KEY,
enameVARCHAR2(15),
salary NUMBER(8,2),
mgr_no NUMBER(2) CONSTRAINT emp_mgr_fk REFERENCES emp);
ALTER TABLE emp
DISABLE CONSTRAINT emp_emp_no_pk CASCADE;
ALTER TABLE emp
ENABLE CONSTRAINT emp_emp_no_pk;
What would be the status of the foreign key EMP_MGR_FK?


Selected Option:


It would remain disabled and has to be enabled manually using the ALTER TABLE command.

Correct Answer:


It would remain disabled and has to be enabled manually using the ALTER TABLE command. 

43	
Carefully read the question and answer accordingly.
The finally block always executes when the try block exits.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

44	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

45	
Carefully read the question and answer accordingly.
Which of the following variable represents the uncaught throwable object that resulted from a call to the error page in JSP? 


Selected Option:


Request

Correct Answer:


Exception 

46	
Carefully read the question and answer accordingly.
Sam is writing a web application program. He has implemented ServletContextListener interface in his web application program. Which method of ServletContextListener interface he should use to perform startup activities for web application? 


Selected Option:


contextInitialized()

Correct Answer:


contextInitialized() 

47	
Carefully read the question and answer accordingly.
Consider you are maintaining ABC company database. ABC company database tables are accessed by 1000 users initially when it was designed from last two years there was tremendous increase in number records count also number of users who are accessing the database tables to fetch results. Users of ABC company database are reporting problem that query processing is taking more time when they execute query against the database tables. What will the right solution you will suggest in such scenarios in order to increase database query performance?


Selected Option:


Create Stored Procedure

Correct Answer:


Create index 

48	
Carefully read the question and answer accordingly.
Which type of parser is suitable,when applications is required to read data without modifying the content 


Selected Option:


SAX

Correct Answer:


SAX 

49	
Carefully read the question and answer accordingly.
How to divide the page into two equal  halves when we are using frameset ?
1.By using cols=50%,50%
2.By using rows=50%,50%
3.By using colspan
4.by using rowspan


Selected Option:


1&2

Correct Answer:


1&2 

50	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Variables
{
 public static void main(String[]args)
 {
  public int i=10;
  System.out.println(i++);
 }
}


Selected Option:


Compilation error

Correct Answer:


Compilation error 

51	
Carefully read the question and answer accordingly.
The ______ statement is used inside the switch to terminate a Statement sequence


Selected Option:


break

Correct Answer:


break 

52	 
Carefully read the question and answer accordingly.
Which are the pattern types are used for building loosely coupled systems 


Selected Option:


Structural Pattern
Behavioral Pattern
Creational pattern

Correct Answer:


Structural Pattern 
Behavioral Pattern 

53	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The APIS of StringBuffer are synchronized unlike that of StringBuilder


Selected Option:


TRUE

Correct Answer:


TRUE 

54	
Carefully read the question and answer accordingly.
Predict which collection has ability to have elements selected Individually in database.


Selected Option:


None of the above
Nested Table
Varray

Correct Answer:


Varray 
Nested Table 

55	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: GenericServlet is an abstract class
Statement B: GenericServlet internally implements Servlet interface
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

56	
Carefully read the question and answer accordingly.
A filter configuration object used by a servlet container to pass information to a filter during initialization.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

57	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: When tags are implemented with tag handlers written in Java, each tag in the library must be declared in the TLD with a tag element.
Statement B: The tag element contains the tag name, the class of its tag handler, information on the tag's attributes, and information on the variables created by the tag.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

58	
Carefully read the question and answer accordingly.
Which of the following are used for executing client side script?
1.JavaScript
2.JSP
3.Servlets
4.VBScript


Selected Option:


1&4

Correct Answer:


1&4 

59	
Carefully read the question and answer accordingly.
Which of the following is an empty tag in HTML?


Selected Option:


<br>

Correct Answer:


<br> 

60	
Carefully read the question and answer accordingly.
Which of the following is not an attribute of meta tag?


Selected Option:


value

Correct Answer:


value 

1	 
Carefully read the question and answer accordingly.
The template pattern avoids code duplication by defining common algorithm in base class and let the subclasses to implement the variations in the algorithm 


Selected Option:


TRUE

Correct Answer:


TRUE 

2	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

3	
Carefully read the question and answer accordingly.
You have a map named “carMap” with a key named “Ford”. Select  correct EL syntaxes to print the value of this key.
1.${carMap.Ford}
2.${carMap.[Ford]}
3.${carMap[“Ford”]}
4.${carMap[Ford]}


Selected Option:


1&3

Correct Answer:


1&3 

4	
Carefully read the question and answer accordingly.
You are using the system account to create a synonym as follows:
 Create synonym User for UserDetails
Which statements are true with respect to the above synonym?


Selected Option:


A synonym with the name User is created and only system can use it

Correct Answer:


A synonym with the name User is created and only system can use it 

5	
Carefully read the question and answer accordingly.
Select the right coding best practices followed while using java Collections.
1.Use for loop instead of iterator
2.Use Collections with generic with same type of data.
3.Copy collections into other collections by calling addAll() methods instead using iterator  to copy each collection element.


Selected Option:


3

Correct Answer:


2&3 

6	
Carefully read the question and answer accordingly.
Which of the following is an empty tag in HTML?


Selected Option:


<br>

Correct Answer:


<br> 

7	
Carefully read the question and answer accordingly.
Which method executes a simple query and returns a single Result Set object?


Selected Option:


executeQuery()

Correct Answer:


executeQuery() 

8	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending data securely on submitting the form? 
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

9	
Carefully read the question and answer accordingly.
Which of the following exception is not mandatory to be handled in code?


Selected Option:


IOException

Correct Answer:


NullPointerException 

10	
Carefully read the question and answer accordingly.
Sam is writing a web application program. He has implemented ServletContextListener interface in his web application program. Which method of ServletContextListener interface he should use to perform startup activities for web application? 


Selected Option:


contextInitialized()

Correct Answer:


contextInitialized() 

11	
Carefully read the question and answer accordingly.
Which tag is used to include multiple HTML pages in single page?


Selected Option:


None of the listed options

Correct Answer:


frameset 

12	
Carefully read the question and answer accordingly.
What is the output of the current code segment ?
 <c:forTokens items=“a,b,c,d,e” delims=“,” begin=“0” end=“4” step=“2” var=“alphabet”>
 <c:out value=“${alphabet}”/>
 </c:forTokens>


Selected Option:


a,c,e

Correct Answer:


a,c,e 

13	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

14	
Carefully read the question and answer accordingly.
Which error  will be raised for the below code?
DECLARE
  TYPE tb_numbers_nt IS TABLE OF NUMBER;
    l_numbers tb_numbers_nt;
   BEGIN
     l_numbers.EXTEND;
     l_numbers(1) := 1;
   END;
 


Selected Option:


"Reference to uninitialized collection"

Correct Answer:


"Reference to uninitialized collection" 

15	
Carefully read the question and answer accordingly.
What will be the output of the below query?
SELECT * FROM suppliers
WHERE supplier_name LIKE '!%' escape '!';


Selected Option:


Query will generate an error

Correct Answer:


All supplier record whose name starts with % will be displayed 

16	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Wrapper11 
{
 public static void main(String[]args)
 {
  Long l=100;
  System.out.println(l);
 }
}


Selected Option:


Compilation error

Correct Answer:


Compilation error 

17	
Carefully read the question and answer accordingly.
Sally has written the following code to access the Employee bean that has already been created with the property called EmpNumber:
<html>
<body>
<jsp:useBean id="employee" scope="session" class="Employee" />
<b> The current count for the Employee bean is:</b> <%employee.getEmpNumber()%>
</body>
</html>
The bean has the following code in the getEmpNumber method:
public int getEmpNumber()
{
EmpNumber++;
return this.EmpNumber;
}
Which of the following statements is true about the output of the above code when the page is loaded and reloaded? 


Selected Option:


The value will be incremented everytime the page is loaded.

Correct Answer:


The value will be incremented everytime the page is loaded. 

18	
Carefully read the question and answer accordingly.
Mahesh has observed that some users are able to directly access the content files stored in the Web application from the Web browser. Which of the following options should Mahesh use to prevent the users from directly accessing the content files? 


Selected Option:


By storing the content files under the WEB-INF directory

Correct Answer:


By storing the content files under the WEB-INF directory 

19	
Carefully read the question and answer accordingly.
Which of the following method is used to initialize the instance variable of a class.


Selected Option:


Constructor

Correct Answer:


Constructor 

20	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

21	
Carefully read the question and answer accordingly.
Which of the following is build tool?


Selected Option:


ANT

Correct Answer:


ANT 

22	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&2

Correct Answer:


1&3 

23	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

24	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

25	
Carefully read the question and answer accordingly.
Gen wants to create a new JSP page. Which element of JSP provide global information about an entire JSP page? 


Selected Option:


Directive

Correct Answer:


Directive 

26	
Carefully read the question and answer accordingly.
Consider the following code for an HTML form.
<form action=”/servlet/Login”>
<input type=”text” name=”username” value=”enter username”/>
<input type=”submit”  name=”sbbutton” value=”signin!..”/>
</form>
Which of the following happens upon pressing the submit button in the above form?
1.A request is sent with the HTTP method GET.
2.A request is sent with the HTTP method POST.
3.The parameter username is the only parameter passed to the web server in the request.
4.The parameters username and sbbutton are passed to the web server in the request URL.


Selected Option:


1&4

Correct Answer:


1&4 

27	
Carefully read the question and answer accordingly.
Identify the entry in web.xml that will instruct the container to compile the JSP when the container starts rather than waiting for the first time.


Selected Option:


<load-on-Init>

Correct Answer:


<load-on-startup> 

28	
Carefully read the question and answer accordingly.
Consider a development scenario where you want to write the object data into persistence storage devices (like file, disk etc.).Using which of the below concept you can achieve the given requirement?


Selected Option:


Serialization

Correct Answer:


Serialization 

29	
Carefully read the question and answer accordingly.
 XYZ company database has Customer personal information View table using which customer can update their personal information like address, phone number fields when user updates address and phone number fields in view table. We need to take care of updating address and phone number fields in underlying database base table automatically. What right solution do you suggest to implement this requirement?


Selected Option:


Implement using triggers

Correct Answer:


Implement using triggers 

30	
Carefully read the question and answer accordingly.
What will be the output of following code?
try 
{            
            System.out.println("Executing try"); 
}  
System.out.println("After try");
catch (Exception ex) 
{
            System.out.println("Executing catch");
} 


Selected Option:


Compile Time Exception

Correct Answer:


Compile Time Exception 

31	
Carefully read the question and answer accordingly.
Is this true or false. Map interface is derived from the Collection interface. 


Selected Option:


FALSE

Correct Answer:


FALSE 

32	
Carefully read the question and answer accordingly.
Which of the following parameter in Query Flashback clearly defines the maximum time period that the database can be flashbacked?


Selected Option:


UNDO_RETENTION

Correct Answer:


UNDO_RETENTION 

33	
Carefully read the question and answer accordingly.
You need to store elements in a collection that guarantees that no duplicates are stored and all elements can be accessed in natural order. Which interface provides that capability?


Selected Option:


java.util.Set

Correct Answer:


java.util.Set 

34	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

35	
Carefully read the question and answer accordingly.
Which of the following keywords ensures that a method cannot be overridden? 


Selected Option:


final

Correct Answer:


final 

36	 
Carefully read the question and answer accordingly.
What is the outputof below code:
package p1;
class Parent {
 public static void doWork() {
 System.out.println("Parent");
 }
}
class Child extends Parent {
 public static void doWork() {
 System.out.println("Child");
 }
}
class Test {
 public static void main(String[] args) {
 Child.doWork();
 }
} 


Selected Option:


Child

Correct Answer:


Child 

37	
Carefully read the question and answer accordingly.
Which of the following is a marker interface used for object serialization?


Selected Option:


Serializable

Correct Answer:


Serializable 

38	
Carefully read the question and answer accordingly.
What are the true aspects about the %NOTFOUND attribute?


Selected Option:


Return FALSE if no rows was returned
Returns NULL if the cursor is open but fetch has not been executed.

Correct Answer:


Returns NULL if the cursor is open but fetch has not been executed. 
Return FALSE if a successful fetch has been executed. 

39	
Carefully read the question and answer accordingly.
class Background implements Runnable{
int i = 0;
public int run(){
while (true) {
i++;
System.out.println("i="+i);
}
return 1;
}
}//End class


Selected Option:


The code will cause an error at compile time.

Correct Answer:


The code will cause an error at compile time. 

40	 
Carefully read the question and answer accordingly.
foreach loop is the only option to iterate over a Map 


Selected Option:


FALSE

Correct Answer:


FALSE 

41	
Carefully read the question and answer accordingly.
HTTP protocol allows asynchronous transactions between a client and server


Selected Option:


TRUE

Correct Answer:


TRUE 

42	
Carefully read the question and answer accordingly.
Consider you are developing web application which following code snippet listed depicts that the JSP page is an errorpage?


Selected Option:


<%@ page isErrorPage="true" %>

Correct Answer:


<%@ page isErrorPage="true" %> 

43	
Carefully read the question and answer accordingly.
An outer join returns all rows that satisfy the join condition and those rows from one table for which no rows from the other satisfy the join condition.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

44	
Carefully read the question and answer accordingly.
The method Class.forName() is a part of JDBC API. State True or False.


Selected Option:


TRUE

Correct Answer:


FALSE 

45	
Carefully read the question and answer accordingly.
Given a Filter class definition with this method:
21. public void doFilter(ServletRequest request,
22. ServletResponse response,
23. FilterChain chain)
24. throws ServletException, IOException {
25. // insert code here
26. }
Which code line should you insert at line 25 to properly invoke the next filter in the chain, or the target servlet if
there are no more filters?


Selected Option:


chain.doFilter(request, response);

Correct Answer:


chain.doFilter(request, response); 

46	
Carefully read the question and answer accordingly.
Which of the following code line will destroy a session? 


Selected Option:


session.invalidate()

Correct Answer:


session.invalidate() 

47	
Carefully read the question and answer accordingly.
TagSupport and BodyTagSupport classes are present in which package?


Selected Option:


javax.servlet.jsp.tagext

Correct Answer:


javax.servlet.jsp.tagext 

48	
Carefully read the question and answer accordingly.
In which package JAXP related API's  are available?


Selected Option:


javax.xml.parsers.*;

Correct Answer:


javax.xml.parsers.*; 

49	
Carefully read the question and answer accordingly.
Examine the PL/SQL Block 
declare 
result Number;
num1 Number:=&number1;
num2 Number:=&number2;
begin
select num1/num2 into result from dual;
dbms_output.put_line('Result is '||result);
exception
when ZEROS_DIVIDE then
dbms_output.put_line('Exception Occurred Divide by Zero');
end;
/
What will be the output of the above code when user passes the value for NUM1 as 0 and NUM2 as 10


Selected Option:


Result is 0

Correct Answer:


Compilation fails 

50	
Carefully read the question and answer accordingly.
Which parser reads small chunk of document at a time,parses it, generate an events and then reads another chunk of document


Selected Option:


DOM

Correct Answer:


SAX 

51	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class VariableDec 
{
 public static void main(String[]args)
 {
  int x = 1;
  if(x>0 )
   x = 3;
  switch(x) 
  {
   case 1: System.out.println(1);
   case 0: System.out.println(0);
   case 2: System.out.println(2);
   break;
   case 3: System.out.println(3);
   default: System.out.println(4);
   break;
  }
 }
}


Selected Option:


3 4

Correct Answer:


3 4 

52	
Carefully read the question and answer accordingly.
Which of the following are valid variable declarations in Java Script?
1.var x=3.14
2.var int x=4;
3.var x=4;
4.var country="INDIA"


Selected Option:


1&2&4

Correct Answer:


1&3&4 

53	
Carefully read the question and answer accordingly.
Which of the following statements are true?
Statement A : Arrays have a fixed upper bound, but nested tables are unbounded 
Statement B :  Second, arrays must have consecutive subscripts and nested tables are dense, but they can be sparse (have non-consecutive subscripts). 


Selected Option:


Both statements A and B are True.

Correct Answer:


Both statements A and B are True. 

54	
Carefully read the question and answer accordingly.
Automatic page Refresh can be done by using refresh Meta Tag.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

55	
Carefully read the question and answer accordingly.
Which of the following tag is used to specify the initialization parameters in the web.xml file? 


Selected Option:


<init-param>

Correct Answer:


<init-param> 

56	
Carefully read the question and answer accordingly.
Which of the following correctly defines use of DTD in XML development?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

57	
Carefully read the question and answer accordingly.
What is the output of below code:
package p1;
public class Hackathon {
 public static void main(String[] args) {
  String x = "Java";
  x.concat(" Rules!");
  System.out.println("x = " + x);
 }
}


Selected Option:


x = Java Rules

Correct Answer:


x = Java 

58	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

59	
Carefully read the question and answer accordingly.
Identify the life cycle method that is called when a JSP is destroyed


Selected Option:


jspDelete()

Correct Answer:


jspDestory() 

60	
Carefully read the question and answer accordingly.
A procedure containing a single OUT parameter would be better rewritten as a function returning the value.


Selected Option:


TRUE

Correct Answer:


TRUE 


1	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending data securely on submitting the form? 
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

2	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: GenericServlet is an abstract class
Statement B: GenericServlet internally implements Servlet interface
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

3	
Carefully read the question and answer accordingly.
Which two statements are true?
1.It is possible for more than two threads to deadlock at once.
2.The JVM implementation guarantees that multiple threads cannot enter into a
deadlocked state.
3.Deadlocked threads release once their sleep() method's sleep duration has expired.
4.If a piece of code is capable of deadlocking, you cannot eliminate the possibility of
deadlocking by inserting
invocations of Thread.yield().


Selected Option:


1&4

Correct Answer:


1&4 

4	
Carefully read the question and answer accordingly.
What is FOR UPDATE clause in Cursors?


Selected Option:


The records will be available for our changes only.
When we issues a SELECT.. FOR UPDATE clause the RDBMS will automatically place a locks on the all the rows identified by the select statement.

Correct Answer:


When we issues a SELECT.. FOR UPDATE clause the RDBMS will automatically place a locks on the all the rows identified by the select statement. 
The records will be available for our changes only. 

5	 
Carefully read the question and answer accordingly.
Which of the following are abstract classes?
1.Reader
2.InputStreamReader
3.InputStream
4.OutputStream 


Selected Option:


1&3&4

Correct Answer:


1&3&4 

6	
Carefully read the question and answer accordingly.
How do you declare a tag library within a JSP page to use custom tags?


Selected Option:


By using taglib directive.

Correct Answer:


By using taglib directive. 

7	
Carefully read the question and answer accordingly.
Consider the following statements:
Statement A: The PreparedStatement object enables you to execute parameterized queries.
Statement B: The SQL query can use the placeholders which are replaced by the INPUT  parameters at runtime. 
Which of the following option is True with respect to the above statements? 


Selected Option:


Both Statement A and Statement B are True.

Correct Answer:


Both Statement A and Statement B are True. 

8	
Carefully read the question and answer accordingly.
Consider you are developing web application which following code snippet listed depicts that the JSP page is an errorpage?


Selected Option:


<%@ page isErrorPage="true" %>

Correct Answer:


<%@ page isErrorPage="true" %> 

9	
Carefully read the question and answer accordingly.
What is the sequence of output of the following code?
DECLARE
           TYPE list_of_names_t IS TABLE OF emp.ename%TYPE
              INDEX BY BINARY_INTEGER;
           family_mem   list_of_names_t;
           l_row BINARY_INTEGER;
        BEGIN
           family_mem (100) := 'Veena';
           family_mem (-15) := 'Sheela';
           family_mem (-30) := 'Syed';
           family_mem (88) := 'Raji';
          l_row := family_mem.FIRST;
          WHILE (l_row IS NOT NULL)
          LOOP
             DBMS_OUTPUT.put_line ( family_mem(l_row));
             l_row := family_mem.NEXT (l_row);
          END LOOP;
      END;


Selected Option:


Syed, Sheela,Raji, Veena

Correct Answer:


Syed, Sheela,Raji, Veena 

10	
Carefully read the question and answer accordingly.
What are the Tools & plug-ins commonly used  in testing java application code? 
1.ANT
2.JUnit
3.JavaScript
4.EMMA


Selected Option:


2&4

Correct Answer:


2&4 

11	
Carefully read the question and answer accordingly.
What will be the output of the below query?
select instr('My SQL World','a') from dual;


Selected Option:


Prints 0

Correct Answer:


Prints 0 

12	
Carefully read the question and answer accordingly.
which are true for try block


Selected Option:


after switching from try block to catch block the control never come back to try block to execute rest of the code
Try block always needed a catch block followed
if exception occurs, control switches to following first Catch block

Correct Answer:


catch block is not mandate always only finally followed by try can be executed 
after switching from try block to catch block the control never come back to try block to execute rest of the code 

13	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

14	
Carefully read the question and answer accordingly.
Martin has created a Web application in which a servlet stores a JDBC URL as an attribute of the session object to access a database. He wants other servlets of the application to retrieve the URL attribute from the session object to access the database. Which of the following code snippets can Martin use to retrieve the URL from the session object? 


Selected Option:


HttpSession session = request.getSession(); String url =(String)session.getAttribute("URL");

Correct Answer:


HttpSession session = request.getSession(); String url =(String)session.getAttribute("URL"); 

15	
Carefully read the question and answer accordingly.
Which JSTL code snippet can be used to perform URL rewriting?


Selected Option:


<a href='<c:url value="cognizant.jsp"/>'/>

Correct Answer:


<a href='<c:url value="cognizant.jsp"/>'/> 

16	
Carefully read the question and answer accordingly.
Which method of ServletConfig interface returns a String containing the value of the named initialization parameter, or null if the parameter does not exist?


Selected Option:


getInitParameter(String name)

Correct Answer:


getInitParameter(String name) 

17	
Carefully read the question and answer accordingly.
TagSupport and BodyTagSupport classes are present in which package?


Selected Option:


javax.servlet.jsp.tagext

Correct Answer:


javax.servlet.jsp.tagext 

18	
Carefully read the question and answer accordingly.
What is the use of attributes in HTML tags?


Selected Option:


Provides additional behaviour to the tag

Correct Answer:


Provides additional behaviour to the tag 

19	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

20	
Carefully read the question and answer accordingly.
If you want to know when a request attribute has been removed,added or replaced, then which listener is the appropriate one?


Selected Option:


HttpRequestListener

Correct Answer:


ServletRequestAttributeListener 

21	
Carefully read the question and answer accordingly.
Which tag is used to include multiple HTML pages in single page?


Selected Option:


frameset

Correct Answer:


frameset 

22	
Carefully read the question and answer accordingly.
Ronald has observed that his Web application has some HTML tags or features that all the Web browsers do not support. If the client's browser does not support the application may or may not run or may generate undesired output in the Web browser of the client. Therefore Ronald wants to identify the type of browser and other specific information about the client that sends the request to the Web application before invoking the servlet. Which of the following options will help Ronald provide this functionality? 


Selected Option:


By programming filters

Correct Answer:


By programming filters 

23	
Carefully read the question and answer accordingly.
JSP syntax errors are caught during which lifecycle event of JSP?


Selected Option:


Translation

Correct Answer:


Translation 

24	
Carefully read the question and answer accordingly.
Choose a valid package name in Java?
1.com.sun.eng
2.123pack
3.pack123
4.outerpack_innerpack


Selected Option:


1&3&4

Correct Answer:


1&3&4 

25	
Carefully read the question and answer accordingly.
Select the key advantages of using Store procedures in database management system.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

26	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class While {
static int i;
public static void main(String[]args){
System.out.println(i);
while(i<=5){
i++;
}
System.out.println(i);
}
}


Selected Option:


0,6

Correct Answer:


0,6 

27	
Carefully read the question and answer accordingly.
Which statement specifies a constant value for a simple element?


Selected Option:


<xs:element name="CountryName" type="xs:string" fixedvalue="India"/>

Correct Answer:


<xs:element name="CountryName" type="xs:string" fixed="India"/> 

28	
Carefully read the question and answer accordingly.
What does XSL stands for?


Selected Option:


Extensible Style Sheet Language

Correct Answer:


Extensible Style Sheet Language 

29	
Carefully read the question and answer accordingly.
Which of the following are valid variable declarations in Java Script?
1.var x=3.14
2.var int x=4;
3.var x=4;
4.var country="INDIA"


Selected Option:


1&3&4

Correct Answer:


1&3&4 

30	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

31	
Carefully read the question and answer accordingly.
DECLARE
TYPE StockItem IS RECORD(
      item_no     Item_master.Item_code%TYPE,
      item_name   Item_master.Item_name%TYPE,
      quantity    Stock.Current_stock%TYPE,
      Unit_price  Item_master.unit_price%TYPE);
St_rec StockItem;
 Predict what type of record it fall under ? 


Selected Option:


Simple Record

Correct Answer:


Custom Record 

32	
Carefully read the question and answer accordingly.
Which of the following gives the order of Database administrative steps needed to open an Oracle Database?


Selected Option:


Start an instance, Open the Database, Mount the database

Correct Answer:


Start an instance, Mount the database, Open the database 

33	
Carefully read the question and answer accordingly.
Expression Language treats null values as “zero” In arithmetic operations.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

34	
Carefully read the question and answer accordingly.
You are developing dynamic web application using JSP. Which attribute of page directive specifies the list of classes imported in the JSP file? 


Selected Option:


import

Correct Answer:


import 

35	
Carefully read the question and answer accordingly.
Which protocol  Servlets and JSP use to communicate with clients?


Selected Option:


HTTP

Correct Answer:


HTTP 

36	 
Carefully read the question and answer accordingly.
Select the options which are true for Singleton pattern 


Selected Option:


To implement singleton pattern, we create static reference to the singleton instance and return a reference to that instance from a static instance() method
ApplicationContext is the example of Singleton Pattern
the implementation code for Singleton pattern : public class PrinterSingleton { public PrinterSingleton instance = null; private PrinterSingleton () { } public PrinterSingleton getInstance() { if(instance == null) { instance = new PrinterSingleton (); } return instance; } }

Correct Answer:


Singleton pattern ensures that only one object for the class created 
Provides global access to the Singleton Object 
To implement singleton pattern, we create static reference to the singleton instance and return a reference to that instance from a static instance() method 
ApplicationContext is the example of Singleton Pattern 

37	
Carefully read the question and answer accordingly.
Select the right coding best practices followed while using java Collections.
1.Use for loop instead of iterator
2.Use Collections with generic with same type of data.
3.Copy collections into other collections by calling addAll() methods instead using iterator  to copy each collection element.


Selected Option:


2&3

Correct Answer:


2&3 

38	
Carefully read the question and answer accordingly.
A filter configuration object used by a servlet container to pass information to a filter during initialization.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

39	
Carefully read the question and answer accordingly.
Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object?


Selected Option:


java.lang.StringBuffer

Correct Answer:


java.lang.StringBuffer 

40	 
Carefully read the question and answer accordingly.
What will be the output of following code?
class InterfaceDemo
{
 public static void main(String [] args)
 {
 new DigiCam(){}.doCharge();
 new DigiCam(){
 public void writeData (String msg) 
 {
 System.out.println("You are Sending: "+msg); 
 }
 }.writeData("MyFamily.jpg");
 }//main
}
interface USB
{
 int readData();
 void writeData(String input);
 void doCharge();
}
abstract class DigiCam implements USB
{
 public int readData(){ return 0;}
 public void writeData(String input){}
 public void doCharge()
 {
 System.out.println("DigiCam do Charge");
 }
} 


Selected Option:


Compilation Error

Correct Answer:


DigiCam do Charge 
You are Sending: MyFamily.jpg 

41	
Carefully read the question and answer accordingly.
Websphere Application server is a open source server


Selected Option:


FALSE

Correct Answer:


FALSE 

42	 
Carefully read the question and answer accordingly.
What will be the output of following code?
class Super2
{
 public void display()
 {
System.out.println("super class display method");
 }
 public void exe()
 {
 System.out.println("super class exe method");
 display();
 }
}
public class InheritMethod extends Super2
{
 public void display()
 {
 
System.out.println("sub class display method");
 }
 
public static void main(String [] args)
 {
 
InheritMethod o=new InheritMethod();
 
 o.exe();
 }
 
} 


Selected Option:


super class exe method super class display method

Correct Answer:


super class exe method 
sub class display method 

43	
Carefully read the question and answer accordingly.
Which of the following are true statements?


Selected Option:


The Iterator interface declares only three methods: hasNext, next and remove.
The ListIterator interface extends both the List and Iterator interfaces
The ListIterator interface provides forward and backward iteration capabilities.

Correct Answer:


The Iterator interface declares only three methods: hasNext, next and remove. 
The ListIterator interface provides the ability to determine its position in the List. 
The ListIterator interface provides forward and backward iteration capabilities. 

44	
Carefully read the question and answer accordingly.
What does XML stand for?


Selected Option:


eXtensible Markup Language

Correct Answer:


eXtensible Markup Language 

45	
Carefully read the question and answer accordingly.
The ++ operator  postfix and prefix has the same effect


Selected Option:


FALSE

Correct Answer:


FALSE 

46	
Carefully read the question and answer accordingly.
Which of these keywords are  a part of exception handling?


Selected Option:


try
catch

Correct Answer:


try 
catch 

47	
Carefully read the question and answer accordingly.
How to display output from PLSQL? 


Selected Option:


DBMS_OUTPUT.PUT_LINE(' The employee name is : X')
DBMS_OUTPUT.PUT_LINE

Correct Answer:


DBMS_OUTPUT.PUT_LINE 
DBMS_OUTPUT.PUT_LINE(' The employee name is : X') 

48	
Carefully read the question and answer accordingly.
State TRUE or FALSE.
line 1: public class Test {
line 2:  public static void main(String[] args) {
line 3: Queue queue = new LinkedList();
line 4:   queue.add("Hello");
line 5:   queue.add("World");
line 6:   List list = new ArrayList(queue);
line 7: System.out.println(list); }
line 8: }
Above code will give run time error at line number 3.
 


Selected Option:


FALSE

Correct Answer:


FALSE 

49	
Carefully read the question and answer accordingly.
Lisa is a web developer she developing dynamic web application using JSP. She want to include "Header.jsp" in all JSP page which she have designed. Which of the following statement includes Header.jsp file?
1.<jsp:include page=“Header.jsp”/>
2.<jsp:include file=“Header.jsp”/>
3.<%@include file=“Header.jsp”%>
4.<%@include page=“Header.jsp”%>


Selected Option:


1&3

Correct Answer:


1&3 

50	
Carefully read the question and answer accordingly.
Automatic page Refresh can be done by using refresh Meta Tag.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

51	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
An abstract class cannot contain non abstract methods


Selected Option:


TRUE

Correct Answer:


FALSE 

52	
Carefully read the question and answer accordingly.
Mark is developing a web based application. The home page is a servlet that accepts the user name and password. Mark does not want the user to enter the username every time he logs into the website. He wants to find a way to store the value on the user's machine. Which method should he use so that the value gets stored on the user's machine? 


Selected Option:


addCookie()

Correct Answer:


addCookie() 

53	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


FALSE

Correct Answer:


TRUE 

54	
Carefully read the question and answer accordingly.
An outer join returns all rows that satisfy the join condition and those rows from one table for which no rows from the other satisfy the join condition.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

55	
Carefully read the question and answer accordingly.
Type 1 & Type 3 driver types are not vendor specific implementation of Java driver. State  True or False


Selected Option:


FALSE

Correct Answer:


TRUE 

56	
Carefully read the question and answer accordingly.
Which procedure gets the student id and the course name for the given grade.
TABLE DATA - COURSES:
COURSEID      DEPARTMENTID       COURSENAME
1112                           20                      Science
1113                           30                    Economics
TABLE DATA - TBL_GRADE:
STUDENTID  COURSEID      YEAR              SEMESTER                GRADE
10001                 1112            2014      'Second Semester'           1
10002                 1113            2015       'First Semester'               2
SAMPLE OUTPUT :  Student ID: 10001 grade is 1


Selected Option:


CREATE OR REPLACE PROCEDURE proc_get_details(p_grade IN TBL_GRADE.grade%TYPE) AS v_studentid NUMBER; v_coursename VARCHAR2(10); v_grade NUMBER; CURSOR c_grade IS SELECT g.studentid, co.coursename FROM TBL_GRADE g, COURSES co WHERE g.courseid = co.courseid AND g.grade = p_grade; BEGIN OPEN c_grade; LOOP FETCH c_grade INTO v_studentid , v_coursename; EXIT WHEN c_grade%NOTFOUND; v_grade := p_grade; DBMS_OUTPUT.PUT_LINE('Student ID:'||' '||v_studentid||' '||'grade is'||' '||v_grade); END LOOP; CLOSE c_grade; END proc_get_details;

Correct Answer:


CREATE OR REPLACE PROCEDURE proc_get_details(p_grade IN TBL_GRADE.grade%TYPE) AS v_studentid NUMBER; v_coursename VARCHAR2(10); v_grade NUMBER; CURSOR c_grade IS SELECT g.studentid, co.coursename FROM TBL_GRADE g, COURSES co WHERE g.courseid = co.courseid AND g.grade = p_grade; BEGIN OPEN c_grade; LOOP FETCH c_grade INTO v_studentid , v_coursename; EXIT WHEN c_grade%NOTFOUND; v_grade := p_grade; DBMS_OUTPUT.PUT_LINE('Student ID:'||' '||v_studentid||' '||'grade is'||' '||v_grade); END LOOP; CLOSE c_grade; END proc_get_details; 

57	
Carefully read the question and answer accordingly.
Consider you are developing a JDBC application, where you have to retrieve the Employee information from the database table based on Employee id value passed at runtime as parameter. Which best statement API you will use to execute parameterized SQL statement at runtime?


Selected Option:


CallableStatement

Correct Answer:


PreparedStatement 

58	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The APIS of StringBuffer are synchronized unlike that of StringBuilder


Selected Option:


TRUE

Correct Answer:


TRUE 

59	
Carefully read the question and answer accordingly.
Which parser reads small chunk of document at a time,parses it, generate an events and then reads another chunk of document


Selected Option:


SAX

Correct Answer:


SAX 

60	
Carefully read the question and answer accordingly.
You are using the system account to create a synonym as follows:
 Create synonym User for UserDetails
Which statements are true with respect to the above synonym?


Selected Option:


A synonym with the name User is created and any user can access it

Correct Answer:


A synonym with the name User is created and only system can use it 





1	 
Carefully read the question and answer accordingly.
The below html meta tag will reload page automatically every 60 ______ .
<meta http-equiv="refresh" content="60">


Selected Option:


seconds

Correct Answer:


seconds 

2	
Carefully read the question and answer accordingly.
State TRUE or FALSE.
line 1: public class Test {
line 2:  public static void main(String[] args) {
line 3: Queue queue = new LinkedList();
line 4:   queue.add("Hello");
line 5:   queue.add("World");
line 6:   List list = new ArrayList(queue);
line 7: System.out.println(list); }
line 8: }
Above code will give run time error at line number 3.
 


Selected Option:


FALSE

Correct Answer:


FALSE 

3	
Carefully read the question and answer accordingly.
SELECT e.EMPLOYEE_ID,e.LAST_NAME,e.DEPARTMENT_ID, d.DEPARTMENT_NAME 
FROM EMP e, DEPARTMENT d
WHER  e.DEPARTMENT_ID = d.DEPARTMENT_ID; 
 
In the statement, which capabilities of a SELECT statement are performed? 


Selected Option:


Selection, Projection, Join

Correct Answer:


Selection, Projection, Join 

4	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

5	
Carefully read the question and answer accordingly.
HTML is used to perform the programming logic.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

6	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

7	
 Carefully read the question and answer accordingly.
What will be the output of the below query?
select Stud_name from (
select rank() over(order by Marks desc) as rank ,Stud_name from StudentDetails
order by Stud_name --LINE 1
)
where rank > 3
 


Selected Option:


Query will generate an error

Correct Answer:


Top 2 student record with lowest marks will be displayed 

8	
Carefully read the question and answer accordingly.
Which of the following statements are true? 
1.Index by table has key value pair
2.Nested Table has key value pair
3.Index by Table is ordered based on its Key
4.Nested Table id ordered based on its key
5.In a key value pair key is unique


Selected Option:


1&3&5

Correct Answer:


1&3&5 

9	
Carefully read the question and answer accordingly.
What are the true aspects of implicit and explicit cursors? 


Selected Option:


Implicit cursors are automatically created by oracle when a select query in PLSQL is executed. Explicit cursors is explicitly attached to a select query by programmer.
For INSERT operations, the implicit cursor holds the data that need to be inserted

Correct Answer:


Implicit cursors are automatically created by oracle when a select query in PLSQL is executed. Explicit cursors is explicitly attached to a select query by programmer. 
For INSERT operations, the implicit cursor holds the data that need to be inserted 

10	
Carefully read the question and answer accordingly.
A JSP page services requests as a servlet. Say True or False


Selected Option:


TRUE

Correct Answer:


TRUE 

11	
Carefully read the question and answer accordingly.
You are developing a web application using Servlets. You have to use filters so that the web container intercepts the incoming requests before it is forwarded to the servlet. Which of the following method is called for every request intercepted by the filter? 


Selected Option:


doFilter

Correct Answer:


doFilter 

12	
Carefully read the question and answer accordingly.
select the correct  statements about BufferedOutputStream class


Selected Option:


setting up BufferedOutputStreaman , an application can write bytes to the underlying output stream without necessarily causing a call to the underlying system for each byte written.
it has flush() method
As bytes from the stream are read or skipped, the internal buffer is refilled as necessary from the contained input stream, many bytes at a time.
BufferedOutputStream class is a member of Java.io package

Correct Answer:


BufferedOutputStream class is a member of Java.io package 
setting up BufferedOutputStreaman , an application can write bytes to the underlying output stream without necessarily causing a call to the underlying system for each byte written. 
it has flush() method 

13	 
Carefully read the question and answer accordingly.
What will be the output for following code?
class Super
{
 static void show()
 {
 System.out.println("super class show method");
 }
 static class StaticMethods 
 {
 void show()
 {
 System.out.println("sub class show method");
 }
 }
 public static void main(String[]args)
 {
 Super.show();
 new Super.StaticMethods().show();
 }
} 


Selected Option:


super class show method sub class show method

Correct Answer:


super class show method 
sub class show method 

14	
Carefully read the question and answer accordingly.
A web application contains images to be displayed across the UI screens. In a typical production environment, where these images will be deployed?


Selected Option:


Will be bundled inside the application, hence no need to deploy individually

Correct Answer:


Web Server 

15	
Carefully read the question and answer accordingly.
You are using JDBC-ODBC bridge driver to establish a connection with a database. You have created a DSN Mydsn. Which statement will you use to connect to the database? 


Selected Option:


Connection cn=DriverManager.getConnection("jdbc:odbc:Mydsn", "username", "password");

Correct Answer:


Connection cn=DriverManager.getConnection("jdbc:odbc:Mydsn", "username", "password"); 

16	
Carefully read the question and answer accordingly.
Which of these is not valid method in Thread class


Selected Option:


boolean getPriority()

Correct Answer:


boolean getPriority() 

17	
Carefully read the question and answer accordingly.
Which parser is a W3C standard?


Selected Option:


DOM

Correct Answer:


DOM 

18	
Carefully read the question and answer accordingly.
Join queries are better in performance than Subqueries.
State true or false.


Selected Option:


TRUE

Correct Answer:


TRUE 

19	
Carefully read the question and answer accordingly.
Which of the following is NOT a Container feature?


Selected Option:


Application Controller

Correct Answer:


Application Controller 

20	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
The below code will compile &   provide desired output:
package p1;
interface Bounceable {
 void bounce();
 void setBounceFactor(int bf);
 private class BusinessLogic
 {
  int var1;
  float var2;
  double result(int var1,float var2){
   return var1*var2;
  }
 }
}
class Test {
 public static void main(String[] args) {
  System.out.println(new Bounceable.BusinessLogic().result(12,12345.22F));
 }
}


Selected Option:


FALSE

Correct Answer:


FALSE 

21	
Carefully read the question and answer accordingly.
Which statement specifies a constant value for a simple element?


Selected Option:


<xs:element name="CountryName" type="xs:string" constant="India"/>

Correct Answer:


<xs:element name="CountryName" type="xs:string" fixed="India"/> 

22	
Carefully read the question and answer accordingly.
Which of the following interface represents the Servlet Config for the current Servlet? 


Selected Option:


javax.Servlet.Config

Correct Answer:


javax.servlet.ServletConfig 

23	 
Carefully read the question and answer accordingly.
Consider that we are connecting to different data sources from our application. If we couple the persistence code along with business logic, then the change of data source in the application will affect the business logic. Which design pattern is recommended to handle this scenario to ensure that the change in data source would not affect the business logic. . 


Selected Option:


DAO Pattern

Correct Answer:


DAO Pattern 

24	
Carefully read the question and answer accordingly.
What will be the old and new value of a database column before  AFTER  and DELETE operation?


Selected Option:


Value before change (:OLD) : Value before delete Value After change (:NEW) : Null

Correct Answer:


Value before change (:OLD) : Value before delete Value After change (:NEW) : Null 

25	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

26	
Carefully read the question and answer accordingly.
You being a software developer needs to develop a web application for your organization. You decided to use servlets to create the web application. While you are creating the servlet you feel the need to write the code for the initialization of the servlet. This is needed to initialize the servlet with the required data after the servlet instance has been created. How will you perform this task? 


Selected Option:


By overriding the init method in the servlet class.

Correct Answer:


By overriding the init method in the servlet class. 

27	
Carefully read the question and answer accordingly.
Your web application views all have the same header which includes <title> tag in the <head> element of the rendered HTML. You have decided to remove the redundant HTML code from your JSPs and put into a single JSP called /WEB-INF/jsp/header.jsp. However, the title of each page is unique, so you have decided to use variable called pageTitle to parameterize this in the header JSP like this:
<title> ${param.pageTitle}</title>
Which JSP code snippet you use in your main view JSPs to insert the header and pass the pageTitle variable?


Selected Option:


<jsp:include page='WEB-INF/jsp/header.jsp'> <jsp:param name='pageTitle' value='Welcome Page'/> </jsp:include>

Correct Answer:


<jsp:include page='WEB-INF/jsp/header.jsp'> <jsp:param name='pageTitle' value='Welcome Page'/> </jsp:include> 

28	
Carefully read the question and answer accordingly.
Examine the table structure of Employee
Ename Ecode Dept
John         1        Sal
Smith       3        Mar
Max           2        Sal
Joe           4        Mar 
Laura       5        Dep 
What will be the output of below query ? 
select decode(Ecode,5,'Department',4,'Marketing',3,’Marketing’,’Sales’) as result from Employee;
 


Selected Option:


Query contains error

Correct Answer:


Sales Marketing Sales Marketing Department 

29	
Carefully read the question and answer accordingly.
which are the Unchecked exceptions


Selected Option:


Array Index Out Of Bounds Exception
ClassNotFoundException

Correct Answer:


Class Cast Exception 
Array Index Out Of Bounds Exception 
Number Format Exception 

30	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

31	
 Carefully read the question and answer accordingly.
What is the correct structure of a java program?
I: import statement 
II: class declaration 
III: package statement 
IV: method,variable declarations
 


Selected Option:


III->I->II->IV.

Correct Answer:


III->I->II->IV. 

32	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

33	
Carefully read the question and answer accordingly.
Martin has created a Web application in which a servlet stores a JDBC URL as an attribute of the session object to access a database. He wants other servlets of the application to retrieve the URL attribute from the session object to access the database. Which of the following code snippets can Martin use to retrieve the URL from the session object? 


Selected Option:


HttpSession session = request.getSession(); String url =(String)session.getAttribute("URL");

Correct Answer:


HttpSession session = request.getSession(); String url =(String)session.getAttribute("URL"); 

34	
Carefully read the question and answer accordingly.
TagSupport and BodyTagSupport classes are present in which package?


Selected Option:


javax.servlet.jsp.tagext

Correct Answer:


javax.servlet.jsp.tagext 

35	
Carefully read the question and answer accordingly.
What will happen if two thread of same priority are called to be processed simultaneously?


Selected Option:


Both of them will be executed simultaneously

Correct Answer:


It is dependent on the operating system. 

36	
Carefully read the question and answer accordingly.
 XYZ company database has Customer personal information View table using which customer can update their personal information like address, phone number fields when user updates address and phone number fields in view table. We need to take care of updating address and phone number fields in underlying database base table automatically. What right solution do you suggest to implement this requirement?


Selected Option:


Implement using triggers

Correct Answer:


Implement using triggers 

37	
Carefully read the question and answer accordingly.
abstract public class Employee 
{
 protected abstract double getSalesAmount();
 public double getCommision() {
 return getSalesAmount() * 0.15;
 }
}
class Sales extends Employee 
{
// insert method here
}
Which two methods, inserted independently, correctly complete the Sales
class?
1.double getSalesAmount() { return 1230.45; }
2. public double getSalesAmount() { return 1230.45; }
3.private double getSalesAmount() { return 1230.45; }
4.protected double getSalesAmount() { return 1230.45; }


Selected Option:


1&2

Correct Answer:


2&4 

38	
Carefully read the question and answer accordingly.
What does XML stand for?


Selected Option:


eXtensible Markup Language

Correct Answer:


eXtensible Markup Language 

39	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
String class do not provides a method which is used to compare two strings lexicographically.


Selected Option:


FALSE

Correct Answer:


FALSE 

40	
Carefully read the question and answer accordingly.
Which tag is used to include multiple HTML pages in single page?


Selected Option:


frameset

Correct Answer:


frameset 

41	
Carefully read the question and answer accordingly.
DIV tag creates linebreaks similar to paragraph tags.
State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

42	
Carefully read the question and answer accordingly.
What will be the output of the following code snippet?
<% page language="java"%>
<html>
<head></head>
<body>
<%java.util.Date now=new java.util.Date(); %>
<H1><%= now.getHours() %>:<%=now.getMinutes()%>:<%=now.getSeconds()%></H1>
</body>
</html> 


Selected Option:


It will display the current time as hh:mm:ss.

Correct Answer:


It will display the current time as hh:mm:ss. 

43	
Carefully read the question and answer accordingly.
Which of following are standard JSTL?
1.http://java.sun.com/jstl/xml/fmt
2.http://java.sun.com/jstl/core/fmt
3.http://java.sun.com/jstl/xml
4.http://java.sun.com/jstl/sql
5.http://java.sun.com/jstl/core


Selected Option:


1&2&4

Correct Answer:


3&4&5 

44	
Carefully read the question and answer accordingly.
TreeSet uses which two interfaces to sort the data 


Selected Option:


SortedSet
Comparable

Correct Answer:


SortedSet 
Comparable 

45	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

46	
Carefully read the question and answer accordingly.
A Web application developed for an institution requires insertion of a header file comprising the logo and institution name. Identify the correct JSP tag from the options given below to add the logo and institution name to all the pages of the Web application. 


Selected Option:


<%@ include file="Header.html" %>

Correct Answer:


<%@ include file="Header.html" %> 

47	
Carefully read the question and answer accordingly.
Consider the code segment given below:
  List list = new ArrayList();
     list.add(“1”);
 list.add(“2”);
 list.add(“3”);
 list.add(“4”);
 request.setAttribute(“list”, list);
 String[]  names = {“a”, “b”, “c”, “d”, “e”};
What will ${names[list[0] + 1]} display?


Selected Option:


c

Correct Answer:


c 

48	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class While {
static int i;
public static void main(String[]args){
System.out.println(i);
while(i<=5){
i++;
}
System.out.println(i);
}
}


Selected Option:


0,6

Correct Answer:


0,6 

49	
Carefully read the question and answer accordingly.
Choose a valid package name in Java?
1.com.sun.eng
2.123pack
3.pack123
4.outerpack_innerpack


Selected Option:


1&3&4

Correct Answer:


1&3&4 

50	
Carefully read the question and answer accordingly.
A container does not initialize the servlets as soon as it starts up, it initializes a servlet when it receives a request for that servlet first time. This is called lazy loading.State True or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

51	
Carefully read the question and answer accordingly.
Which of the following statement is true regarding implementing user defined exception mechanisms? 
Statement A: It is valid to derive a class from java.lang.Exception
Statement B: It is valid to derive a class from java.lang.RuntimeException


Selected Option:


Statement A is true and Statement B is false

Correct Answer:


Both Statements A and B are true 

52	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

53	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

54	
Carefully read the question and answer accordingly.
Which two statements about packages are true? 
1.Packages can be nested.
2.You can pass parameters to packages.
3.A package is loaded into memory each time it is invoked.
4.The contents of packages can be shared by many applications.
5. You can achieve information hiding by making package constructs private.


Selected Option:


4&5

Correct Answer:


4&5 

55	
Carefully read the question and answer accordingly.
In which package JAXP related API's  are available?


Selected Option:


javax.xml.parsers.*;

Correct Answer:


javax.xml.parsers.*; 

56	
Carefully read the question and answer accordingly.
Which of the following used by container to validate a custom tag in a JSP page? 


Selected Option:


Tag Library Descriptor

Correct Answer:


Tag Library Descriptor 

57	
Carefully read the question and answer accordingly.
Variables in Java Script should be declared with data types.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

58	
Carefully read the question and answer accordingly.
If you want to know when a request attribute has been removed,added or replaced, then which listener is the appropriate one?


Selected Option:


None of the listed options

Correct Answer:


ServletRequestAttributeListener 

59	
Carefully read the question and answer accordingly.
executeUpdate() & execute() are valid methods that can be used for executing DDL statements. State  True or False


Selected Option:


FALSE

Correct Answer:


TRUE 

60	
Carefully read the question and answer accordingly.
Consider you are developing a JDBC application, where you have to retrieve Employee table schema information like table columns name, columns field length and data type etc. Which API you will use to retrieve table schema information?


Selected Option:


ResultSetMetaData

Correct Answer:


ResultSetMetaData 



1	
Carefully read the question and answer accordingly.
Which statements about session timeouts are true? 


Selected Option:


Session timeout declarations made programmatically can specify time only in seconds.

Correct Answer:


Session timeout declarations made in the DD(web.xml) can specify time in minutes. 

2	
Carefully read the question and answer accordingly.
Which of the following Listener can get context init parameter and run some code before rest of the application can service a client?


Selected Option:


ServletContextListener

Correct Answer:


ServletContextListener 

3	
Carefully read the question and answer accordingly.
Which tag is used to include multiple HTML pages in single page?


Selected Option:


frameset

Correct Answer:


frameset 

4	
Carefully read the question and answer accordingly.
State whether TRUE or FALSE.
If any class has at least one abstract method you must declare it as abstract class


Selected Option:


TRUE

Correct Answer:


TRUE 

5	
Carefully read the question and answer accordingly.
What does XSL stands for?


Selected Option:


Extensible Style Sheet Language

Correct Answer:


Extensible Style Sheet Language 

6	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: A tag library descriptors an XML document that contains information about a library as a whole and about each tag contained in the library. 
Statement B: TLDs are used by a Web container to validate the tags used by JSP page development tools.
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is true.

Correct Answer:


Statement A is true and statement B is true. 

7	
Carefully read the question and answer accordingly.
Which of the following XML statement is valid?


Selected Option:


<message> if price &lt; 60</message>

Correct Answer:


<message> if price &lt; 60</message> 

8	
Carefully read the question and answer accordingly.
What will be the output of the program?
public class Test {
 public static void aMethod() throws Exception {
  try {
   throw new Exception();
  } finally {
   System.out.print("finally");
  }
 }
 public static void main(String args[]) {
  try {
   aMethod();
  } catch (Exception e) {
   System.out.print("exception ");
  }
  System.out.print("finished"); /* Line 24 */
 }
}


Selected Option:


exception finished

Correct Answer:


finally exception finished 

9	
Carefully read the question and answer accordingly.
Consider  the following statements:
Statement A: GenericServlet is an abstract class
Statement B: GenericServlet internally implements Servlet interface
Which of the following is true about these statements? 


Selected Option:


Statement A is true and statement B is false.

Correct Answer:


Statement A is true and statement B is true. 

10	
Carefully read the question and answer accordingly.
What is the output of this program?
1.    import java.io.*;
2.    class files {
3.        public static void main(String args[]) {
4.            File obj = new File("/java/system");
5.            System.out.print(obj.getName());
6.        }
7.    }


Selected Option:


compilation error

Correct Answer:


system 

11	
Carefully read the question and answer accordingly.
_____________ is a multi way branch statement


Selected Option:


switch

Correct Answer:


switch 

12	
Carefully read the question and answer accordingly.
What exception is raised when the user enters the ID as -6 in the below code?
DECLARE
   c_id customers.id%type := &cc_id;
   c_name  customers.name%type;
   c_addr customers.address%type;
   -- user defined exception
   ex_invalid_id  EXCEPTION;
BEGIN
   IF c_id <= 0 THEN
      RAISE ex_invalid_id;
   ELSE
      SELECT  name, address INTO  c_name, c_addr
      FROM customers
      WHERE id = c_id;
   END IF;
EXCEPTION
   WHEN ex_invalid_id THEN
      dbms_output.put_line('ID must be greater than zero!');
   WHEN no_data_found THEN
      dbms_output.put_line('No such customer!');
 END; /


Selected Option:


ex_invalid_id exception will be raised

Correct Answer:


ex_invalid_id exception will be raised 

13	
Carefully read the question and answer accordingly.
Consider the usage of JSTL forEach tag  in the following code snippet: 
<font color='green'>
 <ul>
  <c:foreach flag=errmsg  items="${errorMsgs}">
  <li>$errmsg</li>
  </c:forEach>
 </ul>
</font>
The code snippet contains some errors.  Predict the correct code. 


Selected Option:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>${errmsg}</li> </c:forEach> </ul> </font>

Correct Answer:


<font color='green'> <ul> <c:forEach flag="errmsg" items="${errorMsgs}"> <li>${errmsg}</li> </c:forEach> </ul> </font> 

14	 
Carefully read the question and answer accordingly.
Which are the statements are true 


Selected Option:


Software coupling defined as the degree to which a software module relies or depends on other modules.
Cohesion is the OO Concept which hides the implementation
Cohesion is the OO principle most closely associated with allowing an object to have many types
Cohesion is clear separation of related functionality into distinct modules, Components , or classes.
Cohesion maximizes code reusability

Correct Answer:


Software coupling defined as the degree to which a software module relies or depends on other modules. 
Cohesion is clear separation of related functionality into distinct modules, Components , or classes. 
Cohesion maximizes code reusability 

15	
Carefully read the question and answer accordingly.
public abstract class Shape 
{
  private int x;
  private int y;
  public abstract void draw();
  public void setAnchor(int x, int y) 
  {
   this.x = x;
   this.y = y;
  }
 }
Which two classes use the Shape class correctly? 
1.public class Circle implements Shape {
private int radius;
}
2.public abstract class Circle extends Shape {
private int radius;
}
3.public class Circle extends Shape {
private int radius;
public void draw();
}
4.public class Circle extends Shape {
private int radius;
public void draw() {/* code here */}
}


Selected Option:


2&4

Correct Answer:


2&4 

16	
Carefully read the question and answer accordingly.
Scripting can be blocked in a jsp by:


Selected Option:


Declaring <scripting-invalid> tag at the top of JSP page

Correct Answer:


Putting <scripting-invalid> element in web.xml 

17	
Carefully read the question and answer accordingly.
An art of identifying, organizing, controlling and verifying the modification to the software work products built by the developer.


Selected Option:


SCM

Correct Answer:


SCM 

18	
Carefully read the question and answer accordingly.
LinkedList represents a collection that does not allow duplicate elements.


Selected Option:


TRUE

Correct Answer:


FALSE 

19	
Carefully read the question and answer accordingly.
Which of the following statement is true regarding try-catch-finally?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

20	 
Carefully read the question and answer accordingly.
The below html meta tag will reload page automatically every 60 ______ .
<meta http-equiv="refresh" content="60">


Selected Option:


seconds

Correct Answer:


seconds 

21	
Carefully read the question and answer accordingly.
Examine the code snippet
DECLARE Num Number;
BEGIN 
Num:=10; 
DECLARE  
Num Number; --LINE 1
BEGIN  
Num:=12; 
while(Num<13)
loop
dbms_output.put_line(Num);
Num:=Num+1;
END loop; 
END;
if Num < 12  --LINE 2
then
dbms_output.put_line('Less');
end if;
END; 
/
What will be the result of the above code?


Selected Option:


Compilation fails due to error on line 1

Correct Answer:


Compiles executes and prints 12 Less 

22	
Carefully read the question and answer accordingly.
Which of the following are valid variable declarations in Java Script?
1.var x=3.14
2.var int x=4;
3.var x=4;
4.var country="INDIA"


Selected Option:


1&3&4

Correct Answer:


1&3&4 

23	
Carefully read the question and answer accordingly.
Examine the table structure of Employee
Ename Ecode Dept
John         1        Sal
Smith       3        Mar
Max           2        Sal
Joe           4        Mar 
Laura       5        Dep 
What will be the output of below query ? 
select decode(Ecode,5,'Department',4,'Marketing',3,’Marketing’,’Sales’) as result from Employee;
 


Selected Option:


Query contains error

Correct Answer:


Sales Marketing Sales Marketing Department 

24	
Carefully read the question and answer accordingly.
What are the benefits of Logging? 
1.Debug applications issues easily
2.Detect complier errors easily
3.Trouble Shoot performance problems


Selected Option:


1&3

Correct Answer:


1&3 

25	
Carefully read the question and answer accordingly.
John wants to retrieve all the employee details whose Employee Number matches to any of the Department Number. Help john to achieve his task 


Selected Option:


select empName , empNo from emp where empno in ( select deptNo from dept)

Correct Answer:


select empName , empNo from emp where empno in ( select deptNo from dept) 

26	
Carefully read the question and answer accordingly.
Which complex type signifies that only one of the child elements can appear?


Selected Option:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType>

Correct Answer:


<xs:complexType name="CountrInfo"><xs:choice> <xs:element name="countryName" type="xs:string"/> <xs:element name="states" type="xs:integer"/></xs:choice></xs:complexType> 

27	
Carefully read the question and answer accordingly.
Select the advantages of  using coding conventions in java application development.


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

28	
Carefully read the question and answer accordingly.
Which tag creates containers to other HTML tags/elements?
I: DIV
II: SPAN


Selected Option:


I

Correct Answer:


I 

29	
Carefully read the question and answer accordingly.
Choose valid expression language statement for accessing textfield elements whose name is userid.


Selected Option:


${param.userid}

Correct Answer:


${param.userid} 

30	
Carefully read the question and answer accordingly.
Which type of Statement can execute parameterized queries?


Selected Option:


PreparedStatement

Correct Answer:


PreparedStatement 

31	
Carefully read the question and answer accordingly.
Which object of JSP holds reference to javax.servlet.http.HttpSession object?


Selected Option:


session

Correct Answer:


session 

32	
Carefully read the question and answer accordingly.
In Oracle10g database, control files contain information that describes the names, locations, and sizes of the database files. State true or False.


Selected Option:


TRUE

Correct Answer:


TRUE 

33	
Carefully read the question and answer accordingly.
Consider you are developing shopping cart application you have to store details of items purchased by the each customer in intermediate memory before storing purchase details in actual database permanently note that number of different items purchased by customer is not definite it may vary. How do you implement given requirement using java considering best performance of the application?


Selected Option:


Implement using Collection API’s.

Correct Answer:


Implement using Collection API’s. 

34	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Variables
{
 public static void main(String[]args)
 {
  public int i=10;
  System.out.println(i++);
 }
}


Selected Option:


11

Correct Answer:


Compilation error 

35	
Carefully read the question and answer accordingly.
Which two statements about packages are true? 
1.Packages can be nested.
2.You can pass parameters to packages.
3.A package is loaded into memory each time it is invoked.
4.The contents of packages can be shared by many applications.
5. You can achieve information hiding by making package constructs private.


Selected Option:


4&5

Correct Answer:


4&5 

36	
Carefully read the question and answer accordingly.
Which of these is not valid method in Thread class


Selected Option:


void run()

Correct Answer:


boolean getPriority() 

37	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Operators 
{
 public static void main(String[]args)
 {
  int i=12;
  int j=13;
  int k=++i-j--;
  System.out.println(i);
  System.out.println(j);
  System.out.println(k);
 }
}


Selected Option:


13,12,0

Correct Answer:


13,12,0 

38	
Carefully read the question and answer accordingly.
Which type of driver converts JDBC calls into the network protocol used by the database management system directly?


Selected Option:


Type 3 driver

Correct Answer:


Type 4 driver 

39	
Carefully read the question and answer accordingly.
Consider Vijay is developing web page using HTML.Which method he can use for sending large amount of data on submitting the form?
I: POST
II: GET


Selected Option:


I

Correct Answer:


I 

40	
Carefully read the question and answer accordingly.
Which parser is a W3C standard?


Selected Option:


DOM

Correct Answer:


DOM 

41	
Carefully read the question and answer accordingly.
In JavaScript, for accessing first paragraph tag in the document which of the statement is used?


Selected Option:


document.getElementsByTagName("p")[0]

Correct Answer:


document.getElementsByTagName("p")[0] 

42	
Carefully read the question and answer accordingly.
HTML is used to perform the programming logic.
State True or False.


Selected Option:


FALSE

Correct Answer:


FALSE 

43	
Carefully read the question and answer accordingly.
Consider you are developing web application which following code snippet listed depicts that the JSP page is an errorpage?


Selected Option:


<%@ page isErrorPage="true" %>

Correct Answer:


<%@ page isErrorPage="true" %> 

44	
Carefully read the question and answer accordingly.
Which of the following tag is used to specify the initialization parameters in the web.xml file? 


Selected Option:


<init-param>

Correct Answer:


<init-param> 

45	
Carefully read the question and answer accordingly.
Consider the following deployment descriptor(web.xml)file:
<session-config>
<session-timeout>
30
</session-timeout>
</session-config>
Then, in the Servlet program code setMaxInactiveInterval(600)(seconds) for the session object is invoked. After how long would session expire? Select one answer from the following.


Selected Option:


30 minutes

Correct Answer:


10 minutes 

46	
Carefully read the question and answer accordingly.
Predict which collection has ability to have elements selected Individually in database.


Selected Option:


Nested Table
Varray
Associative Array
None of the above

Correct Answer:


Varray 
Nested Table 

47	
Carefully read the question and answer accordingly.
Evaluate the following SQL statements that are issued in the given order:
CREATE TABLE emp
(emp_no NUMBER(2) CONSTRAINT emp_emp_no_pk PRIMARY KEY,
enameVARCHAR2(15),
salary NUMBER(8,2),
mgr_no NUMBER(2) CONSTRAINT emp_mgr_fk REFERENCES emp);
ALTER TABLE emp
DISABLE CONSTRAINT emp_emp_no_pk CASCADE;
ALTER TABLE emp
ENABLE CONSTRAINT emp_emp_no_pk;
What would be the status of the foreign key EMP_MGR_FK?


Selected Option:


It would remain disabled and has to be enabled manually using the ALTER TABLE command.

Correct Answer:


It would remain disabled and has to be enabled manually using the ALTER TABLE command. 

48	
Carefully read the question and answer accordingly.
Mention some of the important functions of Servlet Filter. 
1.Security Checks
2.allowing all the users
3.Modifying the request or response


Selected Option:


1&3

Correct Answer:


1&3 

49	
Carefully read the question and answer accordingly.
Which of the following used by container to validate a custom tag in a JSP page? 


Selected Option:


Tag Library Descriptor

Correct Answer:


Tag Library Descriptor 

50	
Carefully read the question and answer accordingly.
Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object?


Selected Option:


java.lang.StringBuffer

Correct Answer:


java.lang.StringBuffer 

51	
Carefully read the question and answer accordingly.
The container supplies a ServletConfig reference to the jspInit() method. Say true or false


Selected Option:


TRUE

Correct Answer:


TRUE 

52	
Carefully read the question and answer accordingly.
Consider the following code snippet:
   String thought = "Green";
   StringBuffer bufferedThought = new StringBuffer(thought);
   String secondThought = bufferedThought.toString();  
   System.out.println(thought == secondThought);
Which of the following option gives the output of the above code snippet?


Selected Option:


FALSE

Correct Answer:


FALSE 

53	
Carefully read the question and answer accordingly.
Which of the following Java EE containers manages the execution of enterprise beans for Java EE applications? 


Selected Option:


EJB container

Correct Answer:


EJB container 

54	
Carefully read the question and answer accordingly.
What are the major areas PMD tool scans java code?


Selected Option:


All of the listed options

Correct Answer:


All of the listed options 

55	
Carefully read the question and answer accordingly.
 XYZ company database has Customer personal information View table using which customer can update their personal information like address, phone number fields when user updates address and phone number fields in view table. We need to take care of updating address and phone number fields in underlying database base table automatically. What right solution do you suggest to implement this requirement?


Selected Option:


Implement using triggers

Correct Answer:


Implement using triggers 

56	
Carefully read the question and answer accordingly.
A JSP page services requests as a servlet. Say True or False


Selected Option:


FALSE

Correct Answer:


TRUE 

57	
Carefully read the question and answer accordingly.
Given a Filter class definition with this method:
21. public void doFilter(ServletRequest request,
22. ServletResponse response,
23. FilterChain chain)
24. throws ServletException, IOException {
25. // insert code here
26. }
Which code line should you insert at line 25 to properly invoke the next filter in the chain, or the target servlet if
there are no more filters?


Selected Option:


chain.doFilter(request, response);

Correct Answer:


chain.doFilter(request, response); 

58	
Carefully read the question and answer accordingly.
What will be the output for following code?
public class Compare
{
 public static void main(String[]args)
 {
  String s=new String("abc");
  String s1=new String("abc");
  System.out.println(s.compareTo(s1));
 }
}


Selected Option:


0

Correct Answer:


0 

59	
Carefully read the question and answer accordingly.
Views are a powerful mechanism for customizing the way your data is presented to users. They can be used to enhance security and streamline complex table relationships. Views that create static results can still be modified using ________, which allow you to define how the underlying tables are modified ensuring your data integrity.


Selected Option:


Triggers

Correct Answer:


Triggers 

60	
Carefully read the question and answer accordingly.
Sally has written the following code to access the Employee bean that has already been created with the property called EmpNumber:
<html>
<body>
<jsp:useBean id="employee" scope="session" class="Employee" />
<b> The current count for the Employee bean is:</b> <%employee.getEmpNumber()%>
</body>
</html>
The bean has the following code in the getEmpNumber method:
public int getEmpNumber()
{
EmpNumber++;
return this.EmpNumber;
}
Which of the following statements is true about the output of the above code when the page is loaded and reloaded? 


Selected Option:


The value will be incremented everytime the page is loaded.

Correct Answer:


The value will be incremented everytime the page is loaded. 


Carefully read the question and answer accordingly.
What is the syntax of Function?
CREATE [OR REPLACE] FUNCTION function_name [parameters] 
IS
Declaration_section 
RETURN return_datatype; 
BEGIN
Execution_section 
Return return_variable;  
EXCEPTION  
exception section  
Return return_variable; 
 END; 

Selected Option:
FALSE

Correct Answer:
FALSE 
Carefully read the question and answer accordingly.
A PL/SQL function can return more than one value from a function using PL/SQL record or PL/SQL table

Selected Option:
FALSE

Correct Answer:
TRUE 
Carefully read the question and answer accordingly.
which parameter passing mode  passes a value from the calling environment to the procedure and a possibly different value from the procedure back to the calling environment using the same parameter ?

Selected Option:
IN OUT

Correct Answer:
IN OUT 

Carefully read the question and answer accordingly.
Which of the following logically related components can be grouped in a PL/SQL package ?

Selected Option:
procedures
exceptions
functions

Correct Answer:
PL/SQL types 
exceptions 
procedures 
functions .
Carefully read the question and answer accordingly.
XYZ Company database tables are accessed by several users but few users want to do positional row updates or deletes operation on databases tables based on business requirement. What will the right solution you will implement in such scenario?

Selected Option:
Use Cursors

Correct Answer:
Use Cursors .

Carefully read the question and answer accordingly.
Which code assign null to  all the fields in the record
emp_info? 

Selected Option:
DECLARE TYPE EmpRec IS RECORD ( emp_id emp.empno%TYPE, job_title VARCHAR2(9), salary NUMBER(7,2)); emp_info EmpRec; BEGIN emp_info.emp_id := 7788; emp_info.job_title := 'ANALYST'; emp_info.salary := 3500; emp_info := emp_null; END;

Correct Answer:
DECLARE
   TYPE EmpRec IS RECORD ( 
      emp_id    emp.empno%TYPE,
      job_title VARCHAR2(9),
      salary    NUMBER(7,2));
      emp_info EmpRec;
      emp_null EmpRec;
BEGIN
   emp_info.emp_id := 7788;
   emp_info.job_title := 'ANALYST';
   emp_info.salary := 3500;
   emp_info := emp_null;  
END; 
Carefully read the question and answer accordingly.
What error the following code will display?

DECLARE
  dynamic_stmt VARCHAR2(200);
  dummy       BOOLEAN;

  FUNCTION get_x (x INTEGER)
    RETURN BOOLEAN
  AS
  BEGIN
    NULL;
  END get_x;

BEGIN
  dynamic_stmt := 'BEGIN :b := get_x(5); END;';
  EXECUTE IMMEDIATE dynamic_stmt USING OUT dummy;
END;

Selected Option:
"Cannot string in current PLSQL session"

Correct Answer:
"Expressions have to be of SQL types" 
Carefully read the question and answer accordingly.
DECLARE
TYPE StockItem IS RECORD(
      item_no     Item_master.Item_code%TYPE,
      item_name   Item_master.Item_name%TYPE,
      quantity    Stock.Current_stock%TYPE,
      Unit_price  Item_master.unit_price%TYPE);

St_rec StockItem;
 Predict what type of record it fall under ? 

Selected Option:
Custom Record

Correct Answer:
Custom Record 
Carefully read the question and answer accordingly.
Identify the type of join used in the below query 
SELECT empName,DeptNo,DeptName
FROM Emp, Dept
WHERE Emp.DeptId >Dept.DeptId


Selected Option:
Non Equi Join

Correct Answer:
Non Equi Join 
Carefully read the question and answer accordingly.
Identify the circumstance under which you will create an Index?

Selected Option:
A column contains a wide range of values.

Correct Answer:
All of the listed options 
Carefully read the question and answer accordingly.
You are writing a query to  select all employees whose salary is less than the average of all the employees' salaries in the same department.
Which query will help you to achieve your goal?



Selected Option:
select ename ,sal ,deptno from emp a where a.sal < (select avg(sal) from emp b where a.deptno = b.deptno) order by deptno;

Correct Answer:
select ename ,sal ,deptno from emp a where
a.sal < (select avg(sal) from emp b 
where a.deptno = b.deptno) 
order by deptno; 
Carefully read the question and answer accordingly.
Which of the following SQL statements defines a FOREIGN KEY constraint on the deptno column of the EMP table?

Selected Option:
CREATE TABLE EMP (empno NUMBER (4), ename VARCHAR2 (35), deptno NUMBER (7,2) CONSTRAINT emp_deptno_fk REFERENCES dept (deptno))

Correct Answer:
CREATE TABLE EMP (empno NUMBER(4), ename VARCHAR2(35), deptno NUMBER(7,2) NOT NULL, CONSTRAINT emp_deptno_fk FOREIGN KEY(deptno) REFERENCES dept(deptno)) 
Carefully read the question and answer accordingly.
Identify the code snippet 
declare EmpNAME;
begin
SELECT ENAME INTO EmpNAME FROM Emp WHERE EmpNo=101172;
dbms_output.put_line(EmpName);
end;  

what will be the output of the above code


Selected Option:
Employee name whose employee no is 101172 is printed

Correct Answer:
The code does not compile at all 
Carefully read the question and answer accordingly.
Which of the following statements are true?

Statement A: Index by Table is Also known as associative arrays. It lets you to look up elements using arbitrary numbers and strings for subscript values. 

Statement B: Nested tables hold an arbitrary number of elements. They use sequential numbers as subscripts. 


Selected Option:
Both statements A and B are True.

Correct Answer:
Both statements A and B are True. 
Carefully read the question and answer accordingly.
Examine the code snippet
declare 
TYPE ABC is VARRAY(10) of NUMBER;
v2 ABC:=ABC(10,8,9,6,5,4,3,32);
begin
Dbms_output.put_line(v2(1));
end;
what will be the output of the above code ?

Selected Option:
Compiles and prints 10

Correct Answer:
Compiles and prints 10 
Carefully read the question and answer accordingly.
Identify the code snippet 
DECLARE
 var_num1 number:=50; 
 var_num2 number; 
BEGIN 
 var_num2 := 200; 
 DECLARE  
   var_mult number; 
   var_num1 number:= 100;   -- LINE 1
BEGIN 
   var_mult := var_num1 * var_num2; 
END; 
dbms_output.put_line( var_num1);
END; 
/
what will be the output of the above code assume serveroutput is on

Selected Option:
Compiles , executes and Prints 50

Correct Answer:
Compiles , executes and Prints 50 
Carefully read the question and answer accordingly.
Consider you are maintaining XYZ company database. XYZ database tables are accessed by several users to fetch daily reports by joining multiple tables found each user writes query which is more than 100 line of SQL statement and submits to server for processing in order to fetch results. This is really increasing the network traffic and also response time. What will the right solution you will implement in such scenarios in order to increase performance?

Selected Option:
Create Stored Procedure

Correct Answer:
Create Stored Procedure 
Carefully read the question and answer accordingly.
Examine the PL/SQL Block 
declare 
result Number;
num1 Number:=&number1;
num2 Number:=&number2;
begin
select num1/num2 into result from dual;
dbms_output.put_line('Result is '||result);
exception
when ZEROS_DIVIDE then
dbms_output.put_line('Exception Occurred Divide by Zero');
end;
/
What will be the output of the above code when user passes the value for NUM1 as 0 and NUM2 as 10


Selected Option:
Result is 0

Correct Answer:
Compilation fails 
Carefully read the question and answer accordingly.
You are using the system account to create a synonym as follows:
 Create synonym User for UserDetails
Which statements are true with respect to the above synonym?


Selected Option:
A synonym with the name User is created and only system can use it

Correct Answer:
A synonym with the name    User is created and only system can use it 
Carefully read the question and answer accordingly.
The user SCOTT who is the owner of ORDERS and SUPPLIERS tables issues the following GRANT command:
GRANT ALL
ON orders, Suppliers TO PUBLIC;
What correction needs to be done to the above statement?


Selected Option:
ALL should be replaced with a list of specific privileges.

Correct Answer:
Separate GRANT statements are required for ORDERS and SUPPLIERS tables. 
Carefully read the question and answer accordingly.
You need to disable all triggers on the EMPLOYEES table. Which command accomplishes this?

Selected Option:
ALTER TABLE employees DISABLE ALL TRIGGERS;

Correct Answer:
ALTER TABLE employees DISABLE ALL TRIGGERS; 
Carefully read the question and answer accordingly.
Which anonymous block to select first 3 highest paid salary and to insert into a temp table without any duplicate entry.

TABLE DATA : TBL_EMPLOYEES

EmployeeID   Salary      DepartmentID
258963             3000                  20
257896             6000                  30
457892             3000                  40
564232             3000                  40
254589             8000                  50
784555             5000                  20


Selected Option:
DECLARE CURSOR c1 is SELECT employeeid, firstname||','||lastname "Name" , salary FROM tbl_employees ORDER BY salary DESC; v_employeeid NUMBER; v_name VARCHAR2(30); v_salary NUMBER; BEGIN OPEN c1; FOR i IN 1..3 LOOP FETCH c1 INTO v_employeeid, v_name, v_salary; INSERT INTO temp VALUES (v_employeeid, v_name, v_salary); EXIT WHEN c1%NOTFOUND; COMMIT; END LOOP; CLOSE c1; END;

Correct Answer:
DECLARE
   CURSOR c1 is
      SELECT employeeid, firstname||','||lastname "Name" , salary 
      FROM tbl_employees
      ORDER BY salary DESC;   
   v_employeeid NUMBER;
   v_name VARCHAR2(30);
   v_salary   NUMBER;
BEGIN
   OPEN c1;
   FOR i IN 1..3 LOOP
      FETCH c1 INTO v_employeeid, v_name, v_salary;
                            
      INSERT INTO temp VALUES (v_employeeid, v_name, v_salary);
          EXIT WHEN c1%NOTFOUND; 
      COMMIT;
   END LOOP;
   CLOSE c1;
END; 
Carefully read the question and answer accordingly.
The following Block of statement is written to check the manager for each employee
declare
cursor c1 is
select ename , Mgr
from Emp;
begin
for rec in c1 LOOP
dbms_output.put_line('Employee '||rec.ename||' Works for '||rec.Mgr);
end loop;
end; 

Identify errors if any in the above code and provide suitable solution

 

Selected Option:
The above code has no error and gives the desired result

Correct Answer:
The above code has no error and gives the desired result 
Carefully read the question and answer accordingly.
The functions used in SQL statements should not 
use OUT or IN OUT mode parameters

Selected Option:
TRUE

Correct Answer:
TRUE 
Carefully read the question and answer accordingly.
What will be the output of the below query?
select to_CHAR(sysdate+(10/1400),'HH:MI:SS') from  dual;


Selected Option:
adds 10 minutes to the current Timestamp

Correct Answer:
adds 10 minutes to the current Timestamp 
Carefully read the question and answer accordingly.
An outer join returns all rows that satisfy the join condition and those rows from one table for which no rows from the other satisfy the join condition.
State True or False.

Selected Option:
T

Correct Answer:
T 
Carefully read the question and answer accordingly.
What does an EXIT statement do in PLSQL?

Selected Option:
The EXIT statement forces a loop to complete unconditionally
When an EXIT statement is encountered, the loop completes immediately and control passes to the end of the program

Correct Answer:
The EXIT statement forces a loop to complete unconditionally 
When an EXIT statement is encountered, the loop completes immediately and control passes to the next statement 
Carefully read the question and answer accordingly.
John wants to see how many employees are there whose salary is above average. 
Which of the following query will help john to achieve this task?


Selected Option:
Select count(*) from emp where sal > (select Avg(sal) from emp);

Correct Answer:
Select count(*) from emp where sal > (select Avg(sal) from emp); 
Carefully read the question and answer accordingly.
The following Block of statement is written to check the manager for each employee
declare
cursor c1 is
select ename , Mgr
from Emp;
begin
for rec in c1 LOOP
dbms_output.put_line('Employee '||rec.ename||' Works for '||rec.Mgr);
end loop;
end; 

Identify errors if any in the above code and provide suitable solution

 

Selected Option:
The above code has no error and gives the desired result

Correct Answer:
The above code has no error and gives the desired result 
Carefully read the question and answer accordingly.
Fields in a %ROWTYPE record inherit constraints

Selected Option:
TRUE

Correct Answer:
FALSE 
Carefully read the question and answer accordingly.
Under which two circumstances do you design database triggers? 
1.To duplicate the functionality of other triggers. 
2. To replicate built-in constraints in the Oracle server such as primary key and foreign key.
3.To guarantee that when a specific operation is performed, related actions are performed
4.For centralized, global operations that should be fired for the triggering statement, regardless of which user or application issues the statement. 

Selected Option:
1&4

Correct Answer:
3&4 
Carefully read the question and answer accordingly.
Consider the following SQL statements:

CREATE Table dept (deptno number (2), deptname varchar (20), loc varchar (20));
ROLLBACK
DESCRIBE dept

Which of the following statement is true about the above?

Selected Option:
The DESCRIBE Dept statement displays the structure of the Dept table only if there is a COMMITstatement introduced before the ROLLBACK statement.

Correct Answer:
The Describe statement displays the structure of the Department table. 
Carefully read the question and answer accordingly.
In the Student Management system we have a table called STUDENTS, COURSES, ENROLLMENTS with below data

TABLE DATA - STUDENTS:
STUDENTID    FIRSTNAME    LASTNAME
10001                   Francis           Peter
10002                   Venkat            Prasad

TABLE DATA - COURSES:
COURSEID    DEPARTMENTID   COURSENAME
1112                        20                      Science
1113                        30                      Economics

The below procedure is used to identify the coursenames in the department 20.
CREATE OR REPLACE PROCEDURE proc_coursename(p_deptid IN courses.departmentid%TYPE)
AS
v_coursename VARCHAR2(10);
CURSOR c_coursename IS
SELECT coursename
FROM  courses 
WHERE departmentid = p_deptid;
BEGIN
FOR v_rec_coursename IN c_coursename LOOP 
DBMS_OUTPUT.PUT_LINE('The course in Department ID:'||' '||p_deptid||' '||'is'||' '||v_rec_coursename.coursename);
END LOOP;
END proc_coursename;

Selected Option:
TRUE

Correct Answer:
TRUE 
Carefully read the question and answer accordingly.
XYZ company database has SALES table which captures all department sales information. You have been asked to create department wise summarized total sales report from SALES table. Which of the following correct option will fetch you meaning full result?

Selected Option:
Use Aggregate function along with GROUP BY clause in query to retrieve result

Correct Answer:
Use Aggregate function along with GROUP BY clause in query to retrieve result 
Carefully read the question and answer accordingly.
Examine the code snippet
declare 
TYPE ABC is VARRAY(10) of NUMBER;
v2 ABC;
begin
v2:=ABC();
v2.extend();
v2(1):=78;
Dbms_output.put_line(v2(1));
end;

what will be the output of the above code ?


Selected Option:
If v2:=ABC(); is removed than the code will compile and print 78

Correct Answer:
Compiles fine and prints the output as 78 
Carefully read the question and answer accordingly.
What will be the output of the query?
Select trim(0 from '00003443500') from dual?
 

Selected Option:
00003443500

Correct Answer:
34435 
Carefully read the question and answer accordingly.
Which procedure gets the student id and the course name for the given grade.

TABLE DATA - COURSES:

COURSEID      DEPARTMENTID       COURSENAME
1112                           20                      Science
1113                           30                    Economics

TABLE DATA - TBL_GRADE:

STUDENTID  COURSEID      YEAR              SEMESTER                GRADE
10001                 1112            2014      'Second Semester'           1
10002                 1113            2015       'First Semester'               2

SAMPLE OUTPUT :  Student ID: 10001 grade is 1

Selected Option:
CREATE OR REPLACE PROCEDURE proc_get_details(p_grade IN TBL_GRADE.grade%TYPE) AS v_studentid NUMBER; v_coursename VARCHAR2(10); v_grade NUMBER; CURSOR c_grade IS SELECT g.studentid, co.coursename FROM TBL_GRADE g, COURSES co WHERE g.courseid = co.courseid AND g.grade = p_grade; BEGIN OPEN c_grade; LOOP FETCH c_grade INTO v_studentid , v_coursename; EXIT WHEN c_grade%NOTFOUND; v_grade := p_grade; DBMS_OUTPUT.PUT_LINE('Student ID:'||' '||v_studentid||' '||'grade is'||' '||v_grade); END LOOP; CLOSE c_grade; END proc_get_details;

Correct Answer:
CREATE OR REPLACE PROCEDURE proc_get_details(p_grade IN TBL_GRADE.grade%TYPE)
AS
v_studentid NUMBER;
v_coursename VARCHAR2(10);
v_grade NUMBER;
CURSOR c_grade IS
SELECT g.studentid, co.coursename
FROM TBL_GRADE g, COURSES co 
WHERE g.courseid = co.courseid
AND g.grade = p_grade;
BEGIN
OPEN c_grade;
LOOP 
FETCH c_grade INTO v_studentid , v_coursename;
EXIT WHEN c_grade%NOTFOUND;
v_grade := p_grade;
DBMS_OUTPUT.PUT_LINE('Student ID:'||' '||v_studentid||' '||'grade is'||' '||v_grade);
END LOOP;
CLOSE c_grade;
END proc_get_details; 
Carefully read the question and answer accordingly.
When calling a function in a SQL statement which parameter notation must be used ?

Selected Option:
combined(positional and named)

Correct Answer:
positional 
Carefully read the question and answer accordingly.
Predict the value of variable named "B"  ? 
DECLARE
A BOOLEAN := NULL;
B BOOLEAN;
BEGIN
B := A IS NULL;
IF B IS NULL THEN
  DBMS_OUTPUT.PUT_LINE('HI');
END IF;
END;

Selected Option:
NULL

Correct Answer:
NULL 
Carefully read the question and answer accordingly.
General Syntax for coding exception
DECLARE
Declaration Section
BEGIN
Exception Section 
When ex_name 1 THEN 
Error handling Statements
When Others THEN
Error handling Statements
When ex_name 1 THEN 
Error handling Statements
END;


Selected Option:
TRUE

Correct Answer:
FALSE 
Carefully read the question and answer accordingly.
Which of the following statements are true?
1.A PL/SQL block has three parts, declarative part, an executable part and an exception handling part. 
2.Declarative and Executable block are Mandatory
3. A PL/SQL Block can be anonymous or named
4. Identifiers in PL/SQL can contain max 35 character
5. Blocks of PL/SQL statements are translated by the PL/SQL engine that can reside either in the client or at the server side. 

Selected Option:
1&3&5

Correct Answer:
1&3&5 
Carefully read the question and answer accordingly.
Which code can you use to ensure that the salary is not increased by more than 10% at a time nor is it ever decreased?

Selected Option:
CREATE OR REPLACE TRIGGER check_sal BEFORE UPDATE OF sal ON emp FOR EACH ROW WHEN (new.sal < old.sal OR new.sal > old.sal * 1.1) BEGIN RAISE_APPLICATION_ERROR ( - 20508, ‘Do not decrease salary not increase by more than 10%’);END;

Correct Answer:
CREATE OR REPLACE TRIGGER check_sal
BEFORE UPDATE OF sal ON emp
FOR EACH ROW
WHEN (new.sal < old.sal OR
new.sal > old.sal * 1.1)
BEGIN
RAISE_APPLICATION_ERROR ( - 20508, ‘Do not decrease
salary not increase by more than 10%’);
END; 
Carefully read the question and answer accordingly.
Consider you are creating a cursor,Choose the correct sequence of steps to work with cursors?

Selected Option:
Declare , Open , Fetch , Close

Correct Answer:
Declare , Open , Fetch , Close 
Carefully read the question and answer accordingly.
A dropped table can be restored by issuing this command.
FLASHBACK TABLE Supplier TO BEFORE DROP;
State True or False.

Selected Option:
T

Correct Answer:
T 
Carefully read the question and answer accordingly.
Examine the code snippet 

declare 
TYPE XYZ is VARRAY(10) of NUMBER;
v2 XYZ; -- line 1
x Number:=0;
Begin
v2:=XYZ(1,2,3,4,5,6,7);
v2.trim(1);--Line 2
while x < v2.last
loop
x:=x+1;
dbms_output.put_line(x);
end loop;
end;
/
What will be the output of the above code?

Selected Option:
Compiles , executes and prints 2, ,3 ,4, 5, 6, 7

Correct Answer:
Compiles , executes and prints 1 , 2, ,3 ,4, 5, 6 
Carefully read the question and answer accordingly.
In SQL, which of the following is NOT true with respect to Primary Key?

Selected Option:
Primary Key constraint has to be explicitly dropped before completely removing the table.

Correct Answer:
Primary Key constraint has to be explicitly dropped before completely removing the table. 
Carefully read the question and answer accordingly.
Under which two circumstances do you design database triggers? 
1.To duplicate the functionality of other triggers. 
2. To replicate built-in constraints in the Oracle server such as primary key and foreign key.
3.To guarantee that when a specific operation is performed, related actions are performed
4.For centralized, global operations that should be fired for the triggering statement, regardless of which user or application issues the statement. 

Selected Option:
3&4

Correct Answer:
3&4 
Carefully read the question and answer accordingly.
Examine the description of the employees table: 

EMP_ID NUMBER (4) NOT NULL 
LAST_NAME VARCHAR2 (30) NOT NULL 
FIRST_NAME VARCHAR2 (30) 
DEPT_ID NUMBER (2) 
JOB_CAT VARCHAR (30) 
SALARY NUMBER (8, 2) 

Which of the following SQL statements shows the department ID, minimum salary, and maximum salary paid in that department, only if the minimum salary is less than 2000 and maximum salary is more than 5000?

Selected Option:
SELECT dept_id, MIN (salary), MAX (salary) FROM employees WHERE MIN (salary) < 2000 AND MAX (salary) > 5000 GROUP BY dept_id

Correct Answer:
SELECT dept_id, MIN (salary), MAX (salary) FROM employees GROUP BY dept_id HAVING MIN(salary) < 2000 AND MAX (salary) > 5000 
Carefully read the question and answer accordingly.
In which case we will use Custom record?

Selected Option:
When Only few columns of one or more tables needs to be referenced, stored and processed.
When Programmer needs to define a customized structure for accessing /storing data.

Correct Answer:
When Only few columns of one or more tables needs to be referenced, stored and processed. 
When Programmer needs to define a customized structure for accessing /storing data. 
Carefully read the question and answer accordingly.
What is meant by %Type?

Selected Option:
Column constraints, such as the NOT NULL and check constraint, or default values are not inherited by items declared using %TYPE.
We can use the %TYPE attribute as a datatype specifier when declaring constants, variables, fields, and parameters.

Correct Answer:
We can use the %TYPE attribute as a datatype specifier when declaring constants, variables, fields, and parameters. 
Column constraints, such as the NOT NULL and check constraint, or default values are not inherited by items declared using %TYPE. 
%TYPE is used when declaring variables to hold database table values 
Carefully read the question and answer accordingly.
Does the below code compares 2 collections?
DECLARE
   TYPE Clientele IS TABLE OF VARCHAR2(64);
   group1 Clientele := Clientele('Customer 1', 'Customer 2'); 
   group2 Clientele := Clientele('Customer 1', 'Customer 3'); 
BEGIN
   IF group1 = group2 THEN
      ...
   END IF;
END;




Selected Option:
FALSE

Correct Answer:
FALSE 
Carefully read the question and answer accordingly.
How to convert the following code using the cursor FOR LOOP?

 DECLARE
 CURSOR occupancy_cur IS
 SELECT pet_id, room_number
 FROM occupancy WHERE occupied_dt = SYSDATE;
 occupancy_rec occupancy_cur%ROWTYPE;
 BEGIN
 OPEN occupancy_cur;
 LOOP
 FETCH occupancy_cur INTO occupancy_rec;
 EXIT WHEN occupancy_cur%NOTFOUND;
 update_bill (occupancy_rec.pet_id,   occupancy_rec.room_number);
 END LOOP;
 CLOSE occupancy_cur;
 END;


Selected Option:
DECLARE CURSOR occupancy_cur IS SELECT pet_id, room_number FROM occupancy WHERE occupied_dt = SYSDATE; occupancy_rec occupancy_cur%ROWTYPE; BEGIN FOR occupancy_rec IN occupancy_cur LOOP update_bill (occupancy_rec.pet_id, occupancy_rec.room_number); END LOOP; END;

Correct Answer:
DECLARE
   CURSOR occupancy_cur IS
      SELECT pet_id, room_number
        FROM occupancy WHERE occupied_dt = SYSDATE;
BEGIN
   FOR occupancy_rec IN occupancy_cur
   LOOP
      update_bill (occupancy_rec.pet_id, occupancy_rec.room_number);
   END LOOP;
END; 
Carefully read the question and answer accordingly.
CREATE OR REPLACE FUNCTION dml_call_sql(sal NUMBER)
RETURN NUMBER IS
BEGIN
INSERT INTO employees(employee_id, last_name,
email, hire_date, job_id, salary)
VALUES(1, 'Frost', 'jfrost@company.com',
SYSDATE, 'SA_MAN', sal);
RETURN (sal + 100);
END;
The above user defined PL/SQL function is called from the below UPDATE query. What is your prediction about the OUTPUT ?
UPDATE employees
SET salary = dml_call_sql(2000)
WHERE employee_id = 170;

Selected Option:
result in mutating table error

Correct Answer:
result in mutating table error 
Carefully read the question and answer accordingly.
IF add_genre_new  THEN
     IF NOT fic_genres.EXISTS(f_genre_id)     THEN
       fic_genres.EXTENDS(1);
       fic_genres(f_genre_id) := f_genre;         DBMS_OUTPUT.PUT_LINE('Total # of entries in fiction_genres is :
                         '||fiction_genres.COUNT();

END IF;

 Predict the correct steps of the above code ? 


Selected Option:
1. Add a new genre. 2. Is this genre id already in the collection? 3. **Add** another element to the varray. 4. Display the total # of elements.

Correct Answer:
1. Add a new genre.
2. Is this genre id already in the collection?
3. **Add** another element to the varray.
4. Display the total # of elements. 
Carefully read the question and answer accordingly.
Identify the below statement:
 
STATEMENT A : In Oracle 10g the default action of a DROP TABLE command is to move the table to the recycle bin (or rename it), rather than actually dropping it.

STATEMENT B: PURGE option can be used to permanently drop a table.


Selected Option:
Both statement A and B are True.

Correct Answer:
Both statement A and B are True. 
Carefully read the question and answer accordingly.
Examine the code snippet
DECLARE Num Number;
BEGIN 
Num:=10; 
DECLARE  
Num Number; --LINE 1
BEGIN  
Num:=12; 
while(Num<13)
loop
dbms_output.put_line(Num);
Num:=Num+1;
END loop; 
END;
if Num < 12  --LINE 2
then
dbms_output.put_line('Less');
end if;
END; 
/

What will be the result of the above code?


Selected Option:
Compiles executes and prints 12 Less

Correct Answer:
Compiles executes and prints 
12
Less 
Carefully read the question and answer accordingly.
Does the below code assign NULL to a nested table?
DECLARE
   TYPE Clientele IS TABLE OF VARCHAR2(64);
   group1 Clientele := Clientele('Customer 1','Customer 2');
   group2 Clientele;
BEGIN
   group1 := group2;
END;



Selected Option:
TRUE

Correct Answer:
TRUE 

1	
Carefully read the question and answer accordingly.
What is an EXIT - WHEN statement?

Selected Option:
When the EXIT statement is encountered, the condition in the WHEN clause is evaluated. If the condition is true, the loop completes and control passes to the next statement after the loop - 0.5
The EXIT-WHEN statement replaces a simple IF statement. - 0.5

Correct Answer:
When the EXIT statement is encountered, the condition in the WHEN clause is evaluated. If the condition is true, the loop completes and control passes to the next statement after the loop 
The EXIT-WHEN statement replaces a simple IF statement. 

2	
Carefully read the question and answer accordingly.
DECLARE
   v_boolean BOOLEAN;
BEGIN
   v_boolean := 'TRUE';
   DBMS_OUPUT.PUT_LINE(v_boolean);
END;
Predict the output of the program ?

Selected Option:
Displays nothing - 0.0

Correct Answer:
Leads to compilation error 

3	
Carefully read the question and answer accordingly.
If the declaration is Number (4,5) and the assigned value is 123.4567 , what is the stored value?

Selected Option:
12345.567 - 0.0

Correct Answer:
Error , exceeds precision 

4	
Carefully read the question and answer accordingly.
What is meant by case statements in PLSQL?

Selected Option:
The selector is followed by one or more WHEN clauses, which are checked sequentially. The value of the selector determines which clause is executed. If the value of the selector equals the value of a WHEN-clause expression, that WHEN clause is executed - 0.33
The ELSE clause does not works similarly to the ELSE clause in an IF statement - 0.0

Correct Answer:
The CASE statement selects one sequence of statements to execute. To select the sequence, the CASE statement uses a selector rather than multiple Boolean expressions. A selector is an expression whose value is used to select one of several alternatives 
The selector is followed by one or more WHEN clauses, which are checked sequentially. The value of the selector determines which clause is executed. If the value of the selector equals the value of a WHEN-clause expression, that WHEN clause is executed 
CASE statements can be labeled 

5	
Carefully read the question and answer accordingly.
What are the restrictions of GO TO statements?

Selected Option:
A GOTO statement can transfer control into an exception handler. - 0.0

Correct Answer:
A GOTO statement cannot transfer control into an IF statement, CASE statement, LOOP statement, or sub-block. 
A GOTO statement cannot transfer control out of a subprogram. 

6	
Carefully read the question and answer accordingly.
The %ROWTYPE attribute provides a record type that represents a row in

Selected Option:
index - 0.0
view - 0.5

Correct Answer:
view 
table 

7	
Carefully read the question and answer accordingly.
Identify the code snippet 
DECLARE
 var_num1 number:=50; 
 var_num2 number; 
BEGIN 
 var_num2 := 200; 
 DECLARE  
   var_mult number; 
   var_num1 number:= 100;   -- LINE 1
BEGIN 
   var_mult := var_num1 * var_num2; 
END; 
dbms_output.put_line( var_num1);
END; 
/
what will be the output of the above code assume serveroutput is on

Selected Option:
Compiles , executes and Prints 50 - 1.0

Correct Answer:
Compiles , executes and Prints 50 

8	
Carefully read the question and answer accordingly.
How to display output from PLSQL?

Selected Option:
DBMS_OUTPUT.PUT_LINE(' The employee name is : X') - 0.5
DBMSOUTPUT.PUT_LINE - 0.0

Correct Answer:
DBMS_OUTPUT.PUT_LINE 
DBMS_OUTPUT.PUT_LINE(' The employee name is : X') 

9	
Carefully read the question and answer accordingly.
In SQL, which of the following is NOT true with respect to Primary Key?

Selected Option:
Primary Key constraint has to be explicitly dropped before completely removing the table. - 1.0

Correct Answer:
Primary Key constraint has to be explicitly dropped before completely removing the table. 

10	
Carefully read the question and answer accordingly.
Predict the value of variable named "B"  ? 
DECLARE
A BOOLEAN := NULL;
B BOOLEAN;
BEGIN
B := A IS NULL;
IF B IS NULL THEN
  DBMS_OUTPUT.PUT_LINE('HI');
END IF;
END;

Selected Option:
FALSE - 0.0

Correct Answer:
NULL 

1	
Carefully read the question and answer accordingly.
Select the key advantages of using Store procedures in database management system.

Selected Option:
All of the listed options - 1.0

Correct Answer:
All of the listed options 

2	
Carefully read the question and answer accordingly.
Consider you are maintaining ABC company database. ABC company database tables are accessed by 1000 users initially when it was designed from last two years there was tremendous increase in number records count also number of users who are accessing the database tables to fetch results. Users of ABC company database are reporting problem that query processing is taking more time when they execute query against the database tables. What will the right solution you will suggest in such scenarios in order to increase database query performance?

Selected Option:
Create index - 1.0

Correct Answer:
Create index 

3	
Carefully read the question and answer accordingly.
The below code checks whether the colletion is NULL  and prints NULL, state TRUE or FALSE?
DECLARE
  TYPE emp_rec is RECORD (
    firstname    TBL_employees.firstname%TYPE,
    lastname     TBL_employees.lastname%TYPE
       );
   TYPE professor IS TABLE OF emp_rec;
   members professor;
BEGIN
 
   IF members IS NULL THEN
     DBMS_OUTPUT.PUT_LINE('NULL');
   ELSE
     DBMS_OUTPUT.PUT_LINE('Not NULL');
   END IF;
END;
/

Selected Option:
TRUE - 1.0

Correct Answer:
TRUE 

4	
Carefully read the question and answer accordingly.
Which procedure raises an exception 'NO DATA FOUND' when the student searches for the course which is not available else to display
a message that the course is available.

Selected Option:
CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like p_course||'%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major; - 1.0

Correct Answer:
CREATE OR REPLACE PROCEDURE Available_major(p_course courses.coursename%TYPE) IS v_courseid NUMBER; v_coursename VARCHAR2(20); v_deptid NUMBER; BEGIN SELECT courseid ,departmentid, coursename INTO v_courseid,v_deptid,v_coursename FROM courses WHERE coursename like p_course||'%'; DBMS_OUTPUT.PUT_LINE('Course Available with department ID:'||' '||v_deptid); EXCEPTION WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No Course Available'); END Available_major; 

5	
Carefully read the question and answer accordingly.
What is the collection exception raised for the below code?
DECLARE
   TYPE NumList IS TABLE OF NUMBER;
   nums NumList;
BEGIN
nums(1) := 1;
END;

Selected Option:
COLLECTION_IS_NULL - 1.0

Correct Answer:
COLLECTION_IS_NULL 

6	
Carefully read the question and answer accordingly.
 XYZ company database has Customer personal information View table using which customer can update their personal information like address, phone number fields when user updates address and phone number fields in view table. We need to take care of updating address and phone number fields in underlying database base table automatically. What right solution do you suggest to implement this requirement?

Selected Option:
Implement using triggers - 1.0

Correct Answer:
Implement using triggers 

7	
Carefully read the question and answer accordingly.
Which of the trigger is used to log all errors and also to do some special processing when the log error is 1017?

Selected Option:
CREATE TRIGGER log_errors AFTER SERVERERROR ON DATABASE BEGIN IF (IS_SERVERERROR (1017)) THEN <special processing of logon error> ELSE <log error number> END IF; END; - 1.0

Correct Answer:
CREATE TRIGGER log_errors AFTER SERVERERROR ON DATABASE BEGIN IF (IS_SERVERERROR (1017)) THEN <special processing of logon error> ELSE <log error number> END IF; END; 

8	
Carefully read the question and answer accordingly.
Which of the following SQL statements will calculate and return the absolute value of -80?

Selected Option:
SELECT ABS(-80) "Absolute" FROM DUAL - 1.0

Correct Answer:
SELECT ABS(-80) "Absolute" FROM DUAL 

9	
Carefully read the question and answer accordingly.
Which is the valid Package specification for the below requirements.
1) A procedure to update each professors salary 
2) A function to return the professor details who receive less salary compared to others.
3) A REF CURSOR to be declared
4) A employee record with employeeid , employee name , salary.
5) A constant with datatype NUMBER with value 4

Selected Option:
CREATE OR REPLACE PACKAGE employee_package AS TYPE t_ref_cursor IS REF CURSOR; TYPE emp_rec IS RECORD ( employeeid NUMBER, firstname VARCHAR2(10), lastname VARCHAR2(10), salary NUMBER); minimum_count CONSTANT NUMBER := 4; FUNCTION get_employee RETURN emp_rec; PROCEDURE update_salary (employeeid IN NUMBER); END employee_package; - 1.0

Correct Answer:
CREATE OR REPLACE PACKAGE employee_package AS TYPE t_ref_cursor IS REF CURSOR; TYPE emp_rec IS RECORD ( employeeid NUMBER, firstname VARCHAR2(10), lastname VARCHAR2(10), salary NUMBER); minimum_count CONSTANT NUMBER := 4; FUNCTION get_employee RETURN emp_rec; PROCEDURE update_salary (employeeid IN NUMBER); END employee_package; 

10	
Carefully read the question and answer accordingly.
What exception the  below code will raise?
DECLARE
  TYPE tab_numbers IS TABLE OF NUMBER
      INDEX BY PLS_INTEGER; 
  l_numbers tab_numbers;
BEGIN
  DBMS_OUTPUT.PUT_LINE (l_numbers (100));
END;

Selected Option:
SUBSCRIPT_BEYOND_COUNT - 0.0

Correct Answer:
NO_DATA_FOUND 

1	
Carefully read the question and answer accordingly.
What occurs when a cursor is opened?

Selected Option:
Open statement retrieves the rows from the cursor and will process it. - 0.0
The select statement provided within the cursor statement gets executed when we open the cursor. - 0.5

Correct Answer:
Opening the cursor allocates the memory first. 
The select statement provided within the cursor statement gets executed when we open the cursor. 

2	
Carefully read the question and answer accordingly.
What exception is raised when the user enters the ID as -6 in the below code?
DECLARE
   c_id customers.id%type := &cc_id;
   c_name  customers.name%type;
   c_addr customers.address%type;
   -- user defined exception
   ex_invalid_id  EXCEPTION;
BEGIN
   IF c_id <= 0 THEN
      RAISE ex_invalid_id;
   ELSE
      SELECT  name, address INTO  c_name, c_addr
      FROM customers
      WHERE id = c_id;
   END IF;
EXCEPTION
   WHEN ex_invalid_id THEN
      dbms_output.put_line('ID must be greater than zero!');
   WHEN no_data_found THEN
      dbms_output.put_line('No such customer!');
 END; /

Selected Option:
TOO MANY ROWS exception will be raised - 0.0

Correct Answer:
ex_invalid_id exception will be raised 

3	
Carefully read the question and answer accordingly.
Consider you are creating a cursor,Choose the correct sequence of steps to work with cursors?

Selected Option:
Declare , Open , Fetch , Close - 1.0

Correct Answer:
Declare , Open , Fetch , Close 

4	
Carefully read the question and answer accordingly.
What are the true aspects of implicit and explicit cursors?

Selected Option:
For INSERT operations, the implicit cursor holds the data that need to be inserted - 0.5
Implicit cursors are automatically created by oracle when a select query in PLSQL is executed. Explicit cursors is explicitly attached to a select query by programmer. - 0.5

Correct Answer:
Implicit cursors are automatically created by oracle when a select query in PLSQL is executed. Explicit cursors is explicitly attached to a select query by programmer. 
For INSERT operations, the implicit cursor holds the data that need to be inserted 

5	
Carefully read the question and answer accordingly.
You are developing a trigger which should ensure that no negative value is inserted in employee table’s Age column .  you have created a trigger as follows 
create or replace trigger  AgeVerify 
before insert
on employee for each row
when(new.EmpAge < 0)
begin
RAISE_APPLICATION_ERROR(-20000, 'no negative age allowed'); 
end;
/
Identify error if any in the above trigger and give the solution.

Selected Option:
No problem in the trigger. It gives the desired result - 1.0

Correct Answer:
No problem in the trigger. It gives the desired result 

6	
Carefully read the question and answer accordingly.
What is FOR UPDATE clause in Cursors?

Selected Option:
The records will be available for our changes only. - 0.5
When we issues a SELECT.. FOR UPDATE clause the RDBMS will automatically place a locks on the all the rows identified by the select statement. - 0.5

Correct Answer:
When we issues a SELECT.. FOR UPDATE clause the RDBMS will automatically place a locks on the all the rows identified by the select statement. 
The records will be available for our changes only. 

7	
Carefully read the question and answer accordingly.
What is the syntax of PRAGMA EXCEPTION_INIT?

Selected Option:
DECLARE exception_name EXCEPTION PRAGMA EXCEPTION_INIT (exception_name , err_code); Begin Execution section Exception WHEN exception_name THEN Handle the exception END; - 1.0

Correct Answer:
DECLARE exception_name EXCEPTION PRAGMA EXCEPTION_INIT (exception_name , err_code); Begin Execution section Exception WHEN exception_name THEN Handle the exception END; 

8	
Carefully read the question and answer accordingly.
How to convert the following code using the cursor FOR LOOP?
 DECLARE
 CURSOR occupancy_cur IS
 SELECT pet_id, room_number
 FROM occupancy WHERE occupied_dt = SYSDATE;
 occupancy_rec occupancy_cur%ROWTYPE;
 BEGIN
 OPEN occupancy_cur;
 LOOP
 FETCH occupancy_cur INTO occupancy_rec;
 EXIT WHEN occupancy_cur%NOTFOUND;
 update_bill (occupancy_rec.pet_id,   occupancy_rec.room_number);
 END LOOP;
 CLOSE occupancy_cur;
 END;

Selected Option:
DECLARE CURSOR occupancy_cur IS SELECT pet_id, room_number FROM occupancy WHERE occupied_dt = SYSDATE; BEGIN OPEN occupancy_cur FOR occupancy_rec IN occupancy_cur LOOP update_bill (occupancy_rec.pet_id, occupancy_rec.room_number); END LOOP; CLOSE occupancy_cur; END; - 0.0

Correct Answer:
DECLARE CURSOR occupancy_cur IS SELECT pet_id, room_number FROM occupancy WHERE occupied_dt = SYSDATE; BEGIN FOR occupancy_rec IN occupancy_cur LOOP update_bill (occupancy_rec.pet_id, occupancy_rec.room_number); END LOOP; END; 

9	
Carefully read the question and answer accordingly.
You are creating a procedure which accepts the employee name and displays the employee details like Employee Name, Employee No, Manager
Identify the correct syntax to achieve the desired result.

Selected Option:
create or replace procedure prcEmp_details(EmpName varchar2) as begin declare cursor c1 is select * from Emp where Ename=EmpName; begin for rec in c1 LOOP dbms_output.put_line(rec.ename||’ ’||rec.empNO||’ ’||rec.Mrg); end loop; end; end; - 1.0

Correct Answer:
create or replace procedure prcEmp_details(EmpName varchar2) as begin declare cursor c1 is select * from Emp where Ename=EmpName; begin for rec in c1 LOOP dbms_output.put_line(rec.ename||’ ’||rec.empNO||’ ’||rec.Mrg); end loop; end; end; 

10	
Carefully read the question and answer accordingly.
What is the syntax of Function?
CREATE [OR REPLACE] FUNCTION function_name [parameters] 
IS
Declaration_section 
RETURN return_datatype; 
BEGIN
Execution_section 
Return return_variable;  
EXCEPTION  
exception section  
Return return_variable; 
 END;

Selected Option:
TRUE - 0.0

Correct Answer:
FALSE 

1	
Carefully read the question and answer accordingly.
Under which two circumstances do you design database triggers? 
1.To duplicate the functionality of other triggers. 
2. To replicate built-in constraints in the Oracle server such as primary key and foreign key.
3.To guarantee that when a specific operation is performed, related actions are performed
4.For centralized, global operations that should be fired for the triggering statement, regardless of which user or application issues the statement.

Selected Option:
3&4 - 1.0

Correct Answer:
3&4 

2	
Carefully read the question and answer accordingly.
Which of the following logically related components can be grouped in a PL/SQL package ?

Selected Option:
procedures - 0.25
functions - 0.25
PL/SQL types - 0.25

Correct Answer:
PL/SQL types 
exceptions 
procedures 
functions 

3	
Carefully read the question and answer accordingly.
 You need to create a trigger on the EMP table that monitors every row that is changed and places this information into the AUDIT_TABLE.
What type of trigger do you create?

Selected Option:
FOR EACH ROW trigger on the AUDIT_TABLE table. - 0.0

Correct Answer:
FOR EACH ROW trigger on the EMP table. 

4	
Carefully read the question and answer accordingly.
A PL/SQL function can return more than one value from a function using PL/SQL record or PL/SQL table

Selected Option:
FALSE - 0.0

Correct Answer:
TRUE 

5	
Carefully read the question and answer accordingly.
CREATE OR REPLACE FUNCTION dml_call_sql(sal NUMBER)
RETURN NUMBER IS
BEGIN
INSERT INTO employees(employee_id, last_name,
email, hire_date, job_id, salary)
VALUES(1, 'Frost', 'jfrost@company.com',
SYSDATE, 'SA_MAN', sal);
RETURN (sal + 100);
END;
The above user defined PL/SQL function is called from the below UPDATE query. What is your prediction about the OUTPUT ?
UPDATE employees
SET salary = dml_call_sql(2000)
WHERE employee_id = 170;

Selected Option:
UPDATE will happen - 0.0

Correct Answer:
result in mutating table error 

6	
Carefully read the question and answer accordingly.
what is the result when we attempt to change the value of an IN parameter ?

Selected Option:
run time exception - 0.0

Correct Answer:
compile-time error 

7	
Carefully read the question and answer accordingly.
Which two statements about packages are true? 
1.Packages can be nested.
2.You can pass parameters to packages.
3.A package is loaded into memory each time it is invoked.
4.The contents of packages can be shared by many applications.
5. You can achieve information hiding by making package constructs private.

Selected Option:
4&5 - 1.0

Correct Answer:
4&5 

8	
Carefully read the question and answer accordingly.
The functions can return PL/SQL specific data types such as BOOLEAN, RECORD, or TABLE

Selected Option:
TRUE - 0.0

Correct Answer:
FALSE 

9	
Carefully read the question and answer accordingly.
A procedure containing a single OUT parameter would be better rewritten as a function returning the value.

Selected Option:
TRUE - 1.0

Correct Answer:
TRUE 

10	
Carefully read the question and answer accordingly.
You need to disable all triggers on the EMPLOYEES table. Which command accomplishes this?

Selected Option:
ALTER TABLE employees DISABLE ALL TRIGGERS; - 1.0

Correct Answer:
ALTER TABLE employees DISABLE ALL TRIGGERS; 

1	
Carefully read the question and answer accordingly.
Consider the following statements that describes a PL/SQL Block Structure:
Statement1: Declare  and Exception Sections are mandatory.
Statement2: Begin and End Sections are optional.
Which of the following is applicable for above?

Selected Option:
Statement1 and Statement2 are False. - 1.0

Correct Answer:
Statement1 and Statement2 are False. 

2	
Carefully read the question and answer accordingly.
Fields in a %ROWTYPE record inherit constraints

Selected Option:
FALSE - 1.0

Correct Answer:
FALSE 

3	
Carefully read the question and answer accordingly.
Identify the type of variable declared 
VARIABLE City Varchar2(20).

Selected Option:
Global Variable - 0.0

Correct Answer:
Bind Variable 

4	
Carefully read the question and answer accordingly.
What does an EXIT statement do in PLSQL?

Selected Option:
When an EXIT statement is encountered, the loop completes immediately and control passes to the next statement - 0.5
The EXIT statement forces a loop to complete unconditionally - 0.5

Correct Answer:
The EXIT statement forces a loop to complete unconditionally 
When an EXIT statement is encountered, the loop completes immediately and control passes to the next statement 

5	
Carefully read the question and answer accordingly.
Which of the following statement is TRUE
(i) Strong REF CURSOR types are less error prone
(ii) Weak REF CURSOR types are not flexible

Selected Option:
(i) - 1.0

Correct Answer:
(i) 

6	
Carefully read the question and answer accordingly.
. By default, variables are initialized to NULL

Selected Option:
TRUE - 1.0

Correct Answer:
TRUE 

7	
Carefully read the question and answer accordingly.
You cannot assign nulls to a variable defined as NOT NULL. If you try, PL/SQL raises the predefined exception _________

Selected Option:
VALUE_ERROR - 1.0

Correct Answer:
VALUE_ERROR 

8	
Carefully read the question and answer accordingly.
Which of the following statements are true?
1.A PL/SQL block has three parts, declarative part, an executable part and an exception handling part. 
2.Declarative and Executable block are Mandatory
3. A PL/SQL Block can be anonymous or named
4. Identifiers in PL/SQL can contain max 35 character
5. Blocks of PL/SQL statements are translated by the PL/SQL engine that can reside either in the client or at the server side.

Selected Option:
1&3&5 - 1.0

Correct Answer:
1&3&5 

9	
Carefully read the question and answer accordingly.
Which is called as index-by tables ?

Selected Option:
Associative arrays - 1.0

Correct Answer:
Associative arrays 

10	
Carefully read the question and answer accordingly.
You must declare each variable of same data type separately

Selected Option:
FALSE - 0.0

Correct Answer:
TRUE 




