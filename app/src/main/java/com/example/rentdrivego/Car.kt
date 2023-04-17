package com.example.rentdrivego

class Car (_carId: String, _make: String, _model: String, _ppd: Double, _year: Int) {

    private var carId: String
    private var make: String
    private var model: String
    private var pricePerDay: Double
    private var year: Int

    init {
        carId = _carId
        make = _make
        model = _model
        pricePerDay = _ppd
        year = _year
    }

    fun getCarId():String{
        return carId
    }
    fun getMake():String{
        return make
    }
    fun getModel():String{
        return model
    }
    fun getPPD():Double{
        return pricePerDay
    }
    fun getYear():Int{
        return year
    }


    fun setCarId(_carId: String){
        carId = _carId
    }
    fun setMake(_make: String){
        make = _make
    }
    fun setModel(_model: String){
        model = _model
    }
    fun setPPD(_ppd: Double){
        pricePerDay = _ppd
    }
    fun setYear(_year: Int){
        year = _year
    }

}