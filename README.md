# dx-boot-study

springboot的一些语法学习


swagger路径：http://localhost:8088/doc.html
admin admin



pdf：
pom配置
私有仓库
```xml

<dependency>
    <groupId>e-iceblue</groupId>
    <artifactId>spire.pdf</artifactId>
    <version>5.4.0</version>
</dependency>


<repositories>
<repository>
    <id>com.e-iceblue</id>
    <name>e-iceblue</name>
    <url>https://repo.e-iceblue.com/nexus/content/groups/public/</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>false</enabled>
    </snapshots>
</repository>
</repositories>
<pluginRepositories>
<pluginRepository>
    <id>com.e-iceblue</id>
    <name>e-iceblue</name>
    <url>https://repo.e-iceblue.com/nexus/content/groups/public/</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>false</enabled>
    </snapshots>
</pluginRepository>
</pluginRepositories>

```
