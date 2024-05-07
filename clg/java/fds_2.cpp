#include<iostream>
using namespace std;

int  main(){
    
    //----------- pointing an array--------------------

   int *ptr = new int[5];
   int arr[] = {1,2,3,4,5};

   for(int i=0; i<5; i++){
         ptr = &arr[i];
        cout<<*ptr<<endl;
   }

   // -----------------array of pointers ----------------

    int arr1[5];
    int* p [5];
 
    for (int i = 0; i < 5; i++) {
        arr1[i] = 10 * (i + 1);
    }

    cout<<endl;

    for(int i=0; i<5; i++){
        p[i] = &arr1[i];
        cout<<*p[i]<<endl;
    }

    return 0;

//------------------------ string to array -----------------------

}




