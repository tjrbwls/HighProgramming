/* data class Person(val firstName:String, val familyName:String)

data class Mailbox(val address:String, val person:Person)

fun main(){
    val p1 = Person("John","Doe")
    val p2 = Person("John","Doe")
    val p3 = p1
    println(p1 == p2)
    println(p1 == p3)

    val b1 = Mailbox("Unknown", p1)
    val b2 = Mailbox("Unknown", p2)
    println(b1==b2)

    println(p1.hashCode())
    println(p2.hashCode())
    println(p3.hashCode())
    println(b1.hashCode())
    println(b2.hashCode())
} 데이터 클래스 예제 */

/* data class Person(val firstName:String, val familyName:String)

fun Person.show()= println("$firstName $familyName")

fun main(){
    val p1 = Person("John","Doe")
    p1.show()
    p1.copy().show()
    p1.copy(family="hi").show()
    p1.show()
} copy() 예제 */

data class Person(val firstName:String, val familyName:String)

fun combine(p1:Person, p2:Person,folder:((String,Person)->String)):String{
    return folder(folder("",p1),p2)
}
fun main(){
    val p1 = Person("John","Doe")
    val p2 = Person("John","Doe")
    println(combine(p1,p2){text,person -> "$text ${person.firstName}"})
    println(combine(p1,p2){text, (firstName) -> "$text $firstName"})
} // 구조 분해 예제