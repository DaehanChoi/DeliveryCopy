package com.example.shuttle.http

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.shuttle.R
import com.example.shuttle.model.UserData
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import java.io.IOException
import java.net.URL

class HttpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http)
        // Gson을 이용하여 데이터 모델을 json형태로 변
        val gson = Gson()
        val json = gson.toJson(UserData("Daehan", 30, "Sujin"))
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            HttpCheckId("http://3.139.68.152:5000/sign_up", json)
            Log.d("HttpActivity", "Clicked")
        }
    }

    fun HttpCheckId(ipAddress: String, data: String ) {
        val url =  ipAddress
        val client = OkHttpClient()
        val rbody = RequestBody.create("application/json".toMediaType(), data)
        val request = Request.Builder().url(url).post(rbody).build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                //에러 메세지 출력
                Log.d("Error", e.toString())
            }

            override fun onResponse(call: Call, response: Response) {
                Log.d("Http", response.toString())
                // post 결과 불러오기  ㅠ toString으로 하면 안됩니당
                Log.d("Http", response.body!!.string())
            }
        })
    }
}