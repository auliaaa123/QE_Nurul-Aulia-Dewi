Materi yang dapat saya simpulkan paa sesi kali ini adalah

Review Materi: RESTful API Introduction

1. Definisi RESTful API:
   - REST (Representational State Transfer) adalah gaya arsitektur yang digunakan dalam pembangunan web services.
   - RESTful API adalah API yang mengikuti prinsip REST dalam desainnya.
   - RESTful API menggunakan protokol HTTP untuk komunikasi antara client dan server.
  
2. Karakteristik RESTful API:
   - Stateless: Setiap permintaan dari client ke server harus berisi semua informasi yang diperlukan untuk memahami dan memproses permintaan tersebut.
   - Client-Server: Client dan server adalah entitas yang terpisah dan independen, masing-masing dengan tanggung jawab yang jelas.
   - Uniform Interface: Antarmuka yang konsisten untuk berinteraksi dengan server, yang terdiri dari identifikasi sumber daya, manipulasi sumber daya melalui representasi, dan self-descriptive messages.
   - Cacheable: Respons dari server harus dapat diberi label (cachable) atau tidak untuk mendukung kinerja yang lebih baik.
   - Layered System: Sistem dapat berlapis, di mana klien mungkin tidak menyadari apakah mereka terhubung langsung ke server akhir atau melalui proxy, load balancer, atau layanan cache lainnya.
   - Code on Demand (Opsional): Server dapat mengirimkan kode eksekusi ke klien pada permintaan, seperti JavaScript di browser.

3. Operasi CRUD pada RESTful API:
   - Create (POST): Membuat sumber daya baru di server.
   - Read (GET): Membaca informasi atau mendapatkan sumber daya dari server.
   - Update (PUT): Memperbarui sumber daya yang ada di server.
   - Delete (DELETE): Menghapus sumber daya dari server.

4. Representasi Data:
   - Data yang dikirimkan antara client dan server biasanya direpresentasikan dalam format yang umum seperti JSON (JavaScript Object Notation) atau XML (eXtensible Markup Language).
   - JSON adalah format yang paling umum digunakan dalam RESTful API karena mudah dibaca dan ditulis, serta ringan.

5. HTTP Methods:
   - HTTP methods digunakan dalam RESTful API untuk menentukan jenis operasi yang akan dilakukan pada sumber daya.
   - Beberapa HTTP methods yang umum digunakan adalah GET, POST, PUT, DELETE, OPTIONS, PATCH, dan lain-lain.

6. Endpoint dan URL: 
   - Endpoint adalah alamat (URL) yang digunakan untuk mengakses atau memanipulasi sumber daya di server.
   - URL (Uniform Resource Locator) adalah alamat yang digunakan untuk menunjukkan lokasi sumber daya yang spesifik di internet.

Kesimpulan nya adalah :
RESTful API merupakan pendekatan yang populer dalam pengembangan web services karena sifatnya yang fleksibel, sederhana, dan terstruktur. RESTful API memungkinkan komunikasi yang efisien antara client dan server menggunakan protokol HTTP, dengan mengikuti prinsip-prinsip desain REST. Hal ini memungkinkan pengembang untuk membuat aplikasi yang skalabel, mudah di-maintain, dan mudah digunakan.