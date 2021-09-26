package file

import groovy.xml.MarkupBuilder

/*
    生成xml格式数据

    <langs type='current' count='3' mainstream='true'>
        <language flavor='static' version='1.5'>Java</language>
        <language flavor='dynamic' version='1.6.0'>Groovy</language>
        <language flavor='dynamic' version='1.9'>JavaScript</language>
    </langs>
 */
def stringWriter = new StringWriter()
def markupBuilder = new MarkupBuilder(stringWriter) // 用来生成xml数据的核心类
// markupBuilder.langs(type: 'current', count: '3', mainstream: 'true'){
//     language(flavor: 'static', version: '1.5', ){
//         age('16')
//     }
//     language(flavor: 'dynamic', version: '1.6.0', ){
//         age('10')
//     }
//     language(flavor: 'dynamic', version: '1.9', 'JavaScript')
// }
// println stringWriter
def langs = new Langs()
markupBuilder.langs(type: langs.type, count: langs.count, mainstream: langs.mainstream){
    // 遍历所有子节点
    langs.languages.each { lang ->
        language(flavor: lang.flavor, version: lang.version, value: lang.value)
    }
}
println stringWriter

class Langs{ // 对应xml中的langs节点
    String type = 'current'
    int count = 3
    boolean mainstream = true
    def languages = [
            new Language(flavor: 'static', version: '1.5', value: 'Java'),
            new Language(flavor: 'dynamic', version: '1.6.0', value: 'Groovy'),
            new Language(flavor: 'dynamic', version: '1.9', value: 'JavaScript')
    ]
}
class Language{ // 对应xml中的language节点
    String flavor
    String version
    String value
}





