import time

def compress(triangle):
	if(len(triangle) == 1):
		return triangle[0][0]
	for i, n in enumerate(triangle[len(triangle)-2]):
		a = n + triangle[len(triangle)-1][i]
		b = n + triangle[len(triangle)-1][i+1]
		triangle[len(triangle)-2][i] = max(a,b)
	del triangle[-1]
	return compress(triangle)

given_file = open('18.txt', 'r')
given = given_file.readlines()
start_time = time.perf_counter()
given_triangle = []
for line in given:
	line = line.replace('\n', '')
	given_triangle.append(list(map(int, line.split())))	

print(str(compress(given_triangle)) + ", in", time.perf_counter() - start_time,"seconds")
given_file.close()