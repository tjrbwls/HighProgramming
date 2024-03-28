/* fun isLetterString(s:String):Boolean{
    if(s==null) return false
    if(s.isEmpty()) return false
    for(ch in s){
        if(!ch.isLetter()) return false
    }
    return true
} null이 될수 없는 타입 검사 할때 사용하는 함수 */

fun main(){
    /* val person = Person() // person 인스턴스 생성
    person.firstName = "GilDong"
    person.familName = "Hong"
    person.age = 23

    person.showMe() // 주생성자를 사용하지 않은 클래스 호출 */

    /* val person = Person("John", "Park")
    person.age = 23

    person.showMe() 주생성자 사용 클래스(복잡하지 않은 경우) 호출 */

    /* val person = Person("John Park")
    person.age = 23

    person.showMe() 주생성자 사용 클래스(복잡한 경우) 호출 */

    /* val me = Person("A","man")
    val who = Room(Person("A", "she"))
    room.showNames() 부생성자 사용 클래스 호출 */

    /* val id = Person.Id("John","Doe")
    val person = Person(id, 25)
    person.showMe() 내포된 클래스 호출 */

    /* val person = Person("Jhon","Park")
    val wallet = person.Possession("Wallet")
    wallet.showOwner() inner 사용 클래스 호출 */

    /* println(isLetterString("abc"))
    println(isLetterString("null")) null이 될수 없는 타입 검사 */

    /* var name : String? = null

    fun initialize(){
        name = "John"
    }

    fun sayHello(name:String?):Boolean{
        if(name == null) return false
        println(name.uppercase())
        return true
    }
    initialize()
    sayHello(name) 널 아님 단언 연산자 */
}