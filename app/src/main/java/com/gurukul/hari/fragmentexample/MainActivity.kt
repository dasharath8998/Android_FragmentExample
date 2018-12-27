package com.gurukul.hari.fragmentexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.view.View
import kotlinx.android.synthetic.main.header.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

   var fManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome.setOnClickListener(this@MainActivity)
        btnCourses.setOnClickListener(this@MainActivity)
        btnMaterials.setOnClickListener(this@MainActivity)
        btnProjects.setOnClickListener(this@MainActivity)
    }

   override fun onClick(v: View?) {
        if(v != null) {
            when(v.id) {
                R.id.btnHome ->{
                    var tx = fManager.beginTransaction()
                    tx.replace(R.id.frag1,HomeFragment())
                    tx.addToBackStack("true")
                    tx.commit()
                }

                R.id.btnCourses -> {
                    var tx = fManager.beginTransaction()
                    tx.replace(R.id.frag1,CoursesFragment())
                    tx.addToBackStack("true")
                    tx.commit()
                }

                R.id.btnMaterials -> {
                    var tx = fManager.beginTransaction()
                    tx.replace(R.id.frag1,MaterialsFragment())
                    tx.addToBackStack("true")
                    tx.commit()
                }

                R.id.btnProjects -> {
                    var tx = fManager.beginTransaction()
                    tx.replace(R.id.frag1,ProjectsFragments())
                    tx.addToBackStack("true")
                    tx.commit()
                }
            }
        }
    }
}
