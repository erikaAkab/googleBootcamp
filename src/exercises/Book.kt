package exercises

const val MAX_BOOKS = 10


class Book(val title: String, val author: String, val year: Int) {
    companion object {
        const val BASE_URL = "http:/algo"
    }

    fun printUrl(){
        println("${BASE_URL}/$title.html")
    }

    fun canBorrow(currentNumber: Int): Boolean {
        return currentNumber + 1 < MAX_BOOKS
    }

    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

fun getInfo(book: Book): Pair<String, String> {
    return book.author to book.title
}

fun getFullInfo(book: Book): Triple<String, String, Int> {
    return Triple(book.author, book.title, book.year)
}

fun main() {
    val book = Book("livro", "fulano", 2001)
//    val (author, title, year) = getFullInfo(book)
//    println("Here is your book $title written by $author in $year")
//    val (author2, title2) = getInfo(book)
//    println("Here is your book $title2 written by $author2")
//
//    val allBooks = setOf(Book("Obra 1", "fulano", 2002), Book("Obra 2", "fulano", 2002), Book("Obra 3", "fulano", 2002))
//    val library = mapOf(allBooks to "fulano")
//    println(library.any { colecao ->  colecao.key.any { livro -> livro.title.equals("Obra 1") } })
//
//    val moreBooks = mutableMapOf<String, String>()
//    moreBooks.put("Obra x", "Fulano 2")
//
//    println(moreBooks.getOrPut("Obra 3", {"fulano3"}))
//    println(moreBooks.getOrPut("Obra 3", {"fulano3"}))
//
//    println(moreBooks)

    println(book.canBorrow(30))
    book.printUrl()
}

//class eBook(title: String, author: String, format: String = "text") : Book(title, author) {
//    private var wordsRead = 0
//
//    override fun readPage() {
//        wordsRead = wordsRead + 250
//    }
//}

