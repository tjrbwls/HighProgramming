fun main(){
    println(listOf("red", "white", "blue", "black").filter {it.length > 3})
    println(setOf("red", "white", "blue", "black").filter {it.length > 3})
    println(arrayOf("red", "white", "blue", "black").filter {it.length > 3})
    println(setOf("red", null, "white", null, "blue", null, "black").filterNotNull().forEach{println(it.length)}) // 필터에서 널이 있을 경우 처리
    val (evens2, odds2) = listOf(1, 2, 3, 4, 5).partition {it%2==0} // 만족하는 리스트와 만족하지 못하는 리스트를 각각 만듦
} // 필터 예제