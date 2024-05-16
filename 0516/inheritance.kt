fun Car.stop(){
    println("Stopped riding") // 멤버가 우선이므로 확장은 실행 안됨
}

class Holder{
    val o:Any get()=""
}

fun main(){
    val aircraft = Aircraft(100)
    aircraft.start()
    aircraft.takeOff()
    aircraft.land()
    aircraft.stop()
    val vehicle:Vehicle = aircraft
    vehicle.start()
    vehicle.stop()

    val vehicle2:Vehicle = Car()
    println(vehicle2.start())
    vehicle2.stop()

    val vehicle3:Vehicle = Boat()
    vehicle3.start()

    val vehicle4:Vehicle = Truck()

    Student("Gil dong", 23, "MIT")

    val objects = arrayOf("1", 2, "3", 4)
    for (obj in objects){
        // println(obj * 2) : 타입이 맞지 않으므로 불가능함
        if (obj is Int) println(obj * 2)
        else println("It type is not Int")
    }
    println(objects[0] is Int)

    val o:Any by lazy{123}
    // if(o is Int) println(o * 2) : 스마트 캐스트가 불가능함 (값이 바뀔 가능성을 가지고 있기 때문)
} // 상속 예제