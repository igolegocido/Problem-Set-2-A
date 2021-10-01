/* Problem Set 2A
 * Ryan Wei
 * Sept. 29, 2021
 */
class Calculator{
    //Constructor Method
    public Calculator(){
    }
    
    //Display Method
    public void display(double a, double b, double c, double sx1, double sy1, double sx2, double sy2, double mx1, double my1, double mx2, double my2,double a1, double ar, double ak, double gr, double gk, double g ){
        //Display Quadratic Formula 
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b +"x + "+ (int)c +" are " + quadraticSub(a,b,c) +" and "+quadraticAdd(a,b,c)+".");
        System.out.println(); //add blank line
        //declare variables for coordinates of Slope Formula
        double x1 = sx1; //value of x for the first point
        double y1 = sy1; //value of y for the first point
        double x2 = sx2; //value of x for the second point
        double y2 = sy2; //value of y for the second point
        //Display Slope Formula
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int)x1 +", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of "+ slope(x1,y1,x2,y2));
        System.out.println(); //add blank line
        //Reassign values to variables for coordinates of Display Formula
        x1 = mx1; //value of x for the first point
        y1 = my1; //value of y for the first point
        x2 = mx2; //value of x for the second point
        y2 = my2; //value of y for the second point
        //Display Midpoint Formula
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int)x1 +", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is (" +midPoint(x1,x2)+", "+midPoint(y1,y2)+")");
        System.out.println(); //add blank line
        
        //declare variables for Arithmetic Series
        double r = ar; //amount of increase between every number of an arthmetic series
        double k = ak; //number of values in the arithemtic series
        System.out.println("SUM OF AN ARITHMETIC SEQUENCE");
        System.out.println("The sum of the first "+(int)k+" terms of an arithemetic series that starts with "+ a1);
        System.out.println("and increases by " + r +" is " +sumOfArithmeticSeries(a1,r,k)); //change lines
        System.out.println(); //add blank line
        
        //reassign values to variables for Geometric Series
        r = gr; //value of the common ratio/rate of increase
        k = gk; //number of values in the finite geometric series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+(int)k+" terms of a finite geometric series that starts with "+g);
        System.out.println("and increases by a rate of "+r+" is "+sumOfGeometricSeries(gr,gk,g)); //change lines
    }
    
    //Quadratic Formula Method (adding)
    public double quadraticAdd(double a, double b, double c){ // a = Coefficient of x^2, b = Coefficient of x, and c is the constant
        return (-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); //returns the value of x when the numerator of the quadratic formula is subtracted
    }
    
    //Quadratic Formula Method (substracting)
    public double quadraticSub(double a, double b, double c){ // a = Coefficient of x^2, b = Coefficient of x, and c is the constant
        return (-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);//returns the value of x when the numerator of the quadratic formula is added
    }
    
    //Slope Formula Method
    public double slope(double x1,double y1,double x2,double y2){
        return (y2-y1)/(x2-x1); //returns the value of slope of the line connecting the two points
    }
    
    //Midpoint Formula Method
    public double midPoint(double xy1, double xy2){
        return (xy1+xy2)/2; //returns the value of the midpoint between two numbers
    }
    
    //Sum of Arithmetic Series Method
    public double sumOfArithmeticSeries(double a1, double r, double k){ //a1 = value of the first number of the arithemtic series
        double ak = a1+((k-1)*r); //value of the last number in the arithmetic series
        return k/2*(a1 + ak); //return sum of all values in the arithmetic series;
    }
    
    //Sum of Geometric Series
    public double sumOfGeometricSeries(double r, double k, double g){ // g = value of the first number in the finite geometric series
        return g*((1-(Math.pow(r,k)))/(1-r)); //return sum of all values of a finite geometric series
    }
    
}