# 이진탐색(재귀)
```c++
int binary_search(int key, int low, int high){
  if(low<=high){
    int mid = (low+high)/2;
    if(key == arr[mid]){
      return mid;
    }
    else if(key < arr[mid]){
      return binary_search(key, low, mid-1);
    }
    else{
      return binary_search(key, mid+1, high);
    }
  return -1;
}
```
# 이진탐색(비재귀)
```c++
int binary_search(int key, int low, int high){
  while(low<=high){
    int mid = (low+high)/2;
    if(key == arr[mid]){
      return mid;
    }
    else if(key < arr[mid]){
      high = mid - 1;
    }
    else{
      low = mid + 1;
    }
return -1;
}
```

# lower bound
```c++
int lower_bound(int target){
  int left = 0;
  int right = arr.size()-1;
  int min_idx = arr.size();
  while(left<=right){
    int mid = (high+low)/2;
    if(arr[mid]>=target){
      high = mid -1;
      min_idx(mid, min_idx);

    }
    else{
      left = mid + 1;
    }
  }
  return min_idx;
}
```

# Upper bound
```c++
int lower_bound(int target){
  int left = 0;
  int right = arr.size()-1;
  int min_idx = arr.size();
  while(left<=right){
    int mid = (high+low)/2;
    if(arr[mid]>target){
      high = mid -1;
      min_idx(mid, min_idx);

    }
    else{
      left = mid + 1;
    }
  }
  return min_idx;
}
```

# 이진탐색트리
```c++
int bst_search(int x){
    int node = arr[1];
    while(arr[node]!=null && arr[node]!=x){
        if(arr[node]>x){
            node*=2;
        }
        else{
            node = node*2+1;
        }
    }
    return node;
}
```

# 이진탐색트리에서의 삽입
```c++
int bst_insert(int x){
    int node = arr[1];
    int parent = arr[1];

    while(node!=null){
        parent = node;
        if(arr[node]>x){
            node*=2;
        }
        else{
            node=2*node+1;
        }
    }
    if(arr[parent]==null){
        arr[0] = arr[x];
    }
    else if(arr[parent]>x){
        arr[parent*2] = arr[x];
    }
    else if(arr[parent]<x){
        arr[parent*2+1] = arr[x];
    }
}
```


# BFS
'''c++
bool visited[9];
vector<int> graph[9];

// BFS 함수 정의
void bfs(int start) {
    queue<int> q;
    q.push(start); // 첫 노드를 queue에 삽입
    visited[start] = true; // 첫 노드를 방문 처리

    // 큐가 빌 때까지 반복
    while (!q.empty()) {
        // 큐에서 하나의 원소를 뽑아 출력
        int x = q.front();
        q.pop();
        cout << x << ' ';
        // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
        for (int i = 0; i < graph[x].size(); i++) {
            int y = graph[x][i];
            if (!visited[y]) {
                q.push(y);
                visited[y] = true;
            }
        }
    }
}
'''
