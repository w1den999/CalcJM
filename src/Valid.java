public class Valid {
    public static boolean validRome(String arrStr){
        String [] strRome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for(String strRom1 : strRome){
            if(arrStr.equals(strRom1)){
                return true;
            }
        }
        return false;
    }
    public static boolean validArabic(String arrArab){
        String[] strArab = {"1","2","3", "4","5","6","7","8","9","10"};
        for(String strArab1 : strArab){
            if(arrArab.equals(strArab1)){
                return true;
            }
        }
        return false;
    }
}