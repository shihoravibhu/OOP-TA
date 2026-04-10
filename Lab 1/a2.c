// 2. WAP to find a sum of numbers entered by user. (E.g: 582=5+8+2=15) [A] 

#include<stdio.h>

void main(){

    int num , sum = 0;
    printf("Enter Number : ");
    scanf("%d",&num);

    while(num != 0){
        sum += num%10;
        num /= 10;
    }

    printf("Sum : %d",sum);
}