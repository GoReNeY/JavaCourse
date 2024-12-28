# SortUniqueWords

This project provides a simple implementation in Java for splitting text provided in String to words, sorting those words and print in sorted order, excluding duplicates.

## How to Use

### Code Example
Below is an example demonstrating the usage of project functionality:

```java
public class Main {
    public static void main(String[] args) {

        SortUniqueWords.sortText("cd ef gh ij ab ab");
    }
}
```
Output
Given the text:

```
"cd ef gh ij ab ab"
```

The program will produce the following output:


```
[ab, cd, ef, gh, ij]
```