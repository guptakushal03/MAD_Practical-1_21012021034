fun main(){
    println("Enter two numbers a and b : ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    println("Summation of $a and $b is " + add(a, b))
    println("Difference of $a and $b is " + sub(a, b))
    println("Multiplication of $a and $b is " + mult(a, b))
    println("Division of $a and $b is " + div(a, b))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mult(a: Int, b: Int): Int {
    return a * b
}

fun div(a: Int, b: Int): Int {
    return a / b
}