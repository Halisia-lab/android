package cours
fun main() {
    /*
    Scoped functions
     */
    //voir les niveaux de visibilité deans les slides

    //au lieu de faire
    var user1 = Useer();
    user1.method1();
    user1.method2();
    user1.method3();

    Useer().apply {
        method1();
        method2();
        method3();
    }

    //apply = renvoie l'objet User
    //run = renvoie la valeur de la dernière instruction des acolades
    //let =

    /*
    Collections
     */

    //listes
    var list = listOf(1,2,3)
    //on peut pas faire list.add(4), sinon il faut faire:
    var list2 = mutableListOf(1,2,3)
    list2.add(4)
    list2.removeAt(3)

    //sets
    val set = setOf(1,2,3,1)
    val set2 = mutableSetOf(1,2,3)

    //maps
    val map = mapOf("key" to "valeur", "key1" to "valeur1")
    print(map["key"])
    val map2 = mutableMapOf("key" to "val")

    val pair = "key" to "valeur"
    pair.first //renvoie "key"
    pair.second //renvoie "valeur"

}

class Useer {
   fun method1() {

   }

    fun method2() {

    }

    fun method3() {

    }
}