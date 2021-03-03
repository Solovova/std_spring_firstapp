package org.solovova.std_spring_firstapp.player

import org.springframework.stereotype.Component

@Component("rockMusic")
class RockMusic: Music {
    override fun play() {
        println("RockMusic")
    }
}