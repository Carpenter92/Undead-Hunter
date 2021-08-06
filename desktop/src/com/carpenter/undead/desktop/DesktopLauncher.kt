package com.carpenter.undead.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.carpenter.undead.UndeadGame


fun main(arg: Array<String>) {
    LwjglApplication(UndeadGame(), LwjglApplicationConfiguration().apply {
        width = 9 * 48
        height = 16 * 48
    })
}