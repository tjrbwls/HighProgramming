/* import java.util.TreeMap

fun main(){
    val list = ArrayList<String>()
    list.add("red")
    list.add("green")
    println(list)

    val set = HashSet<Int>()
    set.add(111)
    set.add(22)
    set.add(3)
    println(set)

    val map = TreeMap<Int, String>()
    map[20] = "Twenty"
    map[10] = "Ten"
    println(map)
} 생성자를 통한 생성 예제 */

/* fun main(){
    val emptylist = emptyList<String>()
    println(emptylist)
    // emptylist.add("아무거나") 불변이기 때문에 사용불가

    val singletonSet = setOf("abc")
    println(singletonSet)
    // singletonSet.remove("abc") 불변이기 때문에 사용불가

    val mutableList = mutableListOf("abc")
    println(mutableList)
    mutableList.add("def")
    println(mutableList)
    mutableList[0] = "xyz"
    println(mutableList)

    val sortedSet = sortedSetOf(8,5,7,1,4)
    println(sortedSet)
    sortedSet.add(3)
    println(sortedSet)

    val emptyMap = emptyMap<Int, String>()
    println(emptyMap)
    // emptyMap[10] = "Ten" 불변이기 때문에 사용불가

    val singletonMap = mapOf(10 to "Ten")
    println(singletonMap)
    // singletonMap.remove("abc") 불변이기 때문에 사용불가

    val mutableMap = mutableMapOf(10 to "Ten")
    println(mutableMap)
    mutableMap[20] = "Twenty"
    mutableMap[100] = "Hundred"
    println(mutableMap)
    mutableMap.remove(20)
    println(mutableMap)

    val sortedMap = sortedMapOf(2 to "two", 1 to "one", 3 to "three")
    println(sortedMap)
    sortedMap[0] = "zero"
    println(sortedMap)
} 가변인자를 받는 함수 예제 */

/* fun main(){
    println(List(5){it*it})

    val numbers = MutableList(5){it*5}
    println(numbers)
    numbers.add(100)
    println(numbers)
} 배열과 비슷하게 리스트를 생성하는 예제 */

/* fun main(){
    println(sequenceOf(1, 2, 3).iterator().next())
    println(listOf(10, 20, 30).asSequence().iterator().next())
    println(mapOf(1 to "one", 2 to "two", 3 to "three").asSequence().iterator().next())

    val numbers = sequence {
        yield(0)
        yieldAll(listOf(1,2,3))
        yieldAll(intArrayOf(4,5,6).iterator())
        yieldAll(generateSequence(10) { if(it<50) it*3 else null })
    }
    println(numbers.toList())
} 시퀀스를 만드는 함수 예제 */

fun main(){
    println(listOf(1,2,3,2,3).toSet())
    println(arrayOf("red", "green", "blue").toSortedSet())
} // 컬렉션 사이의 변환 예제