fun aggreate(numbers: IntArray, op:(Int, Int)->Int):Int {
    var result = numbers.firstOrNull()?: throw IllegalArgumentException("Empty array")
    for (i in 1..numbers.lastIndex)
        result = op(result, numbers[i])
    return result
}

fun sum(numbers: IntArray) = aggreate(numbers, {result, op -> result + op}) //aggreate(numbers) {result, op -> result + op}로도 사용가능

fun max(numbers: IntArray) = aggreate(numbers, {result, op -> if(op > result) op else result})

fun main(){
    println(sum(intArrayOf(1,2,3)))
    println(max(intArrayOf(1,2,3)))
}