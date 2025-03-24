from pyspark.sql import SparkSession
from pyspark.sql.functions import col, length, greatest
import sys
import os

os.environ['PYSPARK_PYTHON'] = sys.executable
os.environ['PYSPARK_DRIVER_PYTHON'] = sys.executable

spark = SparkSession.builder.getOrCreate()

ex2_4_df = spark.createDataFrame(
    [["key", 300, 200],
     ["a", 20, 50]]
)

ex2_4_df.show()

ex2_4_df_mod = ex2_4_df.select(
    greatest(col("_2"), col("_3")).alias("maximum")
)

ex2_4_df_mod.show()