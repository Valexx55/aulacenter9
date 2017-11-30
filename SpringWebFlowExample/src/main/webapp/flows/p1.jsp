<%@ page isELIgnored="false"%>
<html>
<body>
	<h2>P1</h2>

	<form method="post" action="${flowExecutionUrl}">

		<!-- <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" /> -->
		${veces}
		<button type="submit" name="_eventId_ap2">VISIT P2</button>
        <button type="submit" name="_eventId_ap3">VISIT P3</button>
	</form>

</body>
</html>
