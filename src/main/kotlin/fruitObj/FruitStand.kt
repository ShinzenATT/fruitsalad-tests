package fruitObj

/**
 * A class representing a fruit stand.
 * @param id the id of the fruit stand
 * @param name the name of the fruit stand
 * @param baskets  a set of [Basket]s available for purchase
 */
class FruitStand(val id: Int, val name: String, val baskets: Set<Basket>) {
    /**
     * @return the total price of all the baskets available in the fruit stand
     */
    val totalCost: Int
        get() = baskets.sumOf { it.price }

    override fun toString(): String {
        return "$name $baskets: $totalCost kr"
    }
}