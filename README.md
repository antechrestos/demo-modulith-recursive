# Demo modulith recursive

## Module

The project is simple:

* controller in module A calls its domain object A
* this late one publishes an event for starting a `BTreatment`
* B module listens to this kind of event and handle the event
* B module then publishes an event telling that `BTreatment` is handled
* C module listens to this kind of event 

## Run it

### Infrastructure

Go to `infrastructure` directory and run `docker compose up`

### Application

In project directory, run `./gradlew bootRun`

## Test it

Run `curl http://localhost:8080/api/v1/a`

