package variable
/*
    方式一: 通过单引号('')来定义字符串
    def name = 'a single \'a\' string'
    println name.class

    方式二: 通过三引号('''''')来定义字符串
    *: 在定义有格式的字符串时使用
    def thupleName = '''\
    line 1
    line 2
    line 3
    '''
    println thupleName

    方式三: 通过双引号("")来定义字符串
    def doubleName = "this a common string"
    println doubleName.class

    def name = "Lndroid"
    def sayHello = "Hello, ${name}" // 扩展表达式("{}"内可以是任意表达式)
    println sayHello
    println sayHello.class

    def sum = "The sum 2 and 3 equals ${2 + 3}"
    println sum
 */
def sum = "The sum 2 and 3 equals ${2 + 3}"

def result = echo(sum)
println result.class

String echo(String message){
    return message
}
