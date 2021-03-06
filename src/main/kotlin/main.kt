import fruitObj.*

/**
 * Starts the program. Buys baskets for Pelle, Kajsa and their friend while also printing out the stats.
 */
fun main() {
    val pelleKajsaP = Purchases()
    findCherNPreach(pelleKajsaP)
    findMixPear(pelleKajsaP)

    println("-------------------- PELLE & KAJSA Purchases --------------------")
    printStats(pelleKajsaP)

    val friendP = Purchases()
    findCherNPreach(friendP)
    findMixPear(friendP)

    println("\n-------------------- FRIEND Purchases --------------------")
    printStats(friendP)

}

/**
 * Find a fruit stand with a cherry basket and peach basket for lowest price
 * @param purchases The list of purchases to add to
 */
fun findCherNPreach(purchases: Purchases){
    val s = Stands.filter{ it.baskets.any { b ->
        b.contents.any { f -> f.fruit == Fruits.CHERRY || f.fruit == Fruits.PEACH } && b.contents.size == 1
    } }.minByOrNull { it.totalCost }
    if(s != null) {
        purchases.purchase(s.baskets.first{ it.contents.any { f -> f.fruit == Fruits.CHERRY } }, s) // Purchase cherry basket
        purchases.purchase(s.baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEACH } }, s) // Purchase peach basket
    }
}

/**
 * search for a stand that has a basket with pears and other fruits
 * @param purchases The list of purchases to add to
 */
fun findMixPear(purchases: Purchases){
    val s2 = Stands.firstOrNull{ it.baskets.any{ b ->
        b.contents.any{ f-> f.fruit == Fruits.PEAR } && b.contents.size > 1
    } }

    if(s2 != null) {
        purchases.purchase(s2.baskets.first{ it.contents.any { f -> f.fruit == Fruits.PEAR } }, s2) // Purchase mixed pear basket
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
                "The total cost was ${purchases.sumOf { it.basket.price }}kr. And the following fruits that were purchased are $fruitSet.\n" +
                "Here is the list of purchases:"
    )

    purchases.forEach { println(it) }
}
