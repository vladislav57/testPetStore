<%@tag description="Navbar Tag" pageEncoding="UTF-8"%>
<form id="navbar" name="navbar" method="post" action="/shopping/main.jsp" enctype="application/x-www-form-urlencoded">
    <input type="hidden" name="navbar" value="navbar">

    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="/shopping/main.jsp" class="navbar-brand">Yaps Petstore EE 7</a>
            </div>

            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/admin/category/search.jsp">Admin</a></li>
                    <!--<li><a href="" class="menu-en">English</a></li>-->
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Languages<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a id="navbar:j_idt20" href="#" onclick="mojarra.ab(this,event,'action',0,'@form');return false" class="menu-fr">Français</a>
                            </li>
                            <li><a id="navbar:j_idt23" href="#" onclick="mojarra.ab(this,event,'action',0,'@form');return false" class="menu-en">English</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                    </li>
                    <li>
                    </li>
                    <li><a href="/applicationPetstore/shopping/signon.xhtml">Log in
                        <i class="fa fa-sign-in" aria-hidden="true"></i></a>
                    </li>
                    <li>
                    </li>

                    <li>
                        <div class="navbar-form navbar-left" role="search">
                            <div class="form-group"><input type="text" name="navbar:j_idt39" class="form-control"></div>
                            <input type="submit" name="navbar:j_idt41" value="Search" class="btn btn-default">
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</form>