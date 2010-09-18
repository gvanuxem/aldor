package foamj;

import foamj.FoamJ.Array;
import foamj.FoamJ.SInt;
import foamj.FoamJ.Bool;

/**
 * Implementation of Foam Word type.
 */
public interface Word {
	Word  asWord();
	Value toValue();
	int   toSInt();
	boolean toBool();
    Object toArray();
	
	public class U {
		public static Word fromSInt(int x) { return new SInt(x); }
		public static Word fromArray(Object x) { return new Array(x); }
		public static Word fromBool(boolean b) { return new Bool(b); }
	}
}