#Getting started
## include
```
    1. introducing Spring Boot
    2. System Requirements
    3. Installing Spring Boot
    4. Developing your first Spring Boot Application
```
## some important records
```
﻿使用Spring-boot的3种方式
1. Maven Installation
2. Gradle Installation
3. Installation the Spring Boot CLI
4. SDKMan是一款二进制安装软件,可以用来安装Spring Boot CLI
5. 使用Homebrew安装Spring boot CLI
6. 使用MacPorts安装Spring boot CLI

mvn dependency:tree 可以用来查看maven的依赖项

@RestController 
    在我们的示例类上的第一个注释是@ restcontroller。这被称为原型注释。它为人们阅读代码和Spring提供了一些提示，让他们知道该类扮演了一个特定的角色。在本例中，我们的类是一个web @ controller，因此Spring将在处理传入web请求时考虑它。
@RequestMapping
    @requestmapping注释提供“路由”信息。它告诉Spring，任何带有路径的HTTP请求都应该映射到home方法。@ restcontroller注释告诉Spring将产生的字符串直接返回给调用者。
@EnableAutoConfiguration
    第二个类级别注释是@ enableautoconfiguration。这个注释告诉Spring引导，根据您添加的jar依赖项，“猜测”如何配置Spring。因为Spring -boot-starter- web添加了Tomcat和Spring MVC，因此自动配置将假定您正在开发一个web应用程序并相应地设置Spring。
```
 ![image](https://github.com/xxxxy/spring-boot/images/MindMap-chapter2.png)
