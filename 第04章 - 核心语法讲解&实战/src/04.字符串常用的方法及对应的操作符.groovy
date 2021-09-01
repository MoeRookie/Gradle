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

    def sum = "The sum 2 and 3 equals ${2 + 3}"

    def result = echo(sum)
    println result.class

    String echo(String message){
        return message
    }
 */
/* ===================================================字符串的方法===================================================== */
def str = 'groovy Hello'
/*
    字符串填充:
    println str.center(8) // param: 扩充后的新字符串的长度, 要使用其扩充的字符串(不写第二个参数表示以空格填充)
    println str.padLeft(8, 'a') // 将要使用其扩充的字符串填充到已有字符串的左边

    字符串比较:
    def str2 = 'Hello'
    println str > str2

    字符串索引: 如何获取到字符串中的某一个字符
    println str[0] // g
    println str[0..1] // gr

    字符串减法: 从str中减掉str2, 没有则返回str内容本身
    println str - str2

    其他常用方法:
    反转:
    println str.reverse()
    首字母大写:
    println str.capitalize()
    判断是否为数字串"
    println str.isNumber()

    转化类型的方法:
 */
str.toInteger()
str.toLong()
str.toDouble()

