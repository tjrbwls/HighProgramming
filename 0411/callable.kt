/* fun check(s:String, condition:(Char)->Boolean):Boolean{
    for(c in s){
        if(!condition(c)) return false
    }
    return true
}

fun isCapitalLetter(c:Char) = c.isUpperCase() && c.isLetter()

fun main(){
    println(check("Hello", ::isCapitalLetter))
} 호출 가능 참조 예제1*/

/* class Person(val firstName:String, val familyName:String)

fun main(){
    val createPerson = ::Person
    createPerson("John","Doe")
} 생성자에 대한 호출 가능 참조 예제 */

/* class Person(val firstName:String, val familyName:String){
    fun hasNameOf(name:String) = name.equals(firstName, ignoreCase = true)
}

fun main(){
    val isJohn = Person("John","Doe")::hasNameOf

    println(isJohn("Jane"))
    println(isJohn("john"))
} 프로퍼티에 대한 호출 가능 참조 예제 */

class Person(var firstName:String, var familyName:String){
    fun hasNameOf(name:String) = name.equals(firstName, ignoreCase = true)
}

fun main(){
    val person = Person("John","Doe")
    val readName = person::firstName.getter
    println(readName)
}