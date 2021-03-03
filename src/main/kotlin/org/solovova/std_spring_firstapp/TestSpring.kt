package org.solovova.std_spring_firstapp

import org.solovova.std_spring_firstapp.player.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
        )

        val musicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)


        musicPlayer.play()

        context.close()
    }
}