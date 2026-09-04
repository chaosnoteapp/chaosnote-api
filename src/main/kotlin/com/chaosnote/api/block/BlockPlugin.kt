package com.chaosnote.api.block
import androidx.compose.runtime.Composable
import org.pf4j.ExtensionPoint

interface BlockPlugin : ExtensionPoint {

    val type: String
    val shortName: String

    @Composable
    fun Render(blockHandle: BlockHandle)
}