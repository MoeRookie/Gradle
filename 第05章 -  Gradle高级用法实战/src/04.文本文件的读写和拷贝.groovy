package file
def file = new File('../../GroovySpecification.iml')

// 遍历打印文件的每一行
file.eachLine { line ->
    // println line
}

// 一次性获取所有的文件内容
def text = file.getText()
// println text

// 将获取到的文件内容逐行存储到集合中
def result = file.readLines()

// 读取文件部分内容
def reader = file.withReader { reader ->
    char[] buffer = new char[100]
    reader.read(buffer)
    return buffer
}
// println reader

def result2 = copy('../../GroovySpecification.iml','../../GroovySpecification2.iml')
println result2 // true

// 文件拷贝
def copy(String srcPath, String targetPath) {
    try{
        // 首先创建目标文件
        def targetFile = new File(targetPath)
        if (!targetFile.exists()) {
            targetFile.createNewFile()
        }
        // 开始拷贝
        new File(srcPath).withReader { reader ->
            def lines = reader.readLines()
            targetFile.withWriter { writer ->
                lines.each { line ->
                    writer.append(line + '\r\n')
                }
            }
        }
        return true
    }catch(Exception e){
        e.printStackTrace()
    }
    return false
}