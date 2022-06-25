# Object Pool Design Pattern
1. When cost of creation of object is very high.
2. We may need these objects for very short time span in our application
3. Typically, objects that represent fixed external system resources like threads, connections or other system resources are a good candidate for pooling

`java.util.concurrent.ThreadPoolExecutor is example of Object pool in java`