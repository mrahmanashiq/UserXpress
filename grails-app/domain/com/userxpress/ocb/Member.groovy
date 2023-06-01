package com.userxpress.ocb

class Member {

    Integer id
    String firstName
    String lastName
    String email
    String password
    String memberType = GlobalConfig.USER_TYPE.REGULAR_M1EMBER
    String identityHash
    Date identityHashLastUpdate
    Boolean isActive = true

    Date dateCreate
    Date lastUpdate

    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        lastName(nullable: true)
        identityHash(nullable: true)
        identityHashLastUpdate(nullable: true)
    }

    def beforeInsert (){
        this.password = this.password.encodeAsMD5()
    }


    def beforeUpdate(){
        this.password = this.password.encodeAsMD5()
    }

    static mapping = {
        version(false)
        contact(cascade: 'all-delete-orphan')
        contactGroup(cascade: 'all-delete-orphan')
    }
}
