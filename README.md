# UPL-unittest

[TUGAS-KELOMPOK]

Buatlah kelompok (2-3 mhs), kemudian berikan contoh unit test dengan ketentuan:
1. Class under test: minimal 2 kelas, dan antar kelas berkaitan.
2. Unit test dari class under test tersebut. Setiap method dalam unit test mencerminkan test case.
3. Penyelesaian program menggunakan Java + JUnit + Maven, dengan IDE Bebas.

Pengumpulan:
1. Dokumen(Deskripsi Class Under Test, Test case yang dibangun di unit test, link video demo, link kode program).
2. Video demo pembuatan unit test dari class under test. Usahakan semua anggota tim berkontribusi, durasi video maksimal 15 menit.
3. Program di-repository-kan di Git.

Penilaian:
1. Dokumen (20%)*
2. Video (20%)*
3. Repository Program (20%)*
4. Unit Test (30%)*
5. Mock Object (10%)
Pengumpulan Dokumen paling lambat tanggal 28 Maret 2022 jam 23:59.

## Deskripsi
Class Under Test yang digunakan, yaitu kelas Pintu dan kelas Thermometer.
Kelas Pintu merupakan kelas yang dapat membuka pintu otomatis berdasarkan hasil dari suhu yang dibaca oleh kelas Thermometer.
Apabila Thermometer menunjukkan suhu > suhu maksimal, maka kunci pintu tidak dapat dibuka dan akan membunyikan alarm (atribut statusKunci tetap terkunci dan atribut alarm berubah menjadi bunyi). Sedangkan apabila kelas Thermometer menunjukkan suhu <= suhu maksimal, maka kunci pintu dapat terbuka (atribut statusKunci berubah menjadi terbuka dan atribut alarm berubah menjadi mati)

## List Test Case
### Kelas Pintu
- test buka kunci dengan menggunakan mock object thermometer dengan parameter suhu di bawah suhu maksimal, sama dengan suhu maksimal, di atas suhu maksimal
- test kunci pintu
- test bunyi alarm dengan input false dan true
### Kelas Thermometer
- test mengganti suhu
- test mendapatkan suhu

## Link Video Demo

## Link Kode Program
https://github.com/wisesa15/UPL-unittest/
