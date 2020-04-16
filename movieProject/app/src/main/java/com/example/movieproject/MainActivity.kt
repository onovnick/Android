package com.example.movieproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

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
        nikita.add(Model("Movie1" , " Description1" , "https://cs9.pikabu.ru/post_img/2017/02/19/4/1487481861170016714.jpg"))
        nikita.add(Model("Movie2" , " Description2" , "https://i.pinimg.com/originals/1a/4b/58/1a4b5892675d986caeb10181138d584d.jpg"))
        nikita.add(Model("Movie3" , " Description3" , "https://b1.filmpro.ru/c/554011.jpg"))
        nikita.add(Model("Movie4" , " Description4" , "https://www.kino-teatr.ru/movie/posters/big/3/129673.jpg"))
        nikita.add(Model("Movie5" , " Description5" , "https://lh3.googleusercontent.com/proxy/FR1ub75weO_r61w1betXERXT2mOC54ylC0L8iIHYvxd-2bUXckN8Vm0Qu4dd_e52LmykgtdNNMWNhhMsSkoWm1-wL3w2xccWbEN14Qdo3YYiBvVK"))
        nikita.add(Model("Movie6" , " Description6" , "https://www.kino-teatr.ru/movie/posters/big/7/133117.jpg"))
        nikita.add(Model("Movie7" , " Description7" , "https://68.img.avito.st/640x480/5516422068.jpg"))
        nikita.add(Model("Movie8" , " Description8" , "https://pbs.twimg.com/media/D7kszGuXkAAwvAY.jpg"))
        nikita.add(Model("Movie9" , " Description9" , "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS0p8P4HohUkNhZjrp7VmPxC_6XXohdwAOseixC4WlRsiFk6NUS"))
        recyclerView.adapter=MyAdapter(nikita)


    }

}


