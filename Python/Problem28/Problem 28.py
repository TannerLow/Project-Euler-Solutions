import time

start_time = time.time()

sum = 1
for x in range(1,501):
	sum += (2*x+1)**2
	sum += ((2*x+1)**2 - 6*x)
	sum += ((2*x+1)**2 - 4*x)
	sum += ((2*x+1)**2 - 2*x)

print(sum)
print(time.time() - start_time)