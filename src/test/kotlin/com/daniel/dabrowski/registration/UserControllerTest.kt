package com.daniel.dabrowski.registration

import org.junit.Assert
import org.junit.Test

class UserControllerTest : TestSetupFongo() {

    @Test
    fun TotallTest() {
        val total = userRepo.findAll().count()
        Assert.assertEquals("Db should contains 5 entries",
                5, total)
    }

    //Json for post test
    // {"firstName":"Daniel;","email":"daniel.berlin@mail.com","contact":{"city":"Berlin","country":"Germany","telephone":555555,"adress":"address test line"}}

    //post test
    // search endpoint tests
    // bulk upload

}