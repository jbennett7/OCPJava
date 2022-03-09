# Exam Essentials
## Identify the correct functional interface given the number of parameters, return type, and method name--and vice versa
The most commaon functional interfaces are `Supplier`, `Consumer`, `Function`,
and `Predicate`. There are also binary versions and primitive versions of
many of these methods.

## Write code that uses `Optional`
Creating an `Optional` uses `Optional.empty()` or `Optional.of()`. Retrieval
frequently uses `ifPresent()` and `get()`. Alternatively, there are the
functional `ifPresent()` and `orElseGet()` methods.

## Recognize which operations cause a stream pipeline to execute.
Intermediate operations do not run until the terminal operation is encountered.
If no terminal operation is in the pipeline, a `Stream` is returned but not
executed. Examples of terminal operations include `collect()`, `forEach()`,
`min()`, and `reduce()`.

## Determine which terminal operations are reductions
Reductions use all elements of the stream in determining the result. The
reductions that you need to know are `collect()`, `count()`, `max()`, `min()`,
and `reduce()`. A mutable reduction collects into the same object as it goes.
The `collect()` method is a mutable reduction.

## Compare primitive streams to `Stream`
There are three primitive stream classes: `DoubleStream`, `IntStream`, and
`LongStream`. The `map()` method returns a `Stream` transforming each element
to another through a `Function`. The `flatMap()` method flattens nested lists
into a single level and removes empty lists.

## Convert primitive stream types to other primitive stream types
Normally when mapping, you just call the `map()` method. When changing the
class used for the stream, a different method is needed. To convert to
`Stream`, you use `mapToObj()`. To convert to `DoubleStream`, you use
`mapToDouble()`. To convert to `IntStream`, you use `mapToInt()`. To convert
to `LongStream`, you use `mapToLong()`.

## Translate coding using method references into lambdas and vice versa
All code that uses method references can be rewritten as a lambda.For
example, `stream.forEach(System.out::println)` does the same thing as
`stream.forEach(x -> System.out.println(x))`. Not all code that uses lambdas
can be rewritten to use a method reference.

## Use `peek()` to inspect the stream
The `peek()` method is an intermediate operation. It executes a lambda or
method reference on th einput and passes that same input through the pipeline
to the next operator. It is useful for printing out what passes through a
certian point in a stream.

## Search a stream
The `findFirst()` and `findAny()` methods return a single element from a stream
in an `Optional`. The `anyMatch()`, and `allMatch()`, and `noneMatch()` methods
return a `boolean`. Be careful, because these three can hang if called on an
infinite stream with some data. All of these methods are terminal operations.

## Sort a stream
The `sorted()` method is an intermediate operation that sorts a stream. There
are two versions: the signature with zero parameters that sorts using the
natural sort order, and the signature with one parameter that sorts using that
`Comparator` as the sort order.
