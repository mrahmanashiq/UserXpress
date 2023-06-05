package org.userxpress.ocb

class Contact {

    Integer id
    String name
    String image
    Member member

    Date dateCreated
    Date lastUpdated

    Set<ContactDetails> contactDetails // A set of contact details associated with the contact
    Set<ContactGroup> contactGroup // A set of contact groups which the contact belongs

    static belongsTo = [member: Member]  // the Contact class belongs to the Member class

    // one-to-many relationship with ContactDetails and ContactGroup
    static hasMany = [contactDetails: ContactDetails, contactGroup: ContactGroup]

    static constraints = {
        image(nullable: true, blank: true)
    }

    static mapping = {
        version(true) // enables optimistic locking for the Contact entity
        contactDetails(cascade: 'all-delete-orphan')
        /*
          the cascade behavior is set to all-delete-orphan, which means that when a Contact is
          deleted or removed from the association, any associated ContactDetails
          that are orphaned (not associated with any other Contact) will also be deleted.
        */
    }
}
