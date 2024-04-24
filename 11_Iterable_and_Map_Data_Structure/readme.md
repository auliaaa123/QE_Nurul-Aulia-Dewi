Materi yang bisa saya simpulkan pada sesi kali ini adalah 

Iterable adalah antarmuka (interface) di Java yang mewakili kumpulan objek yang dapat diulang. Dengan menggunakan Iterable, kita dapat melakukan iterasi atau perulangan (looping) melalui setiap elemen dalam kumpulan tersebut.

Pada dasarnya, Iterable menyediakan metode `iterator()` yang mengembalikan objek Iterator. Iterator kemudian digunakan untuk mengakses dan mengambil setiap elemen dalam kumpulan tersebut satu per satu.

Map Data Structure

Map adalah antarmuka (interface) di Java yang merepresentasikan kumpulan pasangan kunci-nilai (key-value). Setiap elemen dalam Map terdiri dari sepasang kunci dan nilai yang terkait.

Beberapa implementasi umum dari Map di Java adalah:

1. HashMap: Mengimplementasikan Map menggunakan struktur data hash table. Menyimpan pasangan kunci-nilai tidak dalam urutan tertentu.
   
2. LinkedHashMap: Mengimplementasikan Map menggunakan hash table dan linked list. Menyimpan pasangan kunci-nilai dalam urutan masukan.

3. TreeMap: Mengimplementasikan Map menggunakan struktur data pohon biner. Menyimpan pasangan kunci-nilai dalam urutan terurut berdasarkan kunci.

Map tidak mengimplementasikan Iterable karena Map tidak berisi koleksi elemen yang dapat diulang seperti dalam Iterable. Namun, kita dapat menggunakan beberapa metode yang disediakan oleh Map untuk mendapatkan kumpulan kunci, nilai, atau entri dalam bentuk Set atau Collection yang dapat diulang. Misalnya, `keySet()`, `values()`, atau `entrySet()`.

Kesimpulan nya adalah

- Iterable adalah antarmuka untuk kumpulan objek yang dapat diulang, sementara Map adalah antarmuka untuk kumpulan pasangan kunci-nilai.
- Iterable menyediakan iterasi melalui elemen-elemen dalam kumpulan, sedangkan Map menyediakan akses berdasarkan kunci.
- Map tidak secara langsung mengimplementasikan Iterable, tetapi menyediakan metode untuk mendapatkan kumpulan kunci, nilai, atau entri yang dapat diulang.