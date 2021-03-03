package org.solovova.std_spring_firstapp.player

class MusicPlayer private constructor(private val music: Music) {

    private var nameFromSetter: String? = null

    var nameFromFile: String? = null
    fun doInit() {
        println("Init method")
    }

    fun doDestroy() {
        println("Destroy method")
    }

    fun setNameFromSetter(nameFromSetter: String) {
        this.nameFromSetter = nameFromSetter
    }

    fun play() {
        music.play()
        println("nameFromSetter ${this.nameFromSetter}")
        println("nameFromFile ${this.nameFromFile}")
    }

    companion object {
        @JvmStatic
        fun createInstance(music: Music): MusicPlayer {
            return MusicPlayer(music)
        }
    }



}