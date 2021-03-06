import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var avatar: Int,
    var name: String,
    var location: String,
    var username: String,
    var repository: String,
    var company: String,
    var followers: String,
    var following: String
) : Parcelable