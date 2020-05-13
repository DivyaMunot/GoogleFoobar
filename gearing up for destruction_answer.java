
public static int[] answer(int[] pegs){
	int a = pegs[0];
	int temp = -1;

	for(int peg: pegs){
		a = a + (2*peg*temp);
		temp = temp * -1;
	}

	a = a + pegs[pegs.length-1] * temp;
	a = a * 2;
	int b;
	if (pegs.length%2 == 0)
		b = 3;
	else
		b = 1;

	float ratio = (float)a / (float)b;
	for(int i=0; i<pegs.length-2; i++){
		int gear = pegs[i+1] - pegs[i];
		if(ratio < 0 || ratio > (gear-1)) return new int[] {-1, -1};
		ratio = gear - ratio;
	}

	return new int[] {a, b};
}
