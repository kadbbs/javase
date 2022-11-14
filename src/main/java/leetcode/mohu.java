package leetcode;

import java.util.ArrayList;
import java.util.List;

public class mohu {
    public List<String> ambiguousCoordinates(String s) {
        String receive="";
        String receive1="";
        String receive2="";
        String front="";
        String foot="";
        boolean flag=true;
        List<String> list=new ArrayList<>();
        for(int i=2;i<s.length()-1;i++){
            //s.charAt(i);
            receive=s.substring(0,i)+", "+s.substring(i,s.length());
            list.add(receive);
            for (int u=i+3;u<receive.length()-1;u++){
                receive1=receive.substring(0,u)+"."+receive.substring(u,receive.length());
                list.add(receive1);
                if(i!=2){
                    for (int p=2;p<receive1.indexOf(",");p++){
                        receive2=receive1.substring(0,p)+"."+receive1.substring(p,receive1.length());
                        list.add(receive2);
                    }

                }
            }
            if(i!=2){
                for (int u=2;u<receive.indexOf(",");u++){
                    receive1=receive.substring(0,u)+"."+receive.substring(u,receive.length());
                    list.add(receive1);
                }

            }


        }

        if(s.indexOf("0")!=-1){
            for(int i=0;i<list.size();i++){
                int index_0=list.get(i).indexOf("0");
                int index_f=list.get(i).indexOf(",");
//                int index_d1=list.get(i).indexOf(".");
//                if(index_d1!=-1){
//                    int index_d2=list.get(i).indexOf(".",index_d1);
//
//                }
                front=list.get(i).substring(1,index_f);
                foot=list.get(i).substring(index_f+2,list.get(i).length()-1);
//                front="01";
//                foot="2.3";
                if(front.indexOf(".")==-1&&front.charAt(0)=='0'){
                    if(front.length()!=1){
                        list.remove(i);
                        i--;
                        flag=false;
                    }


                }
//                char yu=foot.charAt(0);
//                if(foot.indexOf(".")==-1&&foot.charAt(0)=='0'){
//                    if(foot.length()!=1){
//                        list.remove(i);
//                        i--;
//                    }
//
//                }
                if(front.indexOf(".")!=-1){
                    if(front.charAt(0)=='0'&&front.charAt(1)!='.'){
                        list.remove(i);
                        i--;
                        flag=false;

                    }else if(front.charAt(front.length()-1)=='0'){
                        list.remove(i);
                        i--;
                        flag=false;
                    }
                }
                char yu=foot.charAt(0);


                if(flag){
                    if(foot.indexOf(".")==-1&&foot.charAt(0)=='0'){
                        if(foot.length()!=1){
                            list.remove(i);
                            i--;
                        }

                    }

                    if(foot.indexOf(".")!=-1){
                        if(foot.charAt(0)=='0'&&foot.charAt(1)!='.'){
                            list.remove(i);
                            i--;

                        }else if(foot.charAt(foot.length()-1)=='0'){
                            list.remove(i);
                            i--;
                        }

                    }

                }
                flag=true;

            }

        }

        return list;
    }

    public static void main(String[] args) {
        mohu mohu=new mohu();
        List<String>list=mohu.ambiguousCoordinates("(0100)");
        for(String i:list){
            System.out.println(i);
        }
    }
}
