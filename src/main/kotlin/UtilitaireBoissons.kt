import java.io.File

class UtilitaireBoissons {

    fun display(plList: ArrayList<Boisson>) {
        for (p in plList) {
            println(
                          "ID = " + p.id + "/"
                        + "NOM = " + p.name + "/"
                        + "PRIX = " + p.prix
            );
        }
    }

    fun createListeBoissons() :  ArrayList<Boisson> {
        val uri = UtilitaireBoissons::class.java.getResource("Boissons/BoissonData.csv").toURI()
        val f = File(uri)
        println("URI = " + uri)
        var liste = ArrayList<Boisson>()
        f.forEachLine {
            var t = it.split(";")
            val b = Boisson(id = Integer.parseInt(t[0]), name = t[1], prix = Integer.parseInt(t[2]))
            liste.add(b)
        }
        return liste
    }
}