package com.ahmetturkmen.mobilodev

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        setSupportActionBar(toolbar)

        buton.setOnClickListener { val  gtr = Intent(this, HakkimdaBilgiActivity::class.java)
        startActivity(gtr)
        }



        if(checkConnection(context)){
            Toast.makeText(this,"İnternet Bağlantısı Başarılı",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"İnternet Bağlantısı Başarısız", Toast.LENGTH_SHORT).show()
        }
    }
    fun checkConnection(context: Context) : Boolean{
        val connectivityManager : ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo : NetworkInfo? = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected


    }






}