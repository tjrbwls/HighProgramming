fun main(){
    //val a = emptyArray<String>()
    //val b = arrayOf("hello","world")
    val c = arrayOf(1,2,3,4)
    val d = c.copyOf() //.copyOf() 생략시 배열c 변경 시 d도 같이 변경됨
    println(c==d) //내용을 비교하지 않음 즉, contentEquals 사용
    val e = c + 1000
    println(c.contentToString())
    println("c.size: ${c.size}, c.lastIndex: ${c.lastIndex}")
    println(c[c.lastIndex])
    c[3]=100
    println(c.contentToString())
    println(d.contentToString())
    println(e.contentToString())

    //val size = readLine()!!.toInt()
    //val squares = Array(size){(it+1)*(it+1)}

    //println(b.contentToString())
    //println(squares.contentToString())
}