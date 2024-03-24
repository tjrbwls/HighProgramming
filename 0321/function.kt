fun main(args:Array<String>){
    fun swap(i: Int, j: Int): String{
        val chars=args[0].toCharArray()
        val tmp=chars[i]
        chars[i]=chars[j]
        return chars.contentToString()
    }
    println(swap(0,args[0].lastIndex))
}