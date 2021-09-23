package variable
def list = [1,2,3,4,5]
/*
    list添加元素
 */
list.add(6)
list.leftShift(7)
list << 8
def plusList = list + 9
// println plusList.toListString()
/*
    list删除元素
 */
// list.remove(7)
// list.remove((Object)7)
// list.removeAt(7)
// list.removeElement(6)
// list.removeAll{ return it % 2 == 0 }
// println list - [6,7]
// println list.toListString()
/*
    列表的排序
 */
def sortList = [6, -3, 9, 2, -7, 1, 5]
// Comparator cm = { a, b ->
//     a == b ? 0 :
//             Math.abs(a) < Math.abs(b) ? -1 : 1
// }
// Collections.sort(sortList, cm)
sortList.sort { a, b ->
    a == b ? 0 :
            Math.abs(a) < Math.abs(b) ? 1 : -1
}
// println sortList
def sortStringList = ['abc', 'z', 'Hello', 'groovy', 'java']
sortStringList.sort{ return it.size() }
// println sortStringList
/*
    列表的查找
*/
def findList = [-3, 9, 6, 2, -7, 1, 5]
// int result = findList.find{return it % 2 == 0}
// def result = findList.findAll{ return it % 2 != 0 }
// println result.toListString()
// def result = findList.any{ return it % 2 == 0 }
// def result = findList.every { return it % 2 != 0 }
// println result
// println findList.min{ return Math.abs(it) } // 1
// println findList.max{ return Math.abs(it) } // 9
def num = findList.count { return it % 2 == 0 }
println num // 2
