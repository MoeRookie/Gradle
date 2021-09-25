package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

def list = [new Person(name: 'John', age: 25),
            new Person(name: 'Major', age: 26)]

// 对象转json
def json = JsonOutput.toJson(list)
// println JsonOutput.prettyPrint(json) // 带结构

// json转对象
def jsonSlurper = new JsonSlurper()
jsonSlurper.parseText(json)

/*=====================================Groovy自带的json工具远比gson简单的多!=========================================*/
def response = getNetworkData(
        'http://yuexibo.top/yxbApp/course_detail.json')
println response.data.head.name

def getNetworkData(String url){
    // 发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text
    println JsonOutput.prettyPrint(response) // 格式化打印json
    // 将json转化为实体对象
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(response)
}






