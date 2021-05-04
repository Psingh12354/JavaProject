<html>
    <title>Sample Example </title>
    <body>
        <form method="post" action="index.jsp">
            <fieldset style="width:30%; background-color:#b3d1ff">
                <h2><center> Factorial</center></h2>
                <hr>
  
                <table>
                <tr>
                    <td>Enter first Value:</td>
                    <td> <input type="text" name="t1" value=""></td>
                </tr>
      
                <tr>
                    <td></td>
                    <td><input type="submit" name="result" value="Check result!"></td>
                </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>

//jsp

<%@ page errorPage="error.jsp" %>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<html>
    <body>
        <H1><center>Result for <%=request.getParameter("a1")%></center></H1>
<%
int num=Integer.parseInt(request.getParameter("t1"));
%>
    <%!
    int factorial(int n)
    {
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    %>
       <%
        out.println("The factorial of  " +num+"  is : " + factorial(num));
    %>
    </body> 
</html>jsp
