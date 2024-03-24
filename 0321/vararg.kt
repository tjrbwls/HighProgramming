/* fun printSorted(vararg items: Int){
    items.sort()
    println(items.contentToString())
}

fun main(){
    printSorted(6,2,10,1) // 가변인자 사용
    val numbers= intArrayOf(2,4,5,33) // 스프레드 연산자 사용
    printSorted(*numbers)
} 정수 array를 넣는 것 */

fun change(vararg items:IntArray){
    items[0][0]=100
}

fun main(){
    val a= intArrayOf(1,2,3)
    val b= intArrayOf(4,5,6)
    change(a,b)
    println(a.contentToString())
    println(b.contentToString())
} //정수 변수를 넣는 것