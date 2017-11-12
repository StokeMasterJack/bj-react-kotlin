package bj

class Hand(val name: String) {

    private val _cards: MutableList<Card> = mutableListOf()

    fun add(card: Card) {
        _cards.add(card)
    }

    fun clear() {
        _cards.clear()
    }

    val cards get():List<Card> = _cards

    val points get() = _cards.sumBy { it.points }

    val size get() = _cards.size

}