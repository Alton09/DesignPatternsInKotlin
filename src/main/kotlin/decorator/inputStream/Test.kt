package decorator.inputStream

import java.io.BufferedInputStream
import java.io.FileInputStream

fun main() {
    LowerCaseInputStream(BufferedInputStream(FileInputStream("Test.txt"))).let { stream ->
        var nextByte = stream.read()
        while (nextByte != -1) {
            println(nextByte.toChar())
            nextByte = stream.read()
        }
    }
}