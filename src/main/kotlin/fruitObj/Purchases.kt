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
    private fun add(basket: Basket, srcStand: FruitStand)
    {
        add(BasketEntry(basket, srcStand))
    }

    /**
     * Adds a basket to the list of purchases and removes it from the stand it was purchased from
     * @param basket Purchased Basket
     * @param srcStand The stand the basket was purchased from
     * @throws NoSuchElementException if the basket is not in the stand or the stand is not in the list
     * @see Stands
     */
    fun purchase(basket: Basket, srcStand: FruitStand)
    {
        val success = Stands.first { it == srcStand }.baskets.remove(basket)

        if (!success) {
            throw NoSuchElementException("Basket not found in stand")
        }

        add(basket, srcStand)
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