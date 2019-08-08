package com.lambdaschool.basilsappstructuredemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.basilsappstructuredemo.util.*
import com.lambdaschool.basilsappstructuredemo.R
import com.lambdaschool.basilsappstructuredemo.application.StructureApplication
import com.lambdaschool.basilsappstructuredemo.model.Order
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Order Details"
        displayOrderDetails((application as StructureApplication).appOrder)
    }

    private fun displayOrderDetails(order: Order) {
        discount_view.text = TextUtils.formatPercent(order.discount)
        orderDate_view.text = DateUtils.formatDate(order.orderDate)
        price_view.text = TextUtils.formatCurrency(order.price)
        tax_view.text = TextUtils.formatCurrency(order.tax)
        customer_first_view.text = TextUtils.formatCustomerName(order.customerFirstName,order.customerLastName)
    }
}
