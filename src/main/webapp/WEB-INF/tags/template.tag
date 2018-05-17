<%@tag description="Template Tag" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<html>
    <head>
        <title>YAPS PerStore</title>
        <t:css></t:css>
        <t:favicon></t:favicon>
    </head>
    <body data-gr-c-s-loaded="true">
        <div id="wrap">
            <t:navbar></t:navbar>
            <div class="container">
                <div class="page-header"></div>
                <t:navigation></t:navigation>
                <div class="col-md-1"></div>
                <div class="col-md-9 well">
                    <jsp:doBody/>
                </div>
            </div>
        </div>
        <t:footer></t:footer>
        <t:footer-scripts></t:footer-scripts>
    </body>
</html>