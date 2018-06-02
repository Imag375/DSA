class Calc{
    public static int mult(int a, int b){
	return a*b;
    }
    public static double div(int a, int b){
        return a/b;
    }
    public static int add(int a, int b){
	return a+b;
    }
    public static int sub(int a, int b){
	return a-b;
    }
    public static double mult(double a, double b){
	return a*b;
    }
    public static double div(double a, double b){
	return a/b;
    }
    public static double add(double a, double b){
	return a+b;
    }
    public static double sub(double a, double b){
	return a-b;
    }
    public static void main(String[] args){
	int a = 5;
	int b = 7;
	double c = a/7;
	double d = b/3;	
	System.out.println(mult(a, b) + " \n");	
	System.out.println(div(a, b) + " \n");
	System.out.println(add(a, b) + " \n");
	System.out.println(sub(a, b) + " \n");		
    }
}
