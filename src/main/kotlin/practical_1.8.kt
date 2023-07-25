import java.util.*
import kotlin.collections.ArrayList

fun printArray(a:Array<Int>){
    for (item in a.size-1 downTo 0) {
        println(a[item])
    }
}
fun selectionSort(arr: IntArray) {
    for (i in 0 until arr.size - 1) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}

fun main() {
    var a1 = arrayOf(10, 90, 60, 80, 100);
    println("Created array-1 using arrayOf method: ")
    printArray(a1);

    var a2=Array<Int>(5){0};
    println("Created array-2 using Array<>(): ");
    println(Arrays.deepToString(a2));

    var a3=Array<Int>(10){i:Int->i+1};
    println("Created array-3 using Array<>() and lambda function :");
    for (num in 1.rangeTo(10)){
        println(num);
    }

    var a4=IntArray(5);
    println("Created array-4 using IntArray()");

    println(a4.contentToString());

    var a5= intArrayOf(12,10,1,5,18,19);
    println("Create array-5 using intArray()");
    for (i in 0 until a5.size){
        println(a5[i]);
    }

    val a6= arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7));
    println("Created 2D array-6 using arrayOf() and intArrayOf():");
    print("[ ")
    for (i in a6.indices) {
        print("[")
        for (j in a6[i].indices) {
            print(a6[i][j])
            if (j < a6[i].size - 1) {
                print(", ")
            }
        }

        print("]")
        if (i < a6.size - 1) {
            print(" , ")
        }
    }
    println(" ]")

    println("Please enter Array value: ");
    var a7=IntArray(5);
    for (i in a7.indices ){
        print("a[${i}] = ");
        a7[i]= readLine()?.toIntOrNull()!!;
    }
    println("Entered Array :")
    println(a7.contentToString());

    println("******************* With Built-in Function ********************");
    println("After sorting by built-in function:");
    var a8=a7.sorted();

    println(a8)

    println("******************* Without Built-in Function ********************");
    println("Before Sorting:");
    println(a7.contentToString());

    println("After sorting without built-in function:");
    selectionSort(a7);
    println(a7.contentToString());
}
