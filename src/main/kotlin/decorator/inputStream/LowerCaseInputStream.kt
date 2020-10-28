package decorator.inputStream

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream): FilterInputStream(inputStream) {

    override fun read(): Int {
        val nextByte = super.read()
        return if(nextByte != -1) {
            val nextChar = nextByte.toChar()
            if(nextChar.isUpperCase()) nextChar.toLowerCase().toInt() else nextByte
        } else nextByte
    }
}