package com.example.retrofitrxexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofitrxexample.network.ElementListModel
import com.example.retrofitrxexample.network.RetroInstance
import com.example.retrofitrxexample.network.RetroService
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.create

class ElementViewModel :ViewModel() {
    lateinit var elemetlist: MutableLiveData<ElementListModel>
    init {
        elemetlist = MutableLiveData()
    }

    fun getElementListObserver(): MutableLiveData<ElementListModel> {
        return elemetlist
    }

    fun makeApiCall() {

        val retroInstance  = RetroInstance.getRetroInstance().create(RetroService::class.java)
        retroInstance.getElementListFromApi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(getElementListObserverRx())
    }

    private fun getElementListObserverRx(): Observer<ElementListModel> {
        return object :Observer<ElementListModel>{
            override fun onComplete() {

            }

            override fun onError(e: Throwable) {
                elemetlist.postValue(null)
            }

            override fun onNext(t: ElementListModel) {
                elemetlist.postValue(t)
            }

            override fun onSubscribe(d: Disposable) {

            }
        }
    }
}