# Define a imagem base para a compilação
FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

# Copia os arquivos de origem e o arquivo pom.xml para o diretório de trabalho no contêiner
COPY pom.xml .
COPY src ./src

# Executa o processo de compilação do Maven para criar o pacote JAR
RUN mvn clean package -DskipTests -q

# Define o comando de execução da aplicação
CMD mvn spring-boot:run