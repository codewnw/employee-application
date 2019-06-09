<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<h1>Employee Registration</h1>
	<form action="register-employee" method="post">
		<table border="1px">
			<tr>
				<td>First Name</td>
				<td><input type="text" placeholder="First Name"
					name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" placeholder="Last Name" name="lastName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" placeholder="Email" name="email" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number" placeholder="Age" name="age" /></td>
			</tr>
			<tr>
				<tr>
			<td>Gender</td>
				<td><input type="radio" name="gender" value="Male" />Male
					&nbsp; &nbsp; <input type="radio" name="gender" value="Female" />Female
				</td>
			</tr><tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile"
					placeholder="Enter Mobile number" /></td>
			</tr>

			<tr>
				<td>City</td>
				<td><input type="text" name="city" placeholder="Enter City" />
				</td>
			</tr>

			<tr>
				<td>State</td>
				<td><select name="state">
						<option value="">--Select--</option>
						<option value="Karnataka">Karnataka</option>
						<option value="Andhra">Andhra</option>
				</select></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><input type="text" name="country"
					placeholder="Enter country" /></td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>


	</form>

</body>
</html>