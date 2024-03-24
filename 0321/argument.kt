fun rectangleArea(width:Int, height:Int):Int{
    return width*height
}

fun main(){
    val w= readLine()!!.toInt()
    val h= readLine()!!.toInt()
    println("Rectangle area : ${rectangleArea(w,h)}")
    // println("Rectangle area : ${rectangleArea(width=w,height=h)}") 이름 붙은 인자를 사용한 경우 (이름 붙이지 않은 위의 경우와 혼용하여 사용가능)
}