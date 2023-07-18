fun main(){
    print("Enter a number : ")
    var num = readLine()!!.toInt()
    var factorial = Factorial(num)
    println("Factorial of $num is $factorial")
}

fun Factorial(num: Int): Long {
    if (num >= 1)
        return num * Factorial(num - 1)
    else
        return 1
}