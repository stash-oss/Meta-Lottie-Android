package com.stash.sample

import androidx.compose.runtime.Composable
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.compose.LottieDynamicProperties
import com.airbnb.lottie.compose.rememberLottieDynamicProperties
import com.airbnb.lottie.compose.rememberLottieDynamicProperty
import com.stash.metalottie.compose.ColorType.FILL
import com.stash.metalottie.compose.ColorType.STROKE
import com.stash.metalottie.compose.ColorValueIdentifier
import com.stash.metalottie.compose.LocalMetaLottie

@Composable
fun rememberTestLottieDynamicProperties(): LottieDynamicProperties {
    // Generated dynamic properties for a single lottie file
    return rememberLottieDynamicProperties(
        rememberLottieDynamicProperty(
            property = LottieProperty.STROKE_COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    STROKE,
                    "primary"
                )
            ) ?: 0x009CEB,
            keyPath = arrayOf("Shape Layer 2", "Shape 1", "Stroke 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.STROKE_COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    STROKE,
                    "background"
                )
            ) ?: 0x0B1620,
            keyPath = arrayOf("circle", "Group 3", "Stroke 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.STROKE_COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    STROKE,
                    "accent"
                )
            ) ?: 0x009CEB,
            keyPath = arrayOf("stroke 2", "Ellipse 41", "Fill 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    FILL,
                    "primary"
                )
            ) ?: 0x000000,
            keyPath = arrayOf("circSmall 8", "Ellipse 1", "Fill 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    FILL,
                    "primary"
                )
            ) ?: 0x000000,
            keyPath = arrayOf("circSmall 7", "Ellipse 1", "Fill 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    FILL,
                    "primary"
                )
            ) ?: 0x000000,
            keyPath = arrayOf("circSmall 6", "Ellipse 1", "Fill 1")
        ),
        rememberLottieDynamicProperty(
            property = LottieProperty.COLOR,
            value = LocalMetaLottie.current.themeColorProvider.getValue(
                ColorValueIdentifier(
                    FILL,
                    "primary"
                )
            ) ?: 0x000000,
            keyPath = arrayOf("circSmall 5", "Ellipse 1", "Fill 1")
        ),
    )
}
