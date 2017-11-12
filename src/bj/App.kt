package bj

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.setState

interface AppState : RState {
  var g: Game
}

class App : RComponent<RProps, AppState>() {

  override fun AppState.init() {
    g = Game()
  }

  override fun RBuilder.render() {
    gameUi(state.g, object : Eh {
      override fun deal() {
        setState {
          g.deal()
        }
      }

      override fun hit() {
        setState {
          g.hit()
        }
      }

      override fun stay() {
        setState {
          g.stay()
        }
      }
    })
  }
}

fun RBuilder.app() = child(App::class) {}