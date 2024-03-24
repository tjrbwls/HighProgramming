fun parseIntNumber(s:String, fallback:Int=-1):Int{
    var num=0
    if(s.length !in 1..31) return fallback
    for(c in s){
        if(c !in '0'..'1') return fallback
        num = num * 2 + (c-'0')
    }
    return num
}

fun main(){
    println("parseIntNumber(01110100):${parseIntNumber("01110100",-1)}")
}
