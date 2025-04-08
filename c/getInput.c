#include <stdlib.h>
#include <stdio.h>

int main() {
    char c;

    int size = 10;
    char* arr = (char *) malloc(size*sizeof(char));
    int index = 0;

    c = getchar();

    while (c != '\n') {
        //resize
        if(index+1 == size) {
            size *= 2;
            char* temp = realloc(arr, size*sizeof(char));
            arr = temp;
        }
        
        arr[index++] = c; //assigns char to proper index of array
        c = getchar();
    }

    arr[index] = 0; //null terminator on array

    printf("Input String: %s\n", arr);
}

