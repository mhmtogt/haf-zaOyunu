# Base image
FROM openjdk:11

# Çalışma dizini oluştur
WORKDIR /app

# Uygulama dosyalarını kopyala
COPY . /app

# Uygulamayı derle
RUN javac Main.java

# Çalıştırma komutu
CMD ["java", "Main"]
