package bj

class Card(val value: Int, val suit: Int) {

    init {
        check(value in 1..13, { "Bad card.value: $value" })
        check(suit in 1..4, { "Bad card.suit: $suit" })
    }

    val suitName get() = when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException()
    }

    val valueName get() = when (value) {
        1 -> "Ace"
        in 2..10 -> value.toString()
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> throw IllegalStateException()
    }

    val name get() = "$valueName of $suitName"

    val points get() = when (value) {
        in 1..10 -> value
        in 11..13 -> 10
        else -> throw IllegalStateException()
    }

}