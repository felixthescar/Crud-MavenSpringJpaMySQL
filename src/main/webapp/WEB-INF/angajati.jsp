<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <Title>${username}</Title>
        <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >
        <script src="${pageContext.request.contextPath}/resources/scripts/script.js"></script>
    </head>
    <body>
        <div class="contextDiv">
		        <table>
		        	<tr>
		        		<td>ID</td>
		        		<td>Name</td>
		        		<td>Surname</td>
		        		<td>NPC</td>
		        		<td>Phone#</td>
		        		<td>Salary</td>
		        	</tr>
		        	<c:forEach items="${employees}" var="emp">
		        		<tr>
		        		<form action="editBtnEmp"method="post">
			        		<td><input name=empIdToEdit placeholder=${emp.id} value=${emp.id} /></td>
			        		<td><input name=empNameToEdit placeholder=${emp.name} value=${emp.name} /></td>
			        		<td><input name=empSurnameToEdit placeholder=${emp.surname} value=${emp.surname} /></td>
			        		<td><input name=empNpcToEdit placeholder=${emp.npc} value=${emp.npc} /></td>
			        		<td><input name=empPhoneNrToEdit placeholder=${emp.phoneNr} value=${emp.phoneNr} /></td>
			        		<td><input name=empSalaryToEdit placeholder=${emp.salary} value=${emp.salary} /></td>
			        		<td><button name=recordToEdit id=${emp.id} class="editButton"><img alt="edit" src="<%=request.getContextPath()%>/resources/icons/creion.png" style="width:20px; height:20px"/></button></td>
	        			</form>
			        		<td><form action="deleteBtnEmp"method=post><button name=recordToDelete value=${emp.id} class="deleteButton"><img alt="delete" src="<%=request.getContextPath()%>/resources/icons/gunoi.png" style="width:20px; height:20px"/></button></form></td>
		        		</tr>
		        	</c:forEach>
		        	<form action="addBtnEmp" method="post">
		        	<tr>
		        		<td><input placeholder= /></td>
			        	<td><input name=empNameToAdd placeholder=EmpName /></td>
			        	<td><input name=empSurnameToAdd placeholder=EmpSurname /></td>
			        	<td><input name=empNpcToAdd placeholder=EmpNpc /></td>
			        	<td><input name=empPhoneNrToAdd placeholder=EmpPhone# /></td>
			        	<td><input name=empSalaryToAdd placeholder=Leafa /></td>
			        	<td><button class="editButton"><img alt="add" src="<%=request.getContextPath()%>/resources/icons/plus.png" style="width:20px; height:20px"/></button></td>
		        	</tr>
		        	</form>
		        </table>
        </div>

        <div class="menuDiv">
            <h1>Menu</h1>
             <form action="ClientsPage" method="post"><button>Clienti</button></form>
            <h1></h1>
             <form action="EmployeesPage" method="post"><button>Angajati</button></form>
            <h1></h1>
             <form action="AccountsPage" method="post"><button>Conturi</button></form>

            <button class="github"><a href="https://github.com/felixthescar">Github</a></button>
        </div>
    </body>
</html>