package com.klh.mycart.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.mycart.R
import com.klh.mycart.model.Product
import kotlinx.android.synthetic.main.item_list.view.*

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var productImage =itemView.findViewById<ImageView>(R.id.image)
        var productType = itemView.findViewById<TextView>(R.id.type)
        var productPrice = itemView.findViewById<TextView>(R.id.price)
        var productWeight = itemView.findViewById<TextView>(R.id.weight)
}

class ProductAdapter(val productList: ArrayList<Product>): RecyclerView.Adapter<ProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.productImage.setImageResource(productList[position].imgae)
        holder.productType.text = productList[position].type
        holder.productPrice.text = productList[position].price
        holder.productWeight.text = productList[position].weight

    }

}