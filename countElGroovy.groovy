def countElements(data) {
    def res = [:]
    data.each { el ->
        res[el] = res.containsKey(el) ? res[el] + 1 : 1
    }
    return res
}

def input = [1, 3, 4, 5, 1, 5, 4]
println(countElements(input))