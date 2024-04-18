import Dirction.*
enum class Dirction{
    NORTH, SOUTH, WEST, EAST
}

fun rotateClockWise(dirction: Dirction)=when(dirction){
    NORTH->EAST
    EAST->SOUTH
    SOUTH->WEST
    WEST->NORTH
}

fun main(){
    println(rotateClockWise(NORTH))
} // 이넘 클래스 예제

