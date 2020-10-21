package decorator.starbuzz

fun main() {
    val drinks = mutableListOf<Beverage>()
    var drink1: Beverage = Espresso(Size.Tall)
    drink1 = Mocha(drink1)
    var drink2: Beverage = DarkRoast(Size.Venti)
    drink2 = Whip(Mocha(Mocha(drink2)))
    var drink3: Beverage = Espresso(Size.Grande)
    drinks.add(drink1)
    drinks.add(drink2)
    drinks.add(drink3)
    drinks.forEach {
        println("Drink = ${it.getDescription()}")
        println("Cost = ${it.getCost()}")
    }
}