fun hexDigit(n:Int):Char{
    when{
        n in 0..9 -> return '0'+n
        n in 10..15 -> return 'A'+n-10
        else -> return '?'
    }
}