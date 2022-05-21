package fruitObj

class FruitStand(val name: String, val products: Set<Product>) {
    val totalCost: Int
        get() = products.sumOf { it.price }

    override fun toString(): String {
        return "$name $products: $totalCost kr"
    }
}