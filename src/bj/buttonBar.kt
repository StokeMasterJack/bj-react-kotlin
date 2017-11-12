@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div

interface Eh {
  fun deal()
  fun hit()
  fun stay()
}


fun RBuilder.buttonBar(eh: Eh) {
  div {
    button {
      +"Deal"
      attrs.onClickFunction = {
        eh.deal()
      }
    }
    button {
      +"Hit"
      attrs.onClickFunction = {
        eh.hit()
      }
    }
    button {
      +"Stay"
      attrs.onClickFunction = {
        eh.stay()
      }
    }

  }
}