from pyspark.sql import SparkSession
from pyspark.sql.functions import col, split, explode, lower, regexp_extract, length

spark = SparkSession.builder.getOrCreate()

book = spark.read.text("./data/pride-and-prejudice.txt")

lines = book.select(split(book.value, " ").alias("line"))

words = lines.select(explode(col("line")).alias("word"))

lower = words.select(lower(col("word")).alias("lower"))

words_clean = lower.select(regexp_extract(col("lower"), "[a-z]*", 0).alias("word"))

words_nonull = words_clean.where(col("word") != "")

words_nois = words_nonull.where(col("word") != "is")

words_len = words_nois.select(col("word"), length(col("word")).alias("length"))

threewords = words_len.where(col("length") > 3).select(col("word"))

threewords.show()