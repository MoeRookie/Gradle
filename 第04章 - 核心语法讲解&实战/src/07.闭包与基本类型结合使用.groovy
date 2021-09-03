package variable
/*
    求指定number的阶乘

    DefaultGroovyMethods类中，名为self参数的类型为Number类型，则说明该方法是基本数据类型与闭包结合的方法；
    闭包的参数，可以通过查看源码，根据闭包调用时传入的参数确定要传入的参数；
 */
int x = cal(101)
println x // 120
int fab(int number){
    int result = 1
    1.upto(number, {num -> result *= num})
    return result
}

int fab2(int number){
    int result = 1
    number.downto(1){ // 闭包可以写在方法外(实际上, 通常也是这种写法)
        num -> result *= num
    }
    return result
}

int cal(int number){
    int result = 0
    number.times { // 方法没有要显示定义的参数时, 可以省略"()"
        num -> result += num
    }
    return result
}