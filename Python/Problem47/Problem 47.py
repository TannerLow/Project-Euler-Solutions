import time
start_time = time.time()

def factorize(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors


i = 0
x = 647
while i != 4:
    if len(set(factorize(x))) == 4:
        i += 1
    else:
        i = 0
    x += 1
print(x - 4)
print(time.time() - start_time)
