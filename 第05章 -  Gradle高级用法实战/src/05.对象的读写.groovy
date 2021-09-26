package file

import objectorention.Person

def person = new Person(name: 'Lndroid', age: 26)
saveObject(person, '../../person.bin')
def result = (Person)readObject('../../person.bin')
println "the name is ${result.name} and the age is ${result.age}"

/**
 * 保存对象到文件中
 * @param obj 对象
 * @param targetPath 目标文件路径
 */
def saveObject(Object obj, String targetPath) {
    try {
        // 首先创建目标文件
        def targetFile = new File(targetPath)
        if (!targetFile.exists()) {
            targetFile.createNewFile()
        }
        targetFile.withObjectOutputStream { oos ->
            oos.writeObject(obj)
        }
        return true
    } catch (Exception e) {
        e.printStackTrace()
    }
    return false
}

/**
 * 从文件中读取对象
 * @param srcPath 源文件路径
 */
def readObject(String srcPath){
    def obj = null
    try {
        def srcFile = new File(srcPath)
        if (null == srcFile || !srcFile.exists()) { return null }
        srcFile.withObjectInputStream { ois ->
            obj = ois.readObject()
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
    return obj
}