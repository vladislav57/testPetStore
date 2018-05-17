<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <h2>
        Products for category : ${categoryName}
    </h2>

    <h3></h3>
    <table class="table">
        <tbody>
            <c:forEach items="${products}" var="p">
                <tr>
                    <td><a href="/showitems.jsp?productId=${p.productId}">${p.name}</a></td>
                    <td>${p.description}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</t:template>