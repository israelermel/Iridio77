package com.github.israelermel.iridio77.impl

import com.android.ddmlib.IDevice
import com.github.israelermel.iridio77.events.AndroidDebugEvent
import com.github.israelermel.iridio77.ui.models.Command

interface AndroidDebugBridgeManagerImplementation {

    fun onDebugEventTriggered(event: AndroidDebugEvent)
    fun executeEvent(event: AndroidDebugEvent, device: IDevice)
    fun changeFontSize(command: Command)
    fun changeDisplayDaltonizer(command: Command)
    fun screenDensity(command: Command)
    fun executeEventListener(execute: (device: IDevice) -> Unit)
}
