#include <bits/stdc++.h>
using namespace std;

void bubbleSort(int array[], int arrayLength)
{
    int j;
    for (j = 1; (j < arrayLength - 1); j++)
    {
        int i;
        for (i = 0; (i < arrayLength - 1); i++)
        {
            if (array[i] > array[i + 1])
            {
                // Swap function
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
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
    int numbers[] = {1, 12, 2, 21, 2, 344, 34, 3, 54, 65, 43, 5, 67, 65, 5, 6787, 65, 45, 6, 5, 43, 7};
    int arrayLength = sizeof(numbers) / sizeof(numbers[0]);

    bubbleSort(numbers, arrayLength);
    Display(numbers, arrayLength);

    return 0;
}
