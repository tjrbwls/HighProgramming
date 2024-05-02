fun main(){
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for((key, value) in map){
        println("$key->$value")
    }

    intArrayOf(1,2,3).forEach { println(it*it) }
    listOf("a", "b", "c").forEach { println("'$it'") }
    sequenceOf("a", "b", "c").forEach { println("'$it'") }
    map.forEach{(key,value)->println("$key->$value")}
    println(map.size)
    println(map.isEmpty())

    val list = arrayListOf(10,20,30)
    println(list.contains(3))
    println(list.contains(30))
    println(list.containsAll(listOf(10,20)))
    list.add(100)
    list.remove(20)
    println(list)
    list += 4
    list -= 100 // 결과가 기존 list에 반영
    println(list)
    println(list + 5) // 결과가 기존 list에 반영되지 않음
    println(list)

    val list2 = arrayListOf(1,4,6,2,4,1,7)
    println(list2.get(3))
    println(list2[2])
    println(list2.indexOf(7)) // indexOf 안에 있는 값의 위치를 반환 해준다 (없으면 -1 반환)
    println(list2.lastIndexOf(4)) // lastIndexOf 안에 있는 값의 마지막 위치를 반환 해준다
    list2.set(3,0)
    list2.removeAt(5)
    list2.add(3, 8) // 인덱스 자리와 넣을 수 입력
    println(list2)

    val segment = list2.subList(1,3) // 기존 list 시작위치 부터 마지막위치(포함x) 까지 위치를 반환시켜준다.
    println(segment)

    val map = mapOf(1 to "I", 5 to "V", 10 to "X", 50 to "L")
    println(map.get(5))
    println(map[10])
    println(map[100]) // 없으면 null 출력
    println(map.getOrDefault(100, "키없음"))
    println(map.getOrElse(100){"이게 맞습니까?"})
    println(map.containsKey(10))
    println(map.containsValue("C"))
    println(map.keys)
    println(map.values)
    println(map.entries) // 키와 값을 합친 것

    val map2 = sortedMapOf(1 to "I", 5 to "V")
    map2.put(100,"C")
    println(map2)
    map2[500] = "D"
    println(map2)
    map2.remove(1)
    println(map2)
    map2.putAll(mapOf(10 to "X"))
    println(map2)
    map2 += 50 to "L"
    println(map2)
} // 기본 컬렉션 연산 예제