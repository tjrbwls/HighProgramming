class Person(val firstName: String, val familyName: String) {
    fun fullName(familyFirst: Boolean): String = if (familyFirst) {
        "$familyName $firstName"
    } else {
        "$firstName $familyName"
    }
}