package cours

fun main() {
    /*
    Sommes
     */
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    var sum = 0
    for(i in list) {
        sum +=i
    }
    println("somme de list avec for: $sum")
    println("somme de list avec function sum: ${list.sum()}")
    println("somme de list avec function sumOf x2: ${list.sumOf{ nb -> nb*2 }}")

    /*
    Plus difficile
     */
    val list2 = listOf("bonjour", "le", "Monde", "je", "m'appelle", "Toto", "j'habite", "en", "Bretagne")
    val valB = list2.groupBy { str -> str.startsWith("B",true) }.getValue(true).joinToString()
    val valE = list2.groupBy { str -> str.startsWith("E",true) }.getValue(true).joinToString()
    val valJ = list2.groupBy { str -> str.startsWith("J",true) }.getValue(true).joinToString()
    val valL = list2.groupBy { str -> str.startsWith("L",true) }.getValue(true).joinToString()
    val valM = list2.groupBy { str -> str.startsWith("M",true) }.getValue(true).joinToString()
    val valT = list2.groupBy { str -> str.startsWith("T",true) }.getValue(true).joinToString()
    println("B = $valB")
    println("E = $valE")
    println("J = $valJ")
    println("L = $valL")
    println("M = $valM")
    println("T = $valT")

    /*
    Nullabilité
     */
    var tab = arrayOf(1,2,3,null,4)
    for(i in tab.filterNotNull()) {
        print(i)
    }

    var tab2 = tab.filterNotNull()
    println(tab2.sortedByDescending { it })


    /*

     */
}