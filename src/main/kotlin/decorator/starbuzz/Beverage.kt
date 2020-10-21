package decorator.starbuzz

interface Beverage {
    val size: Size
    fun getDescription(): String = "${size.name} "
    fun getCost(): Double
}

sealed class Size(val name: String) {
    object Tall: Size("Tall")
    object Venti: Size("Venti")
    object Grande: Size("Grande")
}