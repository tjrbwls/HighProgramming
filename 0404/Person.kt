/* class Person (val firstName:String, val familyName:String) {
    val fullName:String
        get():String{
            return "$firstName $familyName"
        }
}

fun main(){
    val person = Person("John","Doe")
    println(person.fullName)
} 커스텀 접근자 (getter 사용) 예제 */

/* class Person (val firstName:String, val familyName:String, age:Int) {
    val fullName:String
        get()="$firstName $familyName"
    val age:Int = age // 안에서만 사용가능 밖에서 쓰면 누구의 age 인지 모르기때문
        get(){
            println("Accssing age")
            return field
        }
}

fun main(){
    val person = Person("John","Doe", 20)
    println(person.fullName)
    println(person.age)
} 커스텀 접근자 (getter 사용) 확장 예제 */

/* class Person (val firstName:String, val familyName:String) {
    val fullName:String
        get()="$firstName $familyName"
    var age:Int? = null
        set(value){
            if(value!=null && value<=0){
                throw IllegalArgumentException("Invalid age: $value")
            }
            field=value
        }
        get(){
            println("Accssing age")
            return field
        }
}

fun main(){
    val person = Person("John","Doe")
    person.age = 20
    println("${person.fullName}, ${person.age}")
} 커스텀 접근자 (getter, setter, 가변프로퍼티 사용) 예제 */

import java.util.Date

class Person (name:String) {
    var lastChanged:Date?=null
        private set
    var name:String = name
        set(value){
            lastChanged=Date()
            field=value
        }
}

fun main(){
    val person = Person("John Doe")
    println(person.name)
    // person.lastChanged=.. 밖에서는 변경 불가능
} // Date 내외부 변경 예제