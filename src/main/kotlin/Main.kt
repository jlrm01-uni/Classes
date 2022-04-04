fun main(args: Array<String>) {
    val note1 = SimpleNote()

    note1.setSubject("blah blah")
    note1.setContent("tidal wave!")

    note1.displayNote()

    println(note1)

    val note2 = SimpleNoteWithConstructor("perro", "gato")
    println(note2)

    // Testing our NoteCollection
    val collection = NoteCollection()

    val note3 = SimpleNote()
    note3.setSubject("more blah blah")
    note3.setContent("More stuff nobody reads")

    collection.addNote(note1)
    collection.addNote(note3)
    println(collection)

    collection.removeNote(0)
    println(collection)

    collection.removeNote(5)
}