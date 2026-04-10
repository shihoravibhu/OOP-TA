// 4. Print the following Patterns: [A] 

#include <stdio.h>

void main()
{
    int n = 5;

    // parttern 1

    // *
    // **
    // ***
    // ****
    // *****

    // for(int i=0 ; i<n ; i++){
    //     for(int j=0 ; j<=i ; j++){
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    // parttern 2

    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *

    // for (int i = 1; i <= n; i++)
    // {
    //     for (int j = n - i; j >= 1 ; j--)
    //     {
    //         printf(" ");
    //     }
    //     for (int k = 1; k <= i; k++)
    //     {
    //         printf("* ");
    //     }
    //     printf("\n");
    // }

    // parttern 3

    // for (int i = n; i >= 1; i--)
    // {
    //     for (int j = n - i; j >= 1; j--)
    //     {
    //         printf(" ");
    //     }
    //     for (int k = 1; k <= i; k++)
    //     {
    //         printf("* ");
    //     }

    //     printf("\n");
    // }

    // parttern 4

//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    *

    for(int i=1 ; i<=n ; i++){
        for(int j=n-i ; j>=1 ; j--){
            printf(" ");
        }
        for(int k=1 ; k<=i ; k++){
            printf(" *");
        }
        printf("\n");
    }

    for(int i=n-1 ; i>=1 ; i--){
        for(int j=n-i ; j>=1 ; j--){
            printf(" ");
        }
        for(int k=1 ; k<=i ; k++){
            printf(" *");
        }
        printf("\n");
    }

    

    

}