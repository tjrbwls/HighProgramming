/* class Address{
    var zipCode:Int=0
    var city:String=""
    var street:String=""
    var house:String=""

    fun post(message:String):Boolean{
        println("Message for $zipCode, $city, $street, $house : $message")
        return readLine() == "OK"
    }
}

fun main(){
    val addr = Address().run{
        var zipcode = 123456
        var city = "London"
        var street = "Baker Street"
        var house = "221b"
        post("Hello")// 반환값
    }
    if(!addr){
        println("Message is not delivered")
    }
} run() 예제 */

/* class Address(val city:String, val street:String, val house:String){
    fun asText() = "$city, $street, $house"
}

fun main(){
    val message = with(Address("London","Baker Street", "221b")){
        "Address: $city, $street, $house"
    }
    println(message)
} with() 예제 */

/* class Address(val city:String, val street:String, val house:String){
    fun asText() = "$city, $street, $house"
}

fun main(){
    val city = readLine()?:return
    val street = readLine()?:return
    val house = readLine()?:return
    val address = Address(city, street, house)

    println(address.asText())
} 문맥이 없는 run 예제 */

/* class Address(val city:String, val street:String, val house:String){
    fun asText() = "$city, $street, $house"
}

fun readInt() = try{
    readLine()?.toInt()
}
catch(e:NumberFormatException){
    null
}

fun main(){
    val index = readInt()
    val arg = index?.let {args.getOrNull(it)}
    if(arg != null)
        println(arg)
} let() 예제 */

class Address(val city:String, val street:String, val house:String)

class Person(val firstName:String, val familyName:String){
    fun Address.post(message:String){
        val city = city // 확장 수신 객체 : Address
        val street = this.street // 한정시키지 않은 this 확장 수신 객체 : Address
        val house = this@post.house // 한정시킨 this 확장 수신 객체 : Address
        val firstName = firstName // 암시적 this 디스패치 수신 객체 : Person
        val familyName = this@Person.familyName // 한정시킨 this 디스패치 수신 객체 : Person
        println("From $firstName, $familyName at $city, $street, $house")
    }
    fun test(address: Address){
        address.post("Hello")
    }
}

fun main(){
    val addr = Address("부산", "남구", "경성대")
    val p = Person("길동","홍").test(addr)
} // 클래스 멤버인 확장 예제