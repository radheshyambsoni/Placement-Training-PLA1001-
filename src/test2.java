public class test2 {
    public static void main(String[] args) {
        String s="XI";
        int ans=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                if(i+1<s.length()){
                    switch(s.charAt(i+1)){
                        case 'V': ans+=4;i++;break;
                        case 'X': ans+=9;i++;break;
                        default: ans+=1;
                    }
                    break;
                }else{ans+=1;break;}
                
                case 'X':
                if(i+1<s.length()){
                    switch(s.charAt(i+1)){
                        case 'L': ans+=40;i++;break;
                        case 'C': ans+=90;i++;break;
                        default: ans+=10;
                    }
                    break;
                }else{ans+=10;break;}

                case 'C':
                if(i+1<s.length()){
                    switch(s.charAt(i+1)){
                        case 'D': ans+=400;i++;break;
                        case 'M': ans+=900;i++;break;
                        default: ans+=100;
                    }
                    break;
                }else{ans+=100;break;}

                case 'V':ans+=5;break;

                case 'L':ans+=50;break;

                case 'D':ans+=500;break;

                case 'M':ans+=1000;break;
            }
        }
        System.out.println(ans);
    }
}