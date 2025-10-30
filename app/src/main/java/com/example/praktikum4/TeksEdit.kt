package com.example.praktikum4

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier


@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJk by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf( "") }
    var jenis by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki","Perempuan")

    Column (modifier = Modifier.padding(top = 50.dp)),
    var verticalArrangement = Arrangement.Top,
}