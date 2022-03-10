# Exam Essentials
## Recognize invalid uses of dates and times
`LocalDate` does not contain time fields and `LocalTime` does not contain date
fields. Watch for operations eing performed on the wrong type. Also watch for
adding or subtracting time and ignoring the result.

## Differntiate between `Period` and `Duration`
`Period` is for day, month, and year. It can only be used with `LocalDate`,
`LocalDateTime`, and `ZonedDateTime`. `Duration` is for hours, minutes, and
seconds. It can only be used with `LocalTime`, `LocalDateTime`, and
`ZonedDateTime`.

## Perform calculations with dates
Be able to perform calculations between times using UTC. Whether the format is
`-05:00`, `GMT-5`, or `UTC-5`, you calculate by subtracting the offset from the
time and then seeing how far the resulting times are. Also be able to perform
comparisons that include daylight savings time. In March, the United States
springs ahead an hour, and in November, it falls back an hour.

## Identify valid and invalid locale strings
Know that the language code is lowercase and mandatory. The country code is
uppercase if present and follows the language code and an underscore.
`Locale.Builder` is an alternate way to create a `Locale`, and it allows
calling the setters in either order.

## Determine which resource bundle Java will use to look up a key
Know the order that Java uses to search for a matching resource bundle. Also
recognize that the matching resource bundle hierarchy is searched once a
matching resource bundle is found.

## Understand which `Property` value gets used as a default
When calling `get()`, `null` is returned if the key is not found. When calling
`getProperty()`, there are two options. The single-parameter version still
returns `null` if the key is not found. The version that takes two parameters
uses the second parameter as a return value if the key is not found.
