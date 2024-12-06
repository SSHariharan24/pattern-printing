import java.util.Scanner;
import java.lang.Math;


public class Pattern1 {
public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(j + " ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("* ");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" " + j);
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(j + " ");
        }
        for(int j=0;j<2*n - (2*i+1);j++){
            System.out.print("* ");
        }
        for(int j=0;j<i;j++){
            System.out.print(" " + j);
        }
        System.out.println();
    }

System.out.println();

    for(int i=1;i<=2*n-1;i++){
        int stars = i;
        if(i>n) stars = 2*n-i;
        for(int j=1;j<=stars;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

System.out.println();

    int start = 1;
    for(int i=0;i<n;i++){
        if(i % 2 == 0) start = 1;
        else start = 0;
        for(int j=0;j<=i;j++){
            System.out.print(start + " ");
            start = 1 - start;
        }
        System.out.println();
    }

System.out.println();

    int spaces = 2*(n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
        spaces -=2;
    }

System.out.println();

    int num = 1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num + " ");
            num += 1; 
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(char j='A';j<='A'+ i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(char j='A';j<='A'+(n-i-1);j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        char c = (char) ('A' + i);
        for(int j=0;j<=i;j++){
            System.out.print(c + " ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char ch = 'A';
        int breakpoint = (2*i+1) / 2;
        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);
            if(j <= breakpoint) ch++;
            else ch--;
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }

System.out.println();

    for(int i=0;i<n;i++){
       for(char c=(char)('E'-i);c<='E';c++){
            System.out.print(c + " ");
        }
        System.out.println();
    }

System.out.println();

    int init = 0; 
for (int i = 0; i < n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
    }
    for (int j = 0; j < init; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
    }
    init += 2;
    System.out.println();
}

System.out.println();

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for (int j = 0; j < init - 2; j++) { 
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    init -= 2; 
    System.out.println();
}

 System.out.println();   

    int s = 2*n-2;
    for(int i=1;i<=2*n-1;i++){
        int star = i;
        if(i>n) star=2*n-i;
        for(int j=1;j<=star;j++){
            System.out.print("*");
        }
        for(int j=1;j<=s;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=star;j++){
            System.out.print("*");
        }
        System.out.println();
        if(i<n) s-=2;
        else s+=2;
    }

 System.out.println();
     
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.println();
     }

 System.out.println();
 
     for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int top   = i;
            int left  = j;
            int right = (2 * n -2)- j;
            int bottom  =  (2 * n -2)- i;
            System.out.print(n - Math.min(Math.min(top,bottom),Math.min(left,right)));
        }
        System.out.println();
     }
}    
}
