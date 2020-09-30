package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductsAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    inner class ProductHolder(itemView: View) : ViewHolder(itemView){
        // Get ids of productImage, productName, and productPrice
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            // Get resourceId of the product image
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)

            productName?.text = product.title
            productPrice?.text = product.price
        }
    }

    // fun onCreateViewHolder() pulls the product_list_item template into the view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    // fun onBindViewHolder() binds the selected product
    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    // fun getItemCount() returns the total number of products
    override fun getItemCount(): Int {
        return products.count()
    }
}