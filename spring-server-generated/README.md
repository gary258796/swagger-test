# Swagger generated server

Spring Boot API Server 

## Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.  

The underlying library integrating swagger to SpringBoot is [springfox](https://github.com/springfox/springfox)  

Start your server as a simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8081/gary258796/pet/1.0.0
http://localhost:8081/gary258796/pet/1.0.0/
http://localhost:8081/gary258796/pet/1.0.0/swagger-ui.html

**Change default context path and port value in application.properties**
The default-contextPath is */gary258796/pet/1.0.0*, port is *8081*.

## Info

Beside code generated from Swagger-codegen, also integrate this project with plugins.

1. Generate .json or .yaml from api info we add in our project(such as @Api annotation, but for this project, it's all auto-generate from swagger-codegen).  
   Using [kongchen|swagger-maven-plugin](https://github.com/kongchen/swagger-maven-plugin).
2. Transform .json and .yaml to .adoc(Ascii file).  
   Using [Swagger2Markup|swagger2markup](https://github.com/Swagger2Markup/swagger2markup).
3. Transform .adoc to static files such as html, pdf.  
   Using [asciidoctor|asciidoctor-maven-plugin](https://github.com/asciidoctor/asciidoctor-maven-plugin).  
   We will have static files like ![imageFromSwagger2Markup](https://github.com/Swagger2Markup/swagger2markup/raw/master/swagger2markup-documentation/src/docs/asciidoc/images/Swagger2Markup.PNG)

Before build project
1. Remember to tun this project with jdk version 1.7 or 1.8.
2. Add index.adoc into path of property config inside **adoc-output-dir** with content below.You can change this path inside pom.xml .
    `  
    include::overview.adoc[] include::paths.adoc[] include::definitions.adoc[]
    `
   
3. After build, we can see the files in path defined in pom.xml properties :   
    .json or .yaml file -> `${my-base-dir}/${swagger-json-dir}`  
    .adoc -> `${adoc-output-dir}`  
    html or pdf ->  `src/docs/static`
