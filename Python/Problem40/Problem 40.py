import time

start_time = time.time()
s = ""
for x in range(1,200000):
	s += str(x)

print(int(s[0]),int(s[9]),int(s[99]),int(s[999]),int(s[9999]),int(s[99999]),int(s[999999]))
print(int(s[0]) * int(s[9]) * int(s[99]) * int(s[999]) * int(s[9999]) * int(s[99999]) * int(s[999999]))

print(time.time() - start_time)