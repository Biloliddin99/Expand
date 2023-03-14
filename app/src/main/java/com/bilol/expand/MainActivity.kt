package com.bilol.expand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilol.expand.adapters.MyExpandAdapter
import com.bilol.expand.databinding.ActivityMainBinding
import com.bilol.expand.models.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myExpandAdapter: MyExpandAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MyData.addMap()

        myExpandAdapter = MyExpandAdapter(MyData.titleList, MyData.map)
        binding.myExpandView.setAdapter(myExpandAdapter)

        binding.myExpandView.setOnChildClickListener { expandableListView, view, i, i2, l ->
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("name", MyData.map[MyData.titleList[i]]?.get(i2))
            startActivity(intent)
            true
        }

    }
}