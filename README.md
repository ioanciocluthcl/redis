# Demo application with Spring Boot and Redis 

This is a demo project for working with Spring Boot and Redis.

## Install Redis and RedisInsight
The easiest way to install redis locally (for demo projects) is to run it in a docker container. 
You can use redis/redis-stack image which will provide a redis server (http://localhost:6379) 
and RedisInsight UI for visualizing data (http://localhost:8001).
For running redis-stack in Docker, use the below command:

`docker run -d --name redis-stack -p 6379:6379 -p 8001:8001 redis/redis-stack:latest`

## REST API
This application provides two rest APIs:
* http://localhost:8080/students - POST - Adds a new student to DB
* http://localhost:8080/students - GET - Gets all students from DB