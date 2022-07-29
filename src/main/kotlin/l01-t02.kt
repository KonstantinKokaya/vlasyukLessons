// Метод нахождения суммы цифр двузначного числа

val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    println(findSumm(scan.nextLine().toInt()))
}

fun findSumm(number: Int): Int{
    return number/10 + number%10
}