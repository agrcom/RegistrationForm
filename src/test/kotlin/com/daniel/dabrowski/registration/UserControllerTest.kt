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
}