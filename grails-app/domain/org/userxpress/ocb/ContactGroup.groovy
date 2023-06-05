package org.userxpress.ocb

class ContactGroup {

    Integer id
    String name
    Member member // member who owns this contact group

    Date dateCreated
    Date lastUpdated

    static belongsTo = Contact // belongs to the Contact class
    static hasMany = [contact: Contact] // one-to-many relationship with the Contact class

    static constraints = {
        name(blank: false, nullable: false)
        member(nullable: true)
    }

    static mapping = {
        version(true)
    }

}
