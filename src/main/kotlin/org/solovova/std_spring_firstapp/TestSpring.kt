package org.solovova.std_spring_firstapp

import org.solovova.std_spring_firstapp.player.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
        )

        val firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
        firstMusicPlayer.nameFromFile= "First in program"
        val secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)

        println( firstMusicPlayer == secondMusicPlayer)

        secondMusicPlayer.play()

        context.close()
    }
}