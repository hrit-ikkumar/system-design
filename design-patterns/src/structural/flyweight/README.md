# Flyweight Design Pattern
`Separate Shared and Non-Shared things and store sharable things into Flyweight and calculate non-sharable state on fly, Reduces no of object creation in code`

1. We use flyweight design pattern if we need large number of objects of class where we can easily separate out state that can be shared and state that can be externalized.
2. Flyweights store only "intrinsic" state or state that can be shared in any context.
3. Code using flyweight instance provides the extrinsic state when calling methods on flyweight. Flyweight object then uses this state along with tis inner state to carry out the work.
4. Client code can be store extrinsic per fliweight instance it uses or compute it on the fly.
5. States:
    1. Intrinsic state: Sharable state with flyweight context, state-independent, stored in flyweight
    2. Extrinsic state: Passed to flyweight, This is dependent state for flyweight, Need to calculated on the fly
    
``