class SecondsDipslay(private val seconds: String) {

    fun state(): String =
        if (seconds.toInt().even()) "Y" else "O"
}

private fun Int.even(): Boolean =
    this  %2 == 0
