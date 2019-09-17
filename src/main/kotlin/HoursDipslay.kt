class HoursDipslay(var hours: Int) {
    fun state(): String {
        return firstLine() + "\n" + secondLineHours()
    }

    private fun firstLine(): String {
        return (0..3)
            .map { if(it < hours /5 ) "R" else "O" }
            .joinToString("")
    }

    private fun secondLineHours(): String {
        return (0..3)
            .map { if(it< hours %5) "R" else "O" }
            .joinToString("")
    }

}
