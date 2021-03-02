package org.solovova.std_spring_firstapp.player

class MusicPlayer(private val music: Music) {
    fun play() {
        music.play()
    }
}