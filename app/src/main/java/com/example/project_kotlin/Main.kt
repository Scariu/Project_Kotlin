package com.example.project_kotlin

fun main(){
    println("Ingresar el valor en Celsius : ")
    val input = readLine()!!.toDouble()

    val celciusToFarenheint = (9.0/5.0) * (input) + 32

    println("De $input° Celcius equivale a $celciusToFarenheint grados Farenheit.")

    val celciuToKelvin = input + 273.15

    println("De $input° Celcius equivale a $celciuToKelvin grados Kelvin.")

    val farenheintToKelvin = (5.0/9.0) * (celciusToFarenheint - 32) + 273.15
    println("De $celciusToFarenheint° Farenheint equivale $farenheintToKelvin grados Kelvin.")


}

fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}