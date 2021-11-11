package cours

fun main(){
    /*
      ETAPE 3
     */
    //1 - Les variables
    val var1: String = "hello";
    var var2: String = "world";

    //2 - La nullabilité
    var var3: String = "hello";
    var var4: String? = "world";
    //pour appeler uppercase() il faut faire :
    var4!!.uppercase();
    //ou alors :
    var4?.uppercase();
    //Elvis :
    var var5 = var4 ?: "hello";

    //3 - Calculatrice de TVA
    /*println("Saisissez votre montant HT:");
    var montant = readLine();

    println("Resultats: ");
    val TVA1 = 2.1/100;
    val TVA2 = 5.5/100;
    val TVA3 = 10/100;
    val TVA4 = 20/100;
    println("TVA 2.1% : ${(1 + TVA1)*montant!!.toDouble()}€");
    println("TVA 5.5% : ${(1 + TVA2)*montant!!.toDouble()}€");
    println("TVA 10% : ${(1 + TVA3)*montant!!.toDouble()}€");
    println("TVA 20% : ${(1 + TVA4)*montant!!.toDouble()}€");*/

    /*
    ETAPE 4
     */

    //If
    fun isEven(nb: Int):Boolean {
        return nb.mod(2) == 0;
    }

    fun Int.isEven(): Boolean{
        return this.isEven();

    }

    //When
    fun isVoyelle(x: String): Boolean {
        when(x) {
            "a","e","i","o","u","y" -> return true;
            else -> return false;
        }
    }
    //print(isVoyelle("b"));

    //Boucle
    /*for (i in (0..10)) {
        println(i.rangeTo(10))
    }*/

    /*
    ETAPE 5
     */
    fun helloESGI():Unit {
        println("Hello ESGI")
    }

    fun method(number: Int):Int = number *5  //raccourci alt + entree

    println(method(2))
    println(method(number = 3));

    fun foo(name: String, number: Int = 5, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.uppercase() else name) + number

    fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
    )

    fun facto(nb:Int): Int {
        var res = 1
        for(i in 1..nb) {
            res *= i
        }
        return res
    }

    print(facto(10))







}
