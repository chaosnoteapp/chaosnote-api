package com.chaosnote.api.block

interface BlockHandle {
    val id: String
    val payload: String
    fun update(value: String)
    fun saveState(state: Object)
    fun getState(): Object?
}