class Main {

    public static void main(String[] args) {
    
    	int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
    	
	SumaDosNumeros obj = new SumaDosNumeros(); //new: genera un espacio en memoria que va a contener la estructura de la clase
	
	System.out.println(obj.suma(a, b));
	
    }
}


