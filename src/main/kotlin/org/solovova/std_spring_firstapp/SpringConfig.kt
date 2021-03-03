package org.solovova.std_spring_firstapp

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan ("org.solovova.std_spring_firstapp")
@PropertySource ("classpath:mp.properties")
open class SpringConfig