package com.dileva.uicomponents.ext

import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun <T> View.setOnClick(t: T, action: (T) -> Unit) = setOnClickListener { action.invoke(t) }
fun View.setOnClick(action: () -> Unit) = setOnClickListener { action() }

infix fun View.setVisibility(visible: Boolean) {
    visibility = if (visible) View.VISIBLE else View.GONE
}

fun <T> List<T>.perform(action: T.() -> Unit) {
    forEach {
        action.invoke(it)
    }
}