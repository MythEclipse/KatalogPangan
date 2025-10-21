package com.mytheclipse.KatalogPangan.data

import com.mytheclipse.KatalogPangan.R
import com.mytheclipse.KatalogPangan.model.Food

object FoodData {
    val foodList = listOf(
        Food(
            id = 1,
            name = "Rendang",
            overview = "Masakan daging khas Minangkabau yang kaya rempah",
            description = "Rendang adalah masakan daging yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga kering dan berwarna hitam pekat. Rendang berasal dari Sumatera Barat dan merupakan hidangan tradisional dari suku Minangkabau. Rendang telah dinobatkan sebagai hidangan paling enak di dunia versi CNN International.",
            origin = "Sumatera Barat",
            ingredients = "Daging sapi, santan kelapa, cabai merah, bawang merah, bawang putih, jahe, kunyit, lengkuas, serai, daun jeruk, daun kunyit",
            imageRes = R.drawable.rendang
        ),
        Food(
            id = 2,
            name = "Nasi Goreng",
            overview = "Nasi yang digoreng dengan bumbu khas Indonesia",
            description = "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin, atau mentega. Bumbu-bumbu yang digunakan biasanya kecap manis, bawang merah, bawang putih, asam jawa, cabai, dan krupuk. Nasi goreng berbeda dengan nasi yang ditumis karena teknik memasak yang berbeda dan penggunaan kecap manis yang khas. Nasi goreng Indonesia telah diakui oleh dunia sebagai salah satu makanan paling enak dan terkenal di dunia.",
            origin = "Indonesia",
            ingredients = "Nasi putih, kecap manis, bawang merah, bawang putih, cabai, telur, ayam/udang, krupuk",
            imageRes = R.drawable.nasigoreng
        ),
        Food(
            id = 3,
            name = "Sate",
            overview = "Daging tusuk yang dipanggang dengan bumbu kacang",
            description = "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate. Sate dapat ditemukan di berbagai daerah di Indonesia dengan ciri khas masing-masing, seperti sate Madura, sate Padang, sate Lilit, dan lain-lain.",
            origin = "Indonesia",
            ingredients = "Daging ayam/kambing/sapi, bumbu kacang, kecap manis, bawang merah, bawang putih, ketumbar, gula merah",
            imageRes = R.drawable.sate
        ),
        Food(
            id = 4,
            name = "Gado-Gado",
            overview = "Salad sayuran dengan saus kacang kental",
            description = "Gado-gado adalah makanan khas Indonesia berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah yang dihaluskan disertai irisan telur dan bawang goreng. Gado-gado dilengkapi dengan kerupuk atau emping goreng. Sedikit air asam jawa dan terasi membuat rasanya semakin sedap dan gurih. Hidangan ini sangat populer dan dapat ditemukan di seluruh Indonesia.",
            origin = "Jakarta",
            ingredients = "Sayuran rebus (kangkung, kol, tauge, kentang, kacang panjang), bumbu kacang, telur rebus, kerupuk, bawang goreng",
            imageRes = R.drawable.gadogado
        ),
        Food(
            id = 5,
            name = "Soto Ayam",
            overview = "Sup ayam khas Indonesia dengan kuah kuning",
            description = "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kuning. Warna kuning dari kuah soto berasal dari kunyit dan kadang-kadang ditambah dengan santan. Soto ayam biasanya disajikan dengan nasi, tauge, telur rebus, perkedel, dan emping. Setiap daerah memiliki variasi soto dengan ciri khas tersendiri seperti Soto Lamongan, Soto Banjar, Soto Betawi, dan lain-lain.",
            origin = "Indonesia",
            ingredients = "Ayam, kunyit, serai, daun jeruk, bawang merah, bawang putih, jahe, telur rebus, tauge, seledri",
            imageRes = R.drawable.soto
        ),
        Food(
            id = 6,
            name = "Gudeg",
            overview = "Masakan manis dari nangka muda khas Yogyakarta",
            description = "Gudeg adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat gudeg. Warna cokelat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu, dan sambal goreng krecek. Gudeg memiliki rasa manis dan gurih yang khas.",
            origin = "Yogyakarta",
            ingredients = "Nangka muda, santan kelapa, gula merah, bawang merah, bawang putih, kemiri, ketumbar, daun salam, daun jati",
            imageRes = R.drawable.gudeg
        ),
        Food(
            id = 7,
            name = "Rawon",
            overview = "Sup daging berkuah hitam khas Jawa Timur",
            description = "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwak. Rawon berasal dari Jawa Timur dan sering ditemukan di kota-kota seperti Surabaya dan Malang. Warna hitam yang khas berasal dari kluwak (keluak), buah dari pohon kepayang. Rawon disajikan dengan nasi putih, tauge mentah, telur asin, dan sambal. Kuahnya yang gurih dan sedikit pedas membuat rawon sangat digemari.",
            origin = "Jawa Timur",
            ingredients = "Daging sapi, kluwak, kemiri, bawang merah, bawang putih, jahe, lengkuas, serai, daun jeruk, tauge",
            imageRes = R.drawable.rawon
        ),
        Food(
            id = 8,
            name = "Pempek",
            overview = "Makanan olahan ikan dan sagu khas Palembang",
            description = "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari ikan dan sagu. Penyajiannya dilakukan dengan kuah cuka yang disebut cuko (cuka dalam bahasa Palembang). Cuko dibuat dari air yang dididihkan, kemudian ditambah gula merah, udang ebi, cabe rawit tumbuk, bawang putih, dan garam. Ada berbagai jenis pempek seperti pempek kapal selam (berisi telur), pempek lenjer, pempek adaan, dan lain-lain.",
            origin = "Palembang, Sumatera Selatan",
            ingredients = "Ikan tenggiri, sagu/tapioka, telur, bawang putih, gula merah, cuka, cabai rawit, udang ebi",
            imageRes = R.drawable.pempek
        ),
        Food(
            id = 9,
            name = "Bakso",
            overview = "Bola daging dalam kuah kaldu yang gurih",
            description = "Bakso adalah makanan yang terbuat dari daging (biasanya sapi) yang digiling halus kemudian dibentuk bulat-bulat seperti bola pingpong. Bakso umumnya disajikan dalam mangkuk berisi kuah kaldu sapi panas dengan mie, bihun, tauge, tahu, dan terkadang telur. Bakso sangat populer di Indonesia dan dapat ditemukan dari pedagang kaki lima hingga restoran besar. Setiap daerah memiliki variasi bakso dengan ciri khas tersendiri seperti bakso Malang, bakso Solo, bakso urat, dan lain-lain.",
            origin = "Indonesia",
            ingredients = "Daging sapi giling, tepung tapioka, bawang putih, garam, merica, mie/bihun, kaldu sapi",
            imageRes = R.drawable.bakso
        ),
        Food(
            id = 10,
            name = "Nasi Uduk",
            overview = "Nasi gurih yang dimasak dengan santan dan rempah",
            description = "Nasi uduk adalah makanan khas Betawi yang terbuat dari beras yang dimasak dengan santan dan rempah-rempah. Nasi uduk biasanya disajikan dengan lauk pauk seperti ayam goreng, telur dadar/balado, tempe orek, bawang goreng, emping, dan sambal kacang. Aromanya yang harum dan rasanya yang gurih membuat nasi uduk menjadi menu sarapan favorit masyarakat Jakarta dan sekitarnya. Nasi uduk sering dijual pada pagi hari oleh pedagang kaki lima.",
            origin = "Jakarta",
            ingredients = "Beras, santan kelapa, serai, daun salam, daun jeruk, jahe, bawang merah, bawang putih",
            imageRes = R.drawable.nasiuduk
        ),
        Food(
            id = 11,
            name = "Ayam Betutu",
            overview = "Ayam bumbu khas Bali yang kaya rempah",
            description = "Ayam betutu adalah makanan khas Bali yang terbuat dari ayam yang dibumbui dengan bumbu khas Bali yang disebut bumbu betutu. Ayam betutu dibuat dengan memasukkan bumbu ke dalam perut ayam, kemudian ayam dibungkus dengan daun pisang dan dipanggang dalam api sekam atau dibakar dalam oven. Proses memasaknya memakan waktu yang cukup lama sehingga bumbu meresap sempurna ke dalam daging ayam. Rasanya pedas, gurih, dan sangat kaya rempah.",
            origin = "Bali",
            ingredients = "Ayam kampung, cabai merah, bawang merah, bawang putih, kunyit, jahe, lengkuas, kencur, terasi, kemiri, serai",
            imageRes = R.drawable.ayambetutu
        ),
        Food(
            id = 12,
            name = "Pecel Lele",
            overview = "Ikan lele goreng dengan sambal dan lalapan",
            description = "Pecel lele adalah makanan yang terdiri dari ikan lele yang digoreng kering dan disajikan dengan sambal terasi dan lalapan seperti kemangi, kubis, dan timun. Pecel lele biasanya dimakan dengan nasi hangat dan tempe atau tahu goreng. Sambal yang pedas dan gurih menjadi ciri khas dari pecel lele. Makanan ini sangat populer di Jawa dan dapat ditemukan di warung-warung makan hingga restoran. Pecel lele cocok dinikmati kapan saja, baik siang maupun malam hari.",
            origin = "Jawa",
            ingredients = "Ikan lele, sambal terasi, cabai rawit, kemangi, kubis, timun, tempe, tahu",
            imageRes = R.drawable.pecellele
        )
    )
}
