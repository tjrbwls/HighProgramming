abstract class Shape{
    abstract val width:Double
    abstract val height:Double
    abstract fun area():Double
}
fun Shape.print(){
    println("Bounds: $width * $height, area : ${area()}")
}
fun main(){
    Circle(10.0).print()
    Rectangle(3.0,4.0).print()
}