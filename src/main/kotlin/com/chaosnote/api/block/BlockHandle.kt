package com.chaosnote.api.block

interface BlockHandle {
    val id: String
    val payload: String
    fun update(value: String)
    fun saveState(state: Any)
    fun getState(): Any?
}