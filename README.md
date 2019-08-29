# opendecision




## Business Architechture

<img src="https://zipkin.io/public/img/web-screenshot.png" alt="Trace view screenshot" />


## Technology Architechture


<img src="https://zipkin.io/public/img/web-screenshot.png" alt="Trace view screenshot" />

## Data Architechture

<img src="https://zipkin.io/public/img/web-screenshot.png" alt="Trace view screenshot" />

## How to build

#### Requirements:

* JDK 8
* Maven 3.5.4
* 1 GiB RAM free

## Quick-start










# Build the server and also make its dependencies
$ ./mvnw -DskipTests --also-make -pl zipkin-server clean install
# Run the server
$ java -jar ./zipkin-server/target/zipkin-server-*exec.jar



### Javadocs
https://zipkin.io/zipkin contains versioned folders with JavaDocs published on each (non-PR) build, as well
as releases.
