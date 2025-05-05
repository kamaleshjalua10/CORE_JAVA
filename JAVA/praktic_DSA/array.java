package praktic_DSA;

public class array {

    static class arraytwo{
        int size=6;
        int array[]=new int[size];
        int i=-1;
        static int traker=0;
        

        public void insert(int data){
            i++;
            if(i == size){
                System.out.println(" array is full ");
            }
            traker++;
            array[i]=data;           

        }
        public void insertany(int data,int position){
            if(i == size){
                System.out.println(" array is full ");
            }
            for(int i=traker-1;i>=position;i--){
                array[i+1]=array[i];
            }
            traker++;
            array[position]=data;

        }

        public void delete(){  
            if(i == -1){
                System.out.println(" array is Empty ");
            }
            traker--;
            int value=array[i];
            System.out.println(value +" ");
            i--;
           
        }
        public void deleteany(int position){
            if(i == -1){
                System.out.println(" array is Empty ");
            }
            traker--;
            for(int j=position;j<traker;j++){
                array[j]=array[j+1];
            }


        }
        public void revers(){
            for(int k=0;k<traker/2;k++){
                int first=array[k];
                int second=array[traker-k-1];

                array[k]=second;
                array[traker-k-1]=first;

            }

        }

        public void rotate(int time){
            for(int z=0;z<time;z++){
                int value=array[0];
                for(int y=1;y<traker;y++){
                    array[y-1]=array[y];
                }
                array[traker-1]=value;
            }
        }
        public void showtraker(){
            System.out.println("show index : "+traker);
        } 

        public void print(){
            for(int i=0;i<traker;i++){
                System.out.print(array[i]+" ");
            }
        }

    }
    public static void main(String[]ares){
        arraytwo a=new arraytwo();
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.insert(50);
        a.insert(60);
        a.insertany(10, 0);
        // a.deleteany(1);
        // a.insert(70);
        // a.delete();
        // a.delete();
        a.showtraker();
        System.out.println(" Array print ");   
        a.print();
        System.out.println();
       
        System.out.println();
        System.out.println(" Array revers ");
        a.revers();
        a.print();
        System.out.println();
    
        System.out.println();
        System.out.println("Array rotate ");
        a.rotate(3);
        a.print();
        System.out.println();


    }
}
