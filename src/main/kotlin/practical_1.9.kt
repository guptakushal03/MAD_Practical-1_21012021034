fun main()
{
    val num=ArrayList<Int>();
    num.add(57)

    num.add(90)
    num.add(10)
    num.add(13)
    num.add(14)
    for (i in num.indices){
        println("a[${i}] = ${num[i]}")
    }
    var max=num[0];
    for (i in 1..num.size-1){
        if (max<num[i]) max=num[i]
    }
    println("Largest element = ${max}")
}
