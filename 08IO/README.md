# Exam Essentials
## Understand files, directories, and streams.
Files are records that store data to a persistent storage device that is available after the application
has finished executing. Files are organized within a file system in directories, which in turn may contain
other directories. Files can be accessed using streams, which present the data in sequential blocks.

## Be able to use the `java.io.File` class.
Java `File` instances can be created by passing a path `String` to the new `File()` constructor. The `File`
class includes a number of instance methods for retrieving information about both files and directories. It
also includes methods to create/delete files and directories, as well as retrieve a list of files within the
directory.

## Distnguish between byte and character streams.
The `java.io` API supports both byte and character strems. Byte streams have the word `InputStream` or
`OutputStream` in their name and are useful for interacting with binary data. Character streams have the word
`Reader` or `Writer` in their name and are convenient for working with `String` or character data.

## Distinguish between low-level and high-level streams.
A low-level stream is one that operates directly on the underlying resource, such as a stream that reads file
data from the file system. A high-level stream is one that operates on a low-level or other high-level stream
to filter or convert data or to improve read/write performance with the buffer.

## Be able to recognize and know how to use the following classes:
* BufferedReader
* BufferedWriter
* File
* FileReader
* FIleWriter
* FileInputStream
* FileOutputStream
* ObjectOutputStream
* ObjectInputStream
* PrintWriter
The `java.io` API reuses terms in the stream class name, which are useful in decoding the function of the class,
such as `InputStream`, `OutputStream`, `Reader`, `Writer`, `Buffered`, `File`, `Object`, and `Print`. You should
know how to use the stream classes listed here, including how to chain the streams together.

## Be able to perform common stream operations including `close()`, `flush()`, `mark()`, `markSupported()`, `reset()`, and `skip()`
The `java.io` API includes numerous methods common to both input and output stream classes. The `close()` method is
shared by all stream classes and can be used implicitly by using try-with-resource syntax. The `flush()` method is
used in output stream classes to force the writing of the data to the conjunction with the input stream classes
to force the writing of the data to the underlying resource. The `markSupported()`, `mark()`, and `reset()` methods
are used in conjunction with the input stream classes to mark a position in the stream and return to it later on.
Not all `java.io` input stream classes support the `mark()` and `reset()` operations. Finally, the `skip()` method
is used in input stream classes to skip past a number of bytes.

## Understand how to use Java serialization.
Classes can implement the `java.io.Serializable` interface to indicate that they support serializing their data to
disk. The interface requires that all instance members of the class are `Serializable` or marked `transient`. The
`String` class and all Java primitives are `Serializable`. The `ObjectInputStream` and `ObjectOutputStream` classes
can be used to read and write a `Serializable` object from and to a stream, respectively.

## Be able to interact with the user via the `Console` class.
Java 6 introduced the `Console` class as a replacement to `System.in` and `System.out` for reading and writing
data from the user, respectively. The `Console` class includes special methods for retrieving passwords that
are more secure than the standard ways o retrieving `String` values.
