package com.example.pam_roomlocaldb_andini.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    //Query untuk mendapat seluruh data mahasiswa yang diurutkan dari A-Z, A = Ascending
    //Banyak data menggunakan List
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    //Untuk membungkus data
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    //Query untuk mendapat data berdasarkan nim mahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}