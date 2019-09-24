total_sum = 0
to_the_fifths = [0**5,1**5,2**5,3**5,4**5,5**5,6**5,
				 7**5,8**5,9**5]

for i in range(10, 6*to_the_fifths[9]+1):
	sum = 0
	number = i
	while number > 0:
		digit = number % 10
		number //= 10
		sum += to_the_fifths[digit]
	if sum == i: total_sum += i

print(total_sum)