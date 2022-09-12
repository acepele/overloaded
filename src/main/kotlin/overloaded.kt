fun main() {

    printUserInfo()
    printUserInfo("Ben", "815-999-6556")
    printUserInfo("Alpha It","Romeo", "815-261-7121")
}

fun printUserInfo(name: String, phone_number: String) {
   println("$name, $phone_number")

}

fun printUserInfo(business_name: String, contact_name: String, phone_number: String) {
    println("$business_name, $contact_name, $phone_number")

}

fun printUserInfo() {
    println("Please enter the number of your selection: ")
    println("1. Business Customer")
    println("2. Residential Customers")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

}


