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
<h3>Persons List</h3>
<h1>${listPersons}</h1>

        </body>


	

        </html>