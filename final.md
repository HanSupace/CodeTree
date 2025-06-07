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
