<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Member Login</title>
    <meta name="layout" content="public"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
    html, body {
        height: 100%;
    }

    body {
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .account-wall {
        background-color: #f7f7f7;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .login-title {
        font-size: 24px;
        margin-bottom: 20px;
        text-align: center;
    }

    .form-control {
        margin-bottom: 10px;
    }

    .register-btn {
        font-size: 14px;
        margin-top: 10px;
        padding: 8px 12px;
        border-radius: 4px;
    }

    </style>
</head>

<body>
<div id="global-wrapper">
    <div id="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-md-6 col-lg-4 mx-auto">
                    <h3 class="text-center login-title mt-5">UserXpress Member Login</h3>
                    <hr>

                    <div class="account-wall">
                        <g:form controller="authentication" action="doLogin" class="form-signin">
                            <g:textField name="email" class="form-control" placeholder="Email" required="required"/>
                            <g:passwordField name="password" class="form-control" placeholder="Password" required="required"/>
                            <g:submitButton class="btn btn-lg btn-primary btn-block" name="login" value="Login"/>
                        </g:form>

                        <div class="text-center">
                            <g:link controller="authentication" action="registration" class="register-btn btn btn-sm btn-link">Member Registration</g:link>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
