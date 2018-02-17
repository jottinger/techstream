# Model

## Stream

A `Stream` is a source from which an `Event` is generated. It is expected that a `Stream` is not a concrete type.

* Id
* Name
* Type
* Weight (Some `Stream` types may have a lot of events, most of which are not significant)
* Poll Frequency
* Description
* Active
* Last Poll Instant
* Churn (represents how active the `Stream` is)
* Relevance (represents how many events of interest are part of the `Stream` in recent history)

### Questions

* How to gauge `Relevance`? How does it decay?

## Event

An `Event` is an action produced by a `Stream`. It expected that an `Event` is not a concrete type.

* Id
* Source (the `Stream` that generated the event)
* Type
* Content (malleable; hard to define offhand since events can be different things)
* Instant Created
* Relevance (represents whether the `Event` is historically of interest or not)
* Hits (number of times the `Event` was observed by users)

### Questions

* How to ensure uniqueness?
* How to gauge relevance? What training models? Do they apply generally to all event types?