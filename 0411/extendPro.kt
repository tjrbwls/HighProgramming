val IntRange.leftHalf:IntRange
    get()=start..(start+endInclusive)/2

fun main(){
    println((1..10).leftHalf)
} // 확장 프로퍼티 예제