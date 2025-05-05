 
 class first{
    public static int print(int a,int b){
        return a+b;
    }
    public static int print(int x,int y,int z){
        return x*y*z;
    }
 }
 
 class praktic {
    public static void main(String[] args) {
        System.out.println(" add two parameter  : "+first.print(2,10));
        System.out.println(" multiply three parameter : "+ first.print(2, 3, 4));     
    }
}
