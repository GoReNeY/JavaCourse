# MinecraftBlock

This project provides a simple implementation of MinecraftBlock in Java provided with fields sorting and finding same object.

## How to Use

### Code Example
Below is an example demonstrating the usage of project functionality:

Set `blocks` array and add your blocks
```java
MinecraftBlock[] blocks = {
        new MinecraftBlock(1, "Wood Block", 2.5, 1.5, 0),
        new MinecraftBlock(2, "Pine Block", 2.5, 2, 0),
        new MinecraftBlock(32, "Lightstone", 6.0, 3.0, 200),
        new MinecraftBlock(4, "Iron Block", 7.0, 4.5, 0),
        new MinecraftBlock(54, "Jack O Lantern", 5.0, 4.0, 150),
};
```
Add searched block to `searchedBlock` variable
```
MinecraftBlock searchedBlock = new MinecraftBlock(32, "Lightstone", 6.0, 3.0, 200);
```
Output
Given the text:

```
Sorted blocks:
MinecraftBlock{id='4', name='Iron Block', hardness=7.0, weight=4.5, lightLevel=0.0}
MinecraftBlock{id='54', name='Jack O Lantern', hardness=5.0, weight=4.0, lightLevel=150.0}
MinecraftBlock{id='32', name='Lightstone', hardness=6.0, weight=3.0, lightLevel=200.0}
MinecraftBlock{id='2', name='Pine Block', hardness=2.5, weight=2.0, lightLevel=0.0}
MinecraftBlock{id='1', name='Wood Block', hardness=2.5, weight=1.5, lightLevel=0.0}
Found same block: MinecraftBlock{id='32', name='Lightstone', hardness=6.0, weight=3.0, lightLevel=200.0}
```
