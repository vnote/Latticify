package io.github.tonnyl.latticify.data

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * Created by lizhaotailang on 24/09/2017.
 *
 * {
 * "type": "message",
 * "subtype": "file_share",
 * "text": "<@U51B3SBT2> uploaded a file: <https:\/\/androiddevsslack.slack.com\/files\/U51B3SBT2\/F6XR7MYF3\/img_20170905_224733.jpg|IMG_20170905_224733.jpg>",
 * "file": {
 * "id": "F6XR7MYF3",
 * "created": 1504622886,
 * "timestamp": 1504622886,
 * "name": "IMG_20170905_224733.jpg",
 * "title": "IMG_20170905_224733.jpg",
 * "mimetype": "image\/jpeg",
 * "filetype": "jpg",
 * "pretty_type": "JPEG",
 * "user": "U51B3SBT2",
 * "editable": false,
 * "size": 178812,
 * "mode": "hosted",
 * "is_external": false,
 * "external_type": "",
 * "is_public": true,
 * "public_url_shared": false,
 * "display_as_bot": false,
 * "username": "",
 * "url_private": "https:\/\/files.slack.com\/files-pri\/T4WLRK1UL-F6XR7MYF3\/img_20170905_224733.jpg",
 * "url_private_download": "https:\/\/files.slack.com\/files-pri\/T4WLRK1UL-F6XR7MYF3\/download\/img_20170905_224733.jpg",
 * "thumb_64": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_64.jpg",
 * "thumb_80": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_80.jpg",
 * "thumb_360": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_360.jpg",
 * "thumb_360_w": 202,
 * "thumb_360_h": 360,
 * "thumb_480": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_480.jpg",
 * "thumb_480_w": 270,
 * "thumb_480_h": 480,
 * "thumb_160": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_160.jpg",
 * "thumb_720": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_720.jpg",
 * "thumb_720_w": 404,
 * "thumb_720_h": 720,
 * "thumb_800": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_800.jpg",
 * "thumb_800_w": 449,
 * "thumb_800_h": 800,
 * "thumb_960": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_960.jpg",
 * "thumb_960_w": 539,
 * "thumb_960_h": 960,
 * "thumb_1024": "https:\/\/files.slack.com\/files-tmb\/T4WLRK1UL-F6XR7MYF3-62a9202315\/img_20170905_224733_1024.jpg",
 * "thumb_1024_w": 575,
 * "thumb_1024_h": 1024,
 * "image_exif_rotation": 1,
 * "original_w": 719,
 * "original_h": 1280,
 * "permalink": "https:\/\/androiddevsslack.slack.com\/files\/U51B3SBT2\/F6XR7MYF3\/img_20170905_224733.jpg",
 * "permalink_public": "https:\/\/slack-files.com\/T4WLRK1UL-F6XR7MYF3-b139b15f76",
 * "channels": [
 * "C4XA89BEJ"
 * ],
 * "groups": [],
 * "ims": [],
 * "comments_count": 0
 * },
 * "user": "U11111111",
 * "upload": true,
 * "display_as_bot": false,
 * "username": "username",
 * "bot_id": null,
 * "ts": "1504622888.000639"
 */
data class Message(

        @SerializedName("user")
        val user: String?,

        @SerializedName("username")
        val username: String?,

        @SerializedName("icons")
        val icons: Icons?,

        @SerializedName("attachments")
        val attachments: List<Attachment>?,

        @SerializedName("mrkdwn")
        val markdown: Boolean?,

        @SerializedName("display_as_bot")
        val displayAsBot: Boolean?,

        @SerializedName("bot_id")
        val botId: String?,

        @SerializedName("text")
        val text: String?,

        @SerializedName("type")
        val type: String,

        @SerializedName("file")
        val file: File?,

        /**
         * message, bot_message and more
         */
        @SerializedName("subtype")
        val subtype: String?,

        @SerializedName("ts")
        val ts: String,

        @SerializedName("reactions")
        val reactions: List<Reaction>?

) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readParcelable(Icons::class.java.classLoader),
            parcel.createTypedArrayList(Attachment),
            parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
            parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readParcelable(File::class.java.classLoader),
            parcel.readString(),
            parcel.readString(),
            parcel.createTypedArrayList(Reaction))

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(user)
        parcel.writeString(username)
        parcel.writeParcelable(icons, flags)
        parcel.writeTypedList(attachments)
        parcel.writeValue(markdown)
        parcel.writeValue(displayAsBot)
        parcel.writeString(botId)
        parcel.writeString(text)
        parcel.writeString(type)
        parcel.writeParcelable(file, flags)
        parcel.writeString(subtype)
        parcel.writeString(ts)
        parcel.writeTypedList(reactions)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Message> {
        override fun createFromParcel(parcel: Parcel): Message {
            return Message(parcel)
        }

        override fun newArray(size: Int): Array<Message?> {
            return arrayOfNulls(size)
        }
    }

}