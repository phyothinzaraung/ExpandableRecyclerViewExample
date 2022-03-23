package com.phyothinzaraung.expandablerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iamkamrul.expandablerecyclerviewlist.listener.ExpandCollapseListener
import com.phyothinzaraung.expandablerv.adapter.CategoryAdapter
import com.phyothinzaraung.expandablerv.model.Category
import com.phyothinzaraung.expandablerv.model.CategoryList

class MainActivity : AppCompatActivity() {
    private val adapter = CategoryAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = listOf(
            Category("Action", listOf(CategoryList("My Spy"),CategoryList("BloodShot"),CategoryList("Midway"))),
            Category("Drama", listOf(CategoryList("The Godfather"),CategoryList("The Dark Knight"))),
            Category("War", listOf(CategoryList("Apocalypse Now"),CategoryList("Saving Private Ryan")))
        )

        val categoryRecyclerView = findViewById<RecyclerView>(R.id.categoryListRv)
        categoryRecyclerView.setHasFixedSize(true)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter.setExpandCollapseListener(object :ExpandCollapseListener{
            override fun onListItemCollapsed(position: Int) {
                Toast.makeText(applicationContext,  "collapse $position", Toast.LENGTH_SHORT).show()
            }

            override fun onListItemExpanded(position: Int) {
                Toast.makeText(applicationContext,  "expand $position", Toast.LENGTH_SHORT).show()
            }

        })
        categoryRecyclerView.adapter = adapter
        adapter.setExpandableParentItemList(data)
    }
}