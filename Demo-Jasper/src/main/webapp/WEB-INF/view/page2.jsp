<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script src="../resources/js/jquery-1.11.3.min.js"></script>
<script src="../resources/js/jquery-ui.min.js"></script>
<script src="../resources/js/angular.min.js"></script>
<script src="https://code.angularjs.org/1.2.28/angular-route.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>
<script src="../resources/js/app.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
  <body ng-app="yeah">
  
    <h1>Angular Service To Share Data Between Controllers</h1>
  
    <div ng-controller="SecondCtrl">
  
      <p>{{ sharedData }}</p>
      
    </div>
    
  </body>
</html>