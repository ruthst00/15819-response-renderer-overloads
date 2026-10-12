## Attempt to reproduce issue [#15819](https://github.com/apache/grails-core/issues/15819):

### Start the app
``` bash
./gradlew bootRun --offline --console=plain
```

### Hit the controller action
Open `http://localhost:8080/search/results` in your default browser, and check the server logs for exceptions:
```bash
jakarta.servlet.ServletException: Could not resolve view with name 'results' in servlet with name 'dispatcherServletRegistration'
        at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1280) ~[spring-webmvc-7.0.9.jar:7.0.9]
        at org.grails.web.servlet.mvc.GrailsDispatcherServlet.render(GrailsDispatcherServlet.groovy:139) ~[grails-web-mvc-8.0.0.jar:8.0.0]
        at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1042) ~[spring-webmvc-7.0.9.jar:7.0.9]
        ...
```


## Grails 8.0.0 Documentation

- [User Guide](https://grails.apache.org/docs/8.0.0/guide/index.html)
- [API Reference](https://grails.apache.org/docs/8.0.0/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

## Feature spring-boot-devtools documentation

- [Grails SpringBoot Developer Tools documentation](https://docs.spring.io/spring-boot/reference/using/devtools.html)

## Feature scaffolding documentation

- [Grails Scaffolding documentation](https://grails.apache.org/docs/8.0.0/guide/scaffolding.html)

## Feature asset-pipeline-grails documentation

- [Grails Asset Pipeline documentation](https://github.com/wondrify/asset-pipeline#readme)

## Feature mockito documentation

- [https://site.mockito.org](https://site.mockito.org)

## Feature geb-with-testcontainers documentation

- [Grails Geb Functional Testing for Grails with Testcontainers documentation](https://github.com/apache/grails-geb#readme)

- [https://groovy.apache.org/geb/manual/current/](https://groovy.apache.org/geb/manual/current/)

