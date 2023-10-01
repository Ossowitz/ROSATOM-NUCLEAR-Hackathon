FROM maven:3.8.3-openjdk-17-slim

WORKDIR /app

COPY . /app

RUN mvn clean install

CMD ["echo", "Maven build completed successfully"]