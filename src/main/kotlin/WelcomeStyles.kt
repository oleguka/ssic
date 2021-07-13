import kotlinx.css.*
import styled.StyleSheet

object WelcomeStyles : StyleSheet("WelcomeStyles", isStatic = true) {
    val textContainer by css {
        padding(5.px)

        backgroundColor = rgb(8, 97, 22)
        color = rgb(56, 246, 137)
    }

    val textInput by css {
        margin(vertical = 5.px)

        borderWidth = 1.px
        fontSize = 14.px
    }

    val numberInput by css {
        margin(vertical = 5.px)
        fontFamily = "Georgia"
        fontWeight = FontWeight.bold
        borderWidth = 1.px
        fontSize = 14.px
    }
}
