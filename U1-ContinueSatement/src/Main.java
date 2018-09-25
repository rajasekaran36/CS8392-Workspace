class Main {

	public static void main(String[] args) {
		
		int i;
		
		for(i=0;i<5;i++){
			if(i==3){
				System.out.println("Three");
				continue;
			}
			System.out.println(i);
		}
	}

}