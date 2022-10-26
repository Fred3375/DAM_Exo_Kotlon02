fun main(args: Array<String>) {
    val utilitaireBoissons = UtilitaireBoissons()
    val listeBoissons = utilitaireBoissons.createListeBoissons()

    println("String chargée avec la ressource entière")
    println(listeBoissons)
    utilitaireBoissons.display(listeBoissons)
    println()


    println("Nom trié par ordre alphabétique")
    val listeTriee1 = listeBoissons
        .map { b-> b.name }
        // .filter {prix > 300 }
        .sortedDescending()
    for (b in listeTriee1) {
        println("<" + b + ">")
    }
    println()



/* TODO essayer de finir
    println("Nom et prix trié par ordre alphabétique sur le nom")
    val listeTriee2 = listeBoissons.toList()
        .map { p-> p.name }
        .sorted()
    for (b in listeTriee2) {
        println("<" + b + ">")
    }
    println()
*/



}