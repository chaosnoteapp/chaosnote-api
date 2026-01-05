package com.chaosnote.api.block
import androidx.compose.runtime.Composable

interface BlockPlugin {

    val type: String
    val shortName: String

    @Composable
    fun Render(blockHandle: BlockHandle)
}