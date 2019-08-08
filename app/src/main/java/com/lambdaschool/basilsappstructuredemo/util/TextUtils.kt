package com.lambdaschool.basilsappstructuredemo.util

import java.text.NumberFormat

object TextUtils {

    fun formatCustomerName(first: String, last: String): String {
        return "$last, $first"
    }

    fun formatCurrency(price: Double): String {
        return NumberFormat.getCurrencyInstance().format(price)
    }

    fun formatPercent(discount: Double): String {
        return "${NumberFormat.getPercentInstance().format(discount)} discount"
    }
}