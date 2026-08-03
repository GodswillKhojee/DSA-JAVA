// Last updated: 04/08/2026, 00:21:25
class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int start=0;
        for(int i=0;i<arr.size();i++){
            if(i+1<arr.size() && arr[i]==arr[i+1]){
                continue;
            }else{
                arr[start]=arr[i];
                start++;
            }
        }
        return start;
    }
};