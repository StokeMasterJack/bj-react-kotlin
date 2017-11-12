package bj

class Game {

  private var deck = Deck()
  val ph = Hand("Player")
  val dh = Hand("Dealer")

  var isStay: Boolean = false

  init {
    deal()
  }

  fun deal() {
    ph.clear()
    dh.clear()
    ph.add(takeSafe())
    ph.add(takeSafe())
    dh.add(takeSafe())
    dh.add(takeSafe())
    isStay = false
  }

  private fun takeSafe(): Card {
    if (deck.isEmpty()) {
      deck = Deck()
    }
    return deck.take()
  }

  fun hit() {
    ph.add(takeSafe())
  }

  fun stay() {
    while (dh.points < 17) dh.add(takeSafe())
    isStay = true
  }

  val over: Boolean get() = isStay || ph.points >= 21
}