open class MediaResource(val title: String) {
}

class Book(title: String) : MediaResource(title)
class Video(title: String) : MediaResource(title)

interface Library<out T> {
    fun getResource(): T
}

class BookLibrary(private val books: List<Book>) : Library<Book> {
    override fun getResource(): Book {
        return books.random()
    }
}

class VideoLibrary(private val videos: List<Video>) : Library<Video> {
    override fun getResource(): Video {
        return videos.random()
    }
}

fun listResources(resources: List<Library<out MediaResource>>) {
    resources.map {
        it.getResource()
    }.map {

        println(it.title)
    }
}

fun main() {
    val bookLibrary: Library<Book> = BookLibrary(listOf(Book("1984"), Book("Brave New World")))
    val videoLibrary: Library<Video> = VideoLibrary(listOf(Video("Inception"), Video("Interstellar")))

    val libraries: List<Library<MediaResource>> = listOf(bookLibrary, videoLibrary)

    listResources(libraries)
}
