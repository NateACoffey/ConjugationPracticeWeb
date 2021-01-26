<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link  href="/WebPages/language.css" rel="stylesheet">
	<head>
		<meta charset="ISO-8859-1">
		<title>Language Conjugation Tool</title>
	
		<script>
			var textarea = document.getElementById('textarea_id');
			textarea.scrollTop = textarea.scrollHeight;
		</script>
	</head>
	
	<body id="main" style="background-color:#59bfff;">
		<div style="height:60vh;margin:auto;Width:75%;min-width:990px;max-width:1500px;margin-top:10%;text-align:center;border:solid black 2px;border-radius:25px;background-color:#ff9359;">
			<div>
				<input type="button" onclick="location.href='/conjugator'" value="<-- Language Selector" style="margin-left:25px;height:40px;line-height:0;background-color:#FF9359;font-size:20px;">
				<input type="button" onclick="help()" value="?" style="margin-right:25px;width:30px;height:30px;line-height:0;background-color:#FF9359;font-size:20px;">
			</div>
			<p style="margin-top:1px;">Using the given verb ending and tense, enter the correct conjugation.</p>
			<form method="post" action="language" style="height:70%;">
				<p style="height:100%;"><textarea id="textarea" readonly="readonly"style="width:60%;text-align:left;background-color:#e6a37e;height:100%;font-size:18px;font-family:'Courier New',monospace;">${textOutput}</textarea></p>
				<p hidden=""><input type="text" name="language" value="${language}"></p>
				<p>
					<input type="text" name="input" autofocus="autofocus" placeholder="Input here" style="text-align: center;background-color:#e6a37e;height:30px;width:300px;font-size:18px;font-family:'Courier New',monospace;">
					<input type="submit" value="Enter" style="text-align: center;background-color:#C26E42;height:30px;width:100px;font-size:20px;">
				</p>
			</form>
		</div>
		
		
		<script>
			function help() {
			  alert("Assume る refers to 五段 verbs and いる/える refers to 一段 verbs.\n\nType SHOW to show the correct conjugation.!");
			}
		</script>
		
		
		
	</body>
</html>
