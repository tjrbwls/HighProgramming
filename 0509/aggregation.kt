class Person(val firstName:String, val familyName:String, val age:Int){
    override fun toString() = "$firstName $familyName : $age"
}

val Person.fullName get() = "$firstName $familyName"
val Person.reversFullName get() = "$familyName $firstName"
val FULL_NAME_COMPARATOR = Comparator<Person>{p1, p2 -> p1.fullName.compareTo(p2.fullName)}
val REVERSE_FULL_NAME_COMPARATOR = Comparator<Person>{p1, p2 -> p1.reversFullName.compareTo(p2.reversFullName)}

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    println(list1.count())
    println(list1.count{it>2})
    println(list1.sum()) // 람다 연산 불가능 (sumOf는 가능)
    println(list1.average()) // 결과 항상 실수 형태
    val seq = generateSequence("X") {if(it.length>=5) null else it+"X"}
    println(seq.toList())
    println(seq.sumOf{it.length})

    val persons = sequenceOf(
        Person("a", "Girl", 25),
        Person("b", "He", 30),
        Person("c", "She", 19),
        Person("d", "Man", 28),
        Person("e", "My", 23),
    )
    println(persons.minByOrNull { it.firstName }) // 기존에는 비교 할수 없었지만 비교 가능해짐
    println(persons.maxByOrNull { it.age }) // 기존에는 비교 할수 없었지만 비교 가능해짐
    println(persons.minWithOrNull(FULL_NAME_COMPARATOR)) // 비교기로 비교하기
    println(persons.maxWithOrNull(REVERSE_FULL_NAME_COMPARATOR)) // 비교기로 비교하기

    println(list1.joinToString())
    println(listOf(1,2,3).joinToString {it.toString(2)}) // 진번 변환 출력(현재 2진법)
    println(list1.joinToString (limit = 3, truncated = "---"))
    val builder = StringBuilder("JoinTo : ")
    println(list1.joinTo(builder, separator = "|"))

    println(intArrayOf(1,2,3,4).reduce {acc, n -> acc * n}) // 집계 방식 지정 가능
    println(intArrayOf(1,2,3,4).fold("") {acc, n -> acc + ('a'+n-1)}) // 집계 방식 지정 가능
} // 집계 예제