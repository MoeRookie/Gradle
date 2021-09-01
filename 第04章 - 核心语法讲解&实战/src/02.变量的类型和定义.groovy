package variable
/*
    变量的类型
    int x = 10
    println x.class
    double y = 3.14
    println y.class
 */

/*
    变量的定义

    如何选用这两种定义方式?
        01. 如果这个变量不会应用于其他类或模块，那么就可以使用 def 来定义；( 可以方便的随时将其转换为其他类型 )
        02. 否则，那么就应该使用强类型定义的方式；
            ( 一方面，其不能动态的转换为其他类型，这样就能保证调用方传给我们正确类型的值；
              另一方面，如果其要被外界使用，而我们又使用的def去定义的话，那么就会导致调用方无法确定传给我们值的类型 )
 */
def x = 11
// println x.class
def y = 3.1415
// println y.class
def z = "Lndroid"
// println z.class
x = 'Test'
println x.class