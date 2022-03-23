package com.iamkamrul.expandablerecyclerviewlistsample.viewholder

import android.view.View
import android.widget.TextView
import com.iamkamrul.expandablerecyclerviewlist.viewholder.ChildViewHolder
import com.phyothinzaraung.expandablerv.R
import com.phyothinzaraung.expandablerv.model.CategoryList

class CategoryListViewHolder(view:View) : ChildViewHolder(view){
    fun bind(categoryList : CategoryList){
        itemView.findViewById<TextView>(R.id.nameTv).text = categoryList.name
    }
}