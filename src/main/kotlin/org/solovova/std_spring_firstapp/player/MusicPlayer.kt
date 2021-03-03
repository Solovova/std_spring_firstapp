package org.solovova.std_spring_firstapp.player

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component("musicPlayer")

class MusicPlayer @Autowired constructor(
    @Qualifier("classicMusic")
    music: Music
) {

    private val music: Music = music

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


}