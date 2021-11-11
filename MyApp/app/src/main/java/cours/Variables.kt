package cours

fun main() {

    println("Hello World");
    /*
    * Declaration variables
    * */
    var var1 : String? = "Hello"; //on peut faire var1 = null;

    val var2 = "Hello $var1"; //val = constante on peut pas modifier var2 (immutable)
    var var3 = "Hello"; //var = on peut modifier (mutable)

    if(var1 != null)
        var1.toString();
    //ou alors
    var1?.toString();

    var1!!.toString(); // = meme si var3 est null, a éviter


    /*
    * Elvis
    * */
    val expr = var1 ?: "A";
    //équivaut à : if(var1 != null) val1 else "A";


    /*
    * When = comme le switch
    * */
    var var4 : Any? = "Hello";
    when (var4) {
        "a", "b", "c" -> println();
        in 1..5 -> println(); //ou !in
        is String -> println(); //ou !is
        else -> println(); //default
    }
    //on peut retourner des valeurs
    var var5 = when (var4) {
        "a", "b", "c" -> 0
        else -> 1;
    }


    /*
    * Méthodes
    * */
    fun method(arg1: String, arg2: String) : String {
        return arg1;
    }
    //Valeur par défaut
    fun method2(arg1: String, arg2: String = "hello") : String {
        return arg1;
    }
    //appel de méthode
    method("Toto", "Tata");
    //ou alors
    method(
        arg1 = "Toto",
        arg2 = "Tata"
    )
    method2("toto");

    /*
    Extensions de fonctions
     */

    /*fun main(){
        "http://www.google.fr".isUrl();
    }

    fun Demo.isUrl(): Boolean{
        return this.startsWith("")
    }*/


    /*Toast.makeText(
            this,
            "Hello world :)",
            Toast.LENGTH_LONG
        ).show()

        Snackbar.make(
            this,
            findViewById(android.R.id.content),
            "Hello world",
            Snackbar.LENGTH_INDEFINITE
        ).apply {
            setAction("Cliquez-moi", object: View.OnClickListener {
                override fun onClick(p0: View?) {
                    // TODO("Not yet implemented")
                }

            })
            show()
        }

        if (BuildConfig.DEBUG) {
            Log.d("Database", "Unable to open the database")
        }*/
}