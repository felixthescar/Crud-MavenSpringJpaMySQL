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
		        		<td>AccountId</td>
		        		<td>ClientId</td>
		        		<td>EmployeeId</td>
		        		<td>Balance</td>
		        	</tr>
		        	<c:forEach items="${accounts}" var="acc">
		        		<tr>
		        		<form action="editBtnAcc"method="post">
			        		<td><input name=idToEdit placeholder=${acc.id} value=${acc.id} /></td>
			        		<td><input name=clIdToEdit placeholder=${acc.clientId} value=${acc.clientId} /></td>
			        		<td><input name=empIdToEdit placeholder=${acc.empId} value=${acc.empId} /></td>
			        		<td><input name=balanceToEdit placeholder=${acc.balance} value=${acc.balance} /></td>
			        		<td><button name=recordToEdit id=${acc.id} class="editButton"><img alt="edit" src="<%=request.getContextPath()%>/resources/icons/creion.png" style="width:20px; height:20px"/></button></td>
	        			</form>
			        		<td><form action="deleteBtnAcc"method=post><button name=recordToDelete value=${acc.id} class="deleteButton"><img alt="delete" src="<%=request.getContextPath()%>/resources/icons/gunoi.png" style="width:20px; height:20px"/></button></form></td>
		        		</tr>
		        	</c:forEach>
		        	<form action="addBtnAcc" method="post">
		        	<tr>
		        		<td><input placeholder= /></td>
			        	<td><input name=clIdToAdd placeholder=ClientId /></td>
			        	<td><input name=empIdToAdd placeholder=EmployeeId /></td>
			        	<td><input name=balanceToAdd placeholder=Balance /></td>
			        	<td><button class="editButton"><img alt="edit" src="<%=request.getContextPath()%>/resources/icons/plus.png" style="width:20px; height:20px"/></button></td>
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