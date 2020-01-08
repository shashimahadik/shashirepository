<%@page import="java.util.ArrayList"%>
<form action="InboxServlet">

<input type="submit" value="submit"/>


</form>


<%@page import= java.util.ArrayList %>

<%
  ArrayList<String>  al = (ArrayList<String>) request.getAttribute("data");
%>
<table border="3">

     <%
         for(String xx :al){
     %>
    <tr><td>
        <%
          out.print(xx);
        %>
</td> </tr>
       <%
         }
       %>



</table>

<%@page import="java.util.ArrayList"%>
<form action="InboxServlet">

<input type="submit" value="submit"/>






</table>