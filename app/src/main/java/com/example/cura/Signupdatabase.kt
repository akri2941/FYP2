package com.example.cura

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SignUpDatabase(context: Context) : SQLiteOpenHelper(context,"SignUpdb", null,1 ) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE LoginUser(UserID INTEGER PRIMARY KEY AUTOINCREMENT, SignUpUsername TEXT, SignUpEmail TEXT, SignUpPassword TEXT)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}