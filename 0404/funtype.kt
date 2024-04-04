fun masureTime(action:()->Unit):Long{
    val start=System.nanoTime()
    action()
    return System.nanoTime()-start
}

fun main(args:Array<String>){
    val shifter : (Int)->(Int)->Int={n->{i->i+n}}
    val inc = shifter(1)
    println(inc(10))
    val dec = shifter(-1)
    println(dec(10))
}