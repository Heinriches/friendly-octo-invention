class Exemplo_01{
	public static void main (String[] args){
		x = 01;
		y = 19;
		
		for (int i = x; i < y; i++){
			if(i % y == 0){
				System.out.printf("Encontrei um número divisível por $d. O numero é $d.", x, y);
				break;
			}
		}
	}
}