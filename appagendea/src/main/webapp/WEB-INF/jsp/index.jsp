<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppAgenda</title>
</head>
<body>
	<div class="container mt-3">
		<h2>AppAgenda</h2>
		<p>Projeto de Gestão de Agenda</p>
		<h3>Classe: Médico</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código</td>
				</tr>
				<tr>
					<td>nome</td>
					<td>sting</td>
					<td>Nome do médico</td>
				</tr>
				<tr>
					<td>CRM</td>
					<td>String</td>
					<td>CRM</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Cliente</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código</td>
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
		<h3>Classe: Serviço</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código</td>
				</tr>
				<tr>
					<td>ativo</td>
					<td>booolean</td>
					<td>Serviço ativo</td>
				</tr>
				<tr>
					<td>suspensao</td>
					<td>LocalDateTime</td>
					<td>Suspender a partir de</td>
				</tr>
				<tr>
					<td>periodoSuspensao</td>
					<td>int</td>
					<td>Período de suspenção em dias</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Consulta</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>tempoDuracao</td>
					<td>int</td>
					<td>Tempo de duração em minutos</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Exame</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>string</td>
					<td>Descrição</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Procedimento</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>string</td>
					<td>Descrição</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Especialidade</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código</td>
				</tr>
				<tr>
					<td>descricao</td>
					<td>sting</td>
					<td>Descrição</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Operadora</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código</td>
				</tr>
				<tr>
					<td>nome</td>
					<td>sting</td>
					<td>Nome</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Agenda</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
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
					<td>Confirmação da agenda</td>
				</tr>
				<tr>
					<td>realizado</td>
					<td>boolean</td>
					<td>Confirmação da realização</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>