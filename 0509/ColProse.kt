fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    println(list1.all{it<10})
    val seq = generateSequence(1) {if(it<50) it*3 else null }
    println(seq.toList())
    println(seq.all{it%3==0}) // 전부 만족 -> true
    println(seq.none{it%2==0}) // 만족하는것 아무 것도 없을 경우 -> true
    println(seq.any{it%3==0}) // 하나 이상 만족 -> true
} // 컬렉션에 대한 조건 검사 예제