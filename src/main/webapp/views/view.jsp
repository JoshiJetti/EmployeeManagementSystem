<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>

<form action="/view">

<table border="2">

<tr>
	<th>Employee Name</th>
	<th> Designation</th>
	<th>salary</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Qualifier</th>
	<th>Manager</th>
	<th>Gender</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>
<c:forEach var="emp" items="${emps}">
<tr>
	<td>${emp.ename}</td>
	<td>${emp.desg}</td>
	<td>${emp.salary}</td>
	<td>${emp.email}</td>
	<td>${emp.phno}</td>
	<td>${emp.qualification}</td>
	<td>${emp.manager}</td>
	<td>${emp.gender}</td>
	<td><a href="/edit/${emp.ename}">Edit</a></td>
	<td><a href="/delete/${emp.ename}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br><br>
<a href="/">home</a>

</form>
</center>