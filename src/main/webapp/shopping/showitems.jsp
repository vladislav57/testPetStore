<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <h2>
        Items for product : ${ItemDescription}
    </h2>

    <h3></h3>
    <table class="table">
        <tbody>
            <c:forEach items="${items}" var="i">
                <tr>
                    <td><img src="/resources/images/${i.pictureName}.jpg" alt="Item"></td>
                    <td><a href="/showitem.jsp">${i.description}</a></td>
                    <td>${i.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</t:template>