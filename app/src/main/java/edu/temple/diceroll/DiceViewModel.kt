package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val selectedNumber = MutableLiveData<Int>()


    fun setSelectedNumber(number : Int){
        selectedNumber.value = number
    }

    fun getSelectedNumber() : LiveData<Int>{
        return selectedNumber
    }

}