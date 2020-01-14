package com.example.hm_ittp;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0", "Assassin’s Creed Odyssey",
                    "Misi utama Kassandra / Alexios adalah keluarga. Bahwa anak yang tumbuh keras di jalanan dan " +
                    "tanpa orang tua tersebut berambisi untuk menyatukan kembali keluarga mereka.",
                    "https://i.postimg.cc/t4Rc3Q4T/5386.png"},
            {"1", "Red Dead Redemption 2",
                    "Anda berperan sebagai seorang outlaw bernama Arthur Morgan yang hidup bersama di dalam sebuah gang yang dipimpin oleh Dutch." +
                    "Hidup dari beragam aksi kriminal yang sepertinya, menjadi spesialisasi dari anggota Dutch’s gang yang berbeda, gerombolan ini harus kabur setelah aksi raksasa mereka di Blackwater yang seharusnya menjadi akhir dari segalanya, berakhir menjadi bencana.",
                    "https://i.postimg.cc/qRrMwvhn/5385.png"},
            {"2", "Monster Hunter: World ", "Berbeda dengan Old World, New World diposisikan sebagai benua terpisah dengan ekosistem dan keganasan alam " +
                    "yang masih mengandung begitu banyak tanda tanya. Fifth Fleet diharapkan bisa muncul sebagia kekuatan ekstra untuk mempercepat badan penelitian di sana.",
                    "https://i.postimg.cc/fTCX01PB/5384.png"},
            {"3", "Marvel’s Spider-Man", "8 tahun berjuang dan Spider-Man akhirnya berkesempatan untuk menundukkan sang tokoh " +
                    "antagonis utama yang menjadi otak dan dalang di balik begitu banyak tindak kejahatan.",
                    "https://i.postimg.cc/DwWVX3ZT/5383.png"},
            {"4", "Celeste", "Himpunan Mahasiswa Desain Komunikasi Visual, berada pada Prodi " +
                    "Kamu bermain sebagai karakter imut bernama Madeline yang memiliki misi untuk memanjat sebuah gunung tinggi bernama"
                    +
                    "Celeste namun tak pasti apa alasan dibalik misi tersebut. ",
                    "https://i.postimg.cc/cCqCVBbK/5382.png"},
            {"5", "Life is Strange 2", "Sean Diaz (16 tahun) dan Daniel Diaz (9 tahun) yang harus melarikan diri dari rumah mereka di Seattle karena sebuah tragedi tertentu." +
                    "Keduanya yang tengah diburu oleh polisi akhirnya memutuskan untuk bergerak ke Puerto Lobos, Mexico,  "
                    +
                    "yang tentu saja, akan disambut dengan begitu banyak tantangan di sepanjang perjalanan tersebut. ",
                    "https://i.postimg.cc/SQMw8GDP/5389.png"},
            {"6", "Review Rainbow Six Siege", "Ia memang tidak menawarkan mode campaign yang dengan jelas memberikan Anda garis cerita dalam format mode single player layaknya Call of Duty atau Battlefield, namun bukan berarti konflik ini hadir tanpa motif yang jelas." +
                    "Walaupun hanya dalam bentuk CGI semata, garis cerita Rainbow Six Siege berpusat pada matinya tim khusus Rainbow untuk waktu yang sangat lama. Vakumnya pasukan militer khusus tersebut berimbas pada hal yang negatif  "
                    +
                    "munculnya kekuatan terorisme  di beragam tempat. Salah satu yang cukup berbahaya dan meraih popularitas cepat adalah organisasi bernama White Mask yang tak mengenal kata ampun.",
                    "https://i.postimg.cc/KY3dNrm4/5390.png"},
            {"7", "Overwatch", "Overwatch memang sebuah game multiplayer, namun bukan berarti Blizzard tak menawarkan garis cerita yang kuat untuk menjadi landasan mengapa beragam karakter dengan kemampuan khusus yang datang dari beragam negara di dunia ini tiba-tiba terlibat dalam sebuah aksi pertempuran besar-besaran untuk tujuan yang tak jelas. " +
                    "Walaupun tak seberapa signifikan mempengaruhi seperti apa pengalaman gameplay Anda, namun ia jadi konten ekstra tambahan yang bisa dibilang cukup menarik. Apalagi mengingat setting-nya yang mengambil tempat di bumi itu sendiri. "
                    +
                    "Di masa depan, manusia tak bisa hidup dengan nyaman.",
                    "https://i.postimg.cc/9QQ4rzCL/5391.png"},
            {"8", "Fortnite", "Jika ada satu skema update yang pantas dicontoh dari Fortnite adalah bagaimana mereka membuat setiap season yang mengemuka hadir dengan dramatisasi yang pantas untuk diantisipasi. " +
                    "Bahwa penambahan konten dan update tidak sekedar meluncur lewat barisan informasi patch atau berita sekilas saja, tetapi disulap menjadi event yang bisa dinikmati dan disaksikan oleh komunitasnya, bahkan ikut terlibat aktif di dalamnya.  "
                    +
                    "Salah satunya baru saja terjadi beberapa waktu lalu, dengan keseluruhan dunia Fortnite: Battle Royale yang terserap ke dalam sebuah lubang hitam. Sebuah sinyal bahwa babak baru akan dimulai.",
                    "https://i.postimg.cc/SRbdhc0T/5393.png"},
            {"9", "No Mans Sky", "No Man’s Sky memang tidak menawarkan sebuah garis cerita yang jelas dan definitif untuk Anda ikuti. Tak seperti desain game pada umumnya yang biasanya membangun narasi dengan memperkenalkan siapa sebenarnya Anda, mengapa peran Anda begitu signifikan, apa misi utama Anda, " +
                    "dan ancaman terbesar seperti apa yang harus Anda hadapi, No Man’s Sky dibangun tanpa itu semua. Sejak awal permainan, Anda hanya diberikan sebuah pesawat dan beberapa misi kecil yang mempersiapkan Anda untuk menjelajahi bintang. Walaupun demikian, masih ada lore yang bisa Anda cerna dari beragam konten yang ada.  "
                    +
                    "Walaupun tak ada satu garis cerita yang pasti, No Man’s Sky masih memiliki pondasi lore untuk hampir semua elemen yang akan Anda temui di sepanjang perjalanan, dari ras alien, teknologi kuno, hingga beragam benda misterius yang tak pernah Anda prediksi sebelumnya.",
                    "https://i.postimg.cc/MTWgSkyf/5392.png"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
