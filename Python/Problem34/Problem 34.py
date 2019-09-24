total_sum = 0

def factorial(n):
	if n == 0: return 1
	else: return n * factorial(n-1)


factorials = [1, factorial(1), factorial(2), factorial(3),
			  factorial(4), factorial(5), factorial(6),
			  factorial(7), factorial(8), factorial(9)]

for i in range(144,factorial(9)*7):
	sum = 0
	number = i
	while number > 0:
		digit = number % 10
		number //= 10
		sum += factorials[digit]
	if sum == i: total_sum += i

print(total_sum)
#9!7 is the limit because 9!8 is also a 7 digit number