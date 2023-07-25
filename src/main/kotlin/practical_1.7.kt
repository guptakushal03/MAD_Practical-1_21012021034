fun main(){
    print("Enter a number : ")
    var num = readln().toInt()
    var factorial = fact(num)
    println("Factorial of $num is $factorial")
}

fun fact(num: Int): Long {
    if (num >= 1) {
        return num * fact(num - 1)
    }
    else {
        return 1
    }
}
