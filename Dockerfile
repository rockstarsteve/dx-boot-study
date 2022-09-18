FROM openjdk:8-jre
LABEL description="study-server"
ADD ./dx-boot-study-0.1.jar /project/test/dx-boot-study-0.1.jar
ENV TZ=Asia/Shanghai
EXPOSE 8088
#CMD java -jar -Duser.timezone=GMT+08 -server -XX:+HeapDumpOnOutOfMemoryError -Xms512m -Xmx512m ruoyi-admin.jar
CMD ["java","-jar","-Duser.timezone=GMT+08 -server","-XX:+HeapDumpOnOutOfMemoryError","/project/test/dx-boot-study-0.1.jar"]
