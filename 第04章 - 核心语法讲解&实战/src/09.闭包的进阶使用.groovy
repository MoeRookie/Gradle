package variable

/*
    闭包的三个重要变量: this、owner、delegate

    def scriptClouser = {
        println "scriptClouse this ${this}" // 代表闭包定义处的类(类对象|字节码)
        println "scriptClouse this ${owner}" // 代表闭包定义处的类或者对象(外层闭包)
        println "scriptClouse this ${delegate}" // 代表任意对象, 默认与 owner 一致
    }
    scriptClouser.call()
 */
// 定义一个内部类
class Person{
    def classClouser = {
        println "classClouser this ${this}"
        println "classClouser this ${owner}"
        println "classClouser this ${delegate}"
    }

    def say(){
        def methodClouser = {
            println "methodClouser this ${this}"
            println "methodClouser this ${owner}"
            println "methodClouser this ${delegate}"
        }
        methodClouser.call()
    }
}

Person person = new Person()
// person.classClouser.call()
// person.say()

// 闭包中定义闭包
def outerClouser = {
    def innerClouser = {
        println "innerClouser this :" + this
        println "innerClouser this :" + owner
        println "innerClouser this :" + delegate // 修改默认的delegate
    }
    innerClouser.delegate = person
    innerClouser.call()
}
// outerClouser.call()

/*
    总结:
    01.在大多数场景下, this、owner、delegate的值都是一样的
    02.在闭包中定义闭包时, this和owner、delegate的值就不一样了
    03.在修改了闭包的delegate值(this、owner的值不能修改)以后, owner和delegate的值也就不一样了
 */
/*========================================闭包的委托策略============================================*/
class Student{
    String name;
    def pretty = {
        "My name is ${name}"
    }
    String toString(){
        pretty.call()
    }
}
class Teacher{
    String name1;
}

def stu = new Student(name: "Sarash")
def tea = new Teacher(name1: "Lndroid")

stu.pretty.delegate = tea // 修改代理变量
stu.pretty.resolveStrategy = Closure.DELEGATE_ONLY // 指定委托策略为: DELEGATE_FIRST
println stu.toString()