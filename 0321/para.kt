fun increment(a:IntArray):Int{
    return ++a[0]
} //반환 타입이 있는 경우

//fun increment(a:IntArray):Int = ++a[0] 식이 본문인 함수

// fun increment(a:IntArray) = ++a[0] 반환 타입을 생략한 경우

// fun increment(a:IntArray) = {++a[0]} 블록을 람다(익명함수)로 사용한 경우

fun main(){
    val a = intArrayOf(1,2,3)
    println(increment(a))
    println(a.contentToString())
}