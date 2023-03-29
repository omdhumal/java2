<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.tblAlign{
margin-left: auto;
margin-right: auto;
background-color:#ECEDAF;
}

table, th,td{
border: 1px solid black; 
 border-collapse: collapse;
}
</style>
</head>
<body style="background-color:#D5F5E3; text-align:center" >

<h2 style=" color:black; background-color:orange">Xpert It Institute <h5></h5></div></h2>


<form action="login">
	Add  Question...!

	<div class="control-group">
		<textarea class="form-control border-0 py-3 px-4" rows="5" id="message" name="question" placeholder="Add Question" required="required"
			data-validation-required-message="Please enter your Question"></textarea>
		<p class="help-block text-danger"></p>
	</div>
	
	
  <label for="qtype">Question Type:</label>
  <select name="qtype" id="qtype">
    <option value="mcq">MCQ</option>
    <option value="msq">MSQ</option>
    <option value="descriptive">descriptive</option>
    
  </select><br> <p class="help-block text-danger"></p> 
  
  
  
   <div class="control-group" >
          <input type="text" class="form-control border-0 p-4" id="option1"  name="option1" placeholder="a.Option 1" required="required" data-validation-required-message="Please enter your option 1" />  <br>
          <input type="text" class="form-control border-0 p-4" id="option2"  name="option2" placeholder="b.Option 2" required="required" data-validation-required-message="Please enter your option 2" /> <br>
          <input type="text" class="form-control border-0 p-4" id="option3"  name="option3" placeholder="c.Option 3" required="required" data-validation-required-message="Please enter your option 3" />  <br>
          <input type="text" class="form-control border-0 p-4" id="option4"  name="option4" placeholder="d.Option 4" required="required" data-validation-required-message="Please enter your option 4" />  <br>
              <p class="help-block text-danger"></p>                   
   </div>
   
   <div>          <input type="text" class="form-control border-0 p-4" id="correctAns"  name="correctAns" placeholder="correctAns" required="required" data-validation-required-message="Please enter your Ans" />
   </div>
  
  <br><br>
  <input  type="submit" value="Submit">

	
	
	
	
   </form>          

</body>
</html>