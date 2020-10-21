package decorator.starbuzz

abstract class CondimentDecorator(internal val beverage: Beverage): Beverage {
    override val size: Size = beverage.size
}