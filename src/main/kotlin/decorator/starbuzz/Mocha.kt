package decorator.starbuzz

class Mocha(beverage: Beverage): CondimentDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + ", Mocha"
    override fun getCost(): Double = beverage.getCost() + .10
}