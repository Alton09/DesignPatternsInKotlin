package decorator.starbuzz

class Espresso(override val size: Size) : Beverage {
    override fun getDescription(): String = super.getDescription() + "Espresso"
    override fun getCost(): Double = 1.00
}