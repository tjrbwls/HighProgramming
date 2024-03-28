/* class Person (val firstName:String, val familyName:String){
    /* var firstName : String = ""
    var familyName : String = ""
    var age : Int = 0

    fun fullName() = "$firstName $familyName"

    fun showMe(){
        println("${fullName()} : $age")
    } // 주생성자를 사용하지 않은 클래스 */

    /* val fullName = "$firstName $familyName"
    var age : Int = 0
    init {
        println("Created new Person Name : $fullName")
    }
    fun showMe(){
        println("${fullName} : $age")
    } 주생성자 사용 클래스 (복잡하지 않은 경우) */

    /* val firstName : String
    val familyName : String
    var age : Int = 0
    init {
        val names = fullName.split(" ")
        if(names.size != 2){
            throw IllegalArgumentException("Invalid name : $fullName")
        }
        firstName = names[0]
        familyName = names[1]
    }

    fun showMe(){
        println("$firstName $familyName : $age")
    } 주생성자 사용 클래스 (복잡한 경우) */

} // ※ 빈 클래스도 만들 수 있다 */

/* class Person(val firstName: String, val familyName: String){
    fun fullName() = "$firstName $familyName"
}

class Room(vararg val persons: Person){
    fun showNames(){
        for (person in persons){
            println(person.fullName())
        }
    }
}
class Person2(val firstName: String, val familyName: String)
class Person1(val firstName: String, val familyName: String) 부생성자 사용 클래스*/

/* class Person{
    val fullName:String
    constructor(firstName:String, familyName: String):this("$firstName $familyName")
    constructor(fullName:String){
        this.fullName=fullName
    }
} 생성자 위임 클래스 */

/* class Person(val id:Id, val age:Int){
    class Id(val firstName:String, val familyName:String)
    fun showMe() = println("${id.firstName} ${id.familyName}, $age")
} 내포된 클래스 */

class Person(val firstName:String, val familyName: String){
    inner class Possession(val deescription:String){
        fun showOwner() = println(fullName())
    }
    fun fullName() = "$firstName $familyName"
} // inner 사용 클래스

