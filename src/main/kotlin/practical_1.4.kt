fun main(){
    print("Enter a number : ")
    var num = readLine()!!.toInt()
    if (num % 2 == 0){
        print("$num is an even number")
    }
    else{
        print("$num is an odd number")
    }
}