package fruitObj

class FruitStand(val id: Int, val name: String, val baskets: Set<Basket>) {
    val totalCost: Int
        get() = baskets.sumOf { it.price }

    override fun toString(): String {
        return "$name $baskets: $totalCost kr"
    }
}