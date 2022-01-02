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
	
	Language:<input type="text" name="language">
	
	Noofpages:<input type="text" name="noOfPages">
	
	<input type="submit" value="Submit">
	</pre>
	</form>
	
	<form action="searchNewsPaper.do">
	<label>Search</label>
	<input type="text" name="searchNewsPaper">
	<input type="submit" value="SearchNewsPaper">
	</form>	
</body>
</html>