FROM appuio/s2i-maven-java
LABEL maintainer="Agustin Munoz <agustin.munoz@axa-tech.com>"
USER root
RUN useradd -d /springboot -m springboot
COPY . /springboot/
RUN chown -R springboot /springboot
USER springboot
RUN cd /springboot ; mvn clean package spring-boot:start
CMD ["/usr/local/bin/mvn","-f" ,"/springboot/pom.xml","spring-boot:run"]