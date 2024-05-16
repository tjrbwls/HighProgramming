fun main(){
    val list = List(10){it*it}
    println(list)
    println(list.chunked(5))
    println(list.chunked(5){it.sum()})

    val seq = generateSequence(1) {if(it>300) null else it*3}
    println(seq.chunked(3).toList())

    val list1 = List(6){it*it}
    println(list1)
    println(list1.windowed(3))
    println(list1.windowed(3){it.sum()})
    println(list1.windowed(3, step = 2, partialWindows = true))

    println(list1.zipWithNext())
    println(list1.zipWithNext(){a, b -> a*b})
} // 하위 컬렉션 예제