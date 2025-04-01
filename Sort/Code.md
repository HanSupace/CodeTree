## 버블정렬

```c++
#include <iostream>

using namespace std;

int main(){
    int a,b;
    int arr[101];
    bool c;
    cin >> a;
    for(int i=0; i<a; i++){
        cin >> b;
        arr[i]=b;
    }

    do{
        c = true;
        for(int i=0; i<a-1; i++){
            if(arr[i]>arr[i+1]){
                int tmp;
                tmp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
                c=false;
            }
        }

    }while(c==false);

    for(int i=0; i<a; i++){
        cout << arr[i] << " ";
    }
}
```

## 선택정렬
```c++
#include <iostream>

using namespace std;

int main(){
    int n,a;
    int arr[101];
    int tmp;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a;
        arr[i]=a;
    }

    for(int i=0; i<n-1; i++){
        int min=i;
        for(int j=i+1; j<n; j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        tmp=arr[i];
        arr[i]=arr[min];
        arr[min]=tmp;

    }
    for(int i=0; i<n;i++){
        cout << arr[i] << " ";
    }
}
```

## 삽입정렬
```c++
#include <iostream>

using namespace std;

int main(){
    int a;
    cin >> a;

    int arr[101];

    for(int i=0; i<a; i++){
        cin >> arr[i];
    }

    for(int i=1; i<a; i++){
        int j=i-1;
        int key = arr[i];
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;    
        }
        arr[j+1]=key;
    }

    for(int i=0; i<a; i++){
        cout << arr[i]<<" ";
    }
}
```

## 병합정렬
```c++
#include <iostream>
#include <vector>

using namespace std;

int main(){
    int n;
    cin >> n;

    int arr[100001];
    vector<int> new_arr[10];
    
    for(int i=0 ;i<n; i++){
        cin >> arr[i];
    }

    int pos = 10;
    int p=1;

    for(int i=0; i<6; i++){
        for(int j=0; j<n; j++){
            int c = (arr[j]/p)%pos;
            new_arr[c].push_back(arr[j]);
        }
        int index=0;
        for(int j=0; j<10; j++){
            for(int s=0; s<new_arr[j].size(); s++){
                arr[index++]=new_arr[j][s];
            }
            new_arr[j].clear();
        }
        p*=10;
    }   

    for(int i=0; i<n; i++){
        cout << arr[i]<< " ";
    }


}
```


