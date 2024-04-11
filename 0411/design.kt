fun aggregate(numbers:IntArray, op:Int.(Int)->Int):Int{
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty array")
    for (i in 1..numbers.lastIndex)
        result = result.op(numbers[i])
    return result
}

fun sum(numbers: IntArray) = aggregate(numbers){op -> this + op}

fun main(){
    println(sum(intArrayOf(1,2,3,4)))
} // 수신 객체 지정 함수 타입 예제