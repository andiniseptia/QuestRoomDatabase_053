package com.example.pam_roomlocaldb_andini.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pam_roomlocaldb_andini.data.dao.MahasiswaDao
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa

// Mendefinisikan database dengan tabel Mahasiswa
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    // Mendefinisikan fungsi untuk mengakses data Mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao


}