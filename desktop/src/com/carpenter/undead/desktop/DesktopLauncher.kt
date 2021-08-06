package com.carpenter.undead.desktop

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.carpenter.undead.UndeadGame

/*
/Add -XstartOnFirstThread to VM options for MAC OS
*/
fun main(arg: Array<String>) {
    Lwjgl3Application(UndeadGame(), Lwjgl3ApplicationConfiguration().apply {
        setWindowedMode(9 * 48, 16 * 48)
    })
}