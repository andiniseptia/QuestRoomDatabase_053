package com.example.pam_roomlocaldb_andini

import android.app.Application
import com.example.pam_roomlocaldb_andini.dependenciesinjection.ContainerApp
import com.example.pam_roomlocaldb_andini.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    // Fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        /* Membuat instance ContainerApp */
        containerApp = ContainerApp(this)
        // Instance adalah object yang dibuat dari class
    }
}