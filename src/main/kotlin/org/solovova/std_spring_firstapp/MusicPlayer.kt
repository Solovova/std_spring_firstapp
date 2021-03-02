package org.solovova.std_spring_firstapp

interface Music {
    fun play()
}

class RockMusic: Music {
    override fun play() {
        println("RockMusic")
    }
}

class ClassicMusic: Music {
    override fun play() {
        println( "ClassicMusic")
    }
}

class MusicPlayer(music: Music) {
    private val music: Music = music
    fun play() {
        music.play()
    }
}