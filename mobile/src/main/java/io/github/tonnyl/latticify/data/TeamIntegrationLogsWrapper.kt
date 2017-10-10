package io.github.tonnyl.latticify.data

import com.google.gson.annotations.SerializedName

/**
 * Created by lizhaotailang on 08/10/2017.
 *
 * {
 * "ok": true,
 * "logs": [
 * {
 * "service_id": "1234567890",
 * "service_type": "Google Calendar",
 * "user_id": "U1234ABCD",
 * "user_name": "Johnny",
 * "channel": "C1234567890",
 * "date": "1392163200",
 * "change_type": "enabled",
 * "scope": "incoming-webhook"
 * },
 * {
 * "app_id": "2345678901",
 * "app_type": "Johnny App"
 * "user_id": "U2345BCDE",
 * "user_name": "Billy",
 * "date": "1392163201",
 * "change_type": "added"
 * "scope": "chat:write:user,channels:read"
 * },
 * {
 * "service_id": "3456789012",
 * "service_type": "Airbrake",
 * "user_id": "U3456CDEF",
 * "user_name": "Joey",
 * "channel": "C1234567890",
 * "date": "1392163202",
 * "change_type": "disabled",
 * "reason": "user",
 * "scope": "incoming-webhook"
 * }
 * ],
 * "paging": {
 * "count": 3,
 * "total": 3,
 * "page": 1,
 * "pages": 1
 * }
 * }
 */
data class TeamIntegrationLogsWrapper(

        @SerializedName("ok")
        val ok: Boolean,

        @SerializedName("logs")
        val logs: List<TeamIntegrationLog>,

        @SerializedName("paging")
        val paging: Paging

)