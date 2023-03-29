# Apache Spark project template

## Background
In today's data-driven world, collaboration between data engineers and data scientists is critical for the success of any data project. [Data engineers](https://en.wikipedia.org/wiki/Data_engineering) are responsible for designing and building the infrastructure required for data storage, processing, and transformation. [Data scientists](https://en.wikipedia.org/wiki/Data_science), on the other hand, are responsible for developing and deploying machine learning models and deriving insights from the data. To ensure productive collaboration between these two groups, there are some challenges to address: how they communicate, how they work on the same codebase, how they establish code quality standards, what common tools and frameworks they can use?   

## Programming Skills
Data scientists and data engineers work closely together in data-driven organizations, but usually they have different skillsets. Data scientists are proficient in programming languages such as Python, R, and SQL to analyze data, build predictive models, and communicate insights. Data engineers are proficient in programming languages such as Java, Scala, and Python to build and maintain data pipelines, and create data architecture. Productive collaboration between data engineers and data scientists is possible if they are using a framework that supports all (most) these programming languages.


## Apache Spark
[Apache Spark](https://spark.apache.org/) is a powerful open-source data processing framework that supports multiple programming languages, including Java, Scala, Python, SQL and R. Data scientists can use Apache Spark for various tasks such as data cleaning, feature engineering, model training, and evaluation. They can write code in Python or R using Spark's APIs to process large-scale data and build predictive models. Data engineers can use Apache Spark for tasks such as data ingestion, data transformation, and ETL (extract, transform, load) processes. They can write code in Scala or Java using Spark's APIs to build efficient data pipelines and process data in a distributed manner.


## Project Structure
Here's an example folder structure for an Apache Spark project that combines Python and Scala, has a Dockerfile, contains tests in both Scala and Python, and has a docs folder:

```bash
project/
├── docker/
│   └── Dockerfile
├── python/
│   ├── script.py
│   ├── requirements.txt
│   └── tests/
│       └── test_script.py
├── scala/
│   ├── build.sbt
│   ├── project/
│   │   ├── build.properties
│   │   └── plugins.sbt
│   └── src/
│       ├── main/
│       │   ├── resources/
│       │   └── scala/
│       │       └── script.scala
│       └── test/
│           └── scala/
│               └── TestScript.scala
├── docs/
│   ├── README.md
│   └── documentation.md
└── README.md

```



