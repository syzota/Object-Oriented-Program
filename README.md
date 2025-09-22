# Posttest 1

**Nama**  : Putri Syafana Afrillia
**NIM**   : 2409116015 
**Kelas** : A'2024

---

## Program Description
Tema yang digunakan adalah **Sistem Manajemen Label Rekaman Musik** dengan konsep perusahaan dari **Universal Music Group (UMG)**. Program ini dirancang untuk menambahkan artis baru, melihat daftar, memperbarui data, serta menghapus data yang tersimpan. Seluruh interaksi dilakukan melalui inputan index dari pengguna.  

---

## Code Explanation

<img width="778" height="115" alt="image" src="https://github.com/user-attachments/assets/8feb6dea-188d-4247-bf11-56ca078e28b2" />

Bagian awal ini adalah deklarasi _package_ dan **import library** yang digunakan. **ArrayList** dipakai sebagai struktur data untuk menyimpan nama artis dan genre. _Scanner_ digunakan untuk membaca input dari pengguna.

<img width="684" height="175" alt="image" src="https://github.com/user-attachments/assets/87c580e5-b103-43a1-b8c5-747c5803f5c2" />

Di sini didefinisikan **_class_ utama** dengan nama posttest1 dan dengan **main sebagai entry point** program. Objek Scanner dipakai untuk melakukan input. Dua ArrayList dideklarasikan untuk menyimpan data artis dan genrnya. Variabel running berfungsi untuk mengontrol apakah menu masih berjalan atau program berhenti.

<img width="848" height="469" alt="image" src="https://github.com/user-attachments/assets/3c65bfd8-152e-4adc-9bfe-279758957773" />

Bagian ini adalah inti tampilan menu yang selalu diulang selama user belum memilih _exit_. _Try catch_ digunakan untuk menghindari error jika pengguna memasukkan inputan selain integer.

<img width="814" height="238" alt="image" src="https://github.com/user-attachments/assets/28336c1d-f6c6-400f-bef3-7b1db53fc30d" />

_switch-case_ digunakan untuk menangani menu. Pada **case 1**, pengguna menambahkan artis baru. Nama artis dan genre dibaca, lalu dimasukkan ke **ArrayList**. 

<img width="879" height="304" alt="image" src="https://github.com/user-attachments/assets/a079cc6a-b3a4-4bfb-82f5-1987ca78b12d" />

**Case 2** menampilkan daftar artis yang sudah tersimpan. Jika ArrayList artis masih kosong, program memberi tahu bahwa belum ada data. Jika sudah ada, data ditampilkan dalam format nomor urut, nama artis, dan genre-nya.

<img width="875" height="444" alt="image" src="https://github.com/user-attachments/assets/aec5fdb4-5238-488b-82a7-e2209850254c" />

**Case 3** adalah untuk update data artis. User memasukkan nomor urut artis yang ingin diperbarui. Karena array dimulai dari indeks 0, maka input dikurangi 1. Jika nomor valid, data lama akan diganti dengan input baru, sedangkan jika nomor tidak valid, akan muncul pesan peringatan.

<img width="889" height="403" alt="image" src="https://github.com/user-attachments/assets/d2b63f16-680a-4090-9f2d-38242c53b1a9" />

**Case 4** adalah untuk menghapus data artis. Sama seperti update, user memasukkan nomor urut artis. Jika valid, data nama dan genre akan dihapus dan sedangkan jika tidak valid, program menampilkan pesan peringatan.

<img width="789" height="288" alt="image" src="https://github.com/user-attachments/assets/29c71e4b-6587-4a41-938a-812c1653ac83" />

**Case 5** digunakan untuk keluar dari program. _Running_ diubah jadi false, sehingga perulangan _while_ berhenti. Jika input menu tidak sesuai 1–5, maka bagian default akan dijalankan dengan pesan peringatan. Terakhir, perulangan ditutup, lalu _objek Scanner_ ditutup agar resource tidak bocor.

---

## Output Explanation

<img width="380" height="247" alt="image" src="https://github.com/user-attachments/assets/7644c87f-2815-4fbf-a693-8f194aa54dc1" />

Saat dijalankan, program pertama kali menampilkan menu utama. Pengguna kemudian diberikan pilihan menu dari satu sampai lima. Jika memilih opsi untuk menambahkan artis, pengguna akan diminta memasukkan nama artis dan genre musiknya.

