package decorator.starbuzz

class Whip(beverage: Beverage): CondimentDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + ", Whip"
    override fun getCost(): Double = beverage.getCost() + .50
}