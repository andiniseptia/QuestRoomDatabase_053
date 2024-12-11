package com.example.pam_roomlocaldb_andini.repository

import android.content.Context
import com.example.pam_roomlocaldb_andini.data.database.KrsDatabase
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa
import com.example.pam_roomlocaldb_andini.dependenciesinjection.InterfaceContainerApp

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}
