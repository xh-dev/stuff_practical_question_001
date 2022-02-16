### Practical Test Question

```javascript
function recur(n, cur){
    if(!cur){
        cur=0;
    }
    if(n<2){
        throw new Error("invalid input");
    }
    if(n===2){
        return 1/n +cur;
    }
    return recur(n-1, cur + 1/(n*(n-1)));
}

console.log(recur(2,0));
console.log(recur(3,0));
console.log(recur(4,0));
console.log(recur(5,0));
console.log(recur(6,0));
console.log(recur(7,0));
console.log(recur(8,0));
console.log(recur(9,0));


```
#### Explanation
The recur function keep recurring until the n===2.
when recuring 'cur + 1/(n*(n-1))' could be represented as
```
cur0 = the first value of cur
k = the number of time of iteration

when n > 2, cur + 1/(n*(n-1))
when n===2, 0.5 + cur
when n < 2, error thrown for method guard only, not involved in calc


since method (1/(n*(n-1)) + (1/(n-1)(n-2)) + ...   pattern could be simplfied in math
The result of above pattern could be represent as k/(n(n-k))

```


```java
public class Solution3 {
    private static double calc(int n) {
        return calc(n, 0.0);
    }

    private static double calc(int n, double cur) {
        if (n < 2) {
            throw new RuntimeException("Input not valid");
        }

        final double nDouble = Integer.valueOf(n).doubleValue();
        final int k = n - 2;
        final double kDouble = Integer.valueOf(k).doubleValue();


        // when n === 2, the x value always equals 0.5
        final double x = 0.5;
        return cur + (kDouble / (nDouble * (nDouble - kDouble))) + x;

    }

    public static void main(String[] args) {
        System.out.println(calc(2, 0));
        System.out.println(calc(3, 0));
        System.out.println(calc(4, 0));
        System.out.println(calc(5, 0));
        System.out.println(calc(6, 0));
        System.out.println(calc(7, 0));
        System.out.println(calc(8, 0));
        System.out.println(calc(9, 0));
    }
}

```

#### Result
```
0.5
0.6666666666666666
0.75
0.8
0.8333333333333333
0.8571428571428572
0.875
0.8888888888888888
```