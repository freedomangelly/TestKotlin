package com.pzdf.testkotlin.domain

public interface Command<T> {
    fun execute(): T
}