package com.techapps.magicstream.ui

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.techapps.magicstream.R
import com.techapps.magicstream.adapter.CustomAdapter
import com.techapps.magicstream.model.MeetingSchedule

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.my_drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        // to make the Navigation drawer icon always appear on the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val recyclerView = findViewById<RecyclerView>(R.id.RecylerMS)
        val showAll      = findViewById<TextView>(R.id.TVShowAll)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<MeetingSchedule>()

       data.add(MeetingSchedule(R.drawable.teacher1,"Rakesh Bhatt","01:00 hours", "Maths","Morning Session","5 jan","10:00 am","Thursday"))
        data.add(MeetingSchedule(R.drawable.teacher2,"Sagar Shukla","01:00 hours", "Physics","Morning Session","5 jan","11:00 am","Thursday"))
        data.add(MeetingSchedule(R.drawable.teacher3,"Shewta Jha","01:00 hours", "Chemistry","Morning Session","5 jan","12:00 am","Thursday"))
        data.add(MeetingSchedule(R.drawable.teacher4,"Bhawana Verma","01:00 hours", "English","Morning Session","5 jan","01:00 pm","Thursday"))
        data.add(MeetingSchedule(R.drawable.teacher1,"Lalit singh","01:00 hours", "Computer Science","Morning Session","5 jan","02:00 pm","Thursday"))


        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

        showAll.setOnClickListener {
            CustomDialog().show(supportFragmentManager, "MyCustomFragment")
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }


}