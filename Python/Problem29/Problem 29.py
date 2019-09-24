old_list = []

for a in range(2,101):
	for b in range(2,101):
		old_list.append(a**b)


new_list = list(set(old_list))
print(len(new_list))