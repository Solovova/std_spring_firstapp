package org.solovova.std_spring_firstapp

import org.solovova.std_spring_firstapp.player.ClassicMusic
import org.solovova.std_spring_firstapp.player.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun classicMethod() {
        val mp = MusicPlayer.createInstance(ClassicMusic())
        mp.play()
    }

    @JvmStatic
    fun springMethod() {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")

        val mp = context.getBean("musicPlayer", MusicPlayer::class.java)
        mp.play()

        context.close()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        springMethod()
    }
}