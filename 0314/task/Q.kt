fun main(){
    val moringNotification = 51
    val eveningNotfication = 135

    printNotficationSummary(moringNotification)
    printNotficationSummary(eveningNotfication)
}
fun printNotficationSummary(numberOfMessages: Int){
    if (moringNotification<100){
        println("You have ${moringNotification} notifications.")
    }
    else{
        println("Your phones is blowing up! You have 99+ notifications.")
    }
}