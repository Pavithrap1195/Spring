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
	Price:<input type="text" name="price"> 
	<%-- <h3>${ validatePrice}</h3>
 --%>	Language:<input type="text" name="language">
	<%-- <h3>${validateLanguage }</h3> --%>
	Noofpages:<input type="text" name="noOfPages">
	<%-- <h3>${validateNoOfPages }</h3> --%>
	
	<input type="submit" value="Submit">
	</pre>
	</form>

	<h1>${ searchValidationMessage}</h1>
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
	</ol>
</body>
</html>