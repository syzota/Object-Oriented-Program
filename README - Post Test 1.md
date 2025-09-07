# Posttest 1

**Nama**  : Putri Syafana Afrillia
**NIM**   : 2409116015 

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
