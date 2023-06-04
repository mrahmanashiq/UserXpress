package userxpress

import org.userxpress.ocb.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()
    }
    def destroy = {
    }
}
