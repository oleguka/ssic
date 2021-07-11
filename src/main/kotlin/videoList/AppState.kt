package videoList

import react.RState
import videoList.Video

external interface AppState : RState {
    var currentVideo: Video?
}