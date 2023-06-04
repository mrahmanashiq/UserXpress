package org.userxpress.ocb

class AuthenticationController {

    AuthenticationService authenticationService
    MemberService memberService

//  This method is responsible for handling the login action.
//  when a user accesses the login page directly.
    def login() {
        if (authenticationService.isAuthenticated()) {
            redirect(controller: "dashboard", action: "index")
        }
    }


//  This method is invoked when the login form is submitted
    def doLogin() {
        if (authenticationService.doLogin(params.email, params.password)) {
            redirect(controller: "dashboard", action: "index")
        } else {
            flash.message = AppUtil.infoMessage("Email Address or Password not Valid.", false)
            redirect(controller: "authentication", action: "login")
        }
    }


    def logout() {
        session.invalidate()
        redirect(controller: "authentication", action: "login")
    }

/*
    * This method is responsible for rendering the registration page.
    * It prepares the member object ([member: flash.redirectParams]) to be used in the registration form.
*/
    def registration() {
        [member: flash.redirectParams]
    }


//    This method is called when the registration form is submitted.
    def doRegistration() {
        def response = memberService.save(params)
        if (response.isSuccess) {
            authenticationService.setMemberAuthorization(response.model)
            redirect(controller: "dashboard", action: "index")
        } else {
            flash.redirectParams = response.model
            redirect(controller: "authentication", action: "registration")
        }
    }
}
