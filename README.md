#Intermediate Operations in StreamAPI

Stream API, intermediate operations are operations that transform a stream into another stream. These operations are lazy, meaning they don't process the stream's elements until a terminal operation is invoked. Intermediate operations are chained together, and each operation returns a new stream, enabling a fluent API style.

#List of Intermediate Operations

1. filter()
2. map()
3. mapToInt
4. mapToLong
5. mapToDouble
6. flatMap
7.flatMapToInt
8. flatMapToDouble
9. flatMapToLong
10.distinct
11.sorted
12.sorted(Comparator<? super T> comparator)
13.peek
14.limit
15.skip
16.takeWhile
17.dropWhile
18.unordered
19.takeWhile
