<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CategoryUp</title>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<div class="row">
<h1>Category</h1>
<form id="category" action="saveCat" method="post" role="form" style="display: block;">
<div class="form-group">
<input type="text" name="catname" id="catName" tabindex="2" class="form-control" placeholder="enter category name">
</div>
<div class="form-group">
<input type="text" name="catdescription" id="catdescription" tabindex="2" class="form-control" placeholder="about category">
</div>
<div class="col-sm-6 col-sm-offset-3">
<input type="submit" name="submit" id="submit" tabindex="4" class="form-control btn btn-submit" value="SUBMIT">
</div>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>