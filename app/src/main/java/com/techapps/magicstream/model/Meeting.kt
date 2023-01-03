package com.techapps.magicstream.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Meeting(
    @SerializedName("id")
    @Expose
    var id: Long? = null,
    @SerializedName("meeting_id")
    @Expose
    var meetingNo: String? = null,
    @SerializedName("passcode")
    @Expose
    var password: String? = null,
    @SerializedName("sdk_key")
    @Expose
    var sdkKey: String? = null,
    @SerializedName("sdk_secret")
    @Expose
    var sdkSecret: String? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("customer_name")
    @Expose
    val customerName: String? = null
) : Parcelable