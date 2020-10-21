package decorator.starbuzz

class Mocha(beverage: Beverage): CondimentDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + ", Mocha"
    override fun getCost(): Double {
        val sizeCost = when(size) {
            Size.Tall -> .10
            Size.Venti -> .15
            Size.Grande -> .20
        }
        return beverage.getCost() + sizeCost + .10
    }
}