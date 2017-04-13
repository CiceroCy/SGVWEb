<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/iCheck/square/blue.css">
<link rel="stylesheet" href="assets/css/AdminLTE.min.css">
</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<b>SGV</b>
		</div>

		<div class="login-box-body">
			<p class="login-box-msg">Faça login para entrar no Sistema</p>
			<form action="${contextPath}/plain/login.html" method="POST">
				<div class="form-group has-feedback">
					<input type="email" name="username" class="form-control"
						placeholder="email" >
					<spam class="glyphicon glyphicon-envelope form-control-feedback"></spam>
				</div>
				<div class="form-group has-feedback">
					<input type="password" name="password" class="form-control"
						placeholder="Senha" /> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>

				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck">
							<label> <input type="checkbox" />Lembra-me?
							</label>
						</div>
					</div>
					<div class="col-xs-4">
						<botton type="submit" class="btn btn-primary btn-block btn-flat">Login</botton>
					</div>
				</div>
			</form>
			<!-- /.login-box-body -->
		</div>
		<!-- /.login-box -->
	</div>
<%--  <decorator:body /> --%>
	<!-- jQuery 2.2.3 -->
	<script src="assets/js/jquery-2.2.3.min.js"></script>
	<!-- Bootstrap 3.3.6 -->
	<script src=".assets/js/bootstrap.min.js"></script>
	<script src="assets/iCheck/icheck.min.js"></script>
	<script>
		$(function() {
			$('input').iCheck({
				checkboxClass : 'icheckbox_square-blue',
				radioClass : 'iradio_square-blue',
				increaseArea : '20%' // optional
			});
		});
	</script>
<%-- 	<dec:body /> --%>
<%-- <jsp:include page="/template/footer.jsp" />  --%>
</body>
</html>