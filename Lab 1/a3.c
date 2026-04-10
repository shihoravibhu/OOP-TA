// 3. WAP to find a sum of even number 1D array. [A] 

#include<stdio.h>

void main() {

    int n, i, sum = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    for(i = 0; i < n; i++){
        if(arr[i] % 2 == 0){   // check even
            sum += arr[i];
        }
    }

    printf("Sum of even numbers: %d", sum);
}
