# Client Server Teori
Nama  : Roman Keanu Mufid <br>
No.Bp : 2101082020 <br>
Kelas : Teknik Komputer 2B <br>
<br>
 # Application Context
ApplicationContext adalah sebuah interface representasi container Inversion Of Control (IoC) di Spring, dan juga inti dari Spring Framework. <br> <br>
Pada versi Spring 3, XML masih menjadi pilihan utama, namun sekarang sudah banyak orang beralih dari xml ke Annotation, bahkan Spring Boot pun merekomendasikan menggunakan Annotation untuk membuat Aplikasi Spring. <br> <br>
Dokumentasi Application Context : https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html <br> <br>

# Configuration
Untuk membuat ApplicationContext menggunakan Annotation, pertama kita bisa perlu membuat Configuration class <br> <br>
Configuration Class adalah sebuah class yang terdapat annotation @Configuration pada class tersebut <br> <br>
 
```java
@Configuration
public class HelloWorldConfiguration{
}
```
<br>
# Singleton
Singleton adalah salah satu Design Patterns untuk pembuatan objek, dimana sebuah object hanya dibuat satu kali saja <br> <br>
Dan ketika kita membutuhkan object tersebut, kita hanya akan menggunakan object yang sama <br> <br>
```java
public class Database {
    private static Database database;
    
    public static Database getInstance(){
        if (database == null) {
            database = new Database();
        }
        return database;
    }
    
    private Database(){
        
    }
}
```
```java
    var database1 = Database.getInstance();
    var database2 = Database.getInstance();
    
    Assertions.assertSame(database1, database2);
```
# Bean
Saat sebuah object kita masukkan kedalam Spring Container IoC, maka kita sebut object tersebut adalah Bean <br> <br>
Secara default, bean merupakan singleton, artinya jika kita mengakses bean yang sama, maka dia akan mengembalikan object yang sama. Kita juga bisa mengubahnya jika tidak ingin singleton, nanti akan kita bahas di materi tersendiri <br>
```java
@Configuration
public class BeanConfiguration {
    
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
```
# Primary Bean
Jika terjadi duplicate bean, selain kita sebutkan nama bean nya ketika ingin mengakses bean nya, kita  juga bisa pilih salah satu bean menjadi primary <br> <br>
Dengan memilih salah satunya menjadi primary, secara otomatis jika kita mengakses bean tanpa menyebutkan nama bean nya, secara otomatis primary nya yang akan dipilih <br> <br>
Untuk memilih primary bean, kita bisa tambahkan annotaiton @Primary <br> <br>
```java
    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }
```
