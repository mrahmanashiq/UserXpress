package org.userxpress.ocb

import grails.converters.JSON

class ContactDetailsController {

    ContactDetailsService contactDetailsService
    ContactService contactService

    def create() {
        println('Create CD')
        Contact contact = contactService.get(params.id)
        println(contact)
        [contactDetails: contactDetailsService.getContactDetailsListByContact(contact)]
    }

    def delete(Integer id){
        render(contactDetailsService.deleteContactDetails(id) as JSON)
    }
}
