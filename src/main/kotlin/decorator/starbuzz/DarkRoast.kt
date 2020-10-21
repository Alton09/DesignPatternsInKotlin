package decorator.starbuzz

class DarkRoast: Beverage {
    override fun getDescription(): String = "Dark Roast"
    override fun getCost(): Double = 2.00
}