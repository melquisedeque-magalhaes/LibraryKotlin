fun main(args: Array<String>) {
    val librarys = mutableListOf<Library>()

    for(i in 0..2){
        println("\nAdicionando Livro ${i + 1}\n")

        print("Digite o nome do livro: ")
        val name:String = readLine()!!

        print("Digite a quantidade de paginas do livro: ")
        val pages:Int = readLine()!!.toInt()

        print("Digite o nome do author do livro: ")
        val author:String = readLine()!!

        librarys.add(Library(name, pages, author))
    }

    for(i in 0..2){
        println("\nLivro ${i + 1}\n")

        println("O nome do livro é ${librarys[i].getName()}")
        println("O livro tem ${librarys[i].getPages()} paginas")
        println("O author do livro é ${librarys[i].getAuthor()}")
    }

}



