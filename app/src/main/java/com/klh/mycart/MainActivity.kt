package com.klh.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.klh.mycart.adapter.ProductAdapter
import com.klh.mycart.model.Product
import kotlinx.android.synthetic.main.item_list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.cart_recycler_view)
        val productArray =ArrayList<Product>()
        productArray.add(Product(R.drawable.sugar, "Fine Grain Sugar", "Price - $20.00", "1 Kg"))
        productArray.add(Product(R.drawable.peanut, "Peanuts", "Price - $20.00", "3Kg"))
        productArray.add(Product(R.drawable.rice, "Dawat Rice", "Price - $80.00", "2Kg"))


        val productAdapter = ProductAdapter(productArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapter
    }
}
