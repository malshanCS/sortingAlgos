#include <bits/stdc++.h>
using namespace std;

// insertion sort function - function will sort an integer array with "n" number of elements
void insertionSort(int array[], int n)
{
    int i;
    for (i = 1; (i < n); i++)
    {
        int value = array[i];
        int hole = i;
        // hole - as visuallized in the video, insertion sort will take the element to be sorted out of the array
        // Then that index will become a "hole"
        // Below loop will move that hole to the correct index where the element taken out should be in
        while ((hole > 0) && (array[hole - 1] > value))
        {
            array[hole] = array[hole - 1];
            hole = hole - 1;
        }

        // Now insert the element in to the hole
        array[hole] = value;
    }
}

// Function to display the sorted array. output would be in the form of "[a,b,c,d]".
void Display(int array[], int n)
{
    cout << "[";
    int i;
    for (i = 0; i < (n - 1); i++)
        cout << array[i] << ",";
    cout << array[n - 1] << "]" << endl;
}

// Driver code
int main()
{
    int numbers[] = {1, 12, 2};
    int arrayLength = sizeof(numbers) / sizeof(numbers[0]);

    insertionSort(numbers, arrayLength);
    Display(numbers, arrayLength);

    return 0;
}
