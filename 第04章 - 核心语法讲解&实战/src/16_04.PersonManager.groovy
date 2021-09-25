package objectorention.expand

import objectorention.Person

/**
 * 模拟一个Person管理器
 */
class PersonManager {
    static Person createPerson(String name, int age){
        return Person.createPerson(name, age)
    }
}
