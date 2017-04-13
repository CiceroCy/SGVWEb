<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<title>Sistema Web</title>

<!-- Bootstrap 3.3.6 necessário para o tema-->
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<!-- jQuery UI - v1.12.1-->

<!-- Theme style necessário para o tema-->
<link rel="stylesheet" href="assets/css/AdminLTE.min.css">


<!-- Bootstrap 3.3.6 necessário para o tema-->
<script src="assets/js/bootstrap.min.js"></script>




</head>
<body class="hold-transition skin-blue sidebar-mini">

	<div class="wrapper">

		<dec:body />

		<jsp:include page="footer.jsp" />

	</div>


	<script>
		$(document).ready(function() {
			//             _init();
		});
	</script>
</body>
</html>