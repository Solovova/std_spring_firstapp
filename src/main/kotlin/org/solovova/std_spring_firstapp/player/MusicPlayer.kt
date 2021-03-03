package org.solovova.std_spring_firstapp.player

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component("musicPlayer")
class MusicPlayer {
    @Autowired
    @Qualifier("classicMusic")
    private lateinit var music: Music


    @Value("Set from nameFromSetter")
    private lateinit var nameFromSetter: String

    @Value("\${mp.nameFromFile}")
    private lateinit var nameFromFile: String

    fun doInit() {
        println("Init method")
    }

    fun doDestroy() {
        println("Destroy method")
    }



    fun play() {
        music.play()
        println("nameFromSetter ${this.nameFromSetter}")
        println("nameFromFile ${this.nameFromFile}")
    }


}