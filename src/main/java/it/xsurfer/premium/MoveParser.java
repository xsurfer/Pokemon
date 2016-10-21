package it.xsurfer.premium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fabio on 21/10/16.
 */
public class MoveParser {

    public static boolean parse(String moves){
        Pattern p = Pattern.compile("[NSOE]*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(moves);
        if(m.matches())
            return true;
        return false;
    }

}
