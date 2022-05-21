package fruitObj

data class Product (val name: String, val price: Int){
    override fun toString() = "$name: $price kr"
}