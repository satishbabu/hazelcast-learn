# A very simple Hazelcast program


### Server
* Run HazelCastServer.java - It starts the hazelcast server, creates a map called dogs that generates 100 dogs

### Client
* Run HazelCastClient.java - It creates a client and joins the server automatically.  It then gets dogs from the cache and prints them     

Note that both client and server needs to be stopped manually 