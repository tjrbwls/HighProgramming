/* fun forEach(a:IntArray, action:(Int)->Unit){
    for(n in a) action(n)
}

fun main(){
    forEach(intArrayOf(1, 2, 3, 4), fun(it:Int){
        if(it < 2 || it > 3) return
        println(it)
    })
} 비지역적 제어흐름 예제 (return 문제 해결 방법 1) */

fun forEach(a:IntArray, action:(Int)->Unit){
    for(n in a) action(n)
}

fun main(){
    forEach(intArrayOf(1, 2, 3, 4)){
        if(it < 2 || it > 3) return@forEach
        println(it)
    }
} // 비지역적 제어흐름 예제 (return 문제 해결 방법 2)