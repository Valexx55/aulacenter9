<%@ page isELIgnored="false"%>
<html>
<body>
	<h2>Please Login</h2>

	<form method="post" action="${flowExecutionUrl}">

		<input type="hidden" name="_eventId" value="dioRespuesta"> 
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

		Diga Melón<input type="text" name="respuesta" maxlength="40"><br> 
		<input type="submit" value="Contesta" />

	</form>

</body>
</html>
