names_file = open('names.txt','r')
names = names_file.read()
names_list = names.split('","')
names_list.sort()
names_file.close()
letters = [1, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
		   'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
		   'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
		   'Y', 'Z']

sum = 0
for index, name in enumerate(names_list, start=1):
	value = 0
	for s in name:
		value += letters.index(s)
	score = index*value
	sum += score

print(sum)