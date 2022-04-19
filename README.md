chalk
=====

My implementation of a new JVM-based programming language built in ANTLR.

2010


## Chalk language syntax examples

```
String HELLO = "Hello, new world!\n"
# calculating the numbers of fibbonachi
def fibbonachi( Int value ): Int =
  Int count, a1, a2 = 1, a3 = 1
  
  while true
    if count == value || value < 0
      break
    else
      a3 = a1 + a2
      a1 = a2
      a2 = a3
      count++
    end
  end
  return a3
end

def entry main() =
  print HELLO
  Int flag
  do
    println "Input number:"
    flag = readInt
    println fibbonachi(flag)
    println "Continue? (type 0 to abort) :"
    flag = readInt
  until flag != 0
end
```
