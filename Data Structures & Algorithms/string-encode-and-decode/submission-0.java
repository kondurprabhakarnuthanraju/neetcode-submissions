class Solution {

    public String encode(List<String> strs) {
        // #encode 
        String res="";
        for(String s:strs){
            res=res+s;
            // res.append("-");
            res=res+'-';

        }
        return res;

    }

    public List<String> decode(String str) {
        List<String> lst=new ArrayList<>();
        String dum="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                lst.add(dum);
                dum="";
            }
            else{
            dum=dum+str.charAt(i);
            }

        }
        return lst;

    }
}
