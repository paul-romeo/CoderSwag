package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {
    val context = context
    val categories = categories

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Import the category_list_item.xml into categoryView
        val categoryView: View =
            LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        // Get the categoryName and categoryImage from categoryView
        val categoryImage = categoryView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = categoryView.findViewById<TextView>(R.id.categoryName)

        val category = categories[position]

        // Set image resource of the category image based on the resourceId on drawable
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        with(categoryImage) {
            setImageResource(resourceId)
        }
        println(resourceId)

        // Get the categoryName.text

        categoryName.text = category.title

        return categoryView


    }
}