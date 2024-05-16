open class Car:Vehicle() {
    init{
        println("Car 초기화")
    }
    override fun start() = super.start() + "at ${currentSpeed}"
}