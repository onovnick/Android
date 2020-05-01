package com.example.movieproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.IccOpenLogicalChannelResponse
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieproject.API.GetDataService
import com.example.movieproject.API.ReqResponse
import com.example.movieproject.API.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.create
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val recyclerView = findViewById(R.id.recycleView) as RecyclerView
        val models: ArrayList<String> = ArrayList()
        for (i in 1..5){
            models.add("Film nr." +1)
        }


        recyclerView.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL, false)


        val nikita = ArrayList<Model>()
        recyclerView.adapter=MyAdapter(nikita)


        val service = RetrofitClient().getRetrofitClient()?.create<GetDataService>(GetDataService::class.java)
        val request = service?.getData()
        request?.enqueue(object : retrofit2.Callback<ReqResponse> {
            override fun onFailure(call: Call<ReqResponse>, t: Throwable) {
                Toast.makeText(baseContext, "FAIL", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<ReqResponse>, response: Response<ReqResponse>) {
                nikita.clear()
                response.body()?.let{
                    nikita.addAll(it.model)
                    recyclerView.adapter?.notifyDataSetChanged()
                }
            }

        })

    }

}


