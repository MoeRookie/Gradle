package datastruct
/*
    Map操作详解:
 */
def students = [
        1:[number:'0001',name:'Bob',score:55,sex:'male'],
        2:[number: '0002',name: 'Johnny',score: 62, sex: 'female'],
        3:[number: '0003',name: 'Claire',score: 73, sex: 'female'],
        4:[number: '0004',name: 'Amy',score: 66, sex: 'male']
]
// 遍历
// students.each { def student ->
//     println "the key is ${student.key}, " +
//             "the value is ${student.value}"
// }
// 带索引的遍历
// students.eachWithIndex { def student, int index ->
//     println "the index is ${index}, the key is ${student.key}, the value is ${student.value}"
// }
// 直接遍历key-value
// students.eachWithIndex { key, value, index->
//     println "the index is ${index}, the key is ${key}, the value is ${value}"
// }

// 查找
def entry = students.find{ def student->
    return student.value.score >= 60
}
// println entry
def entrys = students.findAll { def student->
    return student.value.score >= 60
}
// println entrys.toMapString()
def count = students.count { def student ->
    return student.value.score >= 60 && student.value.sex == 'male'
}
// println count
def names = students.findAll { def student ->
    return student.value.score >= 60
}.collect { it.value.name }
// println names.toListString()
def group = students.groupBy { def student ->
    return student.value.score >= 60 ? '及格' : '不及格'
}
// println group.toMapString()

// 排序
def sort = students.sort { def student1, def student2 ->
    Number score1 = student1.value.score
    Number score2 = student2.value.score
    return score1 == score2 ? 0 : score1 < score2 ? -1 : 1
}
println sort.toMapString()
