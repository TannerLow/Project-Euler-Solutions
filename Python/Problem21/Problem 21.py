amicables = []

def get_divisors(n):
	divisors = []
	for x in range(1,n//2 + 1):
		if n % x == 0: divisors.append(x)

	return divisors


def add_divisors(list_of_divisors):
	sum = 0
	for divisor in list_of_divisors:
		sum += divisor

	return sum


def is_amicable(n):
	sum = add_divisors(get_divisors(n))
	if sum > 10000: return False
	paired_sum = add_divisors(get_divisors(sum))
	if paired_sum == n and paired_sum != sum: return True
	else: return False


for i in range(1, 10001):
	if is_amicable(i): amicables.append(i)

no_dupes = list(set(amicables))
sum = 0
for i in no_dupes:
	sum += i

print(sum)