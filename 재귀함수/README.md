# 재귀함수의 꽃
```c++
#include <iostream>

using namespace std;

void def(int a){
    if(a==0){
        return;
    }
    cout << a<<" ";
    def(a-1);
    cout << a<<" ";
}

int main(){
    int a;
    cin >> a;
    def(a);
}
```

# 재귀함수를 이용한 별 출력 2
```c++
#include <iostream>

using namespace std;

void def(int a){
    if(a==0){
        return;
    }
    for(int i=0; i<a; i++){
        cout << '*' << " ";
    }
    cout << endl;
    def(a-1);
    for(int i=0; i<a; i++){
        cout << '*' << " ";
    }
    cout << endl;
}

int main(){
    int a;
    cin >> a;
    def(a);
}
```

# 재귀함수를 이용한 피보나치 수
```c++
#include <iostream>

using namespace std;

int def(int a){
    if(a==1){
        return 1;
    }

    if(a==2){
        return 1;
    }
    return def(a-1)+def(a-2);
}

int main(){
    int a;
    cin >> a;
    cout << def(a);
}
```

# 재귀함수를 이용한 최댓값
```c++
#include <iostream>
#include <algorithm>

using namespace std;

int arr[101];
int a,b;

int def(int a){
    if(a==0){
        return arr[0];
    }
    return max(def(a-1),arr[a]);
}

int main(){
    
    cin >> a;
    for(int i=0; i<a; i++){
        cin >>b;
        arr[i]=b;
    }
    int c = def(a);

    cout << c;

}
```

# 재귀함수를 이용한 최소공배수
```c++
#include <iostream>

using namespace std;

int n,a;
int arr[101];

int gcd(int a, int b){
    if(a%b==0){
        return b;
    }
    return gcd(b,a%b);
}

int lcm(){
    int l = arr[0];
    for(int i=1; i<n; i++){
        l = l*arr[i]/gcd(l,arr[i]);
    }
    return l;
}


int main(){
    

    cin >> n;
    for(int i=0; i<n;i++){
        cin >> a;
        arr[i]=a;
    }
    cout << lcm();

}
```
