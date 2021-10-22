package com.example.moneymanagerapp



import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Category  : AppCompatActivity() {
    var images = intArrayOf(R.drawable.restaurant,R.drawable.airplane,R.drawable.heartbeat,
        R.drawable.car, R.drawable.insurance, R.drawable.invoice,R.drawable.joystick
        ,R.drawable.publictransport,R.drawable.responsive,R.drawable.shoppingcart,R.drawable.tax,R.drawable.plus)
    var cate = arrayOf("Food","Flight","Health","Car", "Insurance", "Bills","Entertainment","Transport"
        ,"Electronics","Shopping","Tax","Others")
    var lView: ListView? = null
    var lAdapter: ListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        lView = findViewById<View>(R.id.androidList) as ListView
        lAdapter = ListAdapter(this@Category,cate,images)
        lView!!.adapter = lAdapter
        lView!!.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this@Category,
                cate[i],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}