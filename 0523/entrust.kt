data class Book(val title:String, val author:PersonData){
    override fun toString()="$title by ${author.name}"
}

fun main(){
    val p1 = Person("val",30)
    val intro = Book("Intro",p1)
    println(intro)
}