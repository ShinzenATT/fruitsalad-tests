import fruitObj.*

/**
 * Example data of available fruit stands
 * @see FruitStand
 */
val stands: List<FruitStand> = listOf(
    FruitStand(0, "Gbg Stand",
        setOf(
            Basket("Cherry Basket", 5, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 3,  setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(1, "Partille Stand",
        setOf(
            Basket("Cherry Basket", 9, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 2, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(2, "Kotlin Stand",
        setOf(
            Basket("Cherry Basket", 6, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 1, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(3, "Java Stand",
        setOf(
            Basket("Summer Basket", 10, setOf( FruitInfo(Fruits.PEAR, 7), FruitInfo(Fruits.PEACH, 7) ))
        )
    ),
    FruitStand(4, "Python Stand",
        setOf(
            Basket("Spring Basket", 10, setOf( FruitInfo(Fruits.CHERRY, 12), FruitInfo(Fruits.PEACH, 7) ))
        )
    )
)



fun main() {
    // Cherry basket from kotlin stand
    Purchases.add(stands[2].baskets.first{ it.contents.any { f -> f.fruit == Fruits.CHERRY }}, stands[2])
    // Peach basket from kotlin stand
    Purchases.add(stands[2].baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEACH }}, stands[2])
    // Summer basket from java stand
    Purchases.add(stands[3].baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEAR }}, stands[3])

    println(Purchases)
}