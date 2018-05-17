<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <h2></h2>

    <h3></h3>
    <div style="text-align: center; margin-top:50px;">
        <map name="pestoremap">
            <area alt="Birds" coords="72,2,280,250" shape="rect" href="showproducts.jsp?categoryName=Birds"/>
            <area alt="Fish" coords="2,180,72,250" shape="rect" href="showproducts.jsp?categoryName=Fish"/>
            <area alt="Dogs" coords="60,250,130,320" shape="rect" href="showproducts.jsp?categoryName=Dogs"/>
            <area alt="Reptiles" coords="140,270,210,340" shape="rect" href="showproducts.jsp?categoryName=Reptiles"/>
            <area alt="Cats" coords="225,240,295,310" shape="rect" href="showproducts.jsp?categoryName=Cats"/>
            <area alt="Birds" coords="280,180,350,250" shape="rect" href="showproducts.jsp?categoryName=Birds"/>
        </map>
        <img src="/resources/splash.gif" border="0" width="350" height="355" align="middle" usemap="#pestoremap" alt="Welcome to YAPS PetStore"/>
    </div>
</t:template>