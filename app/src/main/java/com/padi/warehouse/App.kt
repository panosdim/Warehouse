package com.padi.warehouse

import android.content.BroadcastReceiver
import androidx.camera.core.Camera
import androidx.compose.ui.unit.dp


val paddingSmall = 4.dp
val paddingLarge = 8.dp
val paddingExtraLarge = 16.dp

var camera: Camera? = null
lateinit var onComplete: BroadcastReceiver

const val CHANNEL_ID = "Warehouse-Channel"
const val TAG = "Warehouse-Tag"