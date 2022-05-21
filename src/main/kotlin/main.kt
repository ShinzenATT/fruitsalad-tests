import fruitObj.*

val stands: List<FruitStand> = listOf(
    FruitStand("Gbg Stand",
        setOf(
            Product("Cherry Basket", 5),
            Product("Peach Basket", 3)
        )
    ),
    FruitStand("Partille Stand",
        setOf(
            Product("Cherry Basket", 9),
            Product("Peach Basket", 2)
        )
    ),
    FruitStand("Kotlin Stand",
        setOf(
            Product("Cherry Basket", 6),
            Product("Peach Basket", 1)
        )
    )
)

fun main() {
    println( stands.minByOrNull { it.totalCost } ?: "No fruit stands available" )
}