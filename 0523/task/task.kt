class Coffee(val name: String, val price: Int, val point: Int)

val menupan = listOf(
    Coffee("americano", 2000, 20),
    Coffee("cafelatte", 2800, 28),
    Coffee("cappuccino", 3200, 32),
    Coffee("cafemocha", 3400, 34)
)

class Order(val menu: Int, val n: Int) {
    val name
        get() = menupan[menu - 1].name
    val price
        get() = menupan[menu - 1].price * n
    val points
        get() = menupan[menu - 1].point * n
    fun makeCoffee() = "${name} $n 잔 $price 원입니다."
}

class Customer(val phoneNumber: String) {
    var points: Int = 3000
}

fun main() {
    val orders = mutableListOf<Order>()
    val customers = mutableMapOf<String, Customer>()

    while (true) {
        println("SUNBUCKS CAFE : 전화번호를 입력하세요. (종료는 'exit')")
        val phoneInput = readLine()!!
        if (phoneInput == "exit") {
            println("다음에 또 오세요~")
            break
        }

        val customer = customers.getOrPut(phoneInput) { Customer(phoneInput) }
        println("현재 포인트: ${customer.points}")

        while (true) {
            println("SUNBUCKS CAFE : 메뉴를 고르세요.")
            println("1.아메리카노  2.카페라떼  3.카푸치노  4.카페모카  0.주문 완료  exit:안녕히계세요~")
            val menuInput = readLine()!!
            if (menuInput == "exit") {
                println("다음에 또 오세요~")
                return
            }
            val menu = menuInput.toInt()
            if (menu == 0) {
                var total = 0
                var totalPoints = 0
                orders.forEach {
                    println(it.makeCoffee())
                    total += it.price
                    totalPoints += it.points
                }
                println("총합: $total 원")
                println("적립 포인트: $totalPoints")

                if (customer.points >= total) {
                    customer.points -= total
                    customer.points += totalPoints
                    println("구매 후 남은 포인트: ${customer.points}")
                } else {
                    println("포인트가 부족합니다.")
                }

                orders.clear()
                break
            }
            if (menu > 4) {
                println("잘못된 입력입니다. 다시 입력해주세요.")
                continue
            }

            println("몇 잔 필요하신가요? ")
            val num = readLine()!!.toInt()
            orders.add(Order(menu, num))
        }
    }
}