
# Microsserviços de Motificação

Aplicação faz parte do projeto Análise de Proposta. Nessa aplicação sera feito o envio
do SMS utilizando o AWS SNS.


### Stack utilizada

- RabbitMQ para as Filas
- AWS SNS para envio de Notificação
- Java 17
- Spring

### Dependencias instaladas manualmento
- **Jackson :** Para serialização de objetos Java
- **Amazon SNS :** Para o envio de SMS

```java
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-sns -->
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-sns</artifactId>
    <version>1.12.770</version>
</dependency>


```