package org.solovova.std_spring_firstapp

import org.solovova.std_spring_firstapp.player.ClassicMusic
import org.solovova.std_spring_firstapp.player.Music
import org.solovova.std_spring_firstapp.player.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
        )
        val musicBean = context.getBean("musicBean", Music::class.java)


        val musicPlayer = MusicPlayer(musicBean)
        musicPlayer.play()

        context.close()
    }
}