class NoteCollection {
    private val allNotes = mutableListOf<SimpleNote>()

    fun addNote(note: SimpleNote) {
        allNotes.add(note)
    }

    fun removeNote(index: Int): Boolean {
        try {
            val deletedNote = allNotes.removeAt(index)
            println("Note was removed: $deletedNote")
            return true
        } catch (e: IndexOutOfBoundsException) {
            println("Couldn't delete at index $index")
        }
        return false
    }

    override fun toString(): String {
        return "Collection: ${allNotes.joinToString()}"
    }
}