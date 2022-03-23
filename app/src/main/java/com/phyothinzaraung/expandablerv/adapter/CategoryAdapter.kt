package com.phyothinzaraung.expandablerv.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.iamkamrul.expandablerecyclerviewlist.adapter.ExpandableRecyclerAdapter
import com.iamkamrul.expandablerecyclerviewlist.model.ParentListItem
import com.iamkamrul.expandablerecyclerviewlistsample.viewholder.CategoryListViewHolder
import com.iamkamrul.expandablerecyclerviewlistsample.viewholder.CategoryViewHolder
import com.phyothinzaraung.expandablerv.R
import com.phyothinzaraung.expandablerv.model.Category
import com.phyothinzaraung.expandablerv.model.CategoryList


class CategoryAdapter: ExpandableRecyclerAdapter<CategoryViewHolder, CategoryListViewHolder>() {
    override fun onBindChildViewHolder(
        childViewHolder: CategoryListViewHolder,
        position: Int,
        childListItem: Any
    ) {
        val data = childListItem as CategoryList
        childViewHolder.bind(data)
    }

    override fun onBindParentViewHolder(
        parentViewHolder: CategoryViewHolder,
        position: Int,
        parentListItem: ParentListItem
    ) {
        val data = parentListItem as Category
        parentViewHolder.bind(data)
    }

    override fun onCreateChildViewHolder(parentViewGroup: ViewGroup): CategoryListViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category_list, parentViewGroup, false)
        return CategoryListViewHolder(view)
    }

    override fun onCreateParentViewHolder(parentViewGroup: ViewGroup): CategoryViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category, parentViewGroup, false)
        return CategoryViewHolder(view)
    }
}