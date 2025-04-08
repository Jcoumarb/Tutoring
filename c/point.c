#include <stdlib.h>
#include <stdio.h>
#include <math.h>

struct Point {
    int x;
    int y;
} typedef point;

double findLength(point* a, point* b) {
    double x_out = a -> x - b -> x;
    double y_out = a -> y - b -> y;

    double radicand = pow(x_out, 2) + pow(y_out, 2);

    return sqrt(radicand);
}

int main() {
    point* a = (point*) malloc(sizeof(point));
    a -> x = 1;
    a -> y = 3;

    point* b = (point*) malloc(sizeof(point));
    b -> x = 6;
    b -> y = -2;

    printf("Distance between points: %f\n", findLength(a, b));
}
