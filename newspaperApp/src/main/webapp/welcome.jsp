<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to NewsPaper App</h1>
	<h1>${validateMessage}</h1>

	<form action="submitnewspaper.do">
		<pre>
	Name:<input type="text" name="newsPaperName">
	<p style="color: red" text-align="center">${validateNewsPaperName}</p>
	
	Price:<input type="text" name="price"> 
		<p style="color: red" text-align="center">${validatePrice}</p>
	
	Language:<input type="text" name="language">
		<p style="color: red" text-align="center">${validateLanguage}</p>
	
	Noofpages:<input type="text" name="noOfPages">
		<p style="color: red" text-align="center">${validateNoOfpages}</p>
	
	
	<input type="submit" value="Submit">
	</pre>
	</form>

	<%-- <h1>${ searchValidationMessage}</h1>
	<form action="searchNewsPaper.do">
		<label>Search</label> <input type="text" name="searchNewsPaper">
		<input type="submit" value="SearchNewsPaper">
	</form>
	<h2>${NOTFOUND }</h2>
	<ol>
		<li>${NEWSPAPERNAME }</li>
		<li>${PRICE}</li>
		<li>${LANGUAGE}</li>
		<li>${NOOFPAGES}</li>
	</ol> --%>
</body>
</html>