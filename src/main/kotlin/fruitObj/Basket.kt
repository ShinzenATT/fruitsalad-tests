package fruitObj

/**
 * A class representing a basket of fruit.
 * @param name the name of the basket
 * @param price the price of the basket
 * @param contents the fruit contents in the basket which is in the form of a set of [FruitInfo]
 */
data class Basket (val name: String, val price: Int, val contents: Set<FruitInfo>){
    override fun toString() = "$name: $price kr"
}