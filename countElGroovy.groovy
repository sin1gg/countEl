def countElements(data) {

  def res = [:]
  for (el in data) {
    if (res.containsKey(el)) {
      res[el]++
    } else {
      res[el] = 1
    }
  }
  return res
}

def input = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(input)
println(result)