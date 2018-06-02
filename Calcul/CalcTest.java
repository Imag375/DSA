class CalcTest{
    public static void mult_test(){
	int a = 5;
	int b = 7;
	double c = a/7;
	double d = b/3;
        int result1 = Calc.mult(a, b);
	double result2 = Calc.mult(c, d);
        if ((result1 == 35) && (result2 == (c*d)))
            System.out.println("Test ok");
        else System.out.println("Test failed");
    }
    public static void div_test(){
	int a = 5;
	int b = 7;
	double c = a/7;
	double d = b/3;
	double result1 = Calc.div(a, b);
	double result2 = Calc.div(c, d);
        if ((result1 == (a/b)) && (result2 == (c/d)))
            System.out.println("Test ok");
        else System.out.println("Test failed");
    }
    public static void add_test(){
	int a = 5;
	int b = 7;
	double c = a/7;
	double d = b/3;
        int result1 = Calc.add(a, b);
	double result2 = Calc.add(c, d);
        if ((result1 == (a+b)) && (result2 == (c+d)))
            System.out.println("Test ok");
        else System.out.println("Test failed");
    }
    public static void sub_test(){
	int a = 5;
	int b = 7;
	double c = a/7;
	double d = b/3;
        int result1 =  Calc.sub(a, b);
	double result2 =  Calc.sub(c, d);
        if ((result1 == (a-b)) && (result2 == (c-d)))
            System.out.println("Test ok");
        else System.out.println("Test failed");
    }
    public static void main(String[] args){
	mult_test();
	div_test();
	add_test();
	sub_test();
    }	
}
