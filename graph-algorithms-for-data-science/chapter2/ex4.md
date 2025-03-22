# What do you think is the best approach to add the link information in twitter graph
```cypher
(:User {id: "a"})-[:PUBLISHED]->(:Tweet {id: "1"})
(:Tweet {id: "1"})-[:REFERENCE]->(:LINK {url: "https://en.wikipedia.org/wiki/Property_graph"})
```