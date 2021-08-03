		HashSet<Integer> list = new HashSet<Integer>();
		while (input1 > 0) {
		list.add(input1 % 10);
		input1 = input1 / 10;
		}
		return list.size();
