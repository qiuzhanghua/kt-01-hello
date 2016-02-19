Kotlin Hello
=============

## Run from Intellj IDEA
open com.example.Hello.kt, right click and click "Run 'com.example.HelloKt'".

## Run from Command Line

First

```
mvn compile
```

then

```
kotlin -classpath target/classes com.example.HelloKt
```
or

```
mvn exec:java -Dexec.mainClass="com.example.HelloKt" -Dexec.args=""
```
