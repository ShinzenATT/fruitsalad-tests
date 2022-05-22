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
            Basket("Spring Basket", 10, setOf( FruitInfo(Fruits.PEAR, 12), FruitInfo(Fruits.CHERRY, 7) ))
        )
    )
)



fun main() {

}

/**
 * Find a fruit stand with a cherry basket and peach basket for lowest price
 * @param purchases The list of purchases to add to
 */
fun findCherNPreach(purchases: Purchases){
    val s = stands.filter{ it.baskets.any { b ->
        b.contents.any { f -> f.fruit == Fruits.CHERRY || f.fruit == Fruits.PEACH } && b.contents.size == 1
    } }.minByOrNull { it.totalCost }
    if(s != null) {
        purchases.add(s.baskets.first{ it.contents.any { f -> f.fruit == Fruits.CHERRY } }, s) // Purchase cherry basket
        purchases.add(s.baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEACH } }, s) // Purchase peach basket
    }
}

/**
 * search for a stand that has a basket with pears and other fruits
 * @param purchases The list of purchases to add to
 */
fun findMixPear(purchases: Purchases){
    val s2 = stands.firstOrNull{ it.baskets.any{ b ->
        b.contents.any{ f-> f.fruit == Fruits.PEAR } && b.contents.size > 1
    } }

    if(s2 != null) {
        purchases.add(s2.baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEAR } }, s2) // Purchase mixed pear basket
    }
}

/**
 * Prints stats about the purchases such as total price, number of baskets
 */
fun printStats(purchases: Purchases){
    // Unique fruits purchased
    val fruitSet = purchases.map { it.basket.contents }.flatten().map { it.fruit }.toSet()
    // Unique fruit stands purchased from
    val uniqueStands = purchases.map { it.srcStand }.toSet().size

    println(
        "During the trip you bought ${purchases.size} baskets from $uniqueStands different stands and ${fruitSet.size} different fruits.\n" +
                "The total cost was ${purchases.sumOf { it.basket.price }}. And the following fruits were purchased are $fruitSet.\n" +
                "Here is the list of purchases:"
    )

    purchases.forEach { println(it) }
}
