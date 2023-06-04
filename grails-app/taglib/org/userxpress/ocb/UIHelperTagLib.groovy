package org.userxpress.ocb

class UIHelperTagLib {

    static namespace = "UIHelper"

    AuthenticationService authenticationService

    def renderErrorMessage = { attrs, body ->
        def model = attrs.model
        String fieldName = attrs.fieldName
        String errorMessage = attrs.errorMessage ? g.message(code: attrs.errorMessage) : g.message(code: "invalid.input")
        if (model && model.errors && model.errors.getFieldError(fieldName)) {
            out << "<small class='form-text text-danger''><strong>${errorMessage}</strong></small>"
        }
    }

    def memberActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown">'
        out << '<a class="nav-link dropdown-toggle" href="#" id="memberDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">'
        out << authenticationService.getMemberName()
        out << '</a>'
        out << '<div class="dropdown-menu" aria-labelledby="memberDropdown">'
        out << '<a class="dropdown-item" href="' + g.createLink(controller: "authentication", action: "logout") + '">' + g.message(code: "logout") + '</a>'
        out << '</div></li>'
    }

    def leftNavigation = { attrs, body ->
        List navigations = [
                [controller: "dashboard", action: "index", name: "dashboard"],
        ]

        if (authenticationService.isAdministratorMember()) {
            navigations.add([controller: "member", action: "index", name: "member"])
        }

        navigations.each { menu ->
            out << '<li class="list-group-item">'
            out << g.link(controller: menu.controller, action: menu.action) { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }
}
