# Use Case APDOL #

Berikut ini adalah use case untuk Aplikasi Pencairan Dana Online :

  1. Login
  1. Registrasi User
  1. U User
  1. H User
  1. R Rincian Kegiatan
  1. U Rincian Kegiatan
  1. H Rincian Kegiatan
  1. R DIPA
  1. U DIPA
  1. H DIPA
  1. Tayang DIPA
  1. R SPM
  1. U SPM
  1. H SPM
  1. Cetak SPM
  1. Submit ke KPPN
  1. Notifikasi SPM
  1. Tolak SPM
  1. Proses SP2D
  1. Cetak SP2D
  1. Batal SP2D
  1. Monitoring SPM
  1. R Satker
  1. U Satker
  1. H Satker
  1. R Bank Pos
  1. U Bank Pos
  1. H Bank Pos
  1. R Pejabat
  1. U Pejabat
  1. H Pejabat
  1. R Program
  1. U Program
  1. H Program
  1. R Kegiatan
  1. U Kegiatan
  1. H Kegiatan
  1. R Output
  1. U Output
  1. H Output
  1. R Mata Anggaran
  1. U Mata Anggaran
  1. H Mata Anggaran
  1. R Lokasi
  1. U Lokasi
  1. H Lokasi
  1. Logout

## UC-Registrasi KPPN ##
Aktor : Admin.

Admin berada pada halaman Registrasi. Admin memilih jenis user (KPPN). Sistem menampilkan form Registrasi KPPN. Admin mengisi field sesuai data yang diperlukan (username, password, konfirmasi password, nama petugas, pangkat golongan, jabatan). Admin menekan tombol "Register". Sistem mengecek isian username dan password dalam daftar user. Sistem Menampilkan konfirmasi registrasi berhasil.

Alternatif :

  * Jika isian password dan konfirmasi password yang diisikan tidak cocok : sistem akan menampilkan peringatan bahwa password belum sama.
  * Jika username sudah terdaftar / tidak unik : sistem akan menampilkan peringatan.
  * Jika textfield ada yang kosong maka sistem akan memunculkan peringatan bahwa ada data registrasi yang belum diisi.

## UC-Registrasi Satker ##
Aktor : Admin

Admin berada pada halaman Registrasi. Admin memilih jenis user (Satker). Sistem menampilkan form Registrasi Satker. Admin mengisikan field (username, password, kode satker, nama satker, alamat, nama bendahara, pejabat penandatangan SPM, Pangkat/gol penandatangan SPM, Bank, Nomor Rekening). Admin menekan tombol "Register". Sistem mengecek username dan password dalam daftar user. Sistem Menampilkan konfirmasi registrasi berhasil.

Alternatif :

  * Jika isian password dan konfirmasi password yang diisikan tidak cocok : sistem akan menampilkan peringatan bahwa password belum sama.
  * Jika username sudah terdaftar / tidak unik : sistem akan menampilkan peringatan.
  * Jika textfield ada yang kosong maka sistem akan memunculkan peringatan bahwa ada data registrasi yang belum diisi.

## UC-Login ##
Aktor : Admin, KPPN, Satker

User berada pada halaman login APDOL. Kemudian user mengisikan username dan password. Kemudian klik tombol “Login”. Kemudian sistem akan mencari username dan password dalam daftar user. Apabila user ditemukan maka sistem akan menampilkan halaman utama APDOL.

Alternatif :

  * Jika username dan atau password kosong maka sistem akan menampilkan peringatan bahwa username dan atau password kosong.
  * Jika username dan atau password tidak ditemukan dalam daftar user maka sistem akan menampilkan peringatan bahwa username password tidak ditemukan.

## UC-Rekam DIPA ##
Aktor : Admin.

User berada pada sub menu Rekam DIPA yang sudah terdapat field data-data pagu (Tahun Anggaran, Kode Satker, Kementerian, Unit Organisasi, Fungsi, Sub Fungsi, Program, Kegiatan, Sub Kegiatan, BKPK, MAK, Lokasi, Dati II, KPPN, Pagu Awal). Admin memilih data difield yang ada pilihan dropdown dan mengisi field pagu. Kemudian klik tombol “Simpan”, maka sistem akan menampilkan pada table isian apa yang user isikan dan sistem akan menyimpan data dalam Daftar DIPA.

Alternatif :

  * Jika terdapat field yang kosong belum dipilih/diisi maka sistem akan menampilkan peringatan bahwa ada field yang kosong
  * Jika field pagu belum diisi maka sistem akan menampilkan peringatan bahwa field belum diisi

## UC-Ubah DIPA ##
Aktor : Admin

User berada pada sub menu ubah DIPA. User mengisikan tahun anggaran serta kode satker. Kemudian sistem akan menampilkan tabel yang berisi data DIPA yang sudah direkam. User melakukan klik "Pilih" pada field yang data yang ingin diubah. Kemudian klik tombol "Ubah". User melakukan perubahan data. Kemudian klik tombol "Simpan". Sistem akan menyimpan perubahan data pada daftar DIPA.

Alternatif :

  * Jika Data DIPA tidak ditemukan maka sistem akan memunculkan peringatan bahwa data tidak ditemukan
  * Jika user belum melakukan pilihan data yang akan diubah maka sistem akan memunculkan peringatan bahwa data belum dipilih dan mengembalikan ke halaman data DIPA

## UC-Hapus DIPA ##
Aktor : Admin

User berada pada menu Hapus DIPA, User mengisikan tahun anggaran serta kode satker. Kemudian sistem akan menampilkan tabel yang berisi data DIPA yang sudah direkam. User melakukan klik "Pilih" pada field yang data yang ingin dihapus. Kemudian pilih tombol "Hapus". Maka sistem akan menghapus data dari daftar DIPA.

Alternatif :

  * Jika Data DIPA tidak ditemukan maka sistem akan memunculkan peringatan bahwa data tidak ditemukan
  * Jika user belum memilih pilihan yang akan diubah maka sistem akan memunculkan peringatan bahwa data belum dipilih dan mengembalikan ke halaman data DIPA

## UC-Cari DIPA ##
Aktor : Admin

User berada pada menu Cari DIPA. User mengisikan tahun anggaran serta kode satker. Kemudian sistem akan menampilkan tabel data DIPA yang sudah direkam. User mengetikkan data yang ingin dicari pada field "cari". Data berupa uraian DIPA maupun nilai DIPA. Sistem menampilkan data yang dicari

Alternatif :

  * Jika data tidak ditemukan dalam daftar DIPA, maka sistem akan menampilkan pesan bahwa data tidak ditemukan

## UC-Tayang DIPA ##
Aktor : Admin

User berada pada menu Tayang DIPA. User mengisikan tahun anggaran serta kode satker. Kemudian sistem akan menampilkan tabel data DIPA yang sudah direkam. User memilih data yang mau ditayangkan dengan memilih field data yang dimaksud. Maka sistem akan menampilkan rincian data DIPA pada tabel.

Alternatif :

  * Jika Data DIPA tidak ditemukan maka sistem akan memunculkan peringatan bahwa data tidak ditemukan

## UC-Rekam SPM ##
Aktor : Satker.

