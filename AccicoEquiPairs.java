import java.util.Scanner;

public class AccicoEquiPairs{
public static int[] data = new int[30];
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int i = 0,stat = 0;

String input = sc.nextLine(); 
String numbers[] = input.split(" ");
for(int j = 0;j < numbers.length;j++){
data[j] = Integer.parseInt(numbers[j]);
}

int N = numbers.length;
System.out.println("length of data "+ N);

for(int a = 0;a<data.length;a++){
for(int b = a+2;b < data.length;b++){
int x,y,z;
x = slice(0, a-1);
y = slice(a+1, b-1);
z = slice(b+1, N-1);
if(x == y){
if(y == z){
System.out.print("Indices which form Equi pair");
System.out.println("{"+a+","+b+"}");
System.out.print("Slices are");
System.out.println("{0,"+(a-1)+",{"+(a+1)+","+(b-1)+"},"+"{"+(b+1)+","+(N-1)+"}");
stat = 1;
}
}
}
}
if(stat == 0){
System.out.println("Array does not contain any Equi pair");
}

}

public static int slice(int a,int b){
int sum = 0;
while(a <= b){
sum = sum + data[a];
a++;
}
return sum;
}
}