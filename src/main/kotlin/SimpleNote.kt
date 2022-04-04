class SimpleNote {
    private var subject: String? = null
    private var content: String? = null

    fun displayNote() {
        val message = "$subject: $content"
        println(message)
    }

    fun setSubject(value: String) {
        subject = value
    }

    fun setContent(value: String) {
        content = value
    }

    override fun toString(): String {
        return "$subject: $content"
    }
}