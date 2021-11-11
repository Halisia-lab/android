package cours

class Utilisateur (
    nom:String,
    prenom:String
) {

    companion object Printer { //comme static
        fun hello() {
            println("hello world")
        }
    }

}

open class Weather(
    temp: Float,
    lieu: String
) {
    val ZERO = 0
    open var temp: Float = temp
    open var lieu: String = lieu
    constructor(weather: Weather) : this(weather.temp, weather.lieu)

    open override fun toString(): String {
        return "Température de $lieu : $temp"
    }

    open fun isHot(): Boolean {
        return this.temp>25
    }

    open fun isCold(): Boolean {
        return this.temp<ZERO
    }
}

open class LocalWeather(temp:Float, lieu: String) : Weather(temp, lieu) {
    override var temp: Float = temp
    override var lieu: String = lieu
    constructor(weather: Weather) : this(weather.temp, weather.lieu)

    override fun isHot(): Boolean {
        return this.temp>32
    }
}

fun main() {
    val ZERO = 0F
    val user1 = Utilisateur("Halifa", "Halisia")
    val user2 = Utilisateur("Halifa", "Halisia")
    val weather = Weather(30.5F, "Limay")
    val localWeather = object : LocalWeather(41F,"hihi") {//je crée une instance d'une copie de LocalWeather
        override fun isHot(): Boolean {
            return this.temp>40
        }
    }

    Utilisateur.hello()


}