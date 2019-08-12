<%-- 
    Document   : c_logout
    Created on : Oct 16, 2018, 10:13:46 PM
    Author     : utkarsha
--%>

<%
    session.invalidate();
    response.sendRedirect("customer_login1.jsp");
%>