<img width="475" height="160" alt="image" src="https://github.com/user-attachments/assets/fcba1cc3-d3d7-45f8-9e33-865daa4b5318" />

Apabila pengguna memilih untuk melihat daftar artis, program akan mengecek apakah sudah ada data. Jika kosong, program akan memberi pesan bahwa belum ada artis yang ditambahkan, tapi jika sudah ada data maka daftar tersebut akan ditampilkan secara berurutan.

<img width="483" height="637" alt="image" src="https://github.com/user-attachments/assets/9940103e-4908-41ac-882c-6fee962ab866" />

Ketika pengguna memilih opsi memperbarui artis, program akan meminta nomor artis yang ingin diperbarui (sama untuk opsi menghapus) lalu meminta input data yang baru. Terakhir, ketika pengguna memilih opsi keluar, program akan menutup menu dengan menampilkan pesan perpisahan ;)

<img width="345" height="108" alt="image" src="https://github.com/user-attachments/assets/478ebe8f-c266-4329-8450-ac7fae72774c" />

-------------------------------------------------------------------------------------------------

# Posttest 2

---

## Program Description
Tema yang digunakan masih sama, konsep perusahaan dari **Universal Music Group (UMG)**. Berbedanya dari Posttest 1 adalah ada 3 _class_ dan _properties_, _constructor_, _access modifier_, pengelolaan _packages_ dengan menerapan MVC (_Model-View-Controller_), juga fitur _search_. Seluruh interaksi dilakukan melalui inputan index dari pengguna, jika pengguna salah memasukkan instruksi, maka yang keluar adalah validasi peringatan. Di penjelasan ini, akan dijelaskan yang berbeda saja dari Posttest sebelumnya.

---

## Code Explanation: **Main**

Dalam _class_ ini, _import_ atau modul yang dipakai tetap Scanner dengan tambahan agar _class_ lain terhubung. _Class_ ini ditaruh di _package_ main. 

<img width="397" height="134" alt="image" src="https://github.com/user-attachments/assets/a8192b69-9001-40df-8639-5c80ea2e4c58" />

Untuk menu utama, sama saja tetapi ditambah menu _Search Artist_, begitu juga dengan fitur _Add_, akan ada tambahan _property_ baru yaitu _country_. 

<img width="797" height="876" alt="image" src="https://github.com/user-attachments/assets/c9032999-61c6-4e32-9bb2-dc43fdbd2abf" />

Berikut adalah kode dari fitur _Search Artist_, yang menjadi **Case 5**, dan penutup menjadi ada di **Case 6**.

<img width="676" height="314" alt="image" src="https://github.com/user-attachments/assets/006eb6f5-798c-4279-a29a-3ea3384a2ce5" />

---

## Code Explanation: **Artist**

_Class_ ini berada di _package_ model. Urutannya adalah pendeklarasian tiga properti, yaitu nama, genre, dan negara, yang dipakaikan _access modifier_ **privat** agar data terenkapsulasi. 

<img width="517" height="147" alt="image" src="https://github.com/user-attachments/assets/e2072b78-2bef-4fda-b1bf-7c986c915e39" />

Di bawah ini adalah _constructor_ yang berfungsi untuk membuat objek baru dengan mengambil input pengguna.

<img width="647" height="158" alt="image" src="https://github.com/user-attachments/assets/9887cc1a-3a54-4b38-b3c0-b8089e601d97" />

Dan di bawah ini adalah _getter_ dan _setter_, yang digunakan untuk mengambil nilai properti dan mengubahnya. Fitur ini adalah cara agar data privat tetap terakses secara aman.

<img width="866" height="368" alt="image" src="https://github.com/user-attachments/assets/9dea939a-c99c-47b6-b2d3-a4320fee50a8" />

Terakhir adalah pengaturan display memakai _Method_ untuk menampilkan _output_ data jika pengguna memilih menu _view_.

---

## Code Explanation: **ArtistService**

_Class_ ini berada di _package_ service. Di sini juga harus melakukan _import_ pada _class_ di model untuk bisa mengakses ditambah _ArrayList_ yang menampun data yang akan ditambahkan. Pertama,  _Method_ addArtist digunakan untuk menambah artist baru ke daftar.

<img width="557" height="207" alt="image" src="https://github.com/user-attachments/assets/37ee68b5-f507-47c4-a240-595be05bba33" />

_Method_ viewArtists menampilkan seluruh daftar artis yang tersimpan. Jika list kosong, muncul pesan khusus. Jika ada isinya, setiap artis ditampilkan.

