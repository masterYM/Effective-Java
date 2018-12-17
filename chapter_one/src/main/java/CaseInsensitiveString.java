//对称性equals

public class CaseInsensitiveString {

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(s.equals(cis));
        System.out.println(cis.equals(s));
    }


    private final String s;

    public CaseInsensitiveString(String s) {
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
    }

    //    @Override    //违反对称性
//    public boolean equals(Object obj) {
//        if(obj instanceof CaseInsensitiveString){
//            return s.equalsIgnoreCase(((CaseInsensitiveString)obj).s);
//        }
//
//        if(obj instanceof String){
//            return s.equalsIgnoreCase((String)obj);
//        }
//        return false;
//    }
}
