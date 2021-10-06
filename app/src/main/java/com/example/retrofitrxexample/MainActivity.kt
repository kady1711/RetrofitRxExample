package com.example.retrofitrxexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitrxexample.adapter.ElementListAdapter
import com.example.retrofitrxexample.databinding.ActivityMainBinding
import com.example.retrofitrxexample.network.ElementListModel
import com.example.retrofitrxexample.viewmodel.ElementViewModel
import io.reactivex.Observer

class MainActivity : AppCompatActivity() {

    lateinit var viewModel:  ElementViewModel
    lateinit var elementListAdapter: ElementListAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //loadAPIData()


    }



//
//    fun loadAPIData() {
//
//        viewModel = ViewModelProvider(this).get(ElementViewModel::class.java)
//        viewModel.getElementListObserver().observe(this, Observer<ElementListModel>{
//            if(it != null) {
//                elementListAdapter.elementListData = it.items
//                elementListAdapter.notifyDataSetChanged()
//            }
//            else {
//                Toast.makeText(this, "Error in fetching data", Toast.LENGTH_SHORT).show()
//            }
//        })
//        viewModel.makeApiCall()
//    }
}