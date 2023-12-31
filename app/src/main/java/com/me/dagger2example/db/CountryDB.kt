package com.me.dagger2example.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.me.dagger2example.model.Country

@Database(entities = [Country::class], version = 1)
abstract class CountryDB : RoomDatabase() {

    abstract fun getCountryDAO() : CountryDAO

}