import kotlin.reflect.typeOf

fun main(){
    var a : Int = 5
    var b : Double = 5.479
    var c : String = "74"

    println("Integer Value : $a")
    println("Double Value : ${a.toDouble()}")        // Integer to Double
    println("String Value : ${b.toString()}")        // Double to String
    println("Integer Value : ${c.toInt()}")          // String to Integer
}