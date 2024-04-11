/* fun String.truncate(maxLength:Int):String{
    return if(length <= maxLength) this else substring(0, maxLength)
}

fun main(){
    println("Hello".truncate(10))
    println("Hello".truncate(4))
} 확장 함수 예제1 */

class Person(val name:String, val age:Int)

fun Person.showInfo() = println("$name, $age")

fun main(){
    val p = Person("me",2)
    p.showInfo()
} // 확장 함수 예제2