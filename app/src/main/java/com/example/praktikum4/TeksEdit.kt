package com.example.praktikum4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier


@Composable
fun FormDataDiri(modifier: Modifier)
){
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJk by remember { mutableStateOf(value = "") }



}