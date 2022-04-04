class SimpleNoteWithConstructor(var subject: String?,
                                var content: String?) {
    private var comments: String? = null

    init {
        comments = "No comment yet. Please rate and subscribe"

        if (subject != null) {
            subject = subject!!.uppercase()
        }
    }
    override fun toString(): String {
        return "$subject: $content\nComments:\n$comments"
    }
}