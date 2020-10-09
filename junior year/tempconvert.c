//
//  main.c
//  tempConvert
//
//  Created by Lidewij Fryling on 9/29/19.
//  Copyright © 2019 Lidewij Fryling. All rights reserved.
//

#include <stdio.h>
int celsius(int);
int fahrenheit(int);
void table(void);

int main(int argc, const char * argv[]) {
    int temp, convert;
    char type;
    
    printf("What is the temperature?\n");
    scanf("%d", &temp);
    printf("Type c for celsius or f for fahrenheit.\n");
    scanf("%s", &type);
    
    if(type == 'c'){
        convert = fahrenheit(temp);
        printf("%d in fahrenheit is %d degrees.\n", temp,convert);
        table();
    }
    else if(type == 'f'){
        convert = celsius(temp);
        printf("%d in celsius is %d degrees.\n", temp, convert);
        table();
    }
    else{
        printf("Invalid character.\n");
    }
    return 0;
}

int celsius(int temp){
    int convert;
    convert = (temp-32)*5/9;
    return convert;
}

int fahrenheit(int temp){
    int convert;
    convert = (temp*9/5)+32;
    return convert;
}

void table(void){
    int temp = 0, convert = 0;
    printf("Celsius:      Fahrenheit:");
    while(temp <= 100){
        convert = fahrenheit(temp);
        printf("%d      %d\n",temp, convert);
        temp++;
    }
}

