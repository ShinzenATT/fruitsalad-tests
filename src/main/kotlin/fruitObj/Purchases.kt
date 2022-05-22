package fruitObj

/**
 * A list object for containing purchased baskets
 */
class Purchases: MutableList<Purchases.BasketEntry> by ArrayList()
{
    /**
     * Adds a basket to the list of purchases
     * @param basket Purchased Basket
     * @param srcStand The stand the basket was purchased from
     */
    fun add(basket: Basket, srcStand: FruitStand)
    {
        add(BasketEntry(basket, srcStand))
    }

    override fun toString(): String = "Purchases: \n" + joinToString("\n") { it.toString() }

    /**
     * A data class for containing purchased baskets while keeping track of which stands they were purchased from
     * @param basket Purchased Basket
     * @param srcStand The stand the basket was purchased from
     */
    data class BasketEntry(val basket: Basket, val srcStand: FruitStand)
    {
        override fun  toString(): String = "${basket.name} that contains ${basket.contents.map { it.fruit.name }} with cost of ${basket.price}kr from ${srcStand.name}"
    }
}