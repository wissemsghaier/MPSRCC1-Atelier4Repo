# Étape 1 : Utiliser l'image officielle OpenJDK 17 en version slim
FROM openjdk:17-jdk-slim

# Étape 2 : Définir un répertoire de travail dans le conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR dans le conteneur
COPY target/user-0.0.1-SNAPSHOT.jar /app.jar

# Étape 4 : Exposer le port de l'application Spring Boot
# Par défaut, Spring Boot utilise le port 8080
EXPOSE 92

# Étape 5 : Définir la commande d'exécution
CMD ["java", "-jar", "/app.jar"]

