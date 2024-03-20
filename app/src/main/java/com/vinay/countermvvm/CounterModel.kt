package com.vinay.countermvvm

data class CounterModel(var count: Int)

class CounterRepository() {
    private var counter = CounterModel(0)

    fun getCounter() = counter

    fun incrementCount() {
        counter.count++
    }

    fun drcrementCount() {
        counter.count--
    }
}