package videoList

import react.RProps

external interface VideoListProps : RProps {
    var videos: List<Video>
}