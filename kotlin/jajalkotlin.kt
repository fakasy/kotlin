/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Halo dunia")
    var nabil1 = Nabil()
    nabil1.kuping="Ningrum"
    nabil1.jumlahBulu=6
    


println(nabil1.kuping)
var nabil2=Nabil("Cahya",3)
var nabil3=Nabil("Firdaus",8)

var ListNabil:MutableList<Nabil> =mutableListOf(nabil1,nabil2,nabil3)
ListNabil[2].kentut(4)
for (x in ListNabil){
    if(x.kuping=="Cahya"){
        x.kentut(20)
        
    }else {
        x.kentut(4)
    }
}
}

class Nabil(var kuping:String="", var jumlahBulu:Int=0){
fun kentut(jauh:Int){
    println("Nabil ${kuping} kentut sejauh ${jauh} meter")
}
}
