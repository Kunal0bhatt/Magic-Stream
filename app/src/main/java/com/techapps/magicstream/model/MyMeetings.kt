package com.techapps.magicstream.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MyMeetings (

@SerializedName("id")
@Expose
val id: Long? = null,
@SerializedName("meeting_id")
@Expose
val meetingNo: String? = null,
@SerializedName("passcode")
@Expose
val password: String? = null,
@SerializedName("sdk_key")
@Expose
val sdkKey: String? = null,
@SerializedName("sdk_secret")
@Expose
val sdkSecret: String? = null,
@SerializedName("name")
@Expose
val name: String? = null,
@SerializedName("customer_name")
@Expose
val customerName: String? = null
)
