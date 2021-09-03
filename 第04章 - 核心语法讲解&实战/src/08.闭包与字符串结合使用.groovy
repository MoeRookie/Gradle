package variable
/*
    字符串与闭包的结合使用:
 */
String str = 'the 2 and 3 is 5'

// each的遍历
// println str.each {
//     // String s -> print s
// }

// find
// 01.用来查找符合条件的第一个
// 02.闭包是布尔类型的返回值
// println str.find {
//     String s -> s.isNumber()
// } // 2

// findAll用来查找符合条件的所有元素
// def list = str.findAll {
//     String s -> s.isNumber()
// }
// println list.toListString()

// any用来判断是否有符合条件的元素
// println str.any {
//     String s -> s.isNumber()
// } // true

// every方法用来判断是否所有元素都符合条件
// println str.every {
//     String s -> s.isNumber()
// } // false

// collect方法: 将每个元素通过闭包作用后添加到list中并返回
def list = str.collect {
    it.toUpperCase()
}
println list.toListString()
