public class Pattern2 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
       for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i+1);j++){
            System.out.print("*");
        }
        int space =2*(i-1);
        for(int j =1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(n-i+1);j++){
            System.out.print("*");
        }
        System.out.println();
        
       }
    }
}
