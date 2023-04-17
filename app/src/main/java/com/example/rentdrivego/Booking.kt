package com.example.rentdrivego

class Booking (_bookingId: String, _carId: String, _userId: String, _rentalStartDate: String, _rentalEndDate: String) {

    private var bookingId: String
    private var carId: String
    private var userId: String
    private var rentalStartDate: String
    private var rentalEndDate: String

    init {
        bookingId = _bookingId
        carId = _carId
        userId = _userId
        rentalStartDate = _rentalStartDate
        rentalEndDate = _rentalEndDate
    }

    fun getBookingId():String{
        return bookingId
    }
    fun getUserId():String{
        return userId
    }
    fun getCarId():String{
        return carId
    }
    fun getRentalStartDate():String{
        return rentalStartDate
    }
    fun getRentalEndDate():String{
        return rentalEndDate
    }

    fun setBookingId(_bookingId: String){
        bookingId = _bookingId
    }
    fun setUserId(_userId: String){
        userId = _userId
    }
    fun setCarId(_carId: String){
        carId = _carId
    }
    fun setRentalStartDate(_rentalStartDate: String){
        rentalStartDate = _rentalStartDate
    }
    fun setRentalEndDate(_rentalEndDate: String){
        rentalEndDate = _rentalEndDate
    }

}