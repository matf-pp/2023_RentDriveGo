package com.example.rentdrivego

import com.google.firebase.database.DatabaseReference

class UploadDownload {
    private lateinit var database: DatabaseReference

    fun writeUser(user: User){
        database.child("users").child(user.getUserId()).setValue(user)
    }

    fun writeCar(car: Car){
        database.child("cars").child(car.getCarId()).setValue(car)
    }

    fun writeBooking(booking: Booking){
        database.child("bookings").child(booking.getBookingId()).setValue(booking)
    }

    // Treba implementirati citanje korisnika,auta i termina na osnovu njihovih id-eva
    fun readUser(uid: String): User? {
        return null
    }

    fun readCar(cid: String): Unit? {
        return null
    }

    fun readBooking(bid: String): Unit? {
        return null
    }
}