package com.dileva.core.ext

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigator

fun NavController.navigateSafe(
    fromDestinationId: Int,
    toDirections: NavDirections,
    extras: Navigator.Extras? = null
) {
    if (currentDestination?.id == fromDestinationId) {
        if (extras != null) navigate(toDirections, extras)
        else navigate(toDirections)
    }
}