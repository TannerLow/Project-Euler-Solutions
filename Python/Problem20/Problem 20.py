import datetime as time
#not proper factorial, misses case 0
def factorial(n):
	product = 1
	for x in range(1,n+1):
		product *= x
	return product

sum = 0
given_factorial = factorial(100)
for s in str(given_factorial):
	sum += int(s)

print(sum)
#how to factorial by recursion
# def fact_recurse(n):
# 	if n == 0: return 1
# 	else: return n * fact_recurse(n-1)