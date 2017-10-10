package io.github.tonnyl.latticify.data

import com.google.gson.annotations.SerializedName

/**
 * Created by lizhaotailang on 08/10/2017.
 *
 * {
 * "ok": true,
 * "logins": [
 * {
 * "user_id": "U12345",
 * "username": "bob",
 * "date_first": 1422922864,
 * "date_last": 1422922864,
 * "count": 1,
 * "ip": "127.0.0.1",
 * "user_agent": "SlackWeb Mozilla\/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit\/537.36 (KHTML, like Gecko) Chrome\/41.0.2272.35 Safari\/537.36",
 * "isp": "BigCo ISP",
 * "country": "US",
 * "region": "CA"
 * },
 * {
 * "user_id": "U45678",
 * "username": "alice",
 * "date_first": 1422922493,
 * "date_last": 1422922493,
 * "count": 1,
 * "ip": "127.0.0.1",
 * "user_agent": "SlackWeb Mozilla\/5.0 (iPhone; CPU iPhone OS 8_1_3 like Mac OS X) AppleWebKit\/600.1.4 (KHTML, like Gecko) Version\/8.0 Mobile\/12B466 Safari\/600.1.4",
 * "isp": "BigCo ISP",
 * "country": "US",
 * "region": "CA"
 * },
 * ],
 * "paging": {
 * "count": 100,
 * "total": 2,
 * "page": 1,
 * "pages": 1
 * }
 * }
 */
data class TeamLogsWrapper(

        @SerializedName("ok")
        val ok: Boolean,

        @SerializedName("logins")
        val logins: List<TeamLog>,

        @SerializedName("paging")
        val paging: Paging

)