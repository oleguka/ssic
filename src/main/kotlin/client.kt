import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.Display
import kotlinx.css.display
import kotlinx.css.marginBottom
import kotlinx.css.px
import kotlinx.html.js.onClickFunction
import react.dom.*
import styled.css
import styled.styledDiv
import videoList.unwatchedVideos
import videoList.videoList
import videoList.watchedVideos

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            div {
                h3 {
                    +"Video to watch"
                }
                videoList {
                    videos = unwatchedVideos
                }
            }
            div {
                h3 {
                    +"Watched video"
                }
                videoList {
                    videos = watchedVideos
                    attrs.onClickFunction = {
                        window.alert("Clicked watched ${videos.first()}")
                    }
                }
            }
            child(Welcome::class) {
                attrs {
                    name = "Oleg"
                }
            }
        }
        render(document.getElementById("footer")) {
            styledDiv {
                css {
                    display = Display.flex
                    marginBottom = 10.px
                }
                emailShareButton {
                    attrs.url = "props.video.videoUrl"
                    emailIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
                telegramShareButton {
                    attrs.url = "props.video.videoUrl"
                    telegramIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
                pocketIcon {
                    attrs.size = 32
                    attrs.round = true
                }
                redditShareButton {
                    attrs.url = "props.video.videoUrl"
                    redditIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
            }
        }

    }
}
