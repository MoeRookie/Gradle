package objectorention
/*
    无论你是直接.还是调用get/set最终都是调用get/set
 */
// def person = new Person(name: 'Lndroid', age: 26)
// println person.cry()

// 为类动态的添加一个属性
Person.metaClass.sex = 'male'
// def person = new Person(name: 'Lndroid', age: 26)
// println person.sex // male
// person.sex = 'famale'
// println "the new sex is: ${person.sex}" // female

// 为类动态的添加方法
Person.metaClass.sexUpperCase = { sex.toUpperCase() }
def person = new Person(name: 'Lndroid', age: 26)
// println person.sexUpperCase() // MALE

// 为类动态添加静态方法
Person.metaClass.static.createPerson = { String name, int age ->
    new Person(name: name, age: age)
}
def person02 = Person.createPerson('Lndroid', 26)
println "the name is ${person02.name}, the age is ${person02.age}"