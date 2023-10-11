package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

import java.time.temporal.TemporalAmount

class Account(
    val accountNumber: String ,
    val accontOwner: String
) {

    var balance: Double = 0.0

    constructor() : this(accountNumber = "", accontOwner = ""){
        println("constructor()")
    }

    fun deposit(amount: Double) {
        balance += amount
    }
    fun print() {
        println("Number: $accountNumber; Owner: $accontOwner; Balance: $balance")

    }
}