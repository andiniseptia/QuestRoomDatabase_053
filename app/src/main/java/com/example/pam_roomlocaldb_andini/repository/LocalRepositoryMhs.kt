package com.example.pam_roomlocaldb_andini.repository

import com.example.pam_roomlocaldb_andini.data.dao.MahasiswaDao
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}