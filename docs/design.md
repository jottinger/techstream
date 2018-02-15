# TechStream

TechStream is a project whose intention is to track and highlight activity across various information feeds.

The idea is that an _information stream_ is a source for information that is generally technology neutral: an RSS feed is likely to be the most common stream, but one could also imagine github events as information streams, or messages from Slack or IRC, for example.

Information streams generate an _event_ when something happens. For example, an RSS information stream would record a new link as a new event; an IRC channel might have events posted that correspond to individual messages (possibly conforming to some kind of matching mechanism, like "line contains a URL"); a github project event might correspond to a new release, a new issue filed, or a commit or merge.

Because the granularity of events might be so different (an RSS feed might get one - or one hundred - new links a day, while an IRC channel might get *thousands* of messages a day), events have a scale associated with them, that gauges whether the event is _significant_ or not.

An event's significance factors in when you consider how _active_ an information stream is.

The UI should allow streams to be represented in multiple forms:

* A list of the information streams based on how active they are, over their entire history
* A list of the information streams based on how active they are in *recent history*
* A list of the events overall, filterable by type (to allow users to ignore events with little significance, like IRC events)
* A list of the events per information stream
* A list of the events that are *likely* to be of interest, based on training information
