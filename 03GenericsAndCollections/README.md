# Exam Essentials
## pick the correct type of collection from a description
A `List` allows duplicates and orders the elements. A `Set` does not allow duplicates.
A `Queue` orders its elements to allow retrievals from one or both ends. A `Map` maps
keys to values. Be familiar with the differences of implementations of these
interfaces.

## Identify valid and invalid uses of generics
`<T>` represents a type parameter. Any name can be used, but a single uppercase letter
is convention. `<?>` is an unbounded wildcard. `<? extends X>` is an upper-bound
wildcard and applies to both calsses and interfaces. `<? super X>` is a lower-bounded
wildcard.

## Recognize the difference between compiler warnings and errors when dealing with legacy code
A compiler warning occurs when using non-generic types, and a `ClassCastException`
might occur at runtime. A compiler error occurs when trying to unbox from a legacy
collection.

## Differntiate between `Comparable` and `Comparator`
Classes that impelement `Comparable` are said to have a natural ordering and implement
the `compareTo()` method. A class is allowed to have only one natural ordering. A
`Comparator` takes two objects in the `compare()` method. Different `Comparators` can
have different sort orders. A `Comparator` is often implemented using a lambda such as
`(a, b) -> a.num - b.num`.

## Understand the behavior and usage of the sort and binary search methods
The `Collections` and `Arrays` classes provide overloaded `sort()` and `binarySearch()`
methods. They take an optional `Comparator` parameter. The list or array must be sorted
before it is searched using the same definition of order for both.

## Map method references to the "long form" lambda
Be able to convert method references into regular lambda expressions and vice versa.
For example, `System.out::print` and `x -> System.out.print(x)` are equivalent.
