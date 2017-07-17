package com.example.atilsamancioglu.kotlinfoursquareclone

import android.app.Application
import com.parse.ParseACL
import com.parse.ParseUser
import com.parse.Parse



/**
 * Created by atilsamancioglu on 16/07/2017.
 */
class StarterApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this)

        // Add your initialization code here
        Parse.initialize(this)

        ParseUser.enableAutomaticUser()
        val defaultACL = ParseACL()

        defaultACL.publicReadAccess = true
        defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)
    }

}