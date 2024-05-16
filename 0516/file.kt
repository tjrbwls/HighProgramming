import  java.io.*

fun main(){
    FileWriter("data.txt").use{it.write("one\ntwo\nthree")}
    FileReader("data.txt").buffered().use{ println(it.readLine())}
    FileReader("data.txt").use{println(it.readText().replace('\n', ' '))}
    println(FileReader("data.txt").readLines())

    FileReader("data.txt").useLines { println(it.joinToString()) }
    FileReader("data.txt").forEachLine { println("$it/") }

    FileWriter("data2.txt").use{it.write("Hello")}
    val writer = StringWriter()
    FileReader("data2.txt").use{it.copyTo(writer)}
    println(writer.buffer)

    val output = ByteArrayOutputStream()
    FileInputStream("data2.txt").use { it.copyTo(output) }
    println(output.toString("UTF-8"))

    val file = File("data3.txt")
    file.bufferedWriter().use { it.write("Hello~~~~") }
    file.bufferedReader().use { println(it.readLine()) }

    val file2 = File("data.bin")
    file2.outputStream().use { it.write("Hello".toByteArray()) }
    file2.inputStream().use { println(String(it.readAllBytes())) }

    val name = "data.txt"
    FileOutputStream(name).bufferedWriter().use { it.write("one\ntwo") }
    val line = FileInputStream(name).bufferedReader().use { it.readLine() }
    println(line)

    val file3 = File("data3.txt")
    file3.writeText("one")
    println(file3.readText())
    file3.appendText("\ntwo")
    println(file3.readLines())
    println(file3.readText())
    file3.writeText("three")
    println(file3.readLines())

    File("my/nested/dir").mkdirs()
    val root = File("my")
    println("dir exist: ${root.exists()}")
    println("Simple delete: ${root.delete()}")
    println("dir exist: ${root.exists()}")
    println("Recursive delete: ${root.deleteRecursively()}")
    println("dir exist: ${root.exists()}")
} // 파일과 입출력 스트림 예제