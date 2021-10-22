package com.example.moneymanagerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter     //super(context, R.layout.single_list_app_item, utilsArrayList);
    (
    var context: Context,
    private val values: Array<String>,
    private val images: IntArray
) : BaseAdapter() {
    override fun getCount(): Int {
        return values.size
    }

    override fun getItem(i: Int): Any {
        return i
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val viewHolder: ViewHolder
        val result: View?
        if (convertView == null) {
            viewHolder = ViewHolder()
            val inflater = LayoutInflater.from(context)
            convertView = inflater.inflate(R.layout.single_list_item, parent, false)
            viewHolder.txtName = convertView.findViewById<View>(R.id.aNametxt) as TextView
            viewHolder.icon = convertView.findViewById<View>(R.id.appIconIV) as ImageView
            result = convertView
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
            result = convertView
        }
        viewHolder.txtName!!.text = values[position]
        viewHolder.icon!!.setImageResource(images[position])
        return convertView!!
    }

    private class ViewHolder {
        var txtName: TextView? = null
        var icon: ImageView? = null
    }
}