<meta name="layout" content="public"/>

<div class="card">
    <div class="card-header mt-5">
        Member Registration
    </div>

    <div class="card-body">
        <g:form controller="authentication" action="doRegistration">
            <g:render template="/member/form"/>
            <g:submitButton name="registration" value="Registration" class="btn btn-primary"/>
            <g:link controller="authentication" action="login" class="btn btn-primary back-to-login-btn"><g:message
                    code="back.to.login"/></g:link>
        </g:form>
    </div>
</div>

<style>
.back-to-login-btn {
    background-color: #337ab7;
    opacity: 0.9;
    color: #fff;
    border-color: #2e6da4;
}

.back-to-login-btn:hover,
.back-to-login-btn:focus {
    background-color: #286090;
    opacity: 1;
    color: #fff;
    border-color: #204d74;
}
</style>
