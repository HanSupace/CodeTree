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
