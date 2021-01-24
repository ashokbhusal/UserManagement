<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<%@ include file ="header.jsp" %>

</head>
<body>
	<div class="container">
	<div class="panel">
	<div class="panel-default">
	<div class="rows">
	<div class="col-md-2"></div>
	<div class="col-md-8 jumbotron">
	
		<form action="save_user" method="post" class="form-horizontal">
		<fieldset>
		<legend>User Form Registration</legend>
			<div class="form-group">
				<label>User Name</label>
				<input type="text" name="username" class="form-control">
			</div>
			<div class="form-group">
				<label>Password</label>
				<input type="password" name="password" class="form-control">
			</div>
			<div class="form-group">
				<label>Email</label>
				<input type="email" name="email" class="form-control">
			</div>
			<div class="form-group">
				<label>Mobile No</label>
				<input type="number" name="mobileNo" class="form-control">
			</div>
			<div class="form-group">
				<label>DOB</label>
				<input type="date" name="dob" class="form-control">
			</div>
			<div class="form-group">
				<label>Address</label>
				<input type="text" name="address" class="form-control">
			</div>
			<div class="form-group">
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Female">Female <input
					type="radio" name="gender" value="Other">Other
			</div>
			<div class="form-group">
				<label>Hobbies</label> 
					<input type="checkbox" name="hobbies" value="Reading" class="form-check">Reading 
					<input type="checkbox" name="hobbies" value="Playing" class="form-check">Playing 
					<input type="checkbox" name="hobbies" value="Hiking" class="form-check">Hiking
			</div>
			<div class="form-group">
				<label>Nationality</label> <select name="nationality" class="form-control">
					<option value="Nepalese">Nepalese</option>
					<option value="American">American</option>
					<option value="Italian">Italian</option>
				</select>
			</div>
			<div class="form-group">
				<label>Comments</label>
				<textarea rows="5" cols="20" name="comments" class="form-control"></textarea>
			</div>
			<div class="form-group">
				<input type="submit" value="Submit" class="btn btn-success">
			</div>
		</fieldset>	
		</form>
	</div>
	<div class="col-md-2"></div>
	</div>
	</div>	
	</div>	
	</div>
</body>
</html>