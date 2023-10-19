package curso.kotlin.devsyd.estudoskotlin.kotlin.c3.ex002

import java.time.temporal.TemporalAmount

fun main(){
    val acount = Acount(100.0)
    println(acount.balance)

    acount.deposit(1000.0)
    acount.withdraw(100.0)
    acount.withdraw(150.0)
    println(acount.balance)

}

class Acount(balance: Double = 0.0) {
        init {
            require(balance >= 0)
        }
    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount >= 0)
        balance += amount
    }
    fun withdraw(amount: Double){
        require(amount >= 0)
        balance -= amount
    }
}