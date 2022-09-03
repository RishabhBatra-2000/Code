#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
}*head,*temp;

struct node *head = NULL;
struct node *temp = NULL;

int count_list(){
    int list_num = 0;
    if (head == NULL){
        return(list_num);
    }
    else{
        temp = head;
        while(temp!= NULL){
            list_num = list_num + 1;
            temp = temp->next;
        }
    }
    return(list_num);
}

void displayll(){
    
    if (head == NULL){
        printf("empty list\n");
        return;
    }
    else{
        temp = head;
        while(temp!= NULL){
            printf("->[%d]", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

void insert_at_beg(){
    struct node* new = (struct node*) malloc(sizeof(struct node));
    printf("Enter the data for the node.:\t");
    scanf("%d",&new->data);
    
    if(head == NULL){
        head = new;
    }
    else{
        new->next = head;
        head = new;
    }
    printf("---  Node added ---");
    displayll();
}

void insert_at_end(){
    struct node* new = (struct node*) malloc(sizeof(struct node));
    printf("Enter the data for the node.:\t");
    scanf("%d",&new->data);
    
    if(head == NULL){
        printf("There is no existing list present. please make a new list\n");
    }
    else{
        temp = head;
        while(temp->next!=NULL){
            temp = temp->next;
        }
        temp->next = new;
        new->next = NULL;
    }
    printf("---  Node added ---");
    displayll();
}


void insert_at_pos(){
    struct node* new = (struct node*) malloc(sizeof(struct node));
    int pos = 0;
    printf("Enter the position:\t");
    scanf("%d",&pos);
    printf("Enter the data for the node.:\t");
    scanf("%d",&new->data);
    if(head == NULL){
        printf("There is no existing list present. please make a new list\n");
    }
    else{
        
        if(pos<1 || pos>count_list()){
            printf("Invalid position.\n");
        }
        
        else if(pos == 1){
            new->next = head; 
            head = new;
        }
         
        else{
            temp = head;
            while(pos--){
                if(pos == 1){
                new->next = temp->next;
                temp->next = new;
                }
                else{
                    temp = temp->next;
                }
            }
        }
    }
}

void main(){
    
    int input = 0;
    int position = 0;
    printf("0. Exit the compiler.\n");
    printf("1. Display link list.\n");
    printf("2. Create a link list or Add the note at beginning.\n");
    printf("3. Add the node at end.\n");
    printf("4. Add the node at a specific position.\n");
    printf("Enter opration to perform : \n");
    scanf("%d", &input);
    switch(input){
                
        case 0:
            exit(0);
        
        case 1:
            displayll();
            main();
            break;
            
        case 2:
            insert_at_beg();
            main();
            break;
            
        case 3:
            insert_at_end();
            main();
            break;
            
        case 4:
            insert_at_pos();
            main();
            break;
        
        default:
            printf("wrong number\n");
            main();
    }
    
}
