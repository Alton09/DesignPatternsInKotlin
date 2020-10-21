package decorator.starbuzz

class Espresso : Beverage {
    override fun getDescription(): String = "Espresso"
    override fun getCost(): Double = 1.00
}