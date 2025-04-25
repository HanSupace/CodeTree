```c++
#include <iostream>
#include <fstream>
#include <string>

using namespace std;
int main(){
    string name;
    double s;
    double max_score=-101;
    string max_name;
    int cnt=0;
    double sum=0;
    
    ifstream fin;
    fin.open("scores.txt");
    if(!fin){
        cerr << "Error opening scores.txt";
        return -1;
    }
    while(fin >> name >> s){
        
        if(max_score<s){
            max_name = name;
            max_score = s;
            
        }
        cnt++;
        sum+=s;

    }

    fin.close();


    ofstream fout("result.txt");
    if(!fout){
        cerr << "Error opening scores.txt";
        return -1;
    }
    fout << fixed; 
    fout.precision(2);
    fout << "총 " << cnt << " 명"<<endl;
    fout << "합계: "<< sum << " 명"<<endl;
    fout << "평균: "<<sum/cnt<<endl;
    fout << "최고점: "<<max_name << " "<<max_score<<endl;
    
    fout.close();   
    cout << "Result saved in result.txt";


}
```
