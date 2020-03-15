<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<style type="text/css">
			.error{color: red}
		</style>
	</head>
	<body>
	
	<%--<img src="${pageContext.request.contextPath}/resources/images/sample.png">--%>
		<h1 align="center">Student Registration Form</h1>
		<form:form  align="center" action="processForm" modelAttribute="student">
			<h3 align="center">Fill out the Form.Asterisk (*) means required.<br>
			First Name:&emsp;<form:input path="firstName"/>
			<br>
			Last Name(*):&emsp;<form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"></form:errors>
			<br>
			College Id(*):&emsp;<form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass="error"></form:errors>
			<br>
			Select Country:&emsp;<form:select path="country">
			<br>
				<form:options items="${student.countryOptions}"></form:options>
			</form:select>
			<br>
			PostCode:&emsp;<form:input path="postCode"/>
			<form:errors path="postCode" cssClass="error"></form:errors>
			<br>
			FreePass:&emsp;<form:input path="freePass"/>
			<form:errors path="freePass" cssClass="error"></form:errors>
			<br>
			Programming Languages:<br>
			<form:radiobuttons path="language" items="${student.programmingLanguage}"/><br>
			Operating System:<br>
			<form:checkboxes items="${student.operatingSystem}" path="system"/><br>
			<form:button>Submit</form:button></h3>
		</form:form>
	</body>
</html>