from pyspark.sql import SparkSession


def main():
    spark = SparkSession.builder\
        .appName("Pyspark Template").getOrCreate()
    
    data = [('James','Smith','1991-04-01',3000),
            ('Michael','Rose','','2000-05-19',4000)]
    
    columns = ["firstname","lastname","dob","salary"]
    df = spark.createDataFrame(data=data, schema = columns)
    df.show()


if __name__ == "__main__":
    main()