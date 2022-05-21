package fruitObj

data class Basket (val name: String, val price: Int, val contents: Set<FruitInfo>){
    override fun toString() = "$name: $price kr"
}