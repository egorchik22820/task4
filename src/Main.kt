fun main() {
    print("число1 число2 операция\n")
    val input = readln()

    var splits = input.split(" ")
    var num1 = splits[0].toDouble()
    var num2 = splits[1].toDouble()
    var oper = splits[2]


    val result = when (oper) {
        "+" -> print(num1 + num2)
        "-" -> print(num1 - num2)
        "*" -> print(num1 * num2)
        "/" -> {
            if (num2 != 0.0)
                print(num1 / num2)
            else print("на ноль нельзя")
        }
        else -> print("что-то пошло не так")
    }
}