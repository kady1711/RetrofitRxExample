package com.example.retrofitrxexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitrxexample.R
import com.example.retrofitrxexample.network.ElementListModel
import kotlinx.android.synthetic.main.element_layout.view.*
import java.util.*

class ElementListAdapter: RecyclerView.Adapter<ElementListAdapter.MyViewHolder>() {
    var elementListData = ArrayList<ElementListModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementListAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false )
        return MyViewHolder(inflater)

    }

    override fun onBindViewHolder(holder: ElementListAdapter.MyViewHolder, position: Int) {
        holder.bind(elementListData[position])
    }

    override fun getItemCount(): Int {
        return elementListData.size
    }

    class   MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val elementuserid = view.userid
        val elementid = view.eid
        val elementtitle = view.title
        val elemetbody = view.body

        fun bind(data : ElementListModel) {
            elementuserid.text = data.userid
            elementid.text = data.id.toString()
            elementtitle.text = data.title
            elemetbody.text=data.body
        }
    }
}