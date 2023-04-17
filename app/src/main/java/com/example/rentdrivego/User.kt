package com.example.rentdrivego


data class User (val _userId: String, val _name: String, val _phone: String, val _email: String) {

    private var userId: String
    private var name: String
    private var phone: String
    private var email: String


    init {
        email = _email
        name = _name
        userId = _userId
        phone = _phone
    }

    fun getUserId():String{
        return userId
    }
    fun getName():String{
        return name
    }
    fun getPhone():String{
        return phone
    }
    fun getEmail():String{
        return email
    }


    fun setUserId(_userId: String){
        userId = _userId
    }
    fun setName(_name: String){
        name = _name
    }
    fun setPhone(_phone: String){
        phone = _phone
    }
    fun setEmail(_email: String){
        email = _email
    }

}