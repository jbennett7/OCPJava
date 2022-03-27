# Exam Essentials
## Determine if an exception is checked or unchecked.
Checked exceptions are in the Exception class hierarchy but not the `RuntimeException` hierarchy.
`DateTimeParseException`, `IOException`, and `SQLException` are common checked exceptions.

## Recognize when to use `throw` vs. `throws`.
The `throw` keyword is used when you actually want to throw an exception. For example,
`throw new RuntimeException()`. The `throws` keyword is used in a method declaration.

## Create code using multi-catch.
The multiple exception types are separated by the pipe (|). They are not allowed to have a
subclass/superclass relationship.

## Identify the similarities and differences between a traditional `try` statement and try-with-resources statement.
A traditional `try` statement is required to have at least one `catch` block or a `finally` block.
A try-with-resources statement is allowed to omit both. A try-with-resources statement is allowed
to create suppressed exceptions in the `try` clause or when closing resources. Neither is allowed
to create suppressed exceptions by combining the `try` and `finally` (or `catch`) clauses.

## Know how to enable assertions.
Assetions are disabled by default. Watch for a question that uses assertions but does not enable them
or a question that tests your knowledge of how assertions are enabled from the command line.
