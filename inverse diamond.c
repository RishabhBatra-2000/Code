#include<stdio.h> 
 void main()
 {
   int n;

   printf("Enter value of n: ");
   scanf("%d",&n);

   for(int i=1; i<=n; i++)
   {
     for(int j=i; j<=n; j++){
       printf("%d",j);
     }
     for(int k=1; k<2*i-1; k++){
       printf(" ");
     }
     for(int j=i; j<=n; j++){
       printf("%d",j);
     }
     printf("\n");
   }

   for(int i=n-1; i>=1; i--){
     for(int j=n; j>=i; j--){
       printf("%d",j);
     }
     for(int k=1; k<2*i-1; k++){
       printf(" ");
     }
     for(int j=n; j>=i; j--){
       printf("%d",j);
     }
     printf("\n");
   }

 }
