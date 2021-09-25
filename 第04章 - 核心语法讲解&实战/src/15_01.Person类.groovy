package objectorention
/**
 * 01.Groovy中默认都是public
 * 02.任意类的顶级父接口都是GroovyObject
 */
class Person implements DefaultAction{
    String name
    Integer age
    def increaseAge(Integer years){
        this.age = years
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }
}
