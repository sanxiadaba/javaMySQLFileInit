# javaSqlFile
使用Java的jdbc实现的运行指定sql文件的mysql数据库

先导入指定的maven依赖

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>
```

然后按格式填好对应的db.properties文件，以及准备好对应的sql文件，将

MyMySqlInit.java文件拷贝到项目的某个目录下，就会自动检测并初始化数据库

