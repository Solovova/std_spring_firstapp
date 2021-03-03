package org.solovova.std_spring_firstapp.player

import org.springframework.stereotype.Component

@Component("classicMusic")
class ClassicMusic: Music {
    override fun play() {
        println( "ClassicMusic")
    }
}