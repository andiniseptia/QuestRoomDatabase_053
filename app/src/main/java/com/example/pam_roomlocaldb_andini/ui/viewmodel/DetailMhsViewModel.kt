package com.example.pam_roomlocaldb_andini.ui.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pam_roomlocaldb_andini.data.entity.Mahasiswa
import com.example.pam_roomlocaldb_andini.repository.LocalRepositoryMhs
import com.example.pam_roomlocaldb_andini.repository.RepositoryMhs
import com.example.pam_roomlocaldb_andini.ui.navigation.DestinasiDetail
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


// Data class untuk menampung data yang akan ditampilkan di UI

// Memindahkan data dari entity ke ui
fun Mahasiswa.toDetailUiEvent(): MahasiswaEvent {
    //Log.i("DetailMhsViewModel", "Converting Mahasiswa to MahasiswaEvent: $nim, $nama")
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}