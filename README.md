# Java Web Development under the hood

[Download Apache Tomcat](https://tomcat.apache.org/download-90.cgi)

Descompactando
```bash
unzip ~/Downloads/apache-tomcat-8.5.88.zip
```

Dando permissão de execução
```bash
sudo chmod +x ~/Downloads/apache-tomcat-8.5.88/bin/*
```

Rodando o Tomcat
```bash
sh ~/Downloads/apache-tomcat-8.5.88/bin/startup.sh
```

Verificando se o tomcat está rodando
```bash
netstat -a | grep 8080
```

Parando o Tomcat
Rodando o Tomcat
```bash
sh ~/Downloads/apache-tomcat-8.5.88/bin/shutdown.sh
```