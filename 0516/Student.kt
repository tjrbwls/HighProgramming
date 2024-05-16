class Student:Person{
    val university:String
    constructor(name:String, age:Int, university:String):super(name, age){
        this.university = university
    }
}
// class Student (name:String, age:Int, val university:String) : Person(name, age) : 다른 버전의 Student