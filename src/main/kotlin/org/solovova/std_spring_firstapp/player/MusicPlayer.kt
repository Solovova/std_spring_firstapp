package org.solovova.std_spring_firstapp.player

class MusicPlayer(private val music: Music) {
    private var nameFromSetter: String? = null

    var nameFromFile: String? = null

    fun setNameFromSetter(nameFromSetter: String) {
        this.nameFromSetter = nameFromSetter
    }

    fun play() {
        music.play()
        println("nameFromSetter ${this.nameFromSetter}")
        println("nameFromFile ${this.nameFromFile}")
    }
}