User masuk menu SPM. Kemudian pilih Rekam SPM. Sistem akan menampilkan halaman Rekam SPM. Sistem akan menampilkan field data-data rekam SPM. User harus
memilih dan mengisi field. Field yang harus diisi/dipilih adalah tanggal pembuatan SPM, kode satker, kode KPPN, kode fungsi, sub fungsi,
program, jumlah pengeluaran dan jumlah potongan. Kemudian user menekan tombol "MAK/MAP". Sistem akan menampilkan tabel MAK/MAP. User memilih/mengisi rincian per
MAK (kode kegiatan, sub.kegiatan, MAK dan nilai rupiah MAK). Sistem akan mencocokkan jumlah MAK dengan angka yang dimasukkan dijumlah pengeluaran. Apabila
nilai uang per MAK sudah sama dengan jumlah nilai pengeluaran, maka User memilih/mengisingisikan rincian per
MAP (kode MAP, Kode Lembaga, Unit, Lokasi, Kabupaten dan Nilai MAP). Sistem akan mencocokkan jumlah MAP dengan angka yang dimasukkan dijumlah potongan.
Apabila sudah sama maka user klik tombol "Bendahara". Sistem akan menampilkan form Bendahara/Penerima. User mengisi NIP bendahara. Sistem mencari dalam daftar referensi Pejabat. Apabila ditemukan sistem akan menampilkan uraian-uraian yang lainnya secara otomatis. Kemudian user mengisi field "untuk". Kemudian pilih tombol "Yang bersangkutan". Sistem akan menampilkan form yang bersangkutan. Isikan field Penandatangan SPM (NIP Kuasa Pengguna Anggaran) dan perekam data (NIP Perekam Data). Sistem akan mencari dalam daftar referensi Pejabat. Apabila data ditemukan kemudian sistem akan menampilkan nama kedalam field nama penandatangan SPM dan perekam data. User klik tombol "simpan". Maka sistem akan menyimpan perekaman data SPM kedalam daftar SPM.

Alternatif :

  * Jika terdapat field yang kosong maka maka sistem akan menampilkan peringatan bahwa field kosong
  * Jika pada saat pengisian field data tidak ditemukan dalam daftar referensi maka sistem akan memunculkan pesan bahwa data tidak ditemukan

## UC-Ubah SPM ##
Aktor : Satker.

User berada pada halaman ubah SPM. Isikan field tanggal SPM (tanggal SPM yang akan diubah). Sistem akan mencari data dalam daftar SPM. Apabila data ditemukan maka sistem akan menampilkan data SPM yang telah direkam pada tanggal tersebut. Kemudian user memilih nomor SPM yang akan dilakukan perubahan dengan mengklik fieldSPM dimaksud. Kemudian pilih tombol "ubah". Sistem akan menampilkan halaman edit ubah SPM. User melakukan perubahan data SPM. Kemudian klik tombol "simpan". Sistem akan menyimpan perubahan data SPM tersebut dalam daftar SPM.

Alternatif :

  * Jika saat penginputan tanggal SPM data tidak ditemukan maka sistem akan menapilkan pesan bahwa data tidak ditemukan

## UC-Hapus SPM ##
Aktor : Satker.

User berada pada halaman "Hapus SPM".  Isikan field tanggal SPM yang akan dihapus. Sistem akan mencari data dalam daftar SPM. Apabila  data ditemukan maka sistem akan menampilkan data SPM. Kemudian user memilih nomor SPM yang akan dilakukan perubahan dengan mengklik field SPM dimaksud. kemudian tekan tombol “Hapus”. Sistem akan menghapus data SPM dari daftar SPM.

Alternatif :

  * Jika saat penginputan tanggal SPM data tidak ditemukan maka sistem akan menampilkan pesan bahwa data tidak ditemukan

## UC-Cari SPM ##
Aktor : Satker.

User berada pada sub menu  "Cari SPM". Sistem akan menampilkan halaman cari SPM. User mengetikkan data yang ingin dicari pada field "cari". Data berupa kode satker, nomor SPM, tanggal SPM, nilai SPM, MAK, Status SPM. Klik Enter. Sistem akan mencari dalam daftar SPM. Kemudian apabila data ditemukan maka sistem akan menampilkan data SPM yang dicari pada tabel.

Alternatif :

  * Jika data tidak ditemukan dalam daftar SPM, maka sistem akan menampilkan pesan bahwa data tidak ditemukan dan sistem akan mengembalikan pada halaman cari SPM.

## UC-Cetak SPM ##
Aktor : Bendahara.

Satker berada pada  halaman Cetak SPM. Isikan tanggal SPM. Sistem akan mencari dalam daftar SPM. Apabila data ditemukan maka sistem akan menampilkan SPM-SPM yang dibuat pada tanggal tersebut. Satker memilih SPM mana yang akan dicetak dengan pilih pada field di tabel. kemudian klik cetak. sistem akan mengirimkan paket data ke printer.

Alternatif :

  * Jika saat penginputan tanggal SPM data tidak ditemukan maka sistem akan menampilkan pesan bahwa data tidak ditemukan

## UC-Submit SPM ##
Aktor : Bendahara.

Bendahara berada pada halaman submit SPM. User memasukkan tanggal SPM yang akan disubmit ke KPPN. Sistem akan mencari dalam daftar SPM. Apabila data ditemukan maka sistem akan memunculkan tampilan daftar SPM yang sudah siap disubmit ke KPPN. User pilih SPM pada tabel. Klik tombol "submit". Sistem akan menyimpan dalam daftar SPM.

Alternatif :

  * Jika saat penginputan tanggal SPM data tidak ditemukan maka sistem akan menampilkan pesan bahwa data tidak ditemukan.
  * Jika saat submit SPM belum dipilih maka sistem akan menampilkan pesan bahwa SPM belum dipilih.

## UC-Notifikasi SPM ##
Aktor : KPPN.

Pada halaman Notifikasi SPM yang menampilkan daftar SPM, KPPN memilih SPM yang akan diverifikasi, kemudian mengklik tombol verifikasi. Sistem menampilkan SPM yang dipilih. KPPN melakukan proses pemeriksaan data dan setelah selesai memberikan keterangan lalu mengklik tombol Simpan. Sistem akan mengecek bahwa field keterangan telah terisi, menyimpan data lalu mengembalikan ke halaman Notifikasi SPM.

Alternatif :

  * Jika user KPPN belum memilih SPM : sistem akan menampilkan peringatan bahwa SPM belum dipilih.
  * Jika field keterangan belum diisikan : sistem akan menolak input lalu menampilkan pesan error bahwa field keterangan harus terisi, kemudian mengembalikan ke halaman Verifikasi SPM.

## UC-Tolak SPM ##
Aktor : KPPN.

Pada halaman Tolak SPM. KPPN memilih SPM yang akan ditolak, kemudian mengklik tombol tolak. Sistem menampilkan halaman penolakan SPM. KPPN memasukkan data pada field (nomor surat pembatalan (teks), tanggal surat pembatalan (tanggal) dan alasan pembatalan (teks)) kemudian menekan tombol Simpan.  Sistem memastikan bahwa seluruh field telah terisi, mengganti status SPM dan Daftar SPM lalu mengembalikan ke halaman tolak SPM.

Alternatif :

  * Jika user KPPN belum memilih SPM : sistem akan menampilkan peringatan bahwa SPM belum dipilih..
  * Jika salah satu field belum diisikan : sistem akan menampilkan peringatan bahwa seluruh field harus diisikan.

