from pyspark.sql import SparkSession
import sys
import os

os.environ['PYSPARK_PYTHON'] = sys.executable
os.environ['PYSPARK_DRIVER_PYTHON'] = sys.executable


spark = SparkSession.builder.getOrCreate()

df = spark.createDataFrame([
    ["one", "two", 1000000],
    ["one", "two", "three"]
])

print(sum(map(lambda x: x[1] != "string", df.dtypes)))
