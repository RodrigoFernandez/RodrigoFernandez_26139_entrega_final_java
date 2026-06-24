./mvnw clean package -Dmaven.test.skip=true# yogaenequilibrioJava
Backend Yoga en Equilibrio


compilar la aplicación:
`./mvnw clean package -Dmaven.test.skip=true`

levantar la aplicación
`./mvnw spring-boot:run`

levantar la aplicación con debug
`./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"`


