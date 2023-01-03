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
Untuk membuat ApplicationContext menggunakan Annotation, pertama kita bisa perlu membuat Configuration class <br>
Configuration Class adalah sebuah class yang terdapat annotation @Configuration pada class tersebut <br>

```java
@Configuration
public class HelloWorldConfiguration{
}
```
