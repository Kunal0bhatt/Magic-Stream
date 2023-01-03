package com.techapps.magicstream.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.techapps.magicstream.R
import com.techapps.magicstream.model.MeetingSchedule

class CustomAdapter(private val mList: List<MeetingSchedule>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.meeting_schedule, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meetingModel = mList[position]

        holder.teacherImage.setImageResource(meetingModel.image)
        holder.teacher.text = meetingModel.teacher
        holder.duration.text = meetingModel.duration
        holder.subject.text = meetingModel.subject
        holder.session.text = meetingModel.session
        holder.date.text    = meetingModel.date
        holder.time.text    = meetingModel.time
        holder.day.text     = meetingModel.day
    }

    override fun getItemCount(): Int {
        return mList.size
    }



    class ViewHolder(ItemView : View):RecyclerView.ViewHolder(ItemView)
    {
       val teacherImage : ImageView = ItemView.findViewById(R.id.IVTeacher)
       val teacher       : TextView = ItemView.findViewById(R.id.TVTeacher)
       val duration      : TextView = ItemView.findViewById(R.id.TVDuration)
       val time          : TextView = ItemView.findViewById(R.id.TVTime)
       val subject       : TextView = ItemView.findViewById(R.id.TVSubject)
       val date          : TextView = ItemView.findViewById(R.id.TVDate)
       val day           : TextView = ItemView.findViewById(R.id.TVDay)
       val session       : TextView = ItemView.findViewById(R.id.TVSession)

    }



}