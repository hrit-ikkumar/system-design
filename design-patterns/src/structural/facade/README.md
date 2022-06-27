# Facade Design Pattern
`Handles ineteraction with subsystems`
1. We use facade when using our subsystem requires dealing with lots of classes & interfaces for client. Using facade we provide a simple interface which provides same functionality. 
2. Facade is not a simple method forwarding but facade methods encapsulate the subsystem class interactions which otherwise would have been done by client code. 
3. Facades are often added existing legacy codes to simplify code usage & reduce coupling of client code to legacy code.

`java.net.URL is an example of facade design pattern in java`