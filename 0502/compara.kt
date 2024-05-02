/* class Person(val firstName:String, val familyName:String, val age:Int):Comparable<Person>{
    val fullName get() = "$firstName $familyName"
    override fun compareTo(other: Person) = fullName.compareTo(other.firstName)
}

fun main(){
    val p1 = Person("Hong","gil",10)
    val p2 = Person("Gil","dong",50)
    println(p1.compareTo(p2))
} compare 예제 */

class Person(val firstName:String, val familyName:String, val age:Int):Comparable<Person>{
    val fullName get() = "$firstName $familyName"
    override fun compareTo(other: Person) = fullName.compareTo(other.firstName)
}

val AGE_COMPARATOR = Comparator<Person>{person1, person2 -> person1.age.compareTo(person2.age)} // 비교기 클래스

fun main(){
    val p1 = Person("Hong","gil",10)
    val p2 = Person("Gil","dong",50)
    println(p1.compareTo(p2))
} // compare 예제2