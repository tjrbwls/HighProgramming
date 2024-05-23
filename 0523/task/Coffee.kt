class Coffee(val name:String, val price:Int, val point:Int)

val menupan = listOf(
    Coffee("americano", 2000, 20),
    Coffee("cafelatte", 2800, 28),
    Coffee("cappuccino", 3200, 32),
    Coffee("cafemocha", 3400, 34)
)

class Order (val menu:Int, val n:Int){
    val name
        get() = menupan[menu-1].name
    val price
        get() = menupan[menu-1].price*n
    fun makeCoffee() = "${name} $n 잔 $price 원입니다."
}

fun main(){
    while(true){
        println("SUNBUCKS CAFE : 메뉴를 고르세요.")
        println("1.아메리카노  2.카페라떼  3.카푸치노  4.카페모카  0.주문 끝~  exit:안녕히계세요~")
        val menu = readLine()!!.toInt()
        if(menu == 0 || menu > 5) {
            println("다음에 또 오세요~")
            break
        }
        println("몇 잔 필요하신가요? ")
        val num = readLine()!!.toInt()
        val customer = Order(menu, num)
        println(customer.makeCoffee())
    }
}

