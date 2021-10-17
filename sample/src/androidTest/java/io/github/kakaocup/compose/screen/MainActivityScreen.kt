package io.github.kakaocup.compose.screen

import androidx.compose.ui.test.junit4.ComposeTestRule
import io.github.kakaocup.compose.node.KNode

class MainActivityScreen(composeTestRule: ComposeTestRule) :
    ComposeScreen<MainActivityScreen>(composeTestRule) {

    val myText1 = KNode(this) {
        hasTestTag("mySimpleText")
        hasPosition(0)
    }

    val myText2 = KNode(this) {
        hasTestTag("mySimpleText")
        hasPosition(1)
    }

    val myButton = KNode(this) {
        hasTestTag("myTestButton")
        hasText("Button 1")
    }
}