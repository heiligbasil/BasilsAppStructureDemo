package com.lambdaschool.basilsappstructuredemo.util

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    fun formatDate(date: Date): String {
        val format = SimpleDateFormat("dd/MM/yyyy")
        return format.format(date)
    }
}