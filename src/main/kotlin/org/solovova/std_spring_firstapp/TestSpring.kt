package org.solovova.std_spring_firstapp

import org.solovova.std_spring_firstapp.player.MusicPlayer
import org.springframework.context.annotation.AnnotationConfigApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = AnnotationConfigApplicationContext(SpringConfig::class.java)
        val mp = context.getBean("musicPlayer", MusicPlayer::class.java)
        mp.play()

        context.close()
    }
}