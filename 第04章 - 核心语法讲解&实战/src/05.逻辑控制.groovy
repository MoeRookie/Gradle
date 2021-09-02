package variable
def x = 1.23
/*
    switch/case:

    def result
    switch (x){
        case 'foo':
            result = 'found foo'
            break
        case 'bar':
            result = 'bar'
            break
        case [1.23,4,5,6,'inlist']: // 列表
            result = 'list'
            break
        case 12..30: // 范围
            result = 'range'
            break
        case Integer:
            result = 'integer'
            break
        case BigDecimal:
            result = 'big decimal'
            break
        default: result = 'default'
            break
    }
    println result

    for循环:
 */
// 对范围的for循环
def sum = 0
for(i in 0..9){
    sum += i
}
// println sum // 45
sum = 0
// 对list的for循环
for(i in [1,2,3,4,5,6,7,8,9]){
    sum += i
}
// println sum // 45
sum = 0
// 对map的for循环
for(i in [lili:1, 'lucy':2, 'xiaoming':3]){
    sum += i.value
}
println sum // 6

