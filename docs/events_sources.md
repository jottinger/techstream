# Event Sources

This is a recording of thoughts about event sources and their meanings.

* RSS Feeds (each new link in a given feed is a "new event")
* [Github events](https://developer.github.com/v3/activity/events/#list-issue-events-for-a-repository)
	* `GET /repos/:owner/:repo/events` - example can be seen at https://api.github.com/repos/jottinger/techstream/events
* IRC public messages for a given channel
* Slack messages for a given channel
* Email (IMAP/POP3 respository?)