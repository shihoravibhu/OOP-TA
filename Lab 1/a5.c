// 5. Print the following Patterns: [A] 

#include<stdio.h>
#include<string.h>

void main(){

    int n = 5;

    // parttern 1
    
// 1
// 12
// 123
// 1234
// 12345

    // for(int i=1 ; i<=n ; i++){
    //     for(int j=1 ; j<=i ; j++){
    //         printf("%d",j);
    //     }
    //     printf("\n");
    // }

    // parttern 2

//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5

    // for(int i=1 ; i<=n ; i++){
    //     for(int j=n-i ; j>=1 ; j--){
    //         printf(" ");
    //     }
    //     for(int k=1 ; k<=i ; k++){
    //         printf(" %d",i);
    //     }
    //     printf("\n");
    // }

    // parttern 3

//          d
//         d a
//        d a r
//       d a r s
//      d a r s h
//     d a r s h a
//    d a r s h a n

    // char str[] = "darshan";
    char str[100] ;

    printf("Enter String : ");
    scanf(" %[^\n]",str);  // its include space until new line in this we put space before % its removes whitespace 
    // scanf("%s",str);  // its doesnot include space 

    for(int i=0 ; i<strlen(str) ; i++){
        for(int j=strlen(str)-i-1 ; j>=0 ; j--){
            printf(" ");
        }
        for(int k=0 ; k<=i ; k++){
            printf(" %c",str[k]);
        }
        printf("\n");
    }

    // parttern 4

//  * * * * *
//   # # # #
//    * * *
//     # #
//      *


    // for(int i=n ; i>=1 ; i--){
    //     for(int j=n-i ;j>=1 ; j--){
    //         printf(" ");
    //     }
    //     for(int k=1 ; k<=i ; k++){
    //         if(i % 2 != 0){
    //             printf("* ");
    //         }
    //         else{
    //             printf("# ");
    //         }
    //     }
    //     printf("\n");
    // }

    

}