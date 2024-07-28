
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
  div
            {
                margin: auto;
                width: 400px;
                background-color: white;
                box-shadow: 2px;
                border-radius: 25px;
               
            }
            body
            {
                background-color:aqua;
                
            }
            input{
                border-radius: 20px;
                padding: 7px;
            }
            h1
            {
            	 background-color: gray;
                font-size: 30px;
                font-family: Verdana, Geneva, Tahoma, sans-serif;
                text-align: center;
            }
            select{
                border-radius: 20px;
                padding: 7px;
            }
 
 </style>
<center>
<form action="/edit" method="PUT">

	<table>
	 <tr>
		<td>Employee Name : </td>
		<td><input type="text" name="ename"></td>
	</tr> 
	<tr>
		<td>Designation  : </td>
		<td>
			<select name="desg">
			
				<option value="">Select Designation</option>
				<option value="CEO">CEO</option>
				<option value="Junior_Developer">Junior_Developer</option>
				<option value="Senior_Developer">Senior_Developer</option>
				<option value="Manager">Manager</option>			
			</select>
		
		</td>
	</tr>
	<tr>
		<td>Salary : </td>
		<td><input type="text" name="salary"></td>
	</tr>
	<tr>
		<td>Email : </td>
		<td><input type="text" name="email"></td>
	</tr>
	<tr>
		<td>Mobile : </td>
		<td><input type="text" name="phno"></td>
	</tr>
	
	<tr>
		<td>Qualification  : </td>
		<td>
			<select name="qualification">
			
				<option value="">Select Qualification</option>
				<option value="MBA">MBA</option>
				<option value="BSC">BSC</option>
				<option value="BTECH">B.TECH</option>
				<option value="MTECH">MTEch</option>			
			</select>
		
		</td>
		<tr>
		<td>Manager : </td>
		<td><input type="text" name="manager"></td>
	</tr>
	</tr>
	
	<tr>
		<td>Gender : </td>
		<td>
			<input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female">Female
		</td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Update"></td>
		<td><input type="reset" value="Reset"></td>
	
	</tr>	
		
	
	</table>
	
	<br><br>
	<a href="/">Home Page</a>




</form>
</center>