package objectorention
/*
    无论你是直接.还是调用get/set最终都是调用get/set
 */
def person = new Person(name: 'Lndroid', age: 26)
println "the name is ${person.getName()}, " +
        "the age is ${person.getAge()}"

person.increaseAge(10)

