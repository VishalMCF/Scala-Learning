## Apache Spark Notes

### Why does it exists?
To handle big data on a cluster of machine. To coordinate the execution of tasks.
Spark's cluster manager, YARN and mesos are used to manage the clusters which spark will use.

## Basics
Spark Applications consists of two major processes:-
1. Driver Process:- Runs main() function in multiple languages which was used by the developers.
It is responsible for three things:_
a) Maintains info about spark application. b) responding to user's program c) analyze, distribute and schedule works
2. Executor process:- Execute the work provided by the driver. This process executes spark's code.

## Spark APIs
Mainly two set of APIs
1. Unstructured APIs
2. Structured APIs

### Starting Spark
This is done via initiating spark session. In scala the class which is used to do that is:-
org.apache.spark.sql.SparkSession
Lets create a spark data store variable
```scala
val numbers = spark.range(1000).toDF("number")
```
Spark splits the data into multiple chunks partitions which will be processed by each executors in a parallel fashion.
Spark have immutable data stores only. To generate a new dataset from an existing one you have to specify transformations 
in the driver code which spark will execute only when the actions are performed. Actions are also defined in the main() functions.
Two types of transformations:-
1. Wide Dependencies:-
2. Narrow Dependencies:-


### Spark Structured APIs
DataFrames, Datasets, Spark SQL are the three core types of spark collection APIs.






