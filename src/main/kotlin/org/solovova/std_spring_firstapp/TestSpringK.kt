package org.solovova.std_spring_firstapp

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpringK {
    @JvmStatic
    fun main(args: Array<String>) {
//        val context = ClassPathXmlApplicationContext(
//            "applicationContextK.xml"
//        )
//        val testBean = context.getBean("testBean", TestBeanK::class.java)
//        println(testBean.name)
//        context.close()

        val musicPlayer = MusicPlayer(ClassicMusic())
        musicPlayer.play()
    }
}