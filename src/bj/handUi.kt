@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi(h:Hand) {
  div {

    attrs.style = js {
      width = "10rem"
      height = "10rem"
      padding = "1rem"
      marginTop = "1rem"
      marginRight = "1rem"
      background = "cyan"
    }

    div { b { +"${h.name} Hand" } }
    div {
       h.cards.forEach {
         div { +it.name }
       }
    }
    div { b { +"${h.points} Point" } }
  }
}
