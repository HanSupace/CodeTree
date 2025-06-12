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

# DFS
```c++
void DFS(int cur){
    isVisited[cur] = true;
    cout << "방문한 노드 : " << cur << '\n';
    
    // 현재 정점과 간선으로 연결되어 있는 모든 정점들을 둘러본다.
    for(int i = 0; i < graph[cur].size(); i++){
    	int next = graph[cur][i];
        // 만일 방문하지 않았다면 매개변수로 전달하여 DFS를 재귀적으로 호출한다.
        if(!isVisited[next]){
        	DFS(next);
        }
    }
```


# BFS
```c++
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
```

# 다익스트라 알고리즘
```c++
#include <bits/stdc++.h>

using namespace std;

vector<bool> visited; // 방문 유무를 저장하는 벡터 선언
vector<int> d; // 시작 노드에서부터 각 노드까지의 최단 거리를 저장하는 벡터 선언

void dijkstra(int V, vector<pair<int,int>> graph[], int start)
{
    priority_queue<pair<int,int>>pq; // (거리, 노드 인덱스)를 거리 순서대로 정렬할 queue 생성
    
    pq.push({0,start}); //시작 노드로 가기위한 최단 경로는 0으로 설정하여, 큐에 삽입.
    d[start]=0;
    
    while(!pq.empty())
    {
        int dist = -pq.top().first; //현재 노드까지의 비용
        int now = pq.top().second; // 현재 노드
        pq.pop();
        
        if(d[now]<dist) // 이미 최단경로를 체크한 노드인 경우 패스
            continue;
        
        for(int i=0; i<graph[now].size(); i++)
        {
            int cost = dist+graph[now][i].second; // 거쳐서 가는 노드의 비용을 계산
                                                  // 현재노드까지 비용 + 다음 노드 비용
            if(cost<d[graph[now][i].first]) // 비용이 더 작다면 최단경로 테이블 값을 갱신.
            {
                d[graph[now][i].first]=cost;
                pq.push(make_pair(-cost,graph[now][i].first));
            }
        }
    }
}

int main()
{
    int V, E, src;  // (V: # of nodes, E: # of edges, start: source)
    cin >> V >> E;  // 모든 간선 정보를 입력 받기 
    cin >> src;  // 시작점 입력 받기
    
    vector<pair<int,int>> graph[V];  // pair를 저장하는 벡터 V 개 생성 
    for (int i = 0; i < E; i++)
    {
        int from, to, cost;
        cin >> from >> to >> cost;  
        graph[from-1].push_back({to-1, cost});  // graph[] 에 from에서 to까지 가는 가는 비용 저장
    }
    
    d.assign(V, INT_MAX);  // 초기 값을 무한대로 저장
    visited.assign(V, 0);  // 방문한 적 없음을 선언
    
    dijkstra(V, graph, src-1);
    
    // 모든 노드로 가기 위한 최단 거리를 출력
    for (int i = 0; i < V; i++)
    {
        if (d[i] == INT_MAX)
            cout << "INFINITY ";
        else
            cout << d[i] << " ";
    }
    return 0;
}
```

# 플로이드 워셜 알고리즘
```c++
#include <iostream>
using namespace std;

const int INF = 1e9; // 무한대 대신 충분히 큰 수
const int V = 4;     // 정점 수 (고정)

void floydWarshall(int dist[V][V]) {
    for (int k = 0; k < V; ++k) {
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][k] != INF && dist[k][j] != INF && 
                    dist[i][j] > dist[i][k] + dist[k][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
    }
}
int main() {
    int dist[V][V] = {
        {0,     5, INF, 10},
        {INF,   0,   3, INF},
        {INF, INF, 0,   1},
        {INF, INF, INF, 0}
    };

    floydWarshall(dist);
```
