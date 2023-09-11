# Description

## About
A simple Spring Boot demo project build based on hexagonal architecture.

## Additional notes

### Alternative package structure by domain names
In addition, packages like 'endpoint', 'domain', and 'provider' can be split by domain name. For example, we can use the following package structure:
```
-> domain
  -> customer
     -> model
     -> port
     -> ...
  -> order
     -> model
     -> port
     -> ...
```

Or without sub-packages:

```
-> domain
  -> customer
     -> Customer.java
     -> CustomerDetailsProvider.java
     -> CustomerService.java
     -> ...
  -> order
     -> Order.java
     -> CustomerDetailsProvider.java
     -> CustomerService.java
```

Such approach makes potential codebase migration to new microservices easier.

### Utilize DDD or/and Command pattern (which can be called UserAction)
Hexagonal architecture is often used together with DDD and Command pattern. For complex projects, consider utilizing well-known Command pattern.

## Tech stack:
1. Spring Boot Web
2. Spring Data Mongo
3. Mapstruct
4. Archunit
