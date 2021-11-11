package cours

class User (
    val firstname: String,
    val lastname: String
) {
    fun method() {
        lastname
    }
    override fun toString(): String {
        return firstname + " " + lastname
    }
}

data class UserData(
    val firstname: String,
    val lastname: String
)

enum class Color(val rgb:String) {
    red("0xFFFFFF"),green("0xAAFFFF")
}

/*open class A(val arg1: String) { //open = on peut heriter de A
    open fun method() {

    }
}

class B : A("") { //equivaut a quand on faisait super("val")
    override fun method() { //il faut que method soit open

    }
}

abstract class C(){
    fun method() {

    }

    abstract fun method1(); //que la classe fille qui l'implementera
}

interface I { //contient que des methodes non implémentées
    fun method();
    fun method1();
}*/
fun main() {
    val user1 = User("A", "B")
    val user2 = UserData("A", "B")
    println(Color.red.rgb)
    println(user2);

}

class User1(firstname: String, lastname: String) { //constructeur principal
    val firstname: String = firstname
    val lastname: String = lastname

    constructor(value: String) : this("","") //constructeur secondaire qui doit appeler le constructeur principal
}

