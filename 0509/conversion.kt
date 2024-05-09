fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7)
    println(setOf("red", "white", "blue", "black").map {it.length > 3})
    println(listOf("red", "white", "blue", "black").map {it.length})
    println(listOf(1,2,3,4).map{it.toString(16)})
    val result = ArrayList<String>()
    list1.mapTo(result){it.toString()}
    println(result)
    println(arrayOf("A", "B", "C").mapIndexedTo(result){i, s -> "${i+1} : $s"})
} // 변환 예제