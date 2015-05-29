## Scala Micro Service with Netflix OSS

An example scala micro-service using [Netflix Karyon](https://github.com/Netflix/karyon) for server and [Netflix feign](https://github.com/Netflix/feign) for client


### Run Server
Server starts up on port `8080`.

```
$ cd server
$ gradle run
```
 you can test it with `curl -v http://localhost:8080/hello` or run the client

### Run client
In a different terminal, 

```
$ cd client
$ gradle run
```

you should see messages from server

```
client:compileJava UP-TO-DATE
:client:compileScala
:client:processResources UP-TO-DATE
:client:classes
:client:run
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Hello from Scala
Stopping server

BUILD SUCCESSFUL
```

## Karyon Admin interface
Once the server is started, the admin interface is available at : `http://localhost:8077/admin/`.


