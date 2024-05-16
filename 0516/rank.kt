fun main(){
    val int_arr = intArrayOf(1, 5, 3, 7, 6, 0, 9)
    println(int_arr.sorted())
    println(int_arr.contentToString())
    int_arr.apply { sort() }
    println(int_arr.contentToString())
} // 순서 예제