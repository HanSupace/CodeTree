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

## 기수정렬
```c++
#include <iostream>
#include <vector>

using namespace std;

int n;
int arr[100000];

int main() {
    cin >> n;

    vector<int> v[10];

    int sort_arr[100001];

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int pos=1;
    for(int i=0; i<6; i++){
        for(int s=0; s<n; s++){
            int p = arr[s]/pos%10;
            v[p].push_back(arr[s]);
        }
        pos*=10;
        int index=0;
        for(int s=0; s<10; s++){
            for(int j=0; j<v[s].size();j++){
                sort_arr[index++]=v[s][j];

            }
                v[s].clear(); // 꼭 초기화 해주기

        }
        for(int s=0; s<n; s++){
            arr[s]=sort_arr[s];
        }
    }
    for (int i = 0; i < n; i++) {
        cout << arr[i]<<" ";
    }


    return 0;
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

## 퀵정렬
```c++
#include <iostream>
#include <algorithm>

using namespace std;

int n;
int arr[100000];

int part(int low, int high){
    int piviot = arr[high];
    int l = low-1;

    
    for(int i=low; i<high; i++){
        if(arr[i]<piviot){
            l++;
            swap(arr[l],arr[i]);
        }
    }
    swap(arr[l+1],arr[high]);
    return l+1;
}

void al(int low, int high){
    if(low < high){
    int pos = part(low, high);

    al(low, pos-1);
    al(pos+1,high);
    }
}

int main() {
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    al(0,n-1);
     for(int i = 0; i < n; i++)
        cout << arr[i] << " ";

    return 0;
}
```
## 힙정렬
```c++
#include <iostream>
#include <algorithm>

using namespace std;
int arr[101];
int n,b;

void heap(int n, int i){
    int lagest=i;
    int l = i*2;
    int r = i*2+1;

    if(l<=n && arr[l]>arr[lagest]){
        lagest=l;
    }
    
    if(r<=n && arr[r]>arr[lagest]){
        lagest=r;
    }
    if(lagest!=i){
        swap(arr[lagest],arr[i]);
        heap(n,lagest);
    }
}

void Hsort(){
    for(int i=n/2; i>=1; i--){
        heap(n,i);
    }
    for(int i=n; i>=1; i--){
        swap(arr[1],arr[i]);
        heap(i-1,1);
    }
}

int main(){
    
    cin >>n;

    
    
    for(int i=1; i<=n; i++){
        cin >> b;
        arr[i]=b;
    }

    Hsort();



    for(int i=1; i<=n; i++){
        cout << arr[i] << " ";
    }
}
```




