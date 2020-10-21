package decorator.starbuzz

class Whip(beverage: Beverage): CondimentDecorator(beverage) {
    override fun getDescription(): String = beverage.getDescription() + ", Whip"
    override fun getCost(): Double {
        val sizeCost = when (size) {
            Size.Tall -> .15
            Size.Venti -> .20
            Size.Grande -> .25
        }
        return beverage.getCost() + sizeCost + .50
    }
}