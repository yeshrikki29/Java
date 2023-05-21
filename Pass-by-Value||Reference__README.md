# Pass By Reference vs. Pass By Value
> When passing arguments to a method in Java, there are two ways in which the value of the argument can be passed: [pass by reference](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20REFERENCE) and [pass by value](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20VALUE). It is important to understand the difference between these two concepts, as they have different implications for how the method will behave.

> ## [***Pass By Value***](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20VALUE)
>>**Calling or invoking a method by passing primitive data type.**
>>> In [pass by value](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20VALUE), the value of the argument is copied and passed to the method. This means that any changes made to the argument inside the method do not affect the original value of the argument outside the method. ...


> ### Example:

```
public class PassByValueExample {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before method call: " + num);
        square(num);
        System.out.println("After method call: " + num);
    }

    public static void square(int n) {
        n = n * n;
    }
}
```

## *Output:*
```
Before method call: 5
After method call: 5
```
> In the above example, we pass an integer variable num to the square method. Inside the method, the value of n is squared, but this does not affect the original value of num outside the method.

> ## [***Pass By Reference***](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20REFERENCE)
>> **Calling or invoking a method by passing a Reference variable.**
>>> In [pass by reference](https://github.com/yeshrikki29/Java/tree/Pass-by-value%7C%7CReference/PASS%20BY%20REFERENCE), a reference to the original object is passed to the method. This means that any changes made to the object inside the method are reflected in the original object outside the method.

### *Example:*

```
public class PassByReferenceExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        increment(arr);
        System.out.println(Arrays.toString(arr)); 
    }
    
    public static void increment(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
}

```
### Output:

```
[2, 3, 4]
```

> In the above example, we pass a StringBuilder object sb to the appendString method. Inside the method, the string " World" is appended to the original string, and this change is reflected in the original object outside the method.

### *Conclusion*
> It is important to understand the difference between pass by value and pass by reference when writing Java programs, as it can have implications for how your methods behave. In general, **Java uses pass by value**, but objects are passed by reference.
