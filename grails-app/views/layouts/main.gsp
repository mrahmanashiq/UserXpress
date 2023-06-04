<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
    <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>

    <script type="text/javascript">
        <g:if test="${flash?.message && flash?.message?.info}">
        jQuery(document).ready(function () {
            OCB.messageBox.showMessage(Boolean(${flash.message?.success}), "${flash.message?.info}");
        });
        </g:if>
    </script>

    <g:layoutHead/>

</head>

<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="/">UserXpress</a>
        <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse"
                data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        %{--Member Action Menu--}%
        <ul class="navbar-nav ml-auto">
            <UIHelper:memberActionMenu/>
        </ul>
    </nav>
</header>

<div class="container-fluid">
    <div class="row">

        <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-light sidebar">
            <ul class="list-group">
                <UIHelper:leftNavigation/>
            </ul>
        </nav>

        <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3 mt-5">
            <g:layoutBody/>
        </main>
    </div>
</div>

<asset:javascript src="application.js"/>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>
