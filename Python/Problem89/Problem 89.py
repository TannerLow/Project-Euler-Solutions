import math
input_file = open('roman.txt','r')
input = input_file.read()
lines = input.splitlines()

roman = {"M": 1000, "D": 500, "C": 100, "L": 50, "X": 10, "V": 5, "I": 1}

def integerToRoman(A): 
    romansDict = { 
            1: "I", 
            5: "V", 
            10: "X", 
            50: "L", 
            100: "C", 
            500: "D", 
            1000: "M", 
            5000: "MMM"
        } 
  
    div = 1
    while A >= div: 
        div *= 10
  
    div /= 10
  
    res = "" 
  
    while A: 
  
        # main significant digit extracted 
        # into lastNum  
        lastNum = int(A / div) 
  
        if lastNum <= 3: 
            res += (romansDict[div] * lastNum) 
        elif lastNum == 4: 
            res += (romansDict[div] + 
                          romansDict[div * 5]) 
        elif 5 <= lastNum <= 8: 
            res += (romansDict[div * 5] + 
            (romansDict[div] * (lastNum - 5))) 
        elif lastNum == 9: 
            res += (romansDict[div] +
                         romansDict[div * 10]) 
  
        A = math.floor(A % div) 
        div /= 10
          
    return res


counter = 0;
char_saved = 0
for line in lines:
    sum = 0
    a = 0
    length = len(line)
    for char in reversed(line):
        b = roman[char]
        #sum = (sum-b) if (a<b) else (sum+b)
        if b < a:
            sum -= b
        else:
            sum += b
        a = b
    correct_version = len(integerToRoman(sum))
    char_saved += (length - correct_version)

print(char_saved)
