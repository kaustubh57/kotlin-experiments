package experiments.properties

class Car(
    var model: String,
    val dieselEngine: Boolean
) {

    var color: String = "yellow"
    private val seatCount = 4

    lateinit var maker: String

}
