package io.multimoon.colorful

import android.content.Context
import android.support.annotation.StyleRes

class ThemeEditor(internal var primaryColor:ThemeColor=ThemeColor.INDIGO,internal  var accentColor:ThemeColor=ThemeColor.RED,internal var darkTheme:Boolean=true, internal var translucent:Boolean, internal @StyleRes var customTheme:Int=0) {

    fun setPrimaryColor(primaryColor:ThemeColor):ThemeEditor {
        this.primaryColor=primaryColor
        return this
    }

    fun setAccentColor(accentColor:ThemeColor):ThemeEditor {
        this.accentColor = accentColor
        return this
    }

    fun setDarkTheme(darkTheme:Boolean):ThemeEditor {
        this.darkTheme=darkTheme
        return this
    }

    fun setCustomThemeOverride(@StyleRes customTheme:Int):ThemeEditor {
        this.customTheme=customTheme
        return this
    }

    fun setTranslucent(translucent: Boolean):ThemeEditor {
        this.translucent=translucent
        return this
    }

    fun apply(context: Context) {
        applyEdits(context, primaryColor, accentColor, darkTheme,translucent, customTheme)
    }
}