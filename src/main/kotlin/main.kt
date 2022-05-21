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
    val s = stands.firstOrNull{ it.baskets.any{ b ->
        // search for a stand that has a basket with pears and other fruits
        b.contents.any{ f-> f.fruit == Fruits.PEAR } && b.contents.size > 1
    } }

    if(s != null) {
        val b = s.baskets.first{ it.contents.any{ f-> f.fruit == Fruits.PEAR } } // extract basket with pears
        println(" stand with id ${s.id} has a mixed basket with pear with price ${b.price}kr")
    } else {
        println("No stand with basket with pear mixed with other fruits")
    }
}