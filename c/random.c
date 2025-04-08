#include <stdlib.h>
#include <stdio.h>
#include <time.h>  // For time()
#include <unistd.h> // For usleep()

int* randomIntArray(int length) {

	//allocates space based on length passed
	int* out = (int*) malloc(length * sizeof(int));

	//fills each index with random int
	for (int i = 0; i < length; i++) {
        	out[i] = rand() % 100;
    	}

	//returns pointer to this new array
	return out;
}
int main() {
	//random seed
	srand(time(NULL) + getpid());
	
	//sets random size
	int size = (rand() % 10) + 1;

	//calls for array of random size
	int* arr= randomIntArray(size);


	//prints each index of array
	for(int i = 0; i < size; i++) {
		printf("arr[%d] = %d\n", i, arr[i]);
	}

	free(arr);

	return 0;
}
