@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUi(g: Game, eh: Eh) {
  div {
    h1 { +"Blackjack" }
    buttonBar(eh)
    div {

      attrs.title = "Foo"
      attrs.style = kotlinext.js.js {
        display = "flex"
      }

      handUi(g.ph)
      handUi(g.dh)


    }
  }
}