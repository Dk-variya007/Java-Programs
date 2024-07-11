public class passing_array_as_argument {
    public static void Update(int marks[],int nonchanagle){
        nonchanagle=5;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={1,2,3};
        int nonchanagle=10;
        Update(marks,nonchanagle);
        System.out.println(nonchanagle);  // it performs as call by value there for value not change in main function
        for (int i=0;i<marks.length;i++){    // it performs as  call by reference  so value can be change in main function
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
