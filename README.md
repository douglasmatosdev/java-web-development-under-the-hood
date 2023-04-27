# Java Web Development under the hood

[Download Apache Tomcat](https://tomcat.apache.org/download-90.cgi)

[H2 database](https://www.h2database.com/html/main.html)

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

## Servlet Security
```txt
Authentication                                   ______________
                                                /              \
    Please log in:                              | sally: user  |
              ____________                      | david: user  |
    Username |____________|     <------------>  | matt : admin |
    Password |____________|                     \______________/
                                                

Authorization
            |_Guest: /
            |_User : /order.html
            |        /thankYou.html
            |
            |_Admin: /kitchen.html
                        /accounts.html
```