package decorator.starbuzz

class DarkRoast(override val size: Size): Beverage {
    override fun getDescription(): String = super.getDescription() + "Dark Roast"
    override fun getCost(): Double = 2.00
}