/* fun restrictToRange(
    from: Int=Int.MIN_VALUE,
    to: Int=Int.MAX_VALUE,
    what: Int
): Int = Math.max(from, Math.min(to,what))

fun main(){
    println(restrictToRange(10, what = 10))
} 디폴트 파라미터 사용 */

/* fun mul(a:Int, b:Int=1)=a*b //1
fun mul(a:Int, b:Long=1L)=a*b //2
fun mul(a:Int, b:Int, c:Int=1)=a*b*c //3

fun main(){
    mul(a:10, b:20L)
} 여러개의 호출값이 존재 할 경우 더 구채 적인 것을 선택해서 호출 */