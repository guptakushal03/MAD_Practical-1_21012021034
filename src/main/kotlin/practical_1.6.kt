// By using a user defined function perform all arithmetic operations

fun main(){
    println("Enter two numbers a and b : ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    add(a, b)
    sub(a, b)
    mult(a, b)
    div(a, b)
}

fun add(a: Int, b: Int): Int {
    var sum = a + b
    println("Sum of $a and $b is $sum")
    return 0
}

fun sub(a: Int, b: Int): Int {
    var subt = a - b
    println("Difference of $a and $b is $subt")
    return 0
}

fun mult(a: Int, b: Int): Int {
    var mul = a * b
    println("Multiplication of $a and $b is $mul")
    return 0
}

fun div(a: Int, b: Int): Int {
    var div = a / b
    println("Division of $a and $b is $div")
    return 0
}