## UC-Proses SP2D ##
Aktor : KPPN.

Pada halaman Proses SP2D, KPPN mengisi tanggal SPM yang akan diproses menjadi SP2D, kemudian mengklik tombol cari. Sistem akan mencari pada Daftar  SPM kemudian menampilkan pada halaman tayang SPM. KPPN memilih SPM yang akan diproses kemudian mengklik tombol Proses. Sistem menampilkan halaman Isi Tanggal dan Bank. KPPN memasukkan data pada field (tanggal SP2D (tanggal), mencentang kode bank kemudian menekan tombol Simpan.  Sistem mengecek bahwa seluruh field telah terisi, Bank sudah tercentang lalu memberi nomor SP2D, menyimpan data SPM, daftar SPM, SP2D dan Daftar SP2D.

Alternatif :

  * Jika tanggal SPM belum diisikan : sistem akan menampilkan pesan error bahwa tanggal SP2D belum diisikan, kemudian mengembalikan ke halaman Proses SP2D.
  * Jika data SPM tidak ditemukan : sistem akan menampilkan halaman pesan error bahwa data tidak ditemukan.
  * Jika user KPPN belum memilih SPM : sistem akan menampilkan pesan error bahwa SPM belum dipilih, kemudian mengembalikan ke halaman Proses SP2D.
  * Jika salah satu field belum diisikan : sistem akan menampilkan peringatan bahwa seluruh field harus diisikan, kemudian mengembalikan ke halaman Pemrosesan SP2D.
  * Jika checkbox Bank belum dicentang: sistem akan menampilkan peringatan bahwa checkbox Bank belum dicentang.

## UC-Cetak SP2D ##
Aktor : KPPN.

Pada halaman Cetak SP2D, KPPN mengisi tanggal SP2D yang akan dicetak, kemudian mengklik tombol cari. Sistem akan mencari pada Daftar  SP2D kemudian menampilkan pada halaman tayang SP2D Cetak.  KPPN memilih SP2D, kemudian mengklik tombol Cetak SP2D. Sistem mengirim data SP2D untuk dicetak pada printer.

Alternatif :

  * Jika tanggal SP2D belum diisikan : sistem akan menampilkan pesan error bahwa tanggal SP2D belum diisikan, kemudian mengembalikan ke halaman Cetak SP2D.
  * Jika data SPM tidak ditemukan : sistem akan menampilkan halaman pesan error bahwa data tidak ditemukan.
  * Jika user KPPN belum memilih SP2D : sistem akan menampilkan pesan error bahwa SPM belum dipilih, kemudian mengembalikan ke halaman Tayang SP2D Cetak.

## UC-Batal SP2D ##
Aktor : KPPN.

Pada halaman Batal SP2D, KPPN mengisi tanggal SP2D yang akan dibatalkan, kemudian mengklik tombol cari. Sistem akan mencari pada Daftar  SP2D kemudian menampilkan pada halaman tayang SP2D yang berisi Daftar SP2D. KPPN memilih SP2D yang akan dibatalkan, kemudian mengklik tombol batal. Sistem menampilkan halaman pembatalan SP2D. KPPN memasukkan data pada field (nomor surat pembatalan (teks), tanggal surat pembatalan (tanggal) dan alasan pembatalan (teks)) kemudian menekan tombol Simpan.  Sistem mengecek bahwa seluruh field telah terisi, menghapus SP2D dari Daftar SP2D lalu menampilkan halaman Sukses Batal.

Alternatif :

  * Jika tanggal SP2D belum diisikan : sistem akan menampilkan pesan error bahwa tanggal SP2D belum diisikan.
  * Jika data SP2D tidak ditemukan : sistem akan menampilkan halaman pesan error bahwa data tidak ditemukan.
  * Jika user KPPN belum memilih SP2D : sistem akan menampilkan pesan error bahwa SP2D belum dipilih.
  * Jika salah satu field belum diisikan : sistem akan menolak input lalu menampilkan pesan error bahwa seluruh field harus terisi.

## UC-Monitoring SPM ##
Aktor : Bendahara.

Pada halaman Monitoring SPM, Bendahara memasukkan tanggal SPM dan status penyelesaian SPM yang diinginkan lalu menekan tombol Cari. Sistem akan mencari pada daftar SPM dan menampilkan pada halaman Daftar Penyelesaian SPM.

Alternatif :

**Jika field belum diisikan : sistem akan menampilkan pesan error bahwa seluruh field harus diisikan, kemudian mengembalikan ke halaman Monitoring SPM.** Jika data SPM tidak ditemukan: sistem akan menampilkan halaman pesan error bahwa data tidak ditemukan.


## UC-Rekam Satker ##

Aktor : Admin.
Pada halaman Satuan Kerja yang berisi Daftar Satker, Admin mengklik tombol "Rekam". Sistem akan menampilkan halaman Perekaman Satker. Admin memasukkan data dengan memilih Departemen, Unit, Lokasi dan mengetikkan pada field (kode Satker dan nama Satker) kemudian menekan tombol "Simpan". Sistem mengecek seluruh field terisi, seluruh pilihan sudah terpilih, kode satker adalah angka, kode satker sudah 6 digit, kode satker unik/belum ada pada Daftar Satker, menyimpan data, kemudian mengembalikan ke halaman Satker.

Alternatif  :

  * Jika field belum diisikan : sistem akan menampilkan peringatan bahwa seluruh field harus diisikan.
  * Jika kode Satker, Departemen, Unit, Lokasi, Dati II dan KPPN belum dipilih : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker bukan angka : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker kurang dari 6 digit : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker yang dimasukkan tidak unik / sudah ada : sistem akan menampilkan pesan bahwa kode Satker telah ada dan kembali pada halaman Perekaman Satker tanpa menyimpan data.

## UC-Ubah Satker ##
Aktor : Admin.

Pada halaman Satuan Kerja yang berisi Daftar Satker. Admin memilih Satker lalu mengklik tombol "Ubah". Sistem akan menampilkan halaman Pengubahan Satker. Admin mengganti data dengan mengganti pilihan kode Departemen, kode Unit, kode Lokasi dan mengetikkan pada field (kode Satker dan nama Satker) dengan isian baru, kemudian menekan tombol "Simpan". Sistem mengecek seluruh field terisi, seluruh pilihan sudah terpilih, kode satker adalah angka, kode satker sudah 6 digit, kode satker unik/belum ada pada Daftar Satker, menyimpan data, kemudian mengembalikan ke halaman Satker.

Alternatif :

  * Jika satker belum dipilih : sistem akan menampilkan peringatan bahwa Satker belum dipilih dan menampilkan kembali halaman Satker.
  * Jika field belum diisikan : sistem akan menampilkan peringatan bahwa seluruh field harus diisikan dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker, Departemen, Unit, Lokasi belum dipilih : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker bukan angka : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker kurang dari 6 digit : sistem akan menampilkan peringatan kesalahan input dan menampilkan kembali halaman Perekaman Satker tanpa menyimpan data.
  * Jika kode Satker yang dimasukkan tidak unik / sudah ada : sistem akan menampilkan pesan bahwa kode Satker telah ada dan kembali pada halaman Perekaman Satker tanpa menyimpan data.

## UC-Hapus Satker ##
Aktor : Admin

Admin berada pada halaman referensi Satker. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem menampilkan konfirmasi penghapusan. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Satker dan Satker. Kemudian Sistem menampilkan kembali halaman referensi Satker. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal belum memilih referensi yang akan dihapus: Sistem menampilkan pesan error bahwa tidak ada referensi yang akan dihapus.

## UC-27 Rekam Bank Pos ##
Aktor : Admin

Admin berada pada halaman referensi Bank Pos. Admin mengklik tombol "Rekam" kemudian Sistem akan menampilkan halaman rekam Bank Pos. Admin mengisi nomor kode Bank Pos dalam bentuk angka sebanyak 3 (tiga) digit dan nama Bank Pos dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek apakah semua field terisi, nomor kode Bank Pos adalah angka, 3 digit, dan tidak ada dalam Daftar Bank Pos. Sistem akan menyimpan ke dalam Daftar Bank Pos dan Bank Pos. Sistem menampilkan kembali halaman referensi Bank Pos.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia: Sistem menampilkan pesan error bahwa field tidak boleh kosong.
  * Jika Admin mengisi nomor kode Bank Pos bukan angka: Sistem menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Bank Pos dengan jumlah digit yang tidak sesuai: Sistem menampilkan pesan error bahwa nomor kode harus 3 digit.
  * Jika Admin mengisi nomor kode Bank Pos yang sudah ada dalam Daftar Bank Pos: Sistem menampilkan pesan error bahwa nomor kode Bank Pos telah ada.

## UC-Ubah Bank Pos ##
Aktor : Admin

Admin berada pada halaman referensi Bank Pos. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan halaman ubah Bank Pos yang sudah terisi sesuai isian sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode Bank Pos adalah angka, 3 digit, dan tidak ada dalam Daftar Bank Pos. Sistem menyimpan perubahan tersebut ke dalam Daftar Bank Pos dan Bank Pos. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan halaman ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Bank Pos.

Alternatif  :

  * Jika Admin belum memilih referensi : Sistem menampilkan pesan error bahwa tidak ada referensi yang akan diubah.
  * Jika Admin mengisi nomor kode Bank Pos bukan angka: Sistem akan menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Bank Pos dengan jumlah digit yang tidak sesuai: Sistem akan menampilkan pesan error bahwa nomor kode harus 3 digit.
  * Jika Admin mengisi nomor kode Bank Pos yang sudah ada dalam Daftar Bank Pos: Sistem akan menampilkan pesan error bahwa nomor kode Bank Pos telah ada.

## UC-Hapus Bank Pos ##
Aktor : Admin

Admin berada pada halaman referensi Bank Pos. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan konfirmasi penghapusan. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Bank Pos dan Bank Pos. Kemudian Sistem menampilkan kembali halaman referensi Bank Pos. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus: Sistem menampilkan pesan error bahwa tidak ada referensi yang akan dihapus.

## UC-Rekam Pejabat ##
Aktor : Admin

Admin berada pada halaman referensi Pejabat. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan halaman rekam Pejabat. Admin mengisi nomor induk Pejabat sebanyak 18 (delapan belas) digit angka, nama Pejabat dalam bentuk teks, memilih kode golongan pada dropdown list, nama jabatan struktural dalam bentuk teks dan keterangan jabatan dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek apakah semua field terisi, nomor induk adalah angka, 18 digit, dan tidak ada dalam Daftar Pejabat. Sistem akan menyimpan ke dalam Daftar Pejabat dan Pejabat. Sistem menampilkan kembali halaman referensi Pejabat.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia: Sistem menampilkan pesan error bahwa field tidak boleh kosong.
  * Jika Admin mengisi nomor induk Pejabat bukan angka: Sistem menampilkan pesan error bahwa nomor induk harus angka.
  * Jika Admin mengisi nomor induk Pejabat dengan jumlah digit yang tidak sesuai: Sistem menampilkan pesan error bahwa nomor induk harus 18 digit.
  * Jika Admin mengisi nomor induk Pejabat yang sudah ada dalam Daftar Pejabat: Sistem menampilkan pesan error bahwa nomor induk Pejabat telah ada.

## UC-Ubah Pejabat ##
Aktor : Admin

Admin berada pada halaman referensi Pejabat. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan halaman ubah Pejabat yang sudah terisi sesuai isian sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka, 18 digit, dan tidak ada dalam Daftar Pejabat. Sistem menyimpan perubahan tersebut ke dalam Daftar Pejabat dan Pejabat. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan halaman ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Pejabat.

Alternatif:
  * Jika Admin belum memilih referensi : Sistem menampilkan pesan error bahwa tidak ada referensi yang akan diubah.
  * Jika Admin mengisi nomor kode Pejabat bukan angka: Sistem akan menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Pejabat dengan jumlah digit yang tidak sesuai: Sistem akan menampilkan pesan error bahwa nomor kode harus 18 digit.
  * Jika Admin mengisi nomor kode Pejabat yang sudah ada dalam Daftar Pejabat: Sistem akan menampilkan pesan error bahwa nomor kode Pejabat telah ada.

## UC-Hapus Pejabat ##
Aktor : Admin

Admin berada pada halaman referensi Pejabat. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem menampilkan konfirmasi penghapusan. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Pejabat dan Pejabat. Kemudian Sistem menampilkan kembali halaman referensi Pejabat. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal belum memilih referensi yang akan dihapus: Sistem menampilkan pesan error bahwa tidak ada referensi yang akan dihapus.

## UC-Rekam Golongan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Golongan. Sistem menampilkan halaman referensi Golongan yang berisi daftar referensi golongan dari Referensi. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan form isian referensi Golongan. Admin mengisi nomor kode Golongan dalam bentuk kombinasi angka yang terdiri dari 2 (dua) digit antara 1 sampai 4 dan nama Golongan dalam bentuk teks. Admin menekan tombol "Simpan". Sistem mengecek semua field terisi, nomor kode adalah angka (kombinasi 1 sampai 4), 2 digit, dan tidak ada dalam Referensi. Sistem akan menyimpan ke dalam Daftar Referensi Umum yaitu Golongan. Sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi Golongan.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia maka Sistem akan menampilkan pesan bahwa field tidak boleh kosong dan Sistem akan menampilkan kembali form isian referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Golongan telah ada dan Sistem akan menampilkan kembali form isian referensi Golongan.

## UC-Ubah Golongan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Golongan. Sistem menampilkan halaman referensi Golongan yang berisi daftar referensi fungsi dari Referensi. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan form ubah yang sudah terisi sesuai pilihan sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka (kombinasi 1 sampai 4), 2 digit, dan tidak ada dalam Referensi. Sistem menyimpan perubahan tersebut ke dalam Daftar Referensi Umum yaitu Golongan. Sistem menampilkan pesan bahwa perubahan berhasil dilakukan. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan form ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Golongan.

Alternatif:
  * Jika Admin belum memilih referensi : Sistem menampilkan pesan bahwa tidak ada referensi yang akan diubah dan menampilkan kembali halaman referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Golongan.
  * Jika Admin mengisi nomor kode Golongan yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Golongan telah ada dan Sistem akan menampilkan kembali form isian referensi Golongan.

## UC-Hapus Golongan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Golongan. Sistem menampilkan halaman referensi Golongan yang berisi daftar referensi Golongan dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu Golongan. Kemudian Sistem menampilkan kembali halaman referensi Golongan. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada referensi yang akan dihapus dan Sistem menampilkan halaman referensi Golongan.

## UC-Rekam Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Fungsi. Sistem menampilkan halaman referensi Fungsi yang berisi daftar referensi fungsi dari Referensi. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan form isian referensi Fungsi. Admin mengisi nomor kode Fungsi dalam bentuk angka sebanyak 2 (dua) digit angka dan nama Fungsi dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek semua field terisi, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem akan menyimpan ke dalam Daftar Referensi Khusus yaitu Fungsi. Sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi Fungsi.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia maka Sistem akan menampilkan pesan bahwa field tidak boleh kosong dan Sistem akan menampilkan kembali form isian referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Fungsi telah ada dan Sistem akan menampilkan kembali form isian referensi Fungsi.

## UC-Ubah Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Fungsi. Sistem menampilkan halaman referensi Fungsi yang berisi daftar referensi fungsi dari Referensi. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan form ubah yang sudah terisi sesuai pilihan sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem menyimpan perubahan tersebut ke dalam Daftar Referensi Khusus yaitu Fungsi. Sistem menampilkan pesan bahwa perubahan berhasil dilakukan. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan form ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Fungsi.

Alternatif:
**Jika Admin belum memilih referensi : Sistem menampilkan pesan bahwa tidak ada referensi yang akan diubah dan menampilkan kembali halaman referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Fungsi.
  * Jika Admin mengisi nomor kode Fungsi yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Fungsi telah ada dan Sistem akan menampilkan kembali form isian referensi Fungsi.**

## UC-Hapus Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Fungsi. Sistem menampilkan halaman referensi Fungsi yang berisi daftar referensi Fungsi dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Khusus yaitu Fungsi, Sub Fungsi, dan Program yang berhubungan dengan Fungsi tersebut. Kemudian Sistem menampilkan kembali halaman referensi Fungsi. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada referensi yang akan dihapus dan Sistem menampilkan halaman referensi Fungsi.

## UC-Rekam Sub Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Sub Fungsi. Sistem menampilkan halaman referensi Sub Fungsi yang berisi daftar referensi fungsi dan sub fungsi dari Referensi. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan form isian referensi Sub Fungsi. Admin memilih Fungsi yang ada dalam bentuk dropdown list sesuai yang diisikan pada referensi sebelumnya kemudian mengisi nomor kode Sub Fungsi dalam bentuk angka sebanyak 2 (dua) digit dan nama Sub Fungsi dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek semua field terisi, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem akan menyimpan ke dalam Daftar Referensi Khusus yaitu Sub Fungsi. Sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi Sub Fungsi.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia maka Sistem akan menampilkan pesan bahwa field tidak boleh kosong dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.
  * Jika Admin mengisi nomor kode Sub Fungsi bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.
  * Jika Admin mengisi nomor kode Sub Fungsi dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.
  * Jika Admin memilih kode Fungsi dan mengisi nomor kode Sub Fungsi yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Sub Fungsi telah ada dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.

## UC-Ubah Sub Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Sub Fungsi. Sistem menampilkan halaman referensi Sub Fungsi yang berisi daftar referensi fungsi, sub fungsi dari Referensi. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan form ubah yang sudah terisi sesuai pilihan sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem menyimpan perubahan tersebut ke dalam Daftar Referensi Khusus yaitu Sub Fungsi. Sistem menampilkan pesan bahwa perubahan berhasil dilakukan. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan form ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Sub Fungsi.

Alternatif:
  * Jika Admin belum memilih referensi : Sistem menampilkan pesan bahwa tidak ada referensi yang akan diubah dan menampilkan kembali halaman referensi Sub Fungsi.
  * Jika Admin mengisi nomor kode Sub Fungsi bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.
  * Jika Admin mengisi nomor kode Sub Fungsi dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.
  * Jika Admin memilih Fungsi dan mengisi nomor kode Sub Fungsi yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Sub Fungsi telah ada dan Sistem akan menampilkan kembali form isian referensi Sub Fungsi.

## UC-Hapus Sub Fungsi ##
Aktor : Admin

Sistem menampilkan halaman Referensi Khusus. Admin mengklik menu Sub Fungsi. Sistem menampilkan halaman referensi Sub Fungsi yang berisi daftar referensi fungsi dan sub fungsi dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Khusus yaitu Sub Fungsi dan Program yang berhubungan dengan Sub Fungsi tersebut. Kemudian Sistem menampilkan kembali halaman referensi Sub Fungsi. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada referensi yang akan dihapus dan Sistem menampilkan halaman referensi Sub Fungsi.

## UC-Rekam Program ##
Aktor : Admin

Admin berada pada halaman referensi Program. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan halaman rekam Program. Admin memilih Fungsi dan Sub Fungsi yang ada dalam bentuk dropdown list kemudian mengisi nomor kode Program dalam bentuk angka sebanyak 2 (dua) digit dan nama Program dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek apakah semua field terisi, nomor kode adalah angka, 2 digit, dan tidak ada dalam Daftar Program. Sistem akan menyimpan ke dalam Daftar Program dan Program. Sistem menampilkan kembali halaman referensi Program.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia: Sistem menampilkan pesan error bahwa field tidak boleh kosong.
  * Jika Admin mengisi nomor kode Program bukan angka: Sistem menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Program dengan jumlah digit yang tidak sesuai: Sistem menampilkan pesan error bahwa nomor kode harus 2 digit.
  * Jika Admin memilih kode Fungsi, Sub Fungsi dan mengisi nomor kode Program yang sudah ada dalam Daftar Program: Sistem menampilkan pesan error bahwa nomor kode Program telah ada.

## UC-Ubah Program ##
Aktor : Admin

Admin berada pada halaman referensi Program. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan halaman ubah Program yang sudah terisi sesuai isian sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka, 2 digit, dan tidak ada dalam Daftar Program. Sistem menyimpan perubahan tersebut ke dalam Daftar Program dan Program. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan halaman ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Program.

Alternatif:
  * Jika Admin belum memilih referensi : Sistem menampilkan pesan error bahwa tidak ada referensi yang akan diubah.
  * Jika Admin mengisi nomor kode Program bukan angka: Sistem akan menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Program dengan jumlah digit yang tidak sesuai: Sistem akan menampilkan pesan error bahwa nomor kode harus 2 digit.
  * Jika Admin memilih Fungsi, Sub Fungsi dan mengisi nomor kode Program yang sudah ada dalam Referensi: Sistem akan menampilkan pesan error bahwa nomor kode Program telah ada.

## UC-Hapus Program ##
Aktor : Admin

Admin berada pada halaman referensi Program. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem menampilkan konfirmasi penghapusan. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Program dan Program. Kemudian Sistem menampilkan kembali halaman referensi Program. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal belum memilih referensi yang akan dihapus: Sistem menampilkan pesan error bahwa tidak ada referensi yang akan dihapus.

## UC-Rekam Kegiatan ##
Aktor : Admin

Admin berada pada halaman referensi Kegiatan. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan halaman rekam Kegiatan. Admin mengisi nomor kode Kegiatan dalam bentuk angka sebanyak 4 (empat) digit dan nama Kegiatan dalam bentuk teks. Admin mengklik tombol "Simpan". Sistem mengecek apakah semua field terisi, nomor kode adalah angka, 4 digit, dan tidak ada dalam Daftar Kegiatan. Sistem akan menyimpan ke dalam Daftar Kegiatan dan Kegiatan. Sistem menampilkan kembali halaman referensi Kegiatan.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia: Sistem menampilkan pesan error bahwa field tidak boleh kosong.
  * Jika Admin mengisi nomor kode Kegiatan bukan angka: Sistem menampilkan pesan error bahwa nomor kode harus angka.
  * Jika Admin mengisi nomor kode Kegiatan dengan jumlah digit yang tidak sesuai: Sistem menampilkan pesan error bahwa nomor kode harus 4 digit.
  * Jika Admin mengisi nomor kode Kegiatan yang sudah ada dalam Daftar Kegiatan: Sistem menampilkan pesan error bahwa nomor kode Kegiatan telah ada.

## UC-Ubah Kegiatan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Kegiatan. Sistem menampilkan halaman referensi Kegiatan yang berisi daftar referensi fungsi dari Referensi. Admin memilih referensi yang akan diubah dengan mencentangnya kemudian mengklik tombol "Ubah". Sistem akan menampilkan form ubah yang sudah terisi sesuai pilihan sebelumnya. Admin mengubah sesuai keperluan kemudian mengklik tombol "Simpan". Sistem mengecek apakah Admin sudah mencentang atau belum, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem menyimpan perubahan tersebut ke dalam Daftar Referensi Umum yaitu Kegiatan. Sistem menampilkan pesan bahwa perubahan berhasil dilakukan. Jika referensi yang diubah lebih dari satu maka Sistem akan kembali menampilkan form ubah untuk referensi berikutnya hingga selesai dan kembali ke halaman referensi Kegiatan.

Alternatif:
  * Jika Admin belum memilih referensi : Sistem menampilkan pesan bahwa tidak ada referensi yang akan diubah dan menampilkan kembali halaman referensi Kegiatan.
  * Jika Admin mengisi nomor kode Kegiatan bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Kegiatan.
  * Jika Admin mengisi nomor kode Kegiatan dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Kegiatan.
  * Jika Admin mengisi nomor kode Kegiatan yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Kegiatan telah ada dan Sistem akan menampilkan kembali form isian referensi Kegiatan.

## UC-Hapus Kegiatan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Kegiatan. Sistem menampilkan halaman referensi Kegiatan yang berisi daftar referensi Kegiatan dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu Kegiatan. Kemudian Sistem menampilkan kembali halaman referensi Kegiatan. Jika Admin memilih lebih dari satu referensi yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:
  * Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada referensi yang akan dihapus dan Sistem menampilkan halaman referensi Kegiatan.

## UC-Rekam Sub Kegiatan ##
Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu Sub Kegiatan. Sistem menampilkan halaman referensi Sub Kegiatan yang berisi daftar referensi sub kegiatan dari Referensi. Admin mengklik tombol "Rekam", kemudian Sistem akan menampilkan form isian referensi Sub Kegiatan. Admin mengisi nomor kode Sub Kegiatan dalam bentuk angka sebanyak 2 (dua) digit dan nama Sub Kegiatan dalam bentuk teks. Admin menekan tombol "Simpan". Sistem mengecek semua field terisi, nomor kode adalah angka, 2 digit, dan tidak ada dalam Referensi. Sistem akan menyimpan ke dalam Daftar Referensi Umum yaitu Sub Kegiatan. Sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi Sub Kegiatan.

Alternatif:
  * Jika Admin tidak mengisi field yang tersedia maka Sistem akan menampilkan pesan bahwa field tidak boleh kosong dan Sistem akan menampilkan kembali form isian referensi Sub Kegiatan.
  * Jika Admin mengisi nomor kode Sub Kegiatan bukan angka maka Sistem akan menampilkan pesan bahwa nomor kode harus angka dan Sistem akan menampilkan kembali form isian referensi Sub Kegiatan.
  * Jika Admin mengisi nomor kode Sub Kegiatan dengan jumlah digit yang tidak sesuai maka Sistem akan menampilkan pesan bahwa nomor kode harus 2 digit dan Sistem akan menampilkan kembali form isian referensi Sub Kegiatan.
  * Jika Admin mengisi nomor kode Sub Kegiatan yang sudah ada dalam Referensi maka Sistem akan menampilkan pesan bahwa nomor kode Sub Kegiatan telah ada dan Sistem akan menampilkan kembali form isian referensi Sub Kegiatan.

## UC-Ubah Sub Kegiatan ##

aktor : admin

sistem menampilkan halaman referensi umum. admin menekan tombol sub kegiatan dan sistem menampilkan halaman referensi sub kegiatan. admin memilih satu atau lebih kode atau nama sub kegiatan dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum.. sistem  menampilkan form ubah referensi sub kegiatan. pada form admin mengganti 4 digit kode dan nama sub kegiatan dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 4 digit dan kode atau nama tidak ada dalam referensi umum. sistem  menyimpan perubahan ke daftar referensi umum yaitu sub kegiatan, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi sub kegiatan.

alternatif :

  1. admin belum memilih referensi : sistem  menampilkan pesan pilih satu atau lebih referensi sub kegiatan
  1. jika field kode atau nama sub kegiatan diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form  ubah referensi sub kegiatan
  1. jika kode sub kegiatan yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form  ubah referensi sub kegiatan
  1. jika kode sub kegiatan yang diinputkan oleh admin kurang dari 4 digit maka sistem  menampilkan pesan "kode harus 4 digit", batal menyimpan data kemudian menampilkan kembali form  ubah referensi sub kegiatan
  1. jika kode sub kegiatan yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama sub kegiatan telah ada, batal menyimpan data kemudian menampilkan kembali form  ubah referensi sub kegiatan

## UC-Hapus Referensi Sub Kegiatan ##

aktor : admin

Aktor : Admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu sub kegiatan. Sistem menampilkan halaman referensi sub kegiatan yang berisi daftar referensi sub kegiatan dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu sub kegiatan. Kemudian Sistem menampilkan kembali halaman referensi sub kegiatan. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi sub kegiatan.


## UC-Rekam kementerian ##

aktor : Admin

sistem menampilkan halaman referensi khusus kemudian admin mengklik menu referensi kementerian. sistem menampilkan halaman referensi kementerian yang berisi daftar referensi kementerian dari referensi. Admin menekan tombol rekam, lalu sistem menayangkan form pengisian referensi berupa nomor kode kementerian dalam bentuk kombinasi angka yang terdiri dari 2 digit kode dan nama kementerian dalam bentuk teks. Admin mengisikan kode  dan nama kementerian serta menekan tombol simpan. sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 2 digit dan kode atau nama tidak ada dalam referensi khusus. sistem menyimpan kode dan nama kementerian ke dalam daftar referensi khusus yaitu kementerian. sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi kementerian.

alternatif :


  1. jika field kode atau nama kementerian diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi kementerian
  1. jika kode kementerian yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi kementerian
  1. jika kode kementerian yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi kementerian
  1. jika kode kementerian yang diinputkan oleh admin telah ada dalam referensi. maka sistem  menampilkan pesan bahwa kode atau nama kementerian telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi kementerian

## UC-Ubah kementerian ##

aktor : admin


sistem menampilkan halaman referensi umum. admin menekan tombol kementerian dan sistem menampilkan halaman referensi kementerian. admin memilih satu atau lebih kode atau nama kementerian dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum.. sistem  menampilkan form ubah referensi kementerian. pada form admin mengganti 2 digit kode dan nama kementerian dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 2 digit dan kode atau nama tidak ada dalam referensi umum. sistem  menyimpan perubahan ke daftar referensi umum yaitu kementerian, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi kementerian.
alternatif :

  1. admin belum memilih referensi : sistem menampilkan pesan pilih satu atau lebih referensi
  1. jika field kode atau nama kementerian diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form ubah  referensi kementerian
  1. jika kode kementerian yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form ubah  referensi  kementerian
  1. jika kode kementerian yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form ubah  referensi kementerian
  1. jika kode kementerian yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama kementerian telah ada, batal menyimpan data kemudian menampilkan kembali form ubah  referensi kementerian

## UC-Hapus kementerian ##

aktor : admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu kementerian. Sistem menampilkan halaman referensi kementerian yang berisi daftar referensi kementerian dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu kementerian. Kemudian Sistem menampilkan kembali halaman referensi kementerian. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi kementerian.

## UC-Rekam Lokasi ##

aktor : Admin

sistem menampilkan halaman referensi khusus kemudian admin mengklik menu referensi lokasi. sistem menampilkan halaman referensi lokasi yang berisi daftar referensi lokasi dari referensi. Admin menekan tombol rekam, lalu sistem menayangkan form pengisian referensi berupa nomor kode lokasi dalam bentuk kombinasi angka yang terdiri dari 2 digit kode dan nama lokasi dalam bentuk teks. Admin mengisikan kode  dan nama lokasi serta menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 2 digit dan kode atau nama tidak ada dalam referensi. sistem  menyimpan kode dan nama lokasi ke dalam daftar referensi khusus yaitu lokasi . sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi lokasi.

alternatif :

  1. jika field kode atau nama lokasi diisikan kosongoleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi lokasi
  1. jika kode lokasi yang diinputkanoleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi lokasi
  1. jika kode lokasi yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi lokasi
  1. jika kode lokasi yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama lokasi telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi lokasi

## UC-Ubah lokasi ##

aktor : admin

sistem menampilkan halaman referensi khusus. admin menekan tombol lokasi  dan sistem menampilkan halaman referensi lokasi. admin memilih satu atau lebih kode atau nama lokasi dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum.. sistem  menampilkan form ubah referensi lokasi. pada form admin mengganti 2 digit kode dan nama lokasi dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 2 digit dan kode atau nama tidak ada dalam referensi khusus. sistem  menyimpan perubahan ke daftar referensi khusus yaitu lokasi, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi lokasi.

alternatif :

  1. admin belum memilih referensi : sistem  menampilkan pesan pilih satu atau lebih referensi
  1. jika field kode atau nama lokasi diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form ubah  referensi lokasi
  1. jika kode lokasi yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form ubah  referensi  lokasi
  1. jika kode lokasi yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form ubah  referensi lokasi
  1. jika kode lokasi yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama lokasi telah ada, batal menyimpan data kemudian menampilkan kembali form ubah  referensi lokasi

## UC-Hapus lokasi ##

aktor : admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu lokasi. Sistem menampilkan halaman referensi lokasi yang berisi daftar referensi lokasi dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu lokasi. Kemudian Sistem menampilkan kembali halaman referensi lokasi. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi lokasi.

## UC-Rekam dati II ##

aktor : Admin

sistem menampilkan halaman referensi khusus kemudian admin mengklik menu referensi dati II. sistem menampilkan halaman referensi dati II yang berisi daftar referensi dati II dari referensi. Admin menekan tombol rekam, lalu sistem menayangkan form pengisian referensi berupa nomor kode dati II dalam bentuk kombinasi angka yang terdiri dari 2 digit kode lokasi, 2 digit kode dan nama dati II dalam bentuk teks. Admin memilih kode lokasi, mengisi kode  dan nama dati II serta menekan tombol simpan . sistem mengecek field kode dati II dan nama tidak kosong, kode adalah angka, kode dati II sebanyak 2 digit serta kode atau nama tidak ada dalam referensi. sistem  menyimpan kode lokasi, dati II dan nama dati II ke dalam daftar referensi khusus yaitu dati II . sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi dati II.

alternatif :

  1. jika field kode atau nama dati II diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode dati II yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode dati II yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode lokasi dan dati II atau nama dati II yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode lokasi dan dati II atau nama dati II telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II

## UC-Ubah dati II ##

aktor : admin

sistem menampilkan halaman referensi khusus. admin menekan tombol dati II  dan sistem menampilkan halaman referensi dati II. admin memilih satu atau lebih kode atau nama dati II dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum.. sistem  menampilkan form ubah referensi dati II. pada form admin mengganti kode lokasi, 2 digit kode dan nama dati II dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 2 digit dan kode atau nama tidak ada dalam referensi khusus. sistem  menyimpan perubahan ke daftar referensi khusus yaitu dati II, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi dati II.

alternatif :

  1. admin belum memilih referensi : sistem  menampilkan pesan pilih satu atau lebih referensi
  1. jika field kode atau nama dati II diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode dati II yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode dati II yang diinputkan oleh admin kurang dari 2 digit maka sistem  menampilkan pesan "kode harus 2 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II
  1. jika kode lokasi dan dati II atau nama dati II yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode lokasi dan dati II atau nama dati II telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi dati II

## UC-Hapus dati II ##

aktor : admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu dati II. Sistem menampilkan halaman referensi dati II yang berisi daftar referensi dati II dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu dati II. Kemudian Sistem menampilkan kembali halaman referensi dati II. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi dati II.

## UC-Rekam BKPK ##

aktor : Admin

sistem menampilkan halaman referensi khusus kemudian admin mengklik menu referensi bkpk. sistem menampilkan halaman referensi bkpk yang berisi daftar referensi bkpk dari referensi. Admin menekan tombol rekam, lalu sistem menayangkan form pengisian referensi berupa nomor kode bkpk dalam bentuk kombinasi angka yang terdiri dari 4 digit kode dan nama bkpk dalam bentuk teks. Admin mengisikan kode  dan nama bkpk serta menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 4 digit dan kode atau nama tidak ada dalam referensi umum. sistem  menyimpan kode dan nama bkpk ke dalam daftar referensi khusus yaitu bkpk . sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi bkpk.

alternatif :

  1. jika field kode atau nama bkpk diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi bkpk
  1. jika kode bkpk yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi bkpk
  1. jika kode bkpk yang diinputkan oleh admin kurang dari 4 digit maka sistem  menampilkan pesan "kode harus 4 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi bkpk
  1. jika kode bkpk yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama bkpk telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi bkpk

## UC-Ubah BKPK ##

aktor : admin

sistem menampilkan halaman referensi khusus. admin menekan tombol bkpk  dan sistem menampilkan halaman referensi bkpk. admin memilih satu atau lebih kode atau nama bkpk dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum.. sistem  menampilkan form ubah referensi bkpk. pada form admin mengganti 4 digit kode dan nama bkpk dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 4 digit dan kode atau nama tidak ada dalam referensi khusus. sistem  menyimpan perubahan ke daftar referensi khusus yaitu bkpk, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi bkpk.

alternatif :

  1. admin belum memilih referensi : sistem  menampilkan pesan pilih satu atau lebih referensi
  1. jika field kode atau nama bkpk diisikan kosong oleh admin maka sistem  menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form ubah referensi bkpk
  1. jika kode bkpk yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form ubah  referensi  bkpk
  1. jika kode bkpk yang diinputkan oleh admin kurang dari 4 digit maka sistem  menampilkan pesan "kode harus 4 digit", batal menyimpan data kemudian menampilkan kembali form ubah  referensi bkpk
  1. jika kode bkpk yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode atau nama bkpk telah ada, batal menyimpan data kemudian menampilkan kembali form ubah  referensi bkpk

## UC-Hapus BKPK ##

aktor : admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu bkpk. Sistem menampilkan halaman referensi bkpk yang berisi daftar referensi bkpk dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu bkpk. Kemudian Sistem menampilkan kembali halaman referensi bkpk. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi bkpk.

## UC-Rekam mata anggaran ##

aktor : Admin

sistem menampilkan halaman referensi khusus kemudian admin mengklik menu referensi mata anggaran. sistem menampilkan halaman referensi mata anggaran yang berisi daftar referensi mata anggaran dari referensi. Admin menekan tombol rekam, lalu sistem menayangkan form pengisian referensi berupa pilihan kode bkpk, isian kode mata anggaran yang terdiri dari angka 6 digit dan nama mata anggaran dalam bentuk teks. Admin memilih kode bkpk, mengisi kode  dan nama mata anggaran serta menekan tombol simpan . sistem mengecek field kode dan nama mata anggaran tidak kosong, kode mata anggaran adalah angka, kode mata anggaran sebanyak 6 digit serta kode bkpk dan mata anggaran atau nama mata anggaran tidak ada dalam referensi. sistem  menyimpan kode bkpk, kode dan nama mata anggaran ke dalam daftar referensi khusus yaitu mata anggaran . sistem menampilkan pesan rekam berhasil dilakukan dan kembali ke halaman referensi mata anggaran.

alternatif :

# jika field kode atau nama mata anggaran diisikan kosong oleh admin maka sistem menampilkan pesan "kode atau nama harus diisi" kemudian menampilkan kembali form rekam referensi mata anggaran
# jika kode mata anggaran yang diinputkan oleh admin bukan angka maka sistem menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form rekam referensi mata anggaran
# jika kode mata anggaran kurang dari 6 digit maka sistem  menampilkan pesan "kode harus 6 digit", batal menyimpan data kemudian menampilkan kembali form rekam referensi mata anggaran
# jika kode bkpk dan mata anggaran atau nama mata anggaran yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode bkpk dan mata anggaran atau nama mata anggaran telah ada, batal menyimpan data kemudian menampilkan kembali form rekam referensi mata anggaran


## UC-Ubah mata anggaran ##

aktor : admin

sistem menampilkan halaman referensi khusus. admin menekan tombol mata anggaran  dan sistem menampilkan halaman referensi mata anggaran. admin memilih satu atau lebih kode atau nama mata anggaran dengan mencentangnya, kemudian menekan tombol ubah. sistem akan mengecek apakah admin sudah memilih referensi atau belum. sistem  menampilkan form ubah referensi mata anggaran. pada form ubah admin mengganti kode bkpk, mata anggaran atau nama mata anggaran dengan isian baru kemudian menekan tombol simpan . sistem mengecek field kode dan nama tidak kosong, kode adalah angka, kode sebanyak 6 digit dan kode atau nama tidak ada dalam referensi khusus. sistem  menyimpan perubahan ke daftar referensi khusus yaitu mata anggaran, menampilkan pesan bahwa perubahan berhasil dilakukan. jika referensi yang diubah lebih dari satu maka sistem menampilkan form ubah untuk referensi berikutnya, namun jika semua referensi telah dirubah, sistem menampilkan menu awal referensi mata anggaran.

alternatif :

  1. admin belum memilih referensi : sistem  menampilkan pesan pilih satu atau lebih referensi
  1. jika field kode atau nama mata anggaran diisikan kosong oleh admin maka sistem  menampilkan pesan kesalahan input kemudian menampilkan kembali form ubah referensi mata anggaran
  1. jika kode mata anggaran yang diinputkan oleh admin bukan angka maka sistem  menampilkan pesan "kode harus angka", batal menyimpan data kemudian menampilkan kembali form ubah referensi mata anggaran
  1. jika kode mata anggaran kurang dari 6 digit maka sistem  menampilkan pesan "kode harus 6 digit", batal menyimpan data kemudian menampilkan kembali form ubah referensi mata anggaran
  1. jika kode bkpk dan mata anggaran atau nama mata anggaran yang diinputkan oleh admin telah ada dalam database maka sistem  menampilkan pesan bahwa kode bkpk dan mata anggaran atau nama mata anggaran telah ada, batal menyimpan data kemudian menampilkan kembali form ubah referensi mata anggaran

## UC-Hapus mata anggaran ##

aktor : admin

Sistem menampilkan halaman Referensi Umum. Admin mengklik menu mata anggaran. Sistem menampilkan halaman referensi mata anggaran yang berisi daftar referensi mata anggaran dari Referensi. Admin memilih referensi yang akan dihapus dengan memberikan checklist kemudian Admin mengklik tombol "Hapus". Sistem akan menampilkan kotak dialog dengan tombol "Yes" untuk menghapus dan "No" untuk batal menghapus. Admin mengklik tombol "Yes" untuk menghapus referensi tersebut dan Sistem akan menghapusnya dari Daftar Referensi Umum yaitu mata anggaran. Kemudian Sistem menampilkan kembali halaman referensi mata anggaran. Jika Admin memilih lebih dari satu record yang akan dihapus, maka Sistem akan memproses satu per satu.

Alternatif:

Jika Admin mengklik tombol "Hapus" padahal Admin belum memilih referensi yang akan dihapus, maka Sistem akan menampilkan pesan error bahwa tidak ada record yang akan dihapus dan Sistem menampilkan halaman referensi mata anggaran.

## UC- Ubah Password ##
Aktor : Admin, KPPN, Satker.

Sistem menampilkan halaman utilitas. admin menekan men Ubah Password dan kemudian sistem menampilkan form ubah password. User menginput field yang diperlukan untuk mengubah password (password lama, password baru, konfirmasi password baru) kemudian menekan tombol Simpan. Sistem mengecek apakah semua field telah diisi, password lama benar, password baru tidak mengandung karakter unik, password baru tidak sama dengan password lama, dan password baru sama dengan konfirmasi password baru. sistem menyimpan data ke daftar user, menampilkan pesan berhasil lalu mengembalikan ke tampilan utilitas.

Alternatif :

  1. jika password lama salah maka sistem menampilkan pesan "password lama salah"
  1. jika password baru mengandung karakter unik maka sistem akan menampilkan pesan : "password harus dalam huruf atau angka"
  1. Jika password lama baru dengan password sala : sistem  menampilkan peringatan bahwa password baru adalah sama.
  1. Jika isian password baru dan konfirmasi password baru yang diisikan tidak cocok : sistem  menampilkan peringatan bahwa password baru belum sama.

## UC-Logout ##

aktor : admin, satker dan KPPN

admin, satker atau KPPN sedang berada di halaman mana saja, kemudian meng-klik tombol logout. kemudian sistem menampilkan pesan logout berhasil dan halaman depan website.