<%-- 
    Document   : index
    Created on : 3 Oct 2021, 20:04:37
    Author     : nick
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="ooddresit.model.Shop" %>
<%@page import="ooddresit.model.Product" %>
<% Shop solent = new Shop("Solent shop"); %>
<% ArrayList<Product> productsList = solent.getList();%>

<% 
    String productValue = request.getParameter("productValue");

%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='css/solentestores.css' />
    </head>
    <body>
        <!-- TODO finish this! -->
       

        <p>Welcome to Solent E-Stores, where you can buy all your favourite products!</p>
        <p><strong>Now with shopping basket feature!</strong></p>
        <% 
        if(productValue != null) {
        %>
            You are searching for the product type: <strong><%=productValue%></strong>
        <%
        }
        %>
        
        <!-- use the variable passed through  the form to check if it match with any product type in the-->
        <p><%=productsList%></p>
        <p><%=productValue%></p>
        <form method="post" action="">
            <fieldset>
                <legend>Search for products</legend>
                <label for="productValue">Product:</label><br />
                <input name="productValue" id="productValue" type="text" /><br />
                <input type="submit" value="Go!" />
            </fieldset>
        </form>
        
        <% for(int i = 0; i < productsList.size(); i++){
            Product item = productsList.get(i);
            if(item.getProductType().equals(productValue) || item.getName().equals(productValue)){
        %>
                <p><%=item.getName()%></p>
                <p><%=item.getPrice()%></p>
        <%        
            }
        %>    
        <%
        }
        %>

        
        

    </body>
</html>

