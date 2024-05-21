# Apache Spark Notes

#### Why does it exists?
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
Spark has an engine called catalyst which maintains information about planning and processing of 
work. 
Whenever we are doing any operation using any input language like scala, python, R spark will convert into its own 
representation using catalyst and then it will operate on this information.

DataSets -> the types are checked at compile time. Only JVM languages create Datasets through cae classes or beans
Dataframes -> the types are checked at runtime.

Dataframes are simply datasets of type "Row". Row is a type which is optimized for spark to represent a row in memory

#### Columns
They represent the header in a table. They can be of integer, string or maybe a complex type like an array

#### Rows
They are a record of data. Each record in a dataframe must be of Row type. Rows can be created through RDDs
, dataframes, raw csv or parquet data or from the raw scala types.
```scala
spark.range(2).toDF().collect()
```

### Spark Types
Import the following the package to use spark types

```scala
import org.apache.spark.sql.types._
val b = ByteType
```

### How Spark Executes Code
First the code(written in java, scala, etc) is submitted to the spark either through console or a submitted job. 
The code then goes through the catalyst optimizer.

#### Logical Planning
1. **Catalog**:
The Catalog in Apache Spark is a component that tracks all the metadata about the data stored in the system. 
This includes information about databases, tables, columns, partitioning information, and their data types, 
as well as functions and views. The catalog allows Spark to manage and utilize this metadata for query planning 
and optimization. Essentially, it serves as a central repository of all data definitions and structures used in Spark.

2. **Unresolved Logical Plan**:
An Unresolved Logical Plan is the initial phase of the query planning process in Spark SQL. When a query is first 
submitted to Spark, it is parsed into a logical plan that represents the operations and data structures required to 
execute the query. However, at this stage, the plan is "unresolved" because it may contain references to tables, columns, 
or functions that have not yet been validated against the catalog. The names and structures used in the query are still 
symbolic and have not been mapped to actual data sources.

3. **Resolved Logical Plan**:
A Resolved Logical Plan is what follows after the Unresolved Logical Plan has been processed. During this phase, 
Spark checks the unresolved plan against the catalog to validate that all tables, columns, and other referenced objects 
exist and are accessible. It resolves these references to their specific data structures and types. Once this validation 
is complete, and all symbols are associated with actual data definitions, the logical plan is considered "resolved".

4. **Optimized Logical Plan**:
   The Optimized Logical Plan is the result of applying a series of optimization rules to the Resolved Logical Plan. 
Spark uses a variety of rule-based and cost-based optimizations to improve the efficiency of the query. 
These optimizations might include reordering joins, pushing down filters, simplifying expressions, and pruning 
unnecessary columns or tables. The goal is to reduce the cost of executing the plan, in terms of resources like CPU, 
memory, and I/O operations, leading to faster query execution times.

These components form a crucial part of Spark’s ability to execute queries efficiently across distributed systems by 
progressively refining and optimizing the user's query requests.

#### Physical Planning
The optimization plan is then converted to a physical plan which contains the information about how the logical plan will
execute. Multiple physical plans might be generated and they each are compared with one another through a cost model.
This results in RDDs and transformations.

#### Execution
After the finalization of the physical plan spark will run the code on the RDDs generated. Further optimizations also 
happen through the use of java bytecode.

## Apache Spark Architecture

RDDs -> These are partitions of a record which are used to perform in-memory calculation in the spark cluster.
Two types of operations are possible on RDD -> 
1. Transformations (they define nee RDD) 
2. 2.Actions (To trigger the computation to store the value)

RDD Operations:-
1. partitions ->
2. partitioner ->
3. preferredLocation -> 
4. dependencies ->
5. iterator(p, parentIters) ->

Apache Spark is designed to efficiently process large datasets across a distributed environment. It consists of several high-level components that interact to manage and process data. Here are the key components of an Apache Spark cluster:

1. **Driver Program**:
   - The Driver program runs the main() function of the application and is the central point of the Spark application. It converts the user program into tasks and schedules these tasks on the executors.
   - The driver stores the necessary information about the Spark application and is responsible for analyzing, distributing, and scheduling the jobs to the executors.

2. **Cluster Manager**:
   - The Cluster Manager is responsible for managing the cluster resources. It allocates resources to various applications based on the demand. Spark itself is agnostic to the underlying cluster manager, and it supports several types, including:
      - Standalone Cluster Manager (native Spark cluster)
      - Apache Mesos
      - Hadoop YARN
      - Kubernetes

3. **Executors**:
   - Executors are distributed agents responsible for executing the tasks assigned to them by the driver. Each executor runs multiple tasks in multiple threads. They are responsible for computing and storing the data for the application. Executors also report the state of the computation back to the driver node.

4. **SparkContext**:
   - SparkContext is the heart of a Spark application. It establishes a connection to the Spark execution environment and is responsible for sending and executing operations like RDD (Resilient Distributed Dataset) transformations and actions across the Spark cluster. It acts as the master of the Spark application.

5. **DAGScheduler**:
   - The DAGScheduler divides the operator graph into stages of tasks. A stage consists of tasks based on partitions of the input data. The DAGScheduler pipelines operators together to optimize the graph and then submits the stages to the TaskScheduler.

6. **TaskScheduler**:
   - The TaskScheduler is responsible for sending tasks to the cluster, tracking their status, and retrying any failed tasks. It's lower-level than the DAGScheduler and is only aware of tasks, whereas the DAGScheduler knows about higher-level constructs like stages and partitions.

These components work together to provide a flexible and robust environment for processing large-scale data across distributed environments, enabling Spark to handle a wide range of data processing tasks efficiently.










