package fruitObj

/**
 * Example data of available fruit stands
 * @see FruitStand
 */
val Stands: List<FruitStand> = listOf(
    FruitStand(0, "Gbg Stand",
        mutableSetOf(
            Basket("Cherry Basket", 5, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 3,  setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(1, "Partille Stand",
        mutableSetOf(
            Basket("Cherry Basket", 9, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 2, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(2, "Kotlin Stand",
        mutableSetOf(
            Basket("Cherry Basket", 6, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 1, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand(3, "Java Stand",
        mutableSetOf(
            Basket("Summer Basket", 10, setOf( FruitInfo(Fruits.PEAR, 7), FruitInfo(Fruits.PEACH, 7) ))
        )
    ),
    FruitStand(4, "Python Stand",
        mutableSetOf(
            Basket("Spring Basket", 10, setOf( FruitInfo(Fruits.PEAR, 12), FruitInfo(Fruits.CHERRY, 7) ))
        )
    )
)