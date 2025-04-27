
fun main() {
    println(dereceyiFahrenheitYap(25.0))
    println(dikdortgenCevreHesapla(5.0, 10.0))
    println(faktoriyelHesapla(5))
    println(aHarfiSay("merhaba dunya"))

    println(icAciToplam(5))
    println(maasHesapla(25))
    println(kotaUcretiHesapla(60))
}

// 1. Dereceyi Fahrenheit'a çeviren metod
fun dereceyiFahrenheitYap(sicaklik: Double): Double {
    return sicaklik * 1.8 + 32
}

// 2. Dikdörtgenin çevresini hesaplayan metod
fun dikdortgenCevreHesapla(kisakenar: Double, uzunkenar: Double): Double {
    return 2 * (kisakenar + uzunkenar)
}

// 3. Faktöriyel hesaplayan metod
fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelime içinde 'a' harfi sayan metod
fun aHarfiSay(kelime: String): Int {
    return kelime.count { it == 'a' }
}

// 5. Kenar sayısına göre iç açılar toplamını hesaplayan metod
fun icAciToplam(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 6. Gün sayısına göre maaş hesaplayan metod
fun maasHesapla(gunSayisi: Int): Int {
    val toplamSaat = gunSayisi * 8
    return if (toplamSaat <= 160) {
        toplamSaat * 10
    } else {
        (160 * 10) + ((toplamSaat - 160) * 20)
    }
}

// 7. Kota miktarına göre internet ücreti hesaplayan metod
fun kotaUcretiHesapla(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        100 + (kota - 50) * 4
    }
}
