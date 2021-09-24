package datastruct
/*
    注*:
        01.map的key一般为不可变字符串/Number类型, 这里的red...就是不可变字符串,只不过编译器在编译groovy的时候给加上了
        02.要通过map.getClass()方法来获取groovy的map所使用的Java中map的类型[因为map.class属性在此会被结合为key所存在]
 */
def colors = [red:'ff0000',
              green:'00ff00',
              blue:'0000ff']
// 索引方式
// println colors['red']
// println colors.red
colors.blue
// 添加元素
// colors.yellow = 'ffff00'
colors.complex = [a:1, b:2]
// println colors.getClass()
