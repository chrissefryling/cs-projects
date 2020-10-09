//
//  main.c
//  GCD
//
//  Created by Lidewij Fryling on 9/29/19.
//  Copyright © 2019 Lidewij Fryling. All rights reserved.
//

#include <stdio.h>
int gcd(int, int);

int main(int argc, const char * argv[]) {
    int a, b;
    printf("Please input first number:\n");
    scanf("%d", &a);
    printf("Second number:\n ");
    scanf("%d", &b);
    printf("The GCD is %d\n", gcd(a,b));
    return 0;
}

int gcd(int a, int b){
    if(b != 0){
        return gcd(b, a%b);;
    }
    return a;
}
