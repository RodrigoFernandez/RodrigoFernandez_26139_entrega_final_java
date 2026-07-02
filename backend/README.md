# Instrucciones para compilar y levantar el proyecto para el desarrollo local

Parado en la carpeta `.../backend/ecommerce`

## Compilar la aplicación:
```
./mvnw clean package -Dmaven.test.skip=true
```

## Levantar la aplicación:
```
./mvnw spring-boot:run
```

## Levantar la aplicación con debug:
```
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"
```