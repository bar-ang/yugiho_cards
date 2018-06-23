package yugiho;

public class Printer{
    private static String borderize(String str, int borderSize, boolean noBottom){
        String top = "";
        String mid = "";
        String spaceLeft = "";
        String spaceRight = "";
        String output;
        for(int i=0;i< borderSize;i ++){
            top += "-";
        }

        int paddingLeft = (borderSize - str.length() - 2) / 2;
        int paddingRight = (borderSize - str.length() - 2) / 2;
        paddingRight += borderSize-2*paddingLeft-str.length()-2;

        if(paddingLeft < 0)
            paddingLeft = 0;

        if(paddingRight < 0)
            paddingRight = 0;

        for(int i=0;i< paddingLeft;i ++){
            spaceLeft += " ";
        }

        for(int i=0;i< paddingRight;i ++){
            spaceRight += " ";
        }

        mid += "|" + spaceLeft + str + spaceRight + "|";

        output = top + "\n" + mid + "\n";
        if(!noBottom)
            output += top + "\n";

        return output;
    }
	public static String asciiCard(String name, String desc, int stars, int atk, int def){
        String strStars = "";
        String strStats = "";
        if(stars > 0)
            for(int i=0;i < stars ;i ++)
                strStars += "✪ ";
        
        if(atk >= 0) strStats += "atk: " + atk;
        if(def >= 0) strStats += " | def: " + def;

        int borderSize = desc.length()+10;

        String output = borderize(name, borderSize, true) + 
                        borderize(strStars, borderSize, true) + 
                        borderize(desc, borderSize, true) + 
                        borderize(strStats, borderSize, false);
        return output;
    }
    public static String asciiCard(String name, String desc){
        return asciiCard(name, desc, -1, -1, -1);
    }
}
/*
-------------------------
| Card name             |
-------------------------
| ✪✪✪✪✪               |
-------------------------
| Card Desc             |
-------------------------
| atk: 1500 | def: 1000 |
-------------------------
*/