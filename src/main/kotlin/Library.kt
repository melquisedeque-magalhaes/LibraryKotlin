class Library(name: String, pages: Int, author: String) {
    private var name: String = ""
    private var pages: Int = 0
    private var author: String = ""

    private fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }

    private fun setPages(pages: Int){
        this.pages = pages
    }

    fun getPages(): Int {
        return this.pages
    }

    private fun setAuthor(author: String){
        this.author = author
    }

    fun getAuthor(): String{
        return this.author
    }

    init {
        setName(name)
        setPages(pages)
        setAuthor(author)
        println("\n Livro Criado com sucesso!\n")
    }
}