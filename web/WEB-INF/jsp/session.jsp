<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: aleksander.nybakk
  Date: 21.08.2015
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Session</title>
    </head>
    <body>
        <h2>Session details</h2>
        <form:form method="POST" action="/Workout/addSession">
            <table>
                <tr>
                    <td><form:label path="date">Date</form:label></td>
                    <td><form:input path="date" /></td>
                </tr>
                <tr>
                    <td><form:label path="duration">Duration</form:label></td>
                    <td><form:input path="duration" /></td>
                </tr>
                <tr>
                    <td><form:label path="maxHeartRate">Max Heart Rate</form:label></td>
                    <td><form:input path="maxHeartRate" /></td>
                </tr>
                <tr>
                    <td><form:label path="averageHeartRate">Average Heart Rate</form:label></td>
                    <td><form:input path="averageHeartRate" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
