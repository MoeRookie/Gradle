package file

import groovy.xml.XmlSlurper

final String xml = '''
    <response version-api="2.0">
        <value>
            <books id="1" classification="android">
                <book available="20" id="1">
                    <title>疯狂Android讲义</title>
                    <author id="1">李刚</author>
                </book>
                <book available="14" id="2">
                   <title>第一行代码</title>
                   <author id="2">郭林</author>
               </book>
               <book available="13" id="3">
                   <title>Android开发艺术探索</title>
                   <author id="3">任玉刚</author>
               </book>
               <book available="5" id="4">
                   <title>Android源码设计模式</title>
                   <author id="4">何红辉</author>
               </book>
           </books>
           <books id="2" classification="web">
               <book available="10" id="1">
                   <title>Vue从入门到精通</title>
                   <author id="4">李刚</author>
               </book>
           </books>
       </value>
    </response>
'''
// 开始解析xml数据
def xmlSlurper = new XmlSlurper()
def response = xmlSlurper.parseText(xml)
// 获取节点的值
// println response.value.books[0].book[0].title.text() // 疯狂Android讲义
// println response.value.books[0].book[0].author.text() // 李刚
// 获取节点的属性
// println response.value.books[1].book[0].@available // 10
// 查询遍历: 找出作者是'李刚'的书
def list = []
response.value.books.each{ books ->
    // 下面开始对书节点进行遍历
    books.book.each{ book->
        def author = book.author.text()
        if('李刚' == author){
            list.add(book.title.text())
        }
    }
}
// println list.toListString()
// 深度遍历xml数据
def titles = response.depthFirst().findAll { book ->
    return '李刚' == book.author.text()
}.collect{ book ->
    return book.title.text()
}
// println titles.toListString()
// 广度遍历xml数据
def names = response.value.books.children().findAll{ node ->
    'book' == node.name() && node.@id == 2
}.collect{ node ->
    node.title.text()
}
println names.toListString()




