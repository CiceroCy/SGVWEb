<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">

<title>Cadastrar Usuario</title>
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/iCheck/square/blue.css">
<link rel="stylesheet" href="assets/css/AdminLTE.min.css">
</head>
<body class="hold-transition login-page">
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">Cadastrar Usuarios</h3>
		</div>
		<div class="panel-body">
			<form id="form-caduser" data-toggle="validator" role="form" action="saveUser.html" method="post">
				<div class="form-group" >
					<label for="name" class="control-label">Nome</label> <input
						id="name" class="form-control" placeholder="Digite Seu Nome"
						type="text"  name="nome" />
				</div>
				<div class="form-group">
					<div class="row">
						<div class="col-xs-8">
							<label for="email" class="control-label">Email</label> <input
								type="email" class="form-control"  name="email"
								placeholder="Digite seu Email" />
						</div>
					</div>
				</div>
          
                <div class="form-group">
                <input type="radio" name="status" value="true"/>Habilitado
                 <input type="radio" name="status" value="false"/>Desabilitado
                </div>
                
				<div>
				<button class="btn btn-success" type="submit" value="cadastrar">Cadastrar</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>