#include <iostream>
#include <algorithm>

using namespace std;

void print(int* arr, int size){
    for(int i = 0; i < size-1; i++){
        cout << arr[i] << ",";
    }
    cout << arr[size-1] << endl;
}

int main(){
    int arr[] = {0,1,2,3,4,5,6,7,8,9};
    int size = sizeof arr / sizeof arr[0];
    
    //do 999,999 permutations to arr
    for(int i = 2; i <= 1000000; i++){
        next_permutation(arr,arr+size);
    }
    print(arr,size);
    
    return 0;
}
