import fruitObj.*

val stands: List<FruitStand> = listOf(
    FruitStand("Gbg Stand",
        setOf(
            Basket("Cherry Basket", 5, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 3,  setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand("Partille Stand",
        setOf(
            Basket("Cherry Basket", 9, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 2, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    ),
    FruitStand("Kotlin Stand",
        setOf(
            Basket("Cherry Basket", 6, setOf( FruitInfo(Fruits.CHERRY, 20) )),
            Basket("Peach Basket", 1, setOf( FruitInfo(Fruits.PEACH, 10) ))
        )
    )
)

fun main() {
    println( stands.minByOrNull { it.totalCost } ?: "No fruit stands available" )
}