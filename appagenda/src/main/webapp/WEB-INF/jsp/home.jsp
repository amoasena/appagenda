<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppAgenda</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Servi�o</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/exame/lista">Exame</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Procedimento</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Consulta</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Cliente</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Agenda</a>
      </li>
    </ul>
  </div>
</nav>
	<div class="container mt-3">
		<h2>AppAgenda</h2>
		<p>Projeto de Gest�o de Agenda</p>
		<h3>Classe: Cliente</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>C�digo</td>
				</tr>
				<tr>
					<td>nome</td>
					<td>sting</td>
					<td>Nome do cliente</td>
				</tr>
				<tr>
					<td>telefone</td>
					<td>String</td>
					<td>Telefone</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Servi�o</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>C�digo</td>
				</tr>
				<tr>
					<td>ativo</td>
					<td>booolean</td>
					<td>Servi�o ativo</td>
				</tr>
				<tr>
					<td>suspensao</td>
					<td>LocalDateTime</td>
					<td>Suspender a partir de</td>
				</tr>
				<tr>
					<td>periodoSuspensao</td>
					<td>int</td>
					<td>Per�odo de suspen��o em dias</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Consulta</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>tempoDuracao</td>
					<td>int</td>
					<td>Tempo de dura��o em minutos</td>
				</tr>
				<tr>
					<td>nomeMedico</td>
					<td>string</td>
					<td>Nome do m�dico atendente</td>
				</tr>
				<tr>
					<td>especialidade</td>
					<td>string</td>
					<td>Especialidade do m�dico atendente</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Exame</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>string</td>
					<td>Descri��o</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Procedimento</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>string</td>
					<td>Descri��o</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Agenda</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data de agendamento</td>
				</tr>
				<tr>
					<td>confirmado</td>
					<td>boolean</td>
					<td>Confirma��o da agenda</td>
				</tr>
				<tr>
					<td>realizado</td>
					<td>boolean</td>
					<td>Confirma��o da realiza��o</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>