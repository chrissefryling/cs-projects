//
//  main.c
//  pythtriangles
//
//  Created by Lidewij Fryling on 9/29/19.
//  Copyright © 2019 Lidewij Fryling. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a, b, c, count=0;
    for(a = 1; a <= 500; a++){
        for(b = 1; b <= 500; b++){
            for(c = 1; c <= 500; c++){
                if((a*a)+(b*b)==(c*c)){
                    count++;
                    printf("%d, %d, %d\n", a, b, c);
                }
            }
        }
    }
    printf("Total Count: %d", count);
    return 0;
}
