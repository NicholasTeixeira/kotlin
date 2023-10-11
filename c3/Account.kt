package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

import java.time.temporal.TemporalAmount

class Account {

    var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }
}