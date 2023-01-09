package decorator.starbuzz

abstract class CondimentDecorator(private val beverage: Beverage, override val size: Size = beverage.size): Beverage by beverage