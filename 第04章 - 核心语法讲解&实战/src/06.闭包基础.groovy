package variable
/*
    闭包的定义&调用:
    闭包的参数:
    闭包的返回值: 一定有
 */
def clouser = { String name -> println "Hello, ${name}" }
// clouser.call("Groovy!")
def name = 'Groovy!'
def result = clouser(name)
println result // null