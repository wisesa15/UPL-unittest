# Unit Test
Anggota Kelompok:
- Mellia Arya Firanur Sukma (24060118120003)
- Muhammad Rizal Rifai (24060118130132)
- Priyo Tripanca Wisesa (24060118140151)

## Deskripsi
Class Under Test yang digunakan, yaitu kelas Pintu dan kelas Thermometer.
Kelas Pintu merupakan kelas yang dapat membuka pintu otomatis berdasarkan hasil dari suhu yang dibaca oleh kelas Thermometer.
Apabila Thermometer menunjukkan suhu > suhu maksimal, maka kunci pintu tidak dapat dibuka dan akan membunyikan alarm (atribut statusKunci tetap terkunci dan atribut alarm berubah menjadi bunyi). Sedangkan apabila kelas Thermometer menunjukkan suhu <= suhu maksimal, maka kunci pintu dapat terbuka (atribut statusKunci berubah menjadi terbuka dan atribut alarm berubah menjadi mati).

## List Test Case
### Kelas Pintu
- test buka kunci dengan menggunakan mock object thermometer dengan parameter suhu di bawah suhu maksimal, sama dengan suhu maksimal, di atas suhu maksimal
- test kunci pintu
- test bunyi alarm dengan menggunakan mock object thermometer dengan parameter suhu di bawah suhu maksimal, sama dengan suhu maksimal, di atas suhu maksimal
### Kelas Thermometer
- test mengganti suhu
- test mendapatkan suhu

## Link Video Demo
https://www.youtube.com/watch?v=Nyj3sqhWVZ4

## Link Kode Program
https://github.com/wisesa15/UPL-unittest/
