package com.example.pam_roomlocaldb_andini.repository

import android.content.Context
import com.example.pam_roomlocaldb_andini.data.database.KrsDatabase
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa
import com.example.pam_roomlocaldb_andini.dependenciesinjection.InterfaceContainerApp
import kotlinx.coroutines.flow.Flow

// Blueprint yang merepresentasikan dari DAO
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    // Sama persis seperti yang ada di MahasiswaDao
    fun getAllMhs(): Flow<List<Mahasiswa>>

    fun getMhs(nim: String): Flow<Mahasiswa>

    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    suspend fun updateMhs(mahasiswa: Mahasiswa)
}
