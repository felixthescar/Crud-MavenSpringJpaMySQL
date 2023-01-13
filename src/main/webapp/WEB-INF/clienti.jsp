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
		        	</tr>
		        	<c:forEach items="${clients}" var="clt">
		        		<tr>
		        		<form action="editBtnClt"method="post">
			        		<td><input name=cltIdToEdit placeholder=${clt.id} value=${clt.id} /></td>
			        		<td><input name=cltNameToEdit placeholder=${clt.name} value=${clt.name} /></td>
			        		<td><input name=cltSurnameToEdit placeholder=${clt.surname} value=${clt.surname} /></td>
			        		<td><input name=cltNpcToEdit placeholder=${clt.npc} value=${clt.npc} /></td>
			        		<td><input name=cltPhoneNrToEdit placeholder=${clt.phoneNr} value=${clt.phoneNr} /></td>
			        		<td><button name=recordToEdit id=${clt.id} class="editButton"><img alt="edit" src="<%=request.getContextPath()%>/resources/icons/creion.png" style="width:20px; height:20px"/></button></td>
	        			</form>
			        		<td><form action="deleteBtnClt"method=post><button name=recordToDelete value=${clt.id} class="deleteButton"><img alt="delete" src="<%=request.getContextPath()%>/resources/icons/gunoi.png" style="width:20px; height:20px"/></button></form></td>
		        		</tr>
		        	</c:forEach>
		        	<form action="addBtnClt" method="post">
		        	<tr>
		        		<td><input placeholder= /></td>
			        	<td><input name=cltNameToAdd placeholder=ClName /></td>
			        	<td><input name=cltSurnameToAdd placeholder=ClSurname /></td>
			        	<td><input name=cltNpcToAdd placeholder=ClNpc /></td>
			        	<td><input name=cltPhoneNrToAdd placeholder=ClPhone# /></td>
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