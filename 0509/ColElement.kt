/* fun main(){
    println(listOf(1,2,3).first()) // 첫번째 원소
    println(listOf(1,2,3).last()) // 마지막 원소
    println(listOf(1,2,3).first{it > 2}) // 첫번째 원소 (조건)
} 컬렉션 원소 접근 얘제1 */

/* fun main(){
    val set = sortedSetOf(90, 20, 2, 44, 31)
    println(set.elementAt(1))
    println(set.elementAtOrNull(5))
    println(set.elementAtOrElse(5){ println("원소가 없습니다.")})
} 컬렉션 원소 접근 얘제2 */

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7)
    val (x, y, z, a, b)=list1
    println("$x, $y, $z, $a, $b")
} // 컬렉션 원소 접근 얘제3