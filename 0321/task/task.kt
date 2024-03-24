fun combination(balls: Int, share: Int): Int{
    if (share > balls) return 0
    if (share == 0 || share == balls) return 1

    var case = 1
    for(i in 1..share){
        case *= (balls - i + 1)
        case /= i
    }
    return case
}

fun main(){
    print("balls 개수를 입력하세요:")
    val balls = readLine()!!.toInt()
    print("share 개수를 입력하세요:")
    val share = readLine()!!.toInt()
    val result = combination(balls, share)
    println("balls:${balls}, share:${share}, result:${result}")
}