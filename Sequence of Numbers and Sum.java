import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input =new Scanner (System.in);
while(true){
    int r=0,temp;
int M=input.nextInt(),N=input.nextInt();
if(N<=0 || M<=0){
    break;
}
if(N<M){
    temp=N;
    N=M;
    M=temp;
}
for(int i=M;i<=N;i++){
    System.out.printf("%d ",i);
    r += i;
}
System.out.printf("Sum=%d\n",r);
}
 
    }
 
}
