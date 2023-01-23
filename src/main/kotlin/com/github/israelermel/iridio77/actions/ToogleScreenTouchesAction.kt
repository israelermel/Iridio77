package com.github.israelermel.iridio77.actions

import com.github.israelermel.iridio77.events.AdbScreenTouchesEvent
import com.github.israelermel.iridio77.utils.AdbManagerCommands
import com.github.israelermel.iridio77.utils.IridioNotification
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ToogleScreenTouchesAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        event.project?.let { project ->
            val notification = IridioNotification(project)

            AdbManagerCommands(project, notification).executeEvent { device ->
                AdbScreenTouchesEvent(project, notification).execute(device)
            }
        }
    }
}