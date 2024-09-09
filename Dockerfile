FROM sbtscala/scala-sbt:eclipse-temurin-jammy-17.0.10_7_1.10.1_3.4.3

WORKDIR /app/amberdata

COPY build.sbt /app/amberdata/

COPY project /app/amberdata/project

COPY src /app/amberdata/src

COPY resources /app/amberdata/resources

ENTRYPOINT ["sbt", "test",  "run"]