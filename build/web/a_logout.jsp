<%-- 
    Document   : a_logout
    Created on : Oct 16, 2018, 10:20:46 PM
    Author     : utkarsha
--%>

<%
   session.invalidate();
   response.sendRedirect("admin_login.jsp");
%>
