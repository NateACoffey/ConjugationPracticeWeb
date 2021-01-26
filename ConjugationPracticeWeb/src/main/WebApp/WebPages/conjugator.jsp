<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link  href="/WebPages/conjugator.css" rel="stylesheet">
	<head>
		<meta charset="ISO-8859-1">
		<title>Language Conjugation Tool</title>
	</head>

	<body id="main" style="background-color:#59bfff;">
		<div style="margin:auto;Width:75%;min-width:990px;max-width:1500px;margin-top:10%;text-align:center;border:solid black 2px;border-radius:25px;background-color:#ff9359;">
			<p>Select the language</p>
			<form method="post" action="/conjugator/language">
				<p>
					<select name="language" field="*{language}" style="width:25%; background-color:#e6a37e; font-size:30px;">
						<option style="text-align:right; font-size:20px;">Japanese</option>
					</select>
				</p>
				<p hidden=""><input type="text" name="input"></p>
				<p>
					
					<input type="submit" value="Select" style="text-align: center;background-color:#C26E42;">
					
				</p>
			</form>
		</div>
	</body>
</html>
