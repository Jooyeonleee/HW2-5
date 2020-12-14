import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if(studentID==1810666) hw_1810666();
        else if (studentID == 1810815) hw_1810815();
        else if (studentID == 1810348) hw_1810348();
        else if (studentID == 1810553) hw_1810553();
	else if (studentID == 1810374) hw_1810374();
        else if (studentID == 1810448) hw_1810448();
	else if (studentID == 1810859) hw_1810859();
	else
            System.out.println("To be developed...\n");
    }
    private void hw_1810859() {
	Scanner scan = new Scanner(System.in);
	int menu_num;

	System.out.println("[Student ID: 1810859]");
	System.out.println("1. Calaulate factorial");
	System.out.println("2. Calaulate absolute value");

	System.out.print("Enter menu number: ");
	menu_num = scan.nextInt();

	if (menu_num == 1){
		int number_f;
		System.out.print("Input 1 integer for factorial: ");
		number_f = scan.nextInt();

		if (number_f < 0){
			System.out.println("Wrong Input (input 0 or positive integer)");
		}
		else {
			System.out.println("Factorial is " + Factorial_1810859(number_f));
		}
	}
	else if (menu_num == 2){
		int number_a;
		System.out.print("Input 1 integer for absolute value");
		number_a = scan.nextInt();

		System.out.println("Absolute value is " + Absolute_1810859(number_a));
	}
	else {
		System.out.println("Wrong Input (input 1 or 2)");
	}

    }
    public int Factorial_1810859(int a){
	int fac = 1;
	if (a == 0){
		return fac;
	}
	else {
		for (int i = a; i >= 1; i--){
			fac = fac * i;
		}
		return fac;
	}
    }

    public int Absolute_1810859(int a){
	if (a >= 0){
		return a;
	}
	else {
		return -a;
	}
    }
    
    private void hw_1810815() {
    Scanner scanner = new Scanner(System.in);
    int chosenMenu;
    int[] dataArray;
    int result;

    printInfo_1810815();
    
    System.out.print("Enter menu number: ");
    chosenMenu = scanner.nextInt();
    System.out.println();

    if (chosenMenu == 1) {
        System.out.print("Calculate MIN, input three integers separated by space: ");
        dataArray = null;
        dataArray = new int[3];
        for (int i = 0; i < 3; i++) {
            dataArray[i] = scanner.nextInt();
        }

        result = calculateMin_1810815(dataArray);
    }
    else {
        System.out.print("Calculate POW(first ^ second), input two integers separated by space: ");
        dataArray = null;
        dataArray = new int[2];
        for (int i = 0; i < 2; i++) {
            dataArray[i] = scanner.nextInt();
        }

        result = calculatePow_1810815(dataArray);
    }

    System.out.println("The result is: " + result);
    System.out.println();
    }

    private void printInfo_1810815() {
    System.out.println("Student ID: 1810815]");
    System.out.println("1. Calculate MIN");
    System.out.println("2. Calculate POW");
    }

    public int calculateMin_1810815(int[] dataArray) {
    int MIN = Integer.MAX_VALUE;

    for (int i = 0; i < dataArray.length; i++) {
        if (dataArray[i] < MIN) {
            MIN = dataArray[i];
        }
    }

    return MIN;
    }

    public int calculatePow_1810815(int[] dataArray) {
    int POW = 1;

    for (int i = 0; i < dataArray[1]; i++) {
        POW *= dataArray[0];
    }
        
    return POW;
    }

    public void hw_1810666() {
       int choice;
       int n1;int n2; int n3;
       int fact;
       try {
          Scanner n_scan=new Scanner(System.in);
          System.out.println("[Student ID: 1810666]");
          System.out.println("1. Calculate Max");
          System.out.println("2. Calculate Factorial");
          System.out.println("-Input Only Integer Type");
          System.out.println();
          System.out.print("Enter menu number: ");
          choice= n_scan.nextInt();
          System.out.println();
          
          if(choice==1) {
             System.out.println("-Calculate Max-");
             System.out.println("Input 3 Numbers.");
            
             System.out.print("First number:");
             n1=n_scan.nextInt();
             System.out.print("Second number:");
             n2=n_scan.nextInt();
             System.out.print("Third number:");
             n3=n_scan.nextInt();
             
             System.out.println("=> Max Result: "+max_1810666(n1,n2,n3));
          }
          else if (choice==2) {
             System.out.println("-Calculate Factorial-");
             System.out.print("Input Positive Number:");
             fact=n_scan.nextInt();
             if(fact>0) {
                //calculate factorial
                 System.out.println("=> Factorial Result: "+fact_1810666(fact));
             }
             else {System.out.println("Wrong Input");}
             
          }
          else {System.out.println("Wrong menu Input");}
            System.out.println();
       }
       catch(InputMismatchException e) {
          System.out.println("Wrong Input Type");
          System.out.println();
       }
       
       
    }
    
    public int max_1810666(int n1,int n2,int n3){
       int max;
       max=((n1>n2)?n1:n2);
       max=((n3>max)?n3:max);
       return max;
    }
    
    public int fact_1810666(int num) {
       int i=1;
       int fact_res=1;
       for(i=num;i>0;i--) {
          fact_res=fact_res*i;
       }
       return fact_res;
    }

    public void hw_1810348() {
        Scanner sc = new Scanner(System.in);
        int menu=0, num=0, result=0;
        
        do {
            System.out.println("[student ID: 1810348]");
            System.out.println("1. Calculate the factorial");
            System.out.println("2. Calculate the absoulte value");
            System.out.print("Enter menu number: ");
            menu = sc.nextInt();
            
            if(menu==1) {
                System.out.print("Enter a natural number to calculate factorial: ");
                num = sc.nextInt();
                result = factorial_1810348(num);
            }
            else if(menu==2) {
                System.out.print("Enter an integer to calculate abs: ");
                num = sc.nextInt();
                result = abs_1810348(num);
            }
            else {
                System.out.println("Wrong Menu. Please enter again.");
            }
            
        } while(menu!=1&&menu!=2);
        
        
        System.out.println("Result: " + result);
        System.out.println();
    }
    
    public int factorial_1810348(int n) {
        int fact=0, i=0;
        if(n==0)
            fact=1;
        else if (n>0){
            fact=n*factorial_1810348(n-1);
        }
        return fact;
    }

    public int abs_1810348(int a) {
        if(a>0) return a;
        else if (a<0) return a*(-1);
        else return 0;
    }
    
    public void hw_1810553() {
        Scanner scan = new Scanner(System.in);
        int menu=0, a=0, b=0;
        int result=0;
        System.out.println("[Student ID: 1810553]");
        System.out.println("1. Calculate Max");
        System.out.println("2. Calculate Min");
        System.out.print("Enter menu number: ");
        menu = scan.nextInt();
        
        if(menu == 1) {
            System.out.print("Calcuate max of two values, enter 2 integers seperated by space: ");
            a = scan.nextInt(); b = scan.nextInt();
            result = max_1810553(a, b);
            System.out.println("Result: "+result);
        }else if(menu == 2) {
            System.out.print("Calcuate min of two values, enter 2 integers seperated by space: ");
            a = scan.nextInt(); b = scan.nextInt();
            result = min_1810553(a, b);
            System.out.println("Result: "+result);
        }else {
            System.out.println("Wrong menu number");
        }
        System.out.println();
    }
    
    public int max_1810553(int a, int b) {
        if(a>=b)
            return a;
        else 
            return b;
    }

    public int min_1810553(int a, int b) {
        if(a<=b)
            return a;
        else 
            return b;
    }

    public void hw_1810448() {
        int menu, num, result = 0;
        
        System.out.println("[Student ID: 1810448]");
        System.out.println("1. Calculate Factorial");
        System.out.println("2. Calculate Absolute");
        
        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter menu number: ");
                menu = scan.nextInt();

                // Factorial
                if(menu == 1) {
                    System.out.print("Enter a positive integer: ");
                    num = scan.nextInt();

                    // Exceptions when input is negative integer
                    if(num < 0) throw new Exception();
                    else result = factorial_1810448(num);   
                }
                
                // Absolute
                else if(menu == 2) {
                    System.out.print("Enter an integer: ");
                    num = scan.nextInt();
                    result = abs_1810448(num);
                }
                else {
                    System.out.println("Wrong menu");
                    continue;
                }
                break;

            } catch (Exception e) {
                System.out.println("Please enter a number that meets the condition.");
                continue;
            }
        }

	System.out.println(result);
	System.out.println();
    }

	public void hw_1810374() {
		Scanner input = new Scanner(System.in);
		int menu, result;
		int a, b;
		System.out.println("[Student ID: 1810374]");
		System.out.println("1. Calculate Min");
		System.out.println("2. Calculate Power");
		System.out.print("Enter menu number: ");
		menu = input.nextInt();

		if(menu == 1) {
			System.out.print("Enter the two values you want to compare(ex.20 30): ");

			a = input.nextInt();
			b = input.nextInt();
			result = minValue(a,b);
			System.out.println("Answer :"+result);
		}
		else if(menu == 2){
			System.out.print("Enter in order the base value and exponent value(ex.2 3): ");
			a = input.nextInt();
			b = input.nextInt();
			result = powerValue(a,b);
			System.out.println("Answer :"+result);
		}

	}

	public int minValue(int a, int b) {
		if(a<b)	return a;
		else	return b;
	}

	public int powerValue(int a, int b) {
		int pow = 1;
		for(int i=b; i>0; i--){
			pow = pow * a;
		}
		return pow;
	}
    
    public int factorial_1810448(int num) {
        if(num == 0) return 1; // 0! = 1

        int result = num;
        for(int i = num-1 ; i > 1 ; i--) {
            result *= i;
        }
        return result;
    }

    public int abs_1810448(int num) {
        int result = num;
        if(num < 0) result *= (-1);
        return result;
    }
}
