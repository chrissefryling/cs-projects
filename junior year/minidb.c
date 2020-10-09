#include <stdlib.h>
#include <stdio.h>

//functions
void addRecord(void);
void deleteRecord(void);
void printDatabase(void);
void iniDatabase(void);
void sorted(void);
void search(void);
void load(void);
void save(void);
void menu(void);
void currentDatabase(void);

//database info
FILE *database;
typedef struct {
    int number;
    char name[100];
    int quantity;
    int cost;
} tool;

void menu(){
    int choice = 0;
    
        printf("Menu:\n");
        printf("1. Initialize the Database\n");
        printf("2. Input New Records\n");
        printf("3. Search for a Record\n");
        printf("4. Delete a Record\n");
        printf("5. List all the Records\n");
        printf("6. List all the Records (Sorted)\n");
        printf("7. Save Database\n");
        printf("8. Load an Existing Database\n");
        printf("9. Exit\n");
        
        scanf("%d", &choice);

        //choices
        if(choice == 1){
            iniDatabase();
        }
        else if(choice == 2){
            addRecord();
        }else if(choice == 3){
            search();
        }else if(choice == 4){
            deleteRecord();
        }else if(choice == 5){
            printDatabase();
        }else if(choice == 6){
            sorted();
        }else if(choice == 7){
            save();
        }
        else if(choice == 8){
            load();
        }
        else if(choice == 9){
            fclose(database);
            exit(0);
        }
        //invalid input choice
        else{
            printf("Invalid input. Please input a number 1-9.\n");
            menu();
        }
}

int main(int argc, const char * argv[]) {
    menu();
    return 0;
}

void iniDatabase(){
    char pathway[100];
    printf("Initialize Database:\n");
    printf("Please type in what path you would like the file to be in, or an existing path of a file you'd like to use.\n");
    scanf("%s", &pathway);
    database = fopen(pathway, "w+");
    //error handling + letting the user know if the file was created/accessed
    if(!database){
        printf("File path does not exist or file could not be created.\n");
    }else{
        printf("File successfully created/accessed.\n");
    }
     menu();
}

void printDatabase(){
    //error handling
    if(!database){
        printf("There is no active database.\n");
        menu();
    }
   rewind(database);
   tool t;
   printf("Current Database:\n");
   printf("Rec#    Name    Quantity   Cost\n");
   for(int i = 0; i < 100; i++){
       if(!fread(&t, sizeof(tool), 1, database)){
                 break;
             }
           printf("%d       %s       %d       %d\n", t.number, t.name, t.quantity, t.cost);
   }
   menu();
}

void addRecord(){
    //error handling
    if(!database){
        printf("There is no active database.\n");
        menu();
    }
        printf("Add a Record:\n");
        tool t;
        printf("Record Number:\n");
        scanf("%d", &t.number);
        printf("Tool Name:\n");
        scanf("%s", &t.name);
        printf("Quantity:\n");
        scanf("%d", &t.quantity);
        printf("Cost:\n");
        scanf("%d", &t.cost);
        fwrite(&t, sizeof(tool), 1, database);
    menu();
}

void search(){
    //error handling
    if(!database){
        printf("There is no active database.\n");
        menu();
    }
    
    int type;
    tool t;
    printf("If you want to search by tool name, input 1. If you want to search by record number, input 0.\n");
    scanf("%d", &type);
    
    //searches by name
    if(type == 1){
        char search_name[100];
        int flag = 0;
        printf("Tool Name:\n");
        scanf("%s", &search_name);
        printf("Results:\n");
        tool t;
        rewind(database);
        for(int i = 0; i < 100; i++){
            if(fread(&t, sizeof(tool), 1, database) == 0){
                break;
            }
            if(!strncmp(t.name, search_name, strlen(search_name))){
                flag = 1;
                printf("Rec#    Name    Quantity   Cost\n");
                printf("%d       %s       %d       %d\n", t.number, t.name, t.quantity, t.cost);
            }
        }
        if(flag == 0){
            printf("No results found.\n");
        }
        menu();
    }
    
    //searches by record number
    else if(type == 0){
        int sn = 0;
        int flag = 0;
        printf("Record Number:\n");
        scanf("%d", &sn);
        printf("Results:\n");
        tool t;
        rewind(database);
        for(int i = 0; i < 100; i++){
            if(!fread(&t, sizeof(tool), 1, database)){
                    break;
                }
            if(t.number == sn){
                flag = 1;
                printf("Rec#    Name    Quantity   Cost\n");
                printf("%d       %s       %d       %d\n", t.number, t.name, t.quantity, t.cost);
                }
            }
        
            if(flag == 0){
                printf("No results found.\n");
            }
        menu();
    }
    
    //error handling
    else{
        printf("Incorrect type. Type 0 or 1.\n");
        search();
    }
}

void sorted(){
    //error handling
    if(!database){
        printf("There is no active database.\n");
        menu();
    }
    
    int type;
    printf("What would you like to sort by? Type 1 for name, 0 for record number.\n");
    scanf("%d", &type);
    
    //tool name
    if(type == 1){
        // needs to be finished
        for(int i = 0; i < 100; i++){
           // if(strcmp(t.name,  > 0) - // compare struct names alphabetically
          // set a temp?
                
           // }
        }
    }
    //record number
    else if(type == 0){
        //needs to be finished
    }
    //error handling
    else{
        printf("Please type a 0 or 1.\n");
        sorted();
    }
    menu();
}

void deleteRecord(){
   //error handling
   if(!database){
       printf("There is no active database.\n");
       menu();
   }
    
    int rn;
    tool t;
    printf("Enter the record number of the tool you would like to be deleted.\n");
    scanf("%d", &rn);
    rewind(database);
    // needs to be finished
    for(int i = 0; i < 100; i++){
        if(!fread(&t, sizeof(tool), 1, database)){
            break;
        }
        if(t.number == rn){
            //find the tool you want to remove
            fseek(database, sizeof(tool)*rn, SEEK_SET);
            //create new file
            // add all lines but the line you want to remove
            // delete old file
            //rename new file as old file path
        }
    
    }
    menu();
}

void save(){
    //error handling
    if(!database){
        printf("There is no active database.\n");
        menu();
    }
    printf("Saving Database..\n");
    fclose(database);
    printf("Database saved and closed.\n");
    menu();
}

void load(){
    printf("Load a Database:\n");
    char pathway[100];
    printf("Enter file pathway:\n");
    scanf("%s", &pathway);
    database = fopen(pathway, "r+");
    
    //error handling
    if(!database){
        printf("File could not be found.\n");
    }
    else{
        printf("File found and opened.\n");
    }
    menu();
}

