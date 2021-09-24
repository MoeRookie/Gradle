package datastruct
/* 范围的定义 */
def range = 1..10
// println range[0] // 1
// println range.contains(10) // true
// println range.from // 1
// println range.to // 10
/* 本质 */
// 01.范围实际上就是一个列表
// 02.轻量级(eg. 列表中都是一些简单的数字1~10/1~20等, 这时候使用列表就显得更加'重量级')

// 遍历
range.each {
    // println it
}

for(i in range){
    // println i
}

// range在switch-case中的使用
def result = getGrade(75)
println result

def getGrade(Number number){
    def result
    switch (number){
        case 0..<60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..<80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
    return result
}

