class SecondsDipslay(private val seconds: Int) {

    fun state(): String =
        if (seconds.even()) "Y" else "O"
}

private fun Int.even(): Boolean =
    this  %2 == 0
