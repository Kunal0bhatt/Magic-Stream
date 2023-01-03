package com.techapps.magicstream.model

data class MeetingSchedule(
    val image : Int,
    val teacher : String,
    val duration: String,
    val subject : String,
    val session : String,
    val date    : String,
    val time    : String,
    val day     : String
)
