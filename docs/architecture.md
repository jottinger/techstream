# TechStream architecture

TechStream should be built around asynchronous messaging and a microservices architecture.

`docker` and `docker-compose` should be workable as a deployment mechanism.

## Initial thoughts:

* Asynchronous messaging should be provided by ActiveMQ or RabbitMQ. Both are easy, but we need to figure out how to programmatically bootstrap the MQ.
* A relational datastore might be best for persistent data storage if only because it orders data so easily based on event times. I'd prefer to use something like Mongo or Couchbase (or Gigaspaces!) but the ordering of data might make a SQL database more appropriate. GigaSpaces also has the concern over polyglot access; it's fully expected that parts of the app might be in Ruby, Python, Node.JS, or Java.
* I don't know if this is a single-user or multi-user application yet.

## Components

* Web UI
* Administration UI (separate from Web UI?)
* Feed Reader
