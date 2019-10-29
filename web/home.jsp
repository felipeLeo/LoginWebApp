<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home</title>
    </head>
    <body>       
        <form method="post" action="./login">   <!-- For Servlet Login Validation -->
            <input type="hidden" name=methodType" value="login"/>
            <center>
                <h2 style="color: green">Pagina de login</h2>
            </center>
                    
            <table border="1" align="center">
                <tr>
                    <td>User Name :</td>
                    <td><input type="text" name="username" value="admin"/></td>
                </tr>
                <tr>
                    <td>Senha :</td>
                    <td><input type="password" name="password" value="admin"/></td>
                </tr>
                <tr/>
                <br/>
                <tr>
                    <td> Tipo de Função</td>
                    <td>
                        <select name="rolename">
                            <option value="">Selecione o tipo de função</option>
                            <option value="admin">Admin</option>
                            <option value="ops_user">Operador de Usuario</option>
                            <option value="ops_user">Financeiro</option>
                        </select>
                    </td>
                </tr>
                <tr/>
                <br/>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit" /></td>
                </tr> 
            </table>
        </form>
            
        <br>
        <center>Novo no site?? Registre-se: <a href="registration.jsp">Registre-se</a></center>
    </body>
</html>