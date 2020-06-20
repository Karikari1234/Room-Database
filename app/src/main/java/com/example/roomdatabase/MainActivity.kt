package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdatabase.db.AppDatabase
import com.example.roomdatabase.db.entity.User
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var db: AppDatabase
    private lateinit var users: List<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = AppDatabase(applicationContext)
        //coroutineScope {
//            withContext(Dispatchers.IO){
//                users = getAllUsers()
//            }
//        }
//
//        if (users.isNotEmpty()){
//          username.text = users[0].firstName +" " + users[0].lastName
//        }
//        else{
//           username.text = "user not found"
//        }"
    }
//    private suspend fun getAllUsers():List<User>{
//        return withContext(Dispatchers.IO){
//            db.userDao().getAll()
//        }
//    }
}