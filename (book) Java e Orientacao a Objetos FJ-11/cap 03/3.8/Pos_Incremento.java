class Pos_Incremento{
	public static void main(String[] args){
		int i = 5;
		int x = i++;
		int y = ++i;
		System.out.println("Pós-incremento (x = i+) = " +x);
		System.out.println("Pré-incremento (y = +i) = " +y);
	}
}