<img width="595" height="220" alt="image" src="https://github.com/user-attachments/assets/5137f08b-e5e6-4170-aa7c-892ad1ac0e4f" />

Di bawah ini adalah _Method_ updateArtist dipakai untuk memperbarui data artis berdasarkan index. Kalau index valid, data lama diganti dengan yang baru lewat setter, jika tidak akan ada validasi peringatan.

<img width="684" height="187" alt="image" src="https://github.com/user-attachments/assets/00ffa17a-860a-47bf-8a39-e6ceecd687a9" />

Selanjutnya ada _Method_ deleteArtist yang menghapus artis berdasarkan index. Sama seperti yang lain, jika benar akan berhasil dan jika salah akan ada peringatan.

<img width="667" height="168" alt="image" src="https://github.com/user-attachments/assets/185ab022-0913-45a9-9a32-cb618b453f4b" />

Terakhir, searchArtist mencari artis berdasarkan _keyword_ nama. Pencarian menggunakan _case-insensitive_, yaitu tidak melihat besar kecilnya huruf input.

<img width="725" height="262" alt="image" src="https://github.com/user-attachments/assets/6294a80c-fe5f-48c1-9086-6f626bb424cb" />

---

## Output Explanation

Ketika program dijalankan, yang ditampilkan sama persis dengan projek sebelumnnya, bedanya hanya ada tambahan menu, fitur _search_ yang bekerja seperti berikut. 

<img width="394" height="365" alt="image" src="https://github.com/user-attachments/assets/a7dc5a0f-b7c2-4353-90f6-1c51b316683d" />

Perbedaan lainnya adalah ada penambahan properti _country_, seperti di bawah ini.

<img width="434" height="712" alt="image" src="https://github.com/user-attachments/assets/b23cf7c9-af83-4841-8f65-081a6bb58523" />

---

## Bonus Score Explanation

### Nilai tambah 1: penerapan MVC (Model-View-Controller). 

<img width="343" height="173" alt="image" src="https://github.com/user-attachments/assets/7ed3420d-6d35-43b1-962b-d9cd80a61896" />

1. **Class Artist** sebagai **Model**, karena berisi struktur data artis yang memakai atribut, _constructor_, dan juga _getter setter_. _Class_ ini hanya menyimpan data tanpa ada logika program.
2. **Class Main** sebagai **View**, karena berisi struktur menu yang ditampilkan untuk _user_, alias _interface_. Di sini _user_ berinteraksi lewat menu yang telah disediakan. Jadi, _class_, ini hanya menampilkan dan menerima _input_ tanpa ada logika.
3. **Class Artist Service** sebagai **Controller**, karena berisi logika program (CRUD, Search, ArrayList) di mana data akan diolah.

### Nilai tambah 2: Validasi Input

Nilai tambah yang kedua adalah validasi input, terutama jika _user_ melanggar instruksi. Di sini digunakan _try catch_ agar muncul peringatan bahwa pengguna melakukan kesalahan. Kesalahan yang dimaksud dapat berbentuk salah memasukkan tipe data saat memilih menu atau saat ingin menghapus/memperbarui data. Berikut contoh salah satu kode dan _output_nya.

<img width="622" height="148" alt="image" src="https://github.com/user-attachments/assets/cbd377d1-7b01-48f8-b32f-347f339bd6f1" />

<img width="427" height="346" alt="image" src="https://github.com/user-attachments/assets/c48b021c-c825-4eb2-8af2-334e6db67675" />

<img width="498" height="272" alt="image" src="https://github.com/user-attachments/assets/0d9d01fc-7c6e-4aff-b931-fe1625be9b17" />

### Nilai tambah 3: Fitur _Search_

Fitur _search_ adalah fitur di mana pengguna dapat mencari artis yang ingin dia periksa. Kode dan _output_ sudah tertera di penjelasan sebelumnya.

-------------------------------------------------------------------------------------------------

# Posttest 3

---

## Program Description
Tema yang digunakan masih sama, konsep perusahaan dari **Universal Music Group (UMG)**. Berbedanya dari Posttest 2 adalah ada keharusan menerapkan _encapsulation_ (_getter_ dan _setter_), menerapkan _inheritance_ dan _Overriding_. Selain itu banyak perubahan pada pengembangan program yaitu menu bertambah menjadi bisa melihat konser, kontrak

---
