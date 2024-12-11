package com.example.pam_roomlocaldb_andini.dependenciesinjection

import android.content.Context
import com.example.pam_roomlocaldb_andini.data.database.KrsDatabase
import com.example.pam_roomlocaldb_andini.repository.LocalRepositoryMhs
import com.example.pam_roomlocaldb_andini.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp (private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}