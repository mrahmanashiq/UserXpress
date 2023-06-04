package org.userxpress.ocb

import grails.gorm.transactions.Transactional

@Transactional
class AppInitializationService {
    static initialize() {
        initMember()
    }

    private static initMember() {
        if (Member.count() == 0) {
            Member member = new Member()
            member.firstName = "System"
            member.lastName = "Administrator"
            member.email = "system@userxpress.com"
            member.password = "12345678"
            member.memberType = GlobalConfig.USER_TYPE.ADMINISTRATOR
            member.save(flash: true)
        }
    }
}
