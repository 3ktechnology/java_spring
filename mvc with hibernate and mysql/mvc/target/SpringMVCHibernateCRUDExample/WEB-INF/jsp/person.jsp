<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
            <form:form id="person" modelAttribute="person" action="/mvc/v1/person/add" method="post" acceptCharset="UTF-8">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="name">Name: </form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="country">Country:</form:label>
                        </td>
                        <td>
                            <form:input path="country" name="country" id="country" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="add" name="add">Add Person</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    
                </table>
            </form:form>
        </body>
<h3>Persons List</h3>
<c:if test="${!empty listPersons}">
	<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="120">Person Country</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.id}</td>
			<td>${person.name}</td>
			<td>${person.country}</td>
			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
        </html>