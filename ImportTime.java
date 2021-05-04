<html>
    <title>Sample Example </title>
    <body>
        <form method="post" action="index.jsp">
            <fieldset style="width:30%; background-color:#b3d1ff">
                <hr>
                <font size=5 face="Times New Roman">
                    <td><input type="submit" name="result" value="Check result!"></td>
                </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>

//jsp
<%@ page errorPage="error.jsp" %>
<%@ page import = "java.io.,java.util., javax.servlet.*" %>
<html>
    <body>
        <H1><center>Result for <%=request.getParameter("a1")%></center></H1>
    	<%
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      	%>
    </body>
</html>
