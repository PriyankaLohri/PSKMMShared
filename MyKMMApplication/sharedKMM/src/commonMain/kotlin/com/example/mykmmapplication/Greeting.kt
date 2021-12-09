package com.example.mykmmapplication

class Greeting {
    fun greeting(): String {
        var number = 5.5
        print("Result = ${(number)}")
        return "Hello Priyanka K! \n Welcome to, ${Platform().platform}!"

    }
    fun mathTest(): String {
        var number1 = 5.5
        var number2 = 1.2
        var result = number1 + number2
        return " Here is the calculation => ${number1} +  ${number2} =  ${result}"
    }
}