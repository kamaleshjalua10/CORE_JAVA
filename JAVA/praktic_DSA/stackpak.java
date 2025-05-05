package praktic_DSA;

public class stackpak {

    static class stack{
        int size=6;
        int stacka[]=new int[size];
        int top=-1;
        int traker=0;

        public void push(int data){
            if(top == size-1){
                System.out.println("stack is full ");
            }
            else{
                top++;
                traker++;
                stacka[top]=data;
            }
        }

        public void pop(){
            if(top == -1){
                System.out.println(" stack is Empty ");
            }
            else{
                int value=stacka[top];
                System.out.println(" pop value "+value);
                traker--;
                top--;
               
                // System.out.println();
            }
        }

        public void peek(){
            if(top == -1){
                System.out.println(" stack is Empty ");
            }
            else{
                System.out.println(" peek "+ stacka[top]);
            }
        }

        public void revers(){
            for(int i=0;i<traker/2;i++){
                int first=stacka[i];
                int second=stacka[traker-i-1];

                stacka[i]=second;
                stacka[traker-i-1]=first;
            }
        }

        public void rotate(int time){
            for(int i=0;i<time;i++){
                int store=stacka[0];
                for(int j=1;j<traker;j++){
                    stacka[j-1]=stacka[j];
                }
                stacka[traker-1]=store;               
            }
        }

        public void printstack(){
            if(top == -1){
                System.out.println(" stack is Empty ");
            }
            else{
                for(int i=top;i>=0;i--){
                    System.out.print(stacka[i]+" ");
                }
                System.out.println();
            }
        }
    }
    


    public static void main(String[]ares){ 
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(" origenal stack ");
        s.printstack();
        s.pop();
        s.pop();
        System.out.println(" origenal stack ");
        s.printstack();
        System.out.println(" revers stack ");
        s.revers();
        s.printstack();
        System.out.println(" roteae stack ");
        s.rotate(2);
        s.printstack();
    

    }
}
