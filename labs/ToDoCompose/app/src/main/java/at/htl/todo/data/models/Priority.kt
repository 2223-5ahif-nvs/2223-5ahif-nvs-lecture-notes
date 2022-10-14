package at.htl.todo.data.models

import androidx.compose.ui.graphics.Color
import at.htl.todo.ui.theme.HighPriorityColor
import at.htl.todo.ui.theme.LowPriorityColor
import at.htl.todo.ui.theme.MediumPriorityColor
import at.htl.todo.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}