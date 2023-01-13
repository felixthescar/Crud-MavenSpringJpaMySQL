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