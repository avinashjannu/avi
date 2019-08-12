<%-- 
    Document   : f_logout
    Created on : Oct 16, 2018, 10:08:33 PM
    Author     : utkarsha
--%>

<%
    session.invalidate();
    response.sendRedirect("farmer_login1.jsp");
%>
