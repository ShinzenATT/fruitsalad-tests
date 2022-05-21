package fruitObj

/**
 * Enum class for the different types of fruits
 */
enum class Fruits {
    PEAR, CHERRY, PEACH
}

/**
 * Data helper class that contains fruit type and amount
 * @param fruit the type of fruit from the [Fruits] enum
 * @param amount the amount of the fruit
 * @see Basket
 */
class FruitInfo(val fruit: Fruits, val amount: Int)