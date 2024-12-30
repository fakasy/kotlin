
class Siswa(val nama: String, val nis: String) {
    var hadir: Boolean = false
        private set

    fun presensi() {
        hadir = true
    }
}


class Main {
    private val daftar_siswa = mutableListOf<Siswa>()

    fun tambahSiswa(siswa: Siswa) {
        daftar_siswa.add(siswa)
    }

    fun siswaHadir(index: Int) {
        if (index in 0 until daftar_siswa.size) {
            daftar_siswa[index].presensi()
        } else {
            println("Index siswa tidak valid")
        }
    }

    fun tampilkanDaftarPresensi() {
        println("Daftar Presensi Siswa:")
        daftar_siswa.forEachIndexed { index, siswa ->
            val status = if (siswa.hadir) "Hadir" else "Tidak Hadir"
            println("${index + 1}. ${siswa.nama} (NIS: ${siswa.nis}) - $status")
        }
    }
}

fun main() {
    val mainProgram = Main()


    mainProgram.tambahSiswa(Siswa("Nabil", "785"))
    mainProgram.tambahSiswa(Siswa("Seva", "273"))
    mainProgram.tambahSiswa(Siswa("Fendy", "003"))
    mainProgram.tambahSiswa(Siswa("Rendy", "6783"))
    mainProgram.tambahSiswa(Siswa("Sava", "737"))
    mainProgram.tambahSiswa(Siswa("Fataa", "732"))
    mainProgram.tambahSiswa(Siswa("Bara", "927"))
    mainProgram.tambahSiswa(Siswa("Handika", "3922"))
    mainProgram.tambahSiswa(Siswa("Alfa", "221"))
    mainProgram.tambahSiswa(Siswa("Chakim", "010"))


    for (i in 0..7) {
        mainProgram.siswaHadir(i)
    }


    mainProgram.tampilkanDaftarPresensi()
}