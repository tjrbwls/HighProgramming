class Alias (private val Identity:PersonData, private val newIdentity:PersonData):PersonData{
    override val name:String
        get()=newIdentity.name
    override val age:Int
        get()=newIdentity.age
}