# Exam Essentials
## Be able to identify the output of code using `instanceof`
`instanceof` checks if the left operand is the same class
or interface (or a subclass) as the right operand. If the
left operand is `null`, the result is `false`. If the two
operands are not in the same class hierarchy, the code will
not compile.

## Recognize correct and incorrect implementations of equals(), hashCode(), and toString()
`public boolean equals(Object obj)` returns `false` when called
`null` or a class of the wrong type. `public int hashCode()`
returns a number calculated with all or some of the instance
variables used in `equals()`. `public String toString()`
returns any `String`.
