import java.util.Scanner;
public class MatrixMultiplication{
public static void main(String[] args){
Scanner myobj=new Scanner(System.in);
System.out.print("enter the number of rows for matrix A:");
int rowsA=myobj.nextInt();
System.out.print("enter the number of columns for matrix A:");
int colsA=myobj.nextInt();
System.out.print("enter the number of rows for matrix B:");
int rowsB=myobj.nextInt();
System.out.print("enter the number of columns for matrix B:");
int colsB=myobj.nextInt();
if(colsA!=rowsB){
System.out.println("matrix multiplication is not possible");
return;
}
int[][]a=new int[rowsA][colsA];
int[][]b=new int[rowsB][colsB];
int[][]c=new int[rowsA][colsB];
System.out.println("enter the elements of matrix A:");
for(int i=0;i<rowsA;i++){
for(int j=0;j<colsA;j++){
a[i][j]=myobj.nextInt();
}
}
System.out.println("enter elements of matrix B:");
for(int i=0;i<rowsB;i++){
for(int j=0;j<colsB;j++){
b[i][j]=myobj.nextInt();
}
}
for(int i=0;i<rowsA;i++){
for(int j=0;j<colsB;j++){
for(int k=0;k<colsA;k++){
c[i][j]+=a[i][j]*b[i][j];
}
}
}
System.out.println("the product of the matrices is:");
for(int i=0;i<rowsA;i++){
for(int j=0;j<colsB;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();
}
myobj.close();
}
}
