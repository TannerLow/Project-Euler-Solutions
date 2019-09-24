list = [0,1]
i = 1
while i < 1000:
	list.append(list[len(list)-2] + list[len(list)-1])
	i = len(str(list[len(list)-1]))


print(len(list)-1)