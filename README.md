# ImageIO Problem

This is a project for recreating `Could not initialize class javax.imageio.ImageIO` problem I encountered.

## Usage

1. `cd docker`

2. Run `docker-compose up -d` to create the docker container that contains a tocmat server.

3. Open your browser and go to `http://127.0.0.1:8080/helloworld/helloworld2`

4. You will see an error message saying
```
javax.servlet.ServletException: Servlet execution threw an exception
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
```

## Compiling Helloworld Project

If you want to modify the content of the project, please run `ant` to create a `helloworld-0.1-dev.war` file under build. Then move the file to `docker/tomcat/volume/webapps` by running `cp build/helloworld-0.1-dev.war docker/tomcat/volume/webapps